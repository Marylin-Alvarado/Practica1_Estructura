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
public class PosicionException extends Exception {

    public PosicionException(String message) {
        super(message);
    }

    public PosicionException() {
        super("La posicion dada esta fuera de los limites de la lista");
    }

}
