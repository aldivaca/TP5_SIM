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
public class LlegadaPC 
{
    float rnd;
    float tiempoLlegada;
    float proxLlegada;

    public LlegadaPC() 
    {
        this.rnd = (float)30+(float) Math.random()*60;
    }    
    

    public float getRnd() {
        return rnd;
    }

    public void setRnd(float rnd) {
        this.rnd = rnd;
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
    
    
    
}
