/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

/**
 *
 * @author Aldi Vaca
 */
public class Evento {

    public float tiempo;
    public NombreEvento evento;

    public Evento(float tiempo, NombreEvento evento) {
        this.tiempo = tiempo;
        this.evento = evento;
    }

    public Evento(Evento proxEvento) {
        this.tiempo = proxEvento.getTiempo();
        this.evento = proxEvento.getEvento();
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }

    public NombreEvento getEvento() {
        return evento;
    }

    public void setEvento(NombreEvento evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "Evento{" + "tiempo=" + tiempo + ", evento=" + evento + '}';
    }

}
