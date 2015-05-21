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

    Fila f1;
    Fila f2;
    
    public enum Evento{
        LLEGADA,INICIO,FIN_ARREGLO,INICIO_ATENCION
    }
            
          

    public void repeticion() {

        if (f1 == null) {
            f1.setReloj(0);
            f1.setEvento("");
        }
    }

}
