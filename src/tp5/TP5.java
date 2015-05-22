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
public class TP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Logica l = new Logica();
        Fila f2 = l.nuevaFila(null);
        System.out.println("F2: " + f2);
        for (int i = 2; i < 500; i++) {
            f2 = l.nuevaFila(f2);
            System.out.println("F" + i + ": " + f2);
        }

    }

}
