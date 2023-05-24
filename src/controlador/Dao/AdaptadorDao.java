/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.Dao;

;

import com.thoughtworks.xstream.io.StreamException;
import controlador.ed.lista.ListaEnlazada;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;

/**
 *
 * @author marylin
 */


public class AdaptadorDao<T> implements InterfazDao<T> {

   /* private Conexion conexion;
    private Class clazz;
    private String url;

    public AdaptadorDao(Class clazz) {
        this.conexion = new Conexion();
        this.clazz = clazz;
        this.url = Conexion.URL + clazz.getSimpleName().toLowerCase() + ".json";

    }

    
    public void guardar(T obj) throws IOException {
        ListaEnlazada<T> lista = (ListaEnlazada<T>) Array.newInstance(clazz, 1);
        try {
            ListaEnlazada<T> aux = listar();
            //lista = (T[]) Array.newInstance(clazz, aux.length + 1);
            //for (int i = 0; i < aux.length; i++) {
              //  lista[i] = aux[i];
           // }
            //lista[aux.length] = obj;
            System.out.println("pok");

        } catch (Exception e) {
            System.out.println("gg");
            //lista[0] = obj ;
        }
        conexion.getXstream().alias(clazz.getSimpleName().toLowerCase(), clazz);
        conexion.getXstream().toXML(obj, new FileWriter(url));
    }

    
    public void modificar(T obj, Integer pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public ListaEnlazada<T> listar() throws StreamException {
        //System.out.println(conexion.getXstream().fromXML(url));
        //T[] lista = (T[]) conexion.getXstream().fromXML(url);
        return null;
    }

    
    public T obtener(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     */
    private Conexion conexion;
    private Class<T> clazz;
    private String url;

    public AdaptadorDao(Class<T> clazz) {
        this.conexion = new Conexion();
        this.clazz = clazz;
        this.url = Conexion.URL + clazz.getSimpleName().toLowerCase() + ".json";
    }

    @Override
    public void guardar(T obj) throws IOException {
        Nodo<T> lista = null;
        try {
            ListaEnlazada<T> aux = listar();
            Nodo<T> nuevoNodo = new Nodo<>(obj);
            if (aux == null) {
                lista = nuevoNodo;
            } else {
                Nodo<T> ultimo = obtenerUltimoNodo(aux);
                ultimo.siguiente = nuevoNodo;
            }
            System.out.println("pok");

        } catch (Exception e) {
            System.out.println("gg");
            lista = new Nodo<>(obj);
        }
        conexion.getXstream().alias(clazz.getSimpleName().toLowerCase(), clazz);
        conexion.getXstream().toXML(obj, new FileWriter(url));
    }

    public void modificar(T obj, Integer pos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ListaEnlazada<T> listar() throws StreamException {
        ListaEnlazada<T> lista = (ListaEnlazada<T>) conexion.getXstream().fromXML(url);
        return lista;
    }

    public T obtener(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private Nodo<T> obtenerUltimoNodo(Nodo<T> lista) {
        Nodo<T> nodoActual = lista;
        while (nodoActual.siguiente != null) {
            nodoActual = nodoActual.siguiente;
        }
        return nodoActual;
    }

    private Nodo<T> obtenerUltimoNodo(ListaEnlazada<T> aux) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private class Nodo<T> {

        T dato;
        Nodo<T> siguiente;

        public Nodo(T dato) {
            this.dato = dato;
        }
    }
}
