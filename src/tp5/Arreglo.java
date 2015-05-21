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

    int media;
    int tipo = 0; //1:a 2:B 3:C 4:D 5:E
    float tiempo = 0f;
    float pendiente = 0f;
    float reinicio = 0f;
    float fin = 0f;
    boolean estado = false; //true en pediente

    public Arreglo(float reloj) {
        asignarTipo();
        asignarTiempo();

        if (tipo == 3) {
            pendiente = reloj + 15f;
            fin = reloj + tiempo;
            reinicio = fin - 15;
        } else {
            fin = reloj + tiempo;
        }
    }

    public Evento getProxEvento() {
        Evento result;
        if (estado) {
            result = new Evento(reinicio, NombreEvento.REINICIO_ARREGLO);
            estado = false;
        } else {
            if (pendiente != 0) {
                result = new Evento(pendiente, NombreEvento.SERVIDOR_LIBRE);
                pendiente = 0;
                estado = true;
            } else {
                result = new Evento(fin, NombreEvento.FIN_ARREGLO);
            }
        }
        return result;
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

    private void asignarTipo() {
        float rnd = (float) Math.random();
        if (rnd < 0.3f) {
            this.tipo = 1;
        } else {
            if (rnd < 0.55f) {
                this.tipo = 2;
            } else {
                if (rnd < 0.70f) {
                    this.tipo = 3;
                } else {
                    if (rnd < 0.8f) {
                        this.tipo = 4;
                    } else {
                        this.tipo = 5;
                    }
                }
            }
        }
    }

    private void asignarTiempo() {
        int[] vectorTiempo = {120, 60, 180, 60, 90};

        this.media = vectorTiempo[tipo - 1];

        float rnd = (float) Math.random();
        this.tiempo = (media - 5) + rnd * (10);
    }

}
