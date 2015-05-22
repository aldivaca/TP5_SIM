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
public class Servidor {

    boolean ocupado;
    float tLibre;
    float tInicio;

    public Servidor() {
        ocupado = false;
        tInicio = 0;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public float gettLibre() {
        return tLibre;
    }

    public void settLibre(float tLibre) {
        this.tLibre = tLibre;
    }

    public float gettInicio() {
        return tInicio;
    }

    public void settInicio(float tInicio) {
        this.tInicio = tInicio;
    }

    @Override
    public String toString() {
        return "Servidor{" + "ocupado=" + ocupado + ", tLibre=" + tLibre + ", tInicio=" + tInicio + '}';
    }

}
