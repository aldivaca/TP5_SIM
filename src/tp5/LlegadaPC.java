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
public class LlegadaPC {

    float tiempoLlegada;
    float proxLlegada;

    public LlegadaPC(float reloj) {
        this.tiempoLlegada = (float) 30 + (float) Math.random() * (float) 60;
        this.proxLlegada = reloj + tiempoLlegada;
    }

    public float getTiempoLlegada() {
        return tiempoLlegada;
    }

    public void setTiempoLlegada(float tiempoLlegada) {
        this.tiempoLlegada = tiempoLlegada;
    }

    public float getProxLlegada() {
        return proxLlegada;
    }

    public void setProxLlegada(float proxLlegada) {
        this.proxLlegada = proxLlegada;
    }

    @Override
    public String toString() {
        return "LlegadaPC{" + "tiempoLlegada=" + tiempoLlegada + ", proxLlegada=" + proxLlegada + '}';
    }

}
