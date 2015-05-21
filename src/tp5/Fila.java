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
public class Fila {

    float reloj;
    String evento;
    LlegadaPC llegada;
    int cola;
    Servidor serv1;
    Servidor serv2;
    Arreglo a1;
    Arreglo a2;
    int contadorTotal;
    int rechazos;

    public float getProximoTiempo() {

        float lleg, arr1, arr2;
        lleg = llegada.getProxLlegada();
        return lleg;
    }

    public float getReloj() {
        return reloj;
    }

    public void setReloj(float reloj) {
        this.reloj = reloj;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public LlegadaPC getLlegada() {
        return llegada;
    }

    public void setLlegada(LlegadaPC llegada) {
        this.llegada = llegada;
    }

    public int getCola() {
        return cola;
    }

    public void setCola(int cola) {
        this.cola = cola;
    }

    public Servidor getServ1() {
        return serv1;
    }

    public void setServ1(Servidor serv1) {
        this.serv1 = serv1;
    }

    public Servidor getServ2() {
        return serv2;
    }

    public void setServ2(Servidor serv2) {
        this.serv2 = serv2;
    }

    public Arreglo getA1() {
        return a1;
    }

    public void setA1(Arreglo a1) {
        this.a1 = a1;
    }

    public Arreglo getA2() {
        return a2;
    }

    public void setA2(Arreglo a2) {
        this.a2 = a2;
    }

    public int getContadorTotal() {
        return contadorTotal;
    }

    public void setContadorTotal(int contadorTotal) {
        this.contadorTotal = contadorTotal;
    }

    public int getRechazos() {
        return rechazos;
    }

    public void setRechazos(int rechazos) {
        this.rechazos = rechazos;
    }

}
