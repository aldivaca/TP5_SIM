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

    public void repeticion() {

        if (f1 == null) {
            f1.setReloj(0);
            f1.setEvento("");
            f1.setCola(0);
            f1.setServ1(new Servidor());
            f1.setServ2(new Servidor());
            f1.setContadorTotal(0);
            f1.setRechazos(0);
        } else {

        }
    }

}
