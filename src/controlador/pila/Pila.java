/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.pila;

import controlador.ed.lista.ListaEnlazada;
import controlador.ed.lista.exception.NullException;
import controlador.ed.lista.exception.PosicionException;
import controlador.pila.exception.PilaVaciaException;
import controlador.pila.exception.TopeException;

/**
 *
 * @author marylin
 */
public class Pila<E> extends ListaEnlazada<E> {

    private Integer tope;

    public Pila(Integer tope) {
        this.tope = tope;
    }

    public boolean estaLleno() {
        return tope == getSize();
    }

    public void push(E dato) throws TopeException {
        if (!estaLleno()) {
            insertarCabecera(dato);
        } else {
            throw new TopeException();
        }
    }

    public E pop() throws PilaVaciaException, NullException, PosicionException {
        if (!estaVacia()) {
            E dato = eliminar(0);
            return dato;
        } else {
            throw new PilaVaciaException();
        }

    }

    public Integer getTope() {
        return tope;
    }

    public void setTope(Integer tope) {
        this.tope = tope;
    }

}
