/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.Dao;

;

import com.thoughtworks.xstream.io.StreamException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;

/**
 *
 * @author marylin
 */
public class AdaptadorDao<T> implements InterfazDao<T> {

    private Conexion conexion;
    private Class clazz;
    private String url;

    public AdaptadorDao(Class clazz) {
        this.conexion = new Conexion();
        this.clazz = clazz;
        this.url = Conexion.URL + clazz.getSimpleName().toLowerCase() + ".json";

    }

    
    public void guardar(T obj) throws IOException {
        T[] lista = (T[]) Array.newInstance(clazz, 1);
        try {
            T[] aux = listar();
            lista = (T[]) Array.newInstance(clazz, aux.length + 1);
            for (int i = 0; i < aux.length; i++) {
                lista[i] = aux[i];
            }
            lista[aux.length] = obj;
            System.out.println("pok");

        } catch (Exception e) {
            System.out.println("gg");
            lista[0] = obj ;
        }
        conexion.getXstream().alias(clazz.getSimpleName().toLowerCase(), clazz);
        conexion.getXstream().toXML(obj, new FileWriter(url));
    }

    
    public void modificar(T obj, Integer pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public T[] listar() throws StreamException {
        //System.out.println(conexion.getXstream().fromXML(url));
        T[] lista = (T[]) conexion.getXstream().fromXML(url);
        return lista;
    }

    
    public T[] obtener(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
