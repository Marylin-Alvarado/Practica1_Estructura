/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.Dao;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.StreamException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author marylin
 */
public class Conexion {

   /* private XStream xstream;
    public static String URL = "data/";

    public void conectar() {
        //xstream = new XStream(new JettisonMappedXmlDriver());
        xstream.setMode(XStream.NO_REFERENCES);
    }

    public XStream getXstream() {
        if (xstream == null) {
            conectar();
        }
        return xstream;
    }

    public void setXstream(XStream xtream) {
        this.xstream = xtream;
    }
*/
 


    private XStream xstream;
    public static String URL = "data/";

    public void conectar() {
        //xstream = new XStream(new JettisonMappedXmlDriver());
        xstream.setMode(XStream.NO_REFERENCES);
    }

    public XStream getXstream() {
        if (xstream == null) {
            conectar();
        }
        return xstream;
    }

    public void setXstream(XStream xtream) {
        this.xstream = xtream;
    }

    public <T> void guardarListaEnlazada(Nodo<T> lista, Class<T> clazz) throws IOException {
        String url = URL + clazz.getSimpleName().toLowerCase() + ".json";
        getXstream().alias(clazz.getSimpleName().toLowerCase(), clazz);
        getXstream().toXML(lista, new FileWriter(url));
    }

    public <T> Nodo<T> cargarListaEnlazada(Class<T> clazz) throws StreamException {
        String url = URL + clazz.getSimpleName().toLowerCase() + ".json";
        return (Nodo<T>) getXstream().fromXML(url);
    }

    public static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;

        public Nodo(T dato) {
            this.dato = dato;
        }
    }
}



