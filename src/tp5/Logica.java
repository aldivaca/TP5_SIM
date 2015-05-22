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
public class Logica {

    Fila f1 = null;
    Fila f2 = null;

    public Fila nuevaFila(Fila f) {
        f1 = f;
        if (f1 == null) {
            iniciar();
//            System.out.println("F1: " + f1);
//            System.out.println("F2: " + f2);
        } else {
            f1 = new Fila(f);

            Evento proxFila = f1.getProximoTiempo();

            f2 = new Fila(f1);

            switch (proxFila.getEvento()) {
                case LLEGADA:
                    generarLlegada(proxFila.getTiempo());
                    break;
                case FIN_ARREGLO:
                    atenderCola(proxFila.getTiempo());
                    break;
                case SUSPENSION:
                    atenderCola(proxFila.getTiempo());
                    f2.setTrabajoEnEspera(true);
                    break;
                case REINICIO_ARREGLO:
                    atenderCola(proxFila.getTiempo());
                    break;
            }

//            System.out.println("F1: " + f1);
//            System.out.println("F2: " + f2);
        }
        return f2;
    }

    private void iniciar() {
        f1 = new Fila();
        f1.setReloj(0);
        f1.setEvento(NombreEvento.ESTADO_INICIAL);
        f1.setCola(0);
        Arreglo a = new Arreglo();
        f1.setA1(a);
        f1.setA2(a);
        f1.setServ1(new Servidor());
        f1.setServ2(new Servidor());
        f1.setContadorTotal(0);
        f1.setRechazos(0);
        System.out.println("F1: " + f1);
        generarLlegada(0);
    }

    private void generarLlegada(float reloj) {
        if (reloj == 0) {
            f2 = new Fila();
            f2.setEvento(NombreEvento.INICIO_SIM);
            f2.setCola(0);
            f2.setServ1(new Servidor());
            f2.setServ2(new Servidor());
            f2.setContadorTotal(0);
            f2.setRechazos(0);
        } else {
            f2 = new Fila(f1);
            f2.setEvento(NombreEvento.LLEGADA);
            if (f1.getServ1().isOcupado() && f1.getServ2().isOcupado()) {
                if (f1.getCola() < 3) {
                    f2.aumentarCola();
                } else {
                    f2.aumentarRechazos();
                }
            } else {
                if (f1.getCola() == 0) {
                    generarArreglo(reloj);
                }
            }
            f2.setEvento(NombreEvento.LLEGADA);

        }
        LlegadaPC llegada = new LlegadaPC(reloj);
        f2.setReloj(reloj);
        f2.setLlegada(llegada);

    }

    private void generarArreglo(float reloj) {
        Arreglo arreglo = new Arreglo(reloj);
        f2.setReloj(reloj);
        f2.setEvento(NombreEvento.INICIO_ARREGLO);
        if (f2.getServ1().isOcupado()) {
            f2.getServ2().setOcupado(true);
            f2.setA2(arreglo);
        } else {
            f2.getServ1().setOcupado(true);
            f2.setA1(arreglo);
        }
    }

    private void atenderCola(float reloj) {
        f2.aumentarContador();
        if (f1.isTrabajoEnEspera()) {
            generarReinicio(reloj);
        } else {
            if (f1.getCola() > 0) {
                f2.disminuirCola();
                generarArreglo(reloj);
            } else {
                generarFinArreglo(reloj);
            }
        }
    }

    private void generarReinicio(float reloj) {
        Arreglo arreglo = new Arreglo(reloj, 3, 15);
        f2.setReloj(reloj);
        f2.setEvento(NombreEvento.REINICIO_ARREGLO);
        if (f2.getServ1().isOcupado()) {
            f2.getServ2().setOcupado(true);
            f2.setA2(arreglo);
        } else {
            f2.getServ1().setOcupado(true);
            f2.setA1(arreglo);
        }
    }

    public Fila getF1() {
        return f1;
    }

    public void setF1(Fila f1) {
        this.f1 = f1;
    }

    public Fila getF2() {
        return f2;
    }

    public void setF2(Fila f2) {
        this.f2 = f2;
    }

    private void generarFinArreglo(float reloj) {
        f2.setReloj(reloj);
        f2.setEvento(NombreEvento.FIN_ARREGLO);

    }

}
