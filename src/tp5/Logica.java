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

    public void nuevaFila() {

        if (f1 == null) {
            iniciar();
        } else {

        }
    }

    private void iniciar() {
        f1.setReloj(0);
        f1.setEvento(NombreEvento.ESTADO);
        f1.setCola(0);
        f1.setServ1(new Servidor());
        f1.setServ2(new Servidor());
        f1.setContadorTotal(0);
        f1.setRechazos(0);
        generarLlegada(0);
    }

    private void generarLlegada(float reloj) {
        if (reloj == 0) {
            LlegadaPC llegada = new LlegadaPC(0);
            f2.setReloj(reloj);
            f2.setEvento(NombreEvento.INICIO);
            f2.setLlegada(llegada);
            f2.setCola(0);
            f2.setServ1(new Servidor());
            f2.setServ2(new Servidor());
            f2.setContadorTotal(0);
            f2.setRechazos(0);
        } else {
            f2 = new Fila(f1);
            LlegadaPC llegada = new LlegadaPC(reloj);
            f2.setReloj(reloj);
            f2.setEvento(NombreEvento.LLEGADA);
            f2.setLlegada(llegada);
            if (f1.getServ1().isOcupado() && f1.getServ2().isOcupado()) {
                if (f1.getCola() < 3) {
                    f2.aumentarCola();
                } else {
                    f2.aumentarRechazos();
                }
            }
        }
    }

}
