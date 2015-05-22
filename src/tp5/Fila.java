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
    NombreEvento evento;
    LlegadaPC llegada;
    int cola;
    Servidor serv1;
    Servidor serv2;
    Arreglo a1;
    Arreglo a2;
    int contadorTotal;
    int rechazos;
    boolean trabajoEnEspera = false;

    public Fila() {

    }

    public Fila(float reloj, NombreEvento evento, LlegadaPC llegada, int cola, Servidor serv1, Servidor serv2, Arreglo a1, Arreglo a2, int contadorTotal, int rechazos) {
        this.reloj = reloj;
        this.evento = evento;
        this.llegada = llegada;
        this.cola = cola;
        this.serv1 = serv1;
        this.serv2 = serv2;
        this.a1 = a1;
        this.a2 = a2;
        this.contadorTotal = contadorTotal;
        this.rechazos = rechazos;
    }

    public Fila(Fila f1) {
        this.reloj = f1.reloj;
        this.evento = f1.evento;
        this.llegada = f1.llegada;
        this.cola = f1.cola;
        this.serv1 = f1.serv1;
        this.serv2 = f1.serv2;
        this.a1 = f1.a1;
        this.a2 = f1.a2;
        this.contadorTotal = f1.contadorTotal;
        this.rechazos = f1.rechazos;
    }

    public Evento getProximoTiempo() {
        Evento result;
        float lleg, arr1, arr2;
        lleg = llegada.getProxLlegada();
        if (a1 != null) {
            arr1 = a1.getProxEvento().getTiempo();
        } else {
            arr1 = lleg + 1;
        }
        if (a2 != null) {
            arr2 = a2.getProxEvento().getTiempo();
        } else {
            arr2 = lleg + 2;
        }
        if (arr1 < lleg) {
            if (arr1 < arr2) {
                result = new Evento(a1.getProxEvento());
                if (result.getEvento() == NombreEvento.FIN_ARREGLO || result.getEvento() == NombreEvento.SUSPENSION) {
                    this.serv1.setOcupado(false);
                    this.a1 = null;
                    if (result.getEvento() == NombreEvento.SUSPENSION) {
                        this.trabajoEnEspera = true;
                    }
                }
            } else {
                result = new Evento(a2.getProxEvento());
                if (result.getEvento() == NombreEvento.FIN_ARREGLO || result.getEvento() == NombreEvento.SUSPENSION) {
                    this.serv2.setOcupado(false);
                    this.a2 = null;
                    if (result.getEvento() == NombreEvento.SUSPENSION) {
                        this.trabajoEnEspera = true;
                    }
                }
            }
        } else {
            if (lleg < arr2) {
                result = new Evento(lleg, NombreEvento.LLEGADA);
            } else {
                result = new Evento(a2.getProxEvento());
                if (result.getEvento() == NombreEvento.FIN_ARREGLO || result.getEvento() == NombreEvento.SUSPENSION) {
                    this.serv2.setOcupado(false);
                    this.a2 = null;
                    if (result.getEvento() == NombreEvento.SUSPENSION) {
                        this.trabajoEnEspera = true;
                    }
                }
            }

        }
//        System.out.println("-----EL PROXIMO EVENTO SERÁ EL MAS CERCANO QUE ES " + result);
        return result;
    }

    public float getReloj() {
        return reloj;
    }

    public void setReloj(float reloj) {
        this.reloj = reloj;
    }

    public NombreEvento getEvento() {
        return evento;
    }

    public void setEvento(NombreEvento evento) {
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

    void aumentarCola() {
        this.cola = cola + 1;
    }

    void aumentarRechazos() {
        this.rechazos = rechazos + 1;
    }

    void disminuirCola() {
        this.cola = cola - 1;
    }

    public boolean isTrabajoEnEspera() {
        return trabajoEnEspera;
    }

    public void setTrabajoEnEspera(boolean trabajoEnEspera) {
        this.trabajoEnEspera = trabajoEnEspera;
    }

    @Override
    public String toString() {
        return "Fila{" + "reloj=" + reloj + ", evento=" + evento + ", llegada=" + llegada + ", cola=" + cola + ", serv1=" + serv1 + ", serv2=" + serv2 + ", a1=" + a1 + ", a2=" + a2 + ", contadorTotal=" + contadorTotal + ", rechazos=" + rechazos + ", trabajoEnEspera=" + trabajoEnEspera + '}';
    }

    void aumentarContador() {
        this.contadorTotal = contadorTotal + 1;
    }

}
