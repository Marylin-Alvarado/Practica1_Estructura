/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.utiles;

import controlador.SucursalControl;
import controlador.ed.lista.ListaEnlazada;
import controlador.ed.lista.exception.NullException;
import controlador.ed.lista.exception.PosicionException;
import modelo.Historial;
import modelo.Sucursal;
import modelo.Venta;
import vista.FrmSucursal;
import vista.modeloTabla.ModeloTablaSucursal;
import vista.modeloTabla.ModeloTablaVenta;

/**
 *
 * @author marylin
 */
public class Utilidades {
    
        private SucursalControl sc = new SucursalControl();
    private ModeloTablaSucursal modeloS = new ModeloTablaSucursal();
    private ModeloTablaVenta modeloV = new ModeloTablaVenta();
    


    /*public static void imprimirArreglo(Object[] objs) {
        System.out.println("Lista de" + objs.getClass().getSimpleName());
        for (Object o : objs) {
            System.out.println(o.toString());
        }

    }

    public static Object[] agregar(Object[] base, Object[] a, Integer pos) {
        System.out.println(base.length + "  " + pos + "  " + a.length);
        Integer cont = 0;
        for (int i = pos; i < base.length; i++) {
            base[i] = a[cont];
            cont++;
            if (cont == a.length) {
                break;
            }
        }
        return base;
    }

    public static Double sumarVentas(Sucursal s) {
        if (s.getVentas() != null) {
            Double ventas = 0.0;
            for (Venta v : s.getVentas()) {
                ventas += v.getValor();
            }
            return ventas;
        }
        return 0.0;
    }

    public static Double mediaVentas(Sucursal s) {
        Double suma = sumarVentas(s);
        if (suma == 0) {
            return suma;
        } else {
            return suma / (s.getVentas().length);
        }
    }

    /*public static void imprimirArreglo(Object [] arreglo) {
        for(int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i] + "\t");
        }
    }
     
    public static void imprimirLista(Object[] objs) {
        System.out.println("Lista de " + objs.getClass().getSimpleName());
        for (Object o : objs) {
            System.out.println(o.toString());
        }
    }

    public static Double sumarVentas(Sucursal s) {
        if (s.getVentas() != null) {
            Double ventas = 0.0;
            for (Venta v : s.getVentas()) {
                ventas += v.getValor();
            }
            return ventas;
        }
        return 0.0;
    }

    public static Double mediaVentas(Sucursal s) {
        Double suma = sumarVentas(s);
        if (suma == 0) {
            return suma;
        } else {
            return suma / (s.getVentas().length);
        }
    }
     */
    public static void imprimirListaEnlazada(ListaEnlazada lista) throws NullException, PosicionException {
        System.out.println("Lista de " + lista.getTamaño() + " elementos");
        for (int i = 0; i < lista.getTamaño(); i++) {
            Object dato = lista.obtener(i);
            System.out.println(dato.toString());
        }
    }

    public static ListaEnlazada agregar(ListaEnlazada base, ListaEnlazada a, Integer pos) throws NullException, PosicionException {
        ListaEnlazada nuevaLista = new ListaEnlazada();
        for (int i = 0; i < pos; i++) {
            nuevaLista.agregar(base.obtener(i));
        }
        for (int i = 0; i < a.getTamaño(); i++) {
            nuevaLista.agregar(a.obtener(i));
        }
        for (int i = pos; i < base.getTamaño(); i++) {
            nuevaLista.agregar(base.obtener(i));
        }
        return nuevaLista;
    }

    public static Double sumarVentas(Sucursal s) {
        if (s.getVentas() != null) {
            Double ventas = 0.0;
            for (Venta v : s.getVentas() .getVentas()) {
                ventas += v.getValor();
            }
            return ventas;
        }
        return 0.0;
    }

    public static Double mediaVentas(Sucursal s) {
        Double suma = sumarVentas(s);
        if (suma == 0) {
            return suma;
        } else {
            return suma / (s.getVentas().length);
        }
    }
    
 
    



    public static Object sumarVentas(Historial s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Object mediaVentas(Historial s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
