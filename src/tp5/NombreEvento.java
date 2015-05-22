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
public enum NombreEvento {

    LLEGADA, INICIO_ARREGLO, FIN_ARREGLO, INICIO_SIM, SUSPENSION, REINICIO_ARREGLO, ESTADO_INICIAL;

    @Override
    public String toString() {
        switch (this) {
            case LLEGADA:
                return "Llegada de PC";
            case FIN_ARREGLO:
                return "Fin de Arreglo de PC";
            case INICIO_SIM:
                return "Inicio de Simulacion";
            case SUSPENSION:
                return "Suspensión de trabajo C";
            case REINICIO_ARREGLO:
                return "Reinicio de trabajo suspendido";
            case ESTADO_INICIAL:
                return "Vector Estado";
            case INICIO_ARREGLO:
                return "Inicio de Arreglo de PC";
            default:
                return "ERROR";
        }
    }

}
