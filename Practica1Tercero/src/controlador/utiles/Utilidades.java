/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.utiles;

import modelo.Sucursal;
import modelo.Venta;

/**
 *
 * @author marylin
 */
public class Utilidades {
    
       public static void imprimirArreglo(Object[] objs) {
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
    
    public static Double sumarVentas(Sucursal s){
        if(s.getVentas() != null){
            Double ventas = 0.0;
            for(Venta v:s.getVentas()){
                ventas += v.getValor();
            }
            return ventas;
        }
        return 0.0;
    }
    
    public static Double mediaVentas(Sucursal s){
        Double suma = sumarVentas(s);
        if(suma == 0)
        return suma;
        else
            return suma/(s.getVentas().length);
    }

    /*public static void imprimirArreglo(Object [] arreglo) {
        for(int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i] + "\t");
        }
    }
     */
    
}
