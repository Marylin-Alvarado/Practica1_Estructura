/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.ed.lista.exception;

/**
 *
 * @author marylin
 */
public class NullException extends Exception {

    public NullException(String message) {
        super(message);

    }

    public NullException() {
        super("La lista esta vacia, revise de nuevo");

    }

}
