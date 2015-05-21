/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

/**
 *
 * @author a3
 */
public class Arreglo {

    float rnd;
    float rndTiempo;
    int media;
    int tipo;
    float tiempo;
    float pendiente;
    float reinicio;
    float fin;

    public Arreglo() {
        this.rnd = (float) Math.random();
        if (rnd < 0.3f) {
            this.tipo = 1;            
        }
        else
        {
            if(rnd < 0.55f) {
                this.tipo=2;
            }
            else{
                if(rnd <0.70f){
                    this.tipo=3;
                }
                else{
                    if(rnd<0.8f){
                        this.tipo=4;
                    }
                    else{
                        this.tipo=5;
                    }
                }
            }
        }
        int[] vectorTiempo= {120,60,180,60,90};
        this.media= vectorTiempo[tipo-1];
        this.rndTiempo = (float)Math.random();
        this.tiempo= (media-5) + rndTiempo * (10); 

    }

    public float getRnd() {
        return rnd;
    }

    public void setRnd(float rnd) {
        this.rnd = rnd;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }

    public float getPendiente() {
        return pendiente;
    }

    public void setPendiente(float pendiente) {
        this.pendiente = pendiente;
    }

    public float getReinicio() {
        return reinicio;
    }

    public void setReinicio(float reinicio) {
        this.reinicio = reinicio;
    }

    public float getFin() {
        return fin;
    }

    public void setFin(float fin) {
        this.fin = fin;
    }

}
