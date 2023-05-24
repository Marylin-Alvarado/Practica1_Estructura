/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.colas.exception;

/**
 *
 * @author marylin
 */
public class ColaVaciaException extends Exception {

    public ColaVaciaException(String msg) {
        super(msg);
    }

    public ColaVaciaException() {
        super("La cola esta vacia");
    }

}
