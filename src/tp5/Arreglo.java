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
    float tiempoArreglo = 0f;
    float tiempoSuspension = 0f;
    float tiempoReinicio = 0f;
    float fin = 0f;
    boolean suspendido = false; //true en pediente

    public Arreglo(float reloj) {
        asignarTipo();
        asignarTiempo();

        if (tipo == 3) {
            tiempoSuspension = reloj + 15f;
            fin = reloj + tiempoArreglo;
            tiempoReinicio = fin - 15;
        } else {
            fin = reloj + tiempoArreglo;
        }
    }

    Arreglo(float reloj, int i, int i0) {
        this.tipo = i;
        this.tiempoArreglo = i0;
        this.fin = reloj + i0;
    }

    public Evento getProxEvento() {
        Evento result;
        if (suspendido) {
            result = new Evento(tiempoReinicio, NombreEvento.REINICIO_ARREGLO);
            suspendido = false;
        } else {
            if (tiempoSuspension != 0) {
                result = new Evento(tiempoSuspension, NombreEvento.SUSPENSION);
                tiempoSuspension = 0;
                suspendido = true;
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
        return tiempoArreglo;
    }

    public void setTiempo(float tiempo) {
        this.tiempoArreglo = tiempo;
    }

    public float getPendiente() {
        return tiempoSuspension;
    }

    public void setPendiente(float pendiente) {
        this.tiempoSuspension = pendiente;
    }

    public float getReinicio() {
        return tiempoReinicio;
    }

    public void setReinicio(float reinicio) {
        this.tiempoReinicio = reinicio;
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
        this.tiempoArreglo = (media - 5) + rnd * (10);
    }

    @Override
    public String toString() {
        return "Arreglo{" + "media=" + media + ", tipo=" + tipo + ", tiempoArreglo=" + tiempoArreglo + ", tiempoSuspension=" + tiempoSuspension + ", tiempoReinicio=" + tiempoReinicio + ", fin=" + fin + ", suspendido=" + suspendido + '}';
    }

}
