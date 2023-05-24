/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.modeloTabla;

import controlador.ed.lista.ListaEnlazada;
import javax.swing.table.AbstractTableModel;
import modelo.Reclamo;

/**
 *
 * @author marylin
 */
public class ModeloTablaReclamo extends AbstractTableModel {

    private ListaEnlazada<Reclamo> reclamo = new ListaEnlazada<>();

    public ListaEnlazada<Reclamo> getReclamo() {
        return reclamo;
    }

    public void setReclamo(ListaEnlazada<Reclamo> reclamo) {
        this.reclamo = reclamo;
    }

    public int getColumnCount() {
        return 6;
    }

    public int getRowCount() {
        return reclamo.getSize();
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
        Reclamo s = null;
        try {
            s = reclamo.obtener(rowIndex);
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
    

