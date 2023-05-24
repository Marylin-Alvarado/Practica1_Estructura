/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.colas;

import controlador.colas.exception.CimaException;
import controlador.ed.lista.ListaEnlazada;
import controlador.ed.lista.exception.NullException;
import controlador.ed.lista.exception.PosicionException;
import controlador.colas.exception.ColaVaciaException;

/**
 *
 * @author marylin
 */
public class Cola<E> extends ListaEnlazada<E> {

    private Integer cima;
     private Integer tope;

    public Cola(Integer cima) {
        this.cima = cima;
        this.tope = tope;
    }

    public Boolean estaLleno() {
        return cima == getSize();

    }

    public void queue(E dato) throws PosicionException, CimaException {
        if (!estaLleno()) {
            insertarPosicion(dato, getSize() - 1);
        } else {
            throw new CimaException();
        }

    }

    public E dequue() throws ColaVaciaException, PosicionException, NullException {
        if (!estaVacia()) {
            E dato = eliminar(0);
            return dato;
        } else {
            throw new ColaVaciaException();
        }

    }
    
     public Integer getTope() {
        return tope;
    }

    public void setTope(Integer tope) {
        this.tope = tope;
    }


}
