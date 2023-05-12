/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.modeloTabla;

import controlador.ed.lista.ListaEnlazada;
import controlador.utiles.Utilidades;
import javax.swing.table.AbstractTableModel;
import modelo.Venta;


/**
 *
 * @author marylin
 */
public class ModeloTablaVenta extends AbstractTableModel{
   

    private ListaEnlazada<Venta> lista = new ListaEnlazada<>();

    public ListaEnlazada<Venta> getLista() {
        return lista;
    }

    public void setLista(ListaEnlazada<Venta> lista) {
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
                return "MES";
            case 1:
                return "VALOR";
            default:
                return null;
        }
    }

    public Object getValueAt(int rowIndex, int i1) {
        Venta v = null;
        try {
            v = lista.obtener(rowIndex);
        } catch (Exception e) {
        }
         switch (i1) {
            case 0:
                return (v != null) ? v.getMes().toString() : "NO DEFINIDO";
            case 1:
                return  (v != null) ? v.getValor() : 0.0;
            default:
                return null;
        }
    }

    
}
