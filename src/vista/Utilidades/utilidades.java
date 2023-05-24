/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.Utilidades;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import controlador.ed.lista.ListaEnlazada;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import modelo.Sucursal;
import com.google.gson.reflect.TypeToken;
import controlador.ed.lista.exception.NullException;
import controlador.ed.lista.exception.PosicionException;
import controlador.utiles.Utilidades;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.lang.reflect.Type;
import javax.swing.JComboBox;
import modelo.Historial;
import modelo.Reclamo;
import modelo.Venta;

/**
 *
 * @author marylin
 */
public class utilidades {
    
    /**
     * Metodo para Guardar Sucursal en el formato JSON
     * @param sucursal 
     */

    public static void guardarSucursal(Sucursal sucursal) {
        ListaEnlazada<Sucursal> lista = listarSucursal();
        lista.insertar(sucursal);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(lista);
        try (PrintWriter pw = new PrintWriter(new File("sucursal.json"))) {
            pw.write(jsonString);
        } catch (Exception e) {
            System.out.println("Error en el metodo de guardar en utilidades: " + e);
        }
    }
    
    /**
     * Metodo para Guardar Reclamo en formato JSON
     * @param reclamos 
     */

    public static void guardarReclamo(Reclamo reclamos) {
        ListaEnlazada<Reclamo> reclamo = listarReclamo();
        reclamo.insertar(reclamos);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(reclamo);
        try (PrintWriter pw = new PrintWriter(new File("reclamo.json"))) {
            pw.write(jsonString);
        } catch (Exception e) {
            System.out.println("Error en el metodo de guardar en utilidades: " + e);
        }
    }
    /**
     * Metodo para Guardar el Historial en Formato JSON
     * @param historial 
     */

    public static void guardarHistorial(Historial historial) {
        ListaEnlazada<Historial> histo = listarHistorial();
        histo.insertar(historial);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(histo);
        try (PrintWriter pw = new PrintWriter(new File("historial.json"))) {
            pw.write(jsonString);
        } catch (Exception e) {
            System.out.println("Error en el metodo de guardar en utilidades: " + e);
        }
    }
    
    /**
     * Metodo para Guardar La Venta en el formato JSON
     * @param venta 
     */

    public static void guardarVenta(Venta venta) {
        ListaEnlazada<Venta> lista = listarVenta();
        lista.insertar(venta);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(lista);
        try (PrintWriter pw = new PrintWriter(new File("venta.json"))) {
            pw.write(jsonString);
        } catch (Exception e) {
            System.out.println("Error en el metodo de guardar en utilidades: " + e);
        }
    }
    
    /**
     * Metodo para Listar Sucursal en formato JSON
     * @return 
     */

    public static ListaEnlazada<Sucursal> listarSucursal() {
        ListaEnlazada<Sucursal> lista = new ListaEnlazada<>();
        String json = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("sucursal.json"));
            String linea;
            while ((linea = br.readLine()) != null) {
                json += linea;
            }
            br.close();
//            Persona[] arrayLista = new Gson().fromJson(json, Persona[].class);
            Type tipoLista = new TypeToken<ListaEnlazada<Sucursal>>() {
            }.getType();
//            System.out.println("Tipolist " + tipoLista);
//            List a = stringToArray(json, Persona[].class);
            lista = new Gson().fromJson(json, tipoLista);

        } catch (Exception e) {
            System.out.println("Error en utilidades del metodo listar: " + e);
        }
        return lista;
    }
    
    /**
     * Metodo para Listar el Reclamo en formato JSON
     * @return 
     */
    
    public static ListaEnlazada<Reclamo> listarReclamo() {
        ListaEnlazada<Reclamo> reclam = new ListaEnlazada<>();
        String json = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("reclamo.json"));
            String linea;
            while ((linea = br.readLine()) != null) {
                json += linea;
            }
            br.close();
//            Persona[] arrayLista = new Gson().fromJson(json, Persona[].class);
            Type tipoLista = new TypeToken<ListaEnlazada<Reclamo>>() {
            }.getType();
//            System.out.println("Tipolist " + tipoLista);
//            List a = stringToArray(json, Persona[].class);
            reclam = new Gson().fromJson(json, tipoLista);

        } catch (Exception e) {
            System.out.println("Error en utilidades del metodo listar: " + e);
        }
        return reclam;
    }
    /**
     * Metodo Listar Historial en formato JSON
     * @return 
     */

    public static ListaEnlazada<Historial> listarHistorial() {
        ListaEnlazada<Historial> histo = new ListaEnlazada<>();
        String json = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("historial.json"));
            String linea;
            while ((linea = br.readLine()) != null) {
                json += linea;
            }
            br.close();
//            Persona[] arrayLista = new Gson().fromJson(json, Persona[].class);
            Type tipoLista = new TypeToken<ListaEnlazada<Historial>>() {
            }.getType();
//            System.out.println("Tipolist " + tipoLista);
//            List a = stringToArray(json, Persona[].class);
            histo = new Gson().fromJson(json, tipoLista);

        } catch (Exception e) {
            System.out.println("Error en utilidades del metodo listar: " + e);
        }
        return histo;
    }
    /**
     * Metodo para listar la venta en formato JSON
     * @return 
     */

    public static ListaEnlazada<Venta> listarVenta() {
        ListaEnlazada<Venta> lista = new ListaEnlazada<>();
        String json = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("venta.json"));
            String linea;
            while ((linea = br.readLine()) != null) {
                json += linea;
            }
            br.close();
//            Persona[] arrayLista = new Gson().fromJson(json, Persona[].class);
            Type tipoLista = new TypeToken<ListaEnlazada<Venta>>() {
            }.getType();
//            System.out.println("Tipolist " + tipoLista);
//            List a = stringToArray(json, Persona[].class);
            lista = new Gson().fromJson(json, tipoLista);

        } catch (Exception e) {
            System.out.println("Error en utilidades del metodo listar: " + e);
        }
        return lista;
    }
    /**
     * Metodo para eliminar sucursal en formato JSON
     * @param posicion
     * @throws PosicionException
     * @throws NullException 
     */

    public static void eliminarSucursal(Integer posicion) throws PosicionException, NullException {
        ListaEnlazada<Sucursal> lista = listarSucursal();
        lista.eliminar(posicion);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(lista);
        try (PrintWriter pw = new PrintWriter(new File("sucursal.json"))) {
            pw.write(jsonString);
        } catch (Exception e) {
            System.out.println("Error en el metodo de eliminar en utilidades: " + e);
        }
    }
    /**
     * Metodo eliminar una venta en formato JSON
     * @param posicion
     * @throws PosicionException
     * @throws NullException 
     */

    public static void eliminarVenta(Integer posicion) throws PosicionException, NullException {
        ListaEnlazada<Venta> lista = listarVenta();
        lista.eliminar(posicion);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(lista);
        try (PrintWriter pw = new PrintWriter(new File("venta.json"))) {
            pw.write(jsonString);
        } catch (Exception e) {
            System.out.println("Error en el metodo de eliminar en utilidades: " + e);
        }
    }
    /**
     * Metodo modificar sucursal en formato JSON
     * @param sucursal
     * @param posicion
     * @throws PosicionException 
     */

    public static void modificarSucursal(Sucursal sucursal, Integer posicion) throws PosicionException {
        ListaEnlazada<Sucursal> lista = listarSucursal();
        lista.modificarPosicion(sucursal, posicion);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(lista);
        try (PrintWriter pw = new PrintWriter(new File("sucursal.json"))) {
            pw.write(jsonString);
        } catch (Exception e) {
            System.out.println("Error en el metodo de guardar en utilidades: " + e);
        }
    }
    /**
     * Metodo modificar la venta en formato JSON
     * @param venta
     * @param posicion
     * @throws PosicionException 
     */

    public static void modificarVenta(Venta venta, Integer posicion) throws PosicionException {
        ListaEnlazada<Venta> lista = listarVenta();
        lista.modificarPosicion(venta, posicion);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(lista);
        try (PrintWriter pw = new PrintWriter(new File("venta.json"))) {
            pw.write(jsonString);
        } catch (Exception e) {
            System.out.println("Error en el metodo de modificar en utilidades: " + e);
        }
    }
    /**
     * Metodo cargar Sucursal en formato JSON
     * @param cbx
     * @param sucursal
     * @return 
     */

    public static JComboBox cargarSucursal(JComboBox cbx, ListaEnlazada<Sucursal> sucursal) {
        cbx.removeAllItems();
        for (int i = 0; i < sucursal.getSize(); i++) {
            try {
                cbx.addItem(sucursal.obtener(i));
                System.out.println("sucursal " + sucursal.obtener(i));
            } catch (PosicionException | NullException ex) {
                //Logger.getLogger(utilidades.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cbx;
    }
    /**
     * Metodo para cargar la venta en formato JSON
     * @param cbx
     * @param venta
     * @return 
     */

    public static JComboBox cargarVenta(JComboBox cbx, ListaEnlazada<Venta> venta) {
        cbx.removeAllItems();
        for (int i = 0; i < venta.getSize(); i++) {
            try {
                cbx.addItem(venta.obtener(i));
                System.out.println("venta " + venta.obtener(i));
            } catch (PosicionException | NullException ex) {
                //Logger.getLogger(utilidades.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cbx;
    }
}
