/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.Dao;

import com.thoughtworks.xstream.XStream;

/**
 *
 * @author marylin
 */
public class Conexion {

    private XStream xstream;
    public static String URL = "data/";

    public void conectar() {
        xstream = new XStream(new JettisonMappedXmlDriver());
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

}
