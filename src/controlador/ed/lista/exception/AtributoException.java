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
public class AtributoException extends Exception{

    public AtributoException() {
        System.out.println("No se puede encontrar un atributo");
    }

    public AtributoException(String message) {
        super(message);
    }

}
