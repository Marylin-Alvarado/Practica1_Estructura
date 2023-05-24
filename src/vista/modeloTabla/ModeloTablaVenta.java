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
   

    private ListaEnlazada<Venta> datos = new ListaEnlazada<>();

    public ListaEnlazada<Venta> getDatos() {
        return datos;
    }

    public void setDatos(ListaEnlazada<Venta> datos) {
        this.datos = datos;
    }

    public int getColumnCount() {
        return 6;
    }

    public int getRowCount() {
        return datos.getSize();
    }

    public String getColumnName(int column) {
          switch (column) {
            case 0:
                return "MES";
            case 1:
                return "VALOR";
            case 2:
                return "Sucursal";
            default:
                return null;
        }
    }

    public Object getValueAt(int rowIndex, int i1) {
        Venta v = null;
        try {
            v = datos.obtener(rowIndex);
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
