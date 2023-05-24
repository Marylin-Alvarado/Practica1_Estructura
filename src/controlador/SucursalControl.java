/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.ed.lista.ListaEnlazada;
import controlador.ed.lista.exception.NullException;
import controlador.ed.lista.exception.PosicionException;
import controlador.exception.EspacioException;
import modelo.EnumMes;
import modelo.Sucursal;
import modelo.Venta;

/**
 *
 * @author marylin
 */
public class SucursalControl {

    ListaEnlazada<Sucursal> ListaSucursal;

    private Sucursal sucursal;
    private Venta venta;
    private EnumMes mes;

    /*public boolean guardarVenta(Venta venta) {
        if (estaLleno()) {
            return false;
        } else {
            getSucursal().getVentas()[verificarPosicion() + 1] = venta;
            return true;
        }

    }
    
   
   


    public int verificarPosicion() {
        int pos = -1;//este vacio
        //0 hasta limite real
        for (int i = 0; i < getSucursal().getVentas().length; i++) {
            if (getSucursal().getVentas()[i] == null) {
                break;
            } else {
                pos = i;
            }
        }
        return pos;
    }


    public boolean estaLleno() {
        boolean band = false;
        int tamanio = getSucursal().getVentas().length;
        int pos = verificarPosicion();
        //band = pos < tamanio - 1;
        return getSucursal().getVentas().length < verificarPosicion() - 1;
    }

    public boolean guardarVentas(Integer posVenta, Double valor, Integer posSucursal) throws EspacioException {
        if (verificarVenta(posVenta, posSucursal) == true) {
            //ListaEnlazada<posSucursal>.getVentas()<posVenta>.setValor(valor);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean guardarVentas(Integer posVenta, Double valor) throws EspacioException {
        if (this.sucursal != null) {
            if (posVenta <= this.sucursal.getVentas().length - 1) {
                sucursal.getVentas()[posVenta].setValor(valor);
            } else {
                throw new EspacioException();
            }
        } else {
            throw new NullPointerException("Debe seleccionar una sucursal");
        }
        return true;
    }
     */
    /**
     * Metodo para guardar la Venta
     * @param venta
     * @return 
     */
    public boolean guardarVenta(Venta venta) {
        if (estaLleno()) {
            return false;
        } else {
            getSucursal().getVentas().agregar(venta);
            return true;
        }
    }

    /**
     * Metodo para verificar la posicion de sucursal y venta
     * @return 
     */
    public int verificarPosicion() {
      //  int pos = -1; // vacío
     //   int i = 0;
      //  for (Venta venta : getSucursal().getVentas()) {
     //       if (venta == null) {
             //   break;
        //    } else {
        //        pos = i;
        //    }
         //   i++;
       // }
        return 0;
    }
    
    /**
     * Metodo para ver si la lista esta llena
     * @return 
     */
    public boolean estaLleno() {
        int tamanio = getSucursal().getVentas().tamanio();
        int pos = verificarPosicion();
        return tamanio <= pos + 1;
    }

    /**
     * Metodo para guardar ventas
     * @param posVenta
     * @param valor
     * @param posSucursal
     * @return
     * @throws EspacioException 
     */
    public boolean guardarVentas(Integer posVenta, Double valor, Integer posSucursal) throws EspacioException {
        if (verificarVenta(posVenta, posSucursal)) {
            // ListaEnlazada<posSucursal>.getVentas().get(posVenta).setValor(valor);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo para guardarVentas 
     * @param posVenta
     * @param valor
     * @return
     * @throws EspacioException
     * @throws NullException
     * @throws PosicionException 
     */
    public boolean guardarVentas(Integer posVenta, Double valor) throws EspacioException, NullException, PosicionException {
        if (this.sucursal != null) {
            if (posVenta <= this.sucursal.getVentas().tamanio() - 1) {
                sucursal.getVentas().obtener(posVenta).setValor(valor);
            } else {
                throw new EspacioException();
            }
        } else {
            throw new NullPointerException("Debe seleccionar una sucursal");
        }
        return true;
    }

    /**
     * Metodo para verificar la Venta
     * @param posVenta
     * @param posSucursal
     * @return 
     */
    public Boolean verificarVenta(Integer posVenta, Integer posSucursal) {
        return null;
        /*if(sucursales[posSucursal].getVentas()[posVenta].getValor() == 0.0){
            return true;
        
        }else{
        
            return false;
        }
         */
    }
    
    /**
     * Metodo get de venta
     * @return 
     */

    public Venta getVenta() {
        return venta;
    }

    /**
     * Metodo set de venta
     * @param venta 
     */
    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    /**
     * Metodo sucursalcontrol
     */
    public SucursalControl() {
        ListaSucursal = new ListaEnlazada<>();

    }
    
    /**
     * Metodo get de sucursal
     * @return 
     */

    public Sucursal getSucursal() {
        if (sucursal == null) {
            sucursal = new Sucursal();
        }
        return sucursal;
    }

    /**
     * Metodo set de sucursal
     * @param sucursal 
     */
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    /**
     * Metodo de la lista enlazada de sucursal de get sucursales
     * @return 
     */
    public ListaEnlazada<Sucursal> getSucursales() {
        return ListaSucursal;
    }
    
    /**
     * Metodo de la lista enlazada de sucursal de get sucursaL
     * @return 
     */

    public ListaEnlazada<Sucursal> getListaSucursal() {
        return ListaSucursal;
    }

    /**
     * Metodo de set lista de sucursal
     * @param ListaSucursal 
     */
    public void setListaSucursal(ListaEnlazada<Sucursal> ListaSucursal) {
        this.ListaSucursal = ListaSucursal;
    }


    /**
     * Metodo para imprimir los meses
     * 
     */
    public void imprimir() {
        for (EnumMes mes : EnumMes.values()) {
            System.out.println(mes.toString());
        }
    }

    /**
     * Metodo para registrar
     * @return
     * @throws EspacioException
     * @throws NullException
     * @throws PosicionException 
     */
    public boolean registrar() throws EspacioException, NullException, PosicionException {
        int pos = -1;
        int cont = -1;
        /*for (Sucursal s : sucursales) {
            cont++;

            if (s == null) {
                pos = cont;
                break;
            }
        }
        if (pos == -1) {
            throw new EspacioException();
        }
        sucursal.setVentas(new Venta[EnumMes.values().length]);
        for (int i = 0; i < EnumMes.values().length; i++) {
            Venta venta = new Venta();
            venta.setId(i + 1);
            venta.setMes(EnumMes.values()[i]);
            venta.setValor(0.0);
            sucursal.getVentas()[i] = venta;
        }

        sucursales[pos] = sucursal;
         */

        return true;
    }

}
