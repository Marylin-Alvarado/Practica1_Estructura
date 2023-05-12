/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.modeloTabla;

import controlador.ed.lista.ListaEnlazada;
import controlador.utiles.Utilidades;
import javax.swing.table.AbstractTableModel;
import modelo.Sucursal;

/**
 *
 * @author marylin
 */
public class ModeloTablaSucursal extends AbstractTableModel {

    private ListaEnlazada<Sucursal> lista = new ListaEnlazada<>();

    public ListaEnlazada<Sucursal> getLista() {
        return lista;
    }

    public void setLista(ListaEnlazada<Sucursal> lista) {
        this.lista = lista;
    }

    public int getColumnCount() {
        return 6;
    }

    public int getRowCount() {
        return lista.getSize();
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Sucursal";
            case 1:
                return "Venta Anual";
            case 2:
                return "Venta Promedio";
            default:
                return null;
        }
    }

    public Object getValueAt(int rowIndex, int i1) {
        Sucursal s = null;
        try {
            s = lista.obtener(rowIndex);
        } catch (Exception e) {
        }
          switch (i1) {
            case 0:
                return (s != null) ? s.getNombre() : "NO DEFINIDO";
            case 1:
                return  (s != null) ? Utilidades.sumarVentas(s) : 0.0;
            case 2:
                return  (s != null) ? Utilidades.mediaVentas(s) : 0.0;
            default:
                return null;
        }
    }

}
