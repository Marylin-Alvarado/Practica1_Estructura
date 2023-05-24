/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.ed.lista.ListaEnlazada;
import modelo.EnumMes;
import modelo.Sucursal;
import modelo.Venta;

/**
 *
 * @author marylin
 */
public class VentaControl {

    ListaEnlazada<Venta> ListaVenta;
    private Sucursal sucursal;
    private Venta venta;
    private EnumMes mes;

    public ListaEnlazada<Venta> getListaVenta() {
        return ListaVenta;
    }

    public void setListaVenta(ListaEnlazada<Venta> ListaVenta) {
        this.ListaVenta = ListaVenta;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public EnumMes getMes() {
        return mes;
    }

    public void setMes(EnumMes mes) {
        this.mes = mes;
    }
    
    
    
    

}
