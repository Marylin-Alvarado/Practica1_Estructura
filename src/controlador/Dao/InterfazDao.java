/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.Dao;

import controlador.ed.lista.ListaEnlazada;
import java.io.FileNotFoundException;
import controlador.ed.lista.exception.PosicionException;
import java.io.IOException;

/**
 *
 * @author marylin
 */
public interface InterfazDao<T> {
    
        /**
     * 
     * @param obj 
     * @throws java.io.IOException 
     */
    
    public void guardar(T obj)  throws IOException;
    /**
     * 
     * @param obj
     * @param pos 
     */
    public void modificar(T obj, Integer pos);
    /**
     * 
     * @return 
     */
    public ListaEnlazada<T> listar();
    /**
     * 
     * @param id
     * @return 
     */
    public T obtener(Integer id);

}
