/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.ed.lista;


import controlador.ed.lista.exception.AtributoException;
import controlador.ed.lista.exception.NullException;
import controlador.ed.lista.exception.PosicionException;
import controlador.utiles.Utilidades;
import static java.awt.PageAttributes.MediaType.E;
import static java.lang.Math.E;
import static java.lang.StrictMath.E;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import modelo.Sucursal;
import modelo.Venta;

/**
 *
 * @author marylin
 */
public class ListaEnlazada<E> {

    private NodoLista<E> cabecera;
    private Integer size;
    private ListaEnlazada Nodo;
    public Double length;

    public ListaEnlazada() {
        cabecera = null;
        size = 0;
    }

    public NodoLista getCabecera() {
        return cabecera;
    }

    public void setCabecera(NodoLista cabecera) {
        this.cabecera = cabecera;
    }

    public boolean isEmpty() {
        return cabecera == null;
    }

    public int getTamaño() {
        int tamaño = 20;
        return tamaño;
    }

    public Boolean estaVacia() {
        return cabecera == null;
    }

//    private Integer tamanio() {
//        Integer tamanio = 0;
//        NodoLista<E> aux` = cabecera;
//        while (aux != null) {
//            tamanio++;
//            aux = aux.getSiguiente();
//        }
//        return tamanio;
//    }
    public void insertar(E dato) {
        NodoLista<E> nodo = new NodoLista<>(dato, null);
        if (estaVacia()) {
            this.cabecera = nodo;
        } else {
            NodoLista<E> aux = cabecera;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nodo);
        }
        size++;

    }

    public void insertarCabecera(E dato) {

        if (estaVacia()) {
            insertar(dato);
        } else {
            NodoLista<E> nodo = new NodoLista<>(dato, null);
            nodo.setSiguiente(cabecera);
            cabecera = nodo;
            size++;

        }
    }

    public void insertarPosicion(E dato, Integer pos) throws PosicionException {
        if (estaVacia()) {
            insertar(dato);
        } else if (pos >= 0 && pos < size) {
            if (pos == (size - 1)) {
                insertar(dato);
            } else if (pos == 0) {
                insertarCabecera(dato);
            } else {
                NodoLista<E> nodo = new NodoLista(dato, null);
                NodoLista<E> aux = cabecera;
                for (int i = 0; i < (pos - 1); i++) {
                    aux = aux.getSiguiente();
                }
                NodoLista<E> siguiente = aux.getSiguiente();
                aux.setSiguiente(nodo);
                nodo.setSiguiente(siguiente);
                size++;
            }

        } else {
            throw new PosicionException();
        }
    }

    public void imprimir() {
        System.out.println("----------------------LISTA ENLAZADA----------------------");
        NodoLista<E> aux = cabecera;
        while (aux != null) {
            System.out.print(aux.getDato().toString() + "\t");
            aux = aux.getSiguiente();

        }
        System.out.println("\n----------------------------------------------------------");
    }

    public E obtener(Integer pos) throws NullException, PosicionException {

        if (!estaVacia()) {
            E dato = null;
            if (pos >= 0 && pos < size) {
                if (pos == 0) {
                    dato = cabecera.getDato();
                } else {
                    NodoLista<E> aux = cabecera;
                    for (int i = 0; i < pos; i++) {
                        aux = aux.getSiguiente();
                    }
                    dato = aux.getDato();
                }
            } else {
                throw new PosicionException();
            }
            return dato;
        } else {
            throw new NullException();
        }
        //return dato;

    }

    public void modificar(E dato, Integer pos) throws PosicionException {
        if (!estaVacia()) {
            insertar(dato);

        } else if (pos >= 0 && pos < size) {
            if (pos == 0) {
                cabecera.setDato(dato);
            } else {
                NodoLista<E> aux = cabecera;
                for (int i = 0; i < pos; i++) {
                    aux = aux.getSiguiente();
                }
                aux.setDato(dato);
            }

        } else {
            throw new PosicionException();
        }

    }

    public E eliminar(Integer pos) throws NullException, PosicionException {

        if (!estaVacia()) {
            E dato = null;
            if (pos >= 0 && pos < size) {
                if (pos == 0) {
                    dato = cabecera.getDato();
                    cabecera = cabecera.getSiguiente();
                    size--;
                } else {
                    NodoLista<E> aux = cabecera;
                    for (int i = 0; i < pos; i++) {
                        aux = aux.getSiguiente();
                    }
                    dato = aux.getDato();
                    NodoLista<E> proximo = aux.getSiguiente();
                    aux.setSiguiente(proximo.getSiguiente());
                    size--;
                }
            } else {
                throw new PosicionException();
            }
            return dato;
        } else {
            throw new NullException();
        }
    }

    public E[] toArray() {
        E[] matriz = null;
        if (this.size > 0) {
            matriz = (E[]) Array.newInstance(cabecera.getDato().getClass(), this.size);
            NodoLista<E> aux = cabecera;
            for (int i = 0; i < this.size; i++) {
                matriz[i] = aux.getDato();
                aux = aux.getSiguiente();
            }
        }
        return matriz;
    }

    public ListaEnlazada<E> toList(E[] matriz) {
        this.vaciar();
        for (int i = 0; i < matriz.length; i++) {
            this.insertar(matriz[i]);
        }
        return this;
    }

    public void vaciar() {
        this.cabecera = null;
        this.size = 0;
    }

    public Integer getSize() {
//        this.size = tamanio();
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void modificarPosicion(E dato, Integer pos) throws PosicionException {
        if (estaVacia()) {
            insertar(dato);
        } else if (pos >= 0 && pos < size) {
            if (pos == 0) {
                cabecera.setDato(dato);
            } else {

                NodoLista<E> aux = cabecera;

                for (int i = 0; i < pos; i++) {
                    aux = aux.getSiguiente();
                }
                aux.setDato(dato);
            }

        } else {
            throw new PosicionException();
        }
    }

    /*public int calcularTotalVentasEnAño(int anio) {
        int totalVentas = 0;
        NodoLista<E> actual = cabecera;
        while (actual != null) {
            if (actual.anio == anio) {
                totalVentas += actual.ventas;
            }
            actual = actual.siguiente;
        }
        return totalVentas;
    }
     */
    public void agregar(Object obtener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deleteAll() {
        this.cabecera = null;
        this.size = 0;
    }

    public Integer size() {
        return size;

    }

    public void insertar(int venta, int anio) {
        NodoLista<E>  nuevoNodo = new NodoLista(venta, anio);
        if (cabecera == null) {
            cabecera = nuevoNodo;
        } else {
            NodoLista<E>  actual = cabecera;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public int calcularTotalVentasEnAño(int anio) {
        int totalVentas = 0;
        NodoLista<E>  actual = cabecera;
        while (actual != null) {
            if (actual.anio == anio) {
                totalVentas += actual.anio;
            }
            actual = actual.siguiente;
        }
        return totalVentas;
    }
    
      public String obtenerMesMenorVenta() {
        if (cabecera == null) {
            return "No hay ventas registradas.";
        }

        NodoLista<E> actual = cabecera;
        //String mesMenorVenta = actual.venta.mes;
        //double menorVenta = actual.venta.monto;

       // while (actual != null) {
          //  if (actual.venta.monto < menorVenta) {
           //     menorVenta = actual.venta.monto;
          //      mesMenorVenta = actual.venta.mes;
           // }
        //    actual = actual.siguiente;
       // }

        return null;
    }

    public int tamanio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Iterable<Venta> getVentas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Sucursal get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
    

    
    
 

}


