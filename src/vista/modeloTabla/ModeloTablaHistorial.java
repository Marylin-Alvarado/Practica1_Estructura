/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.modeloTabla;

import controlador.ed.lista.ListaEnlazada;
import javax.swing.table.AbstractTableModel;
import modelo.Historial;

/**
 *
 * @author marylin
 */
public class ModeloTablaHistorial extends AbstractTableModel {

    private ListaEnlazada<Historial> histo = new ListaEnlazada<>();

    public ListaEnlazada<Historial> getHisto() {
        return histo;
    }

    public void setHisto(ListaEnlazada<Historial> histo) {
        this.histo = histo;
    }

    public int getColumnCount() {
        return 6;
    }

    public int getRowCount() {
        return histo.getSize();
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "fecha";
            case 1:
                return "Sucursal";
            case 2:
                return "Descripcion";


            default:
                return null;
        }
    }

    public Object getValueAt(int rowIndex, int i1) {
        Historial s = null;
        try {
            s = histo.obtener(rowIndex);
        } catch (Exception e) {
        }
          switch (i1) {
            case 0:
                return (s != null) ? s.getNombre() : "NO DEFINIDO";


            default:
                return null;
        }
    }
    
}
