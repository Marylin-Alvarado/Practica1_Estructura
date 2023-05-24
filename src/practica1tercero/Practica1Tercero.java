/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1tercero;

import controlador.ed.lista.ListaEnlazada;
import controlador.ed.lista.exception.NullException;
import controlador.ed.lista.exception.PosicionException;
import modelo.Sucursal;

/**
 *
 * @author marylin
 */
public class Practica1Tercero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Agregar solicitudes de usuarios

        // System.out.println("Hola");
        ListaEnlazada<Sucursal> lista = new ListaEnlazada<>();
      
        try {
            Sucursal s1 = new Sucursal();
            s1.setId(lista.size() + 1);
            s1.setNombre("Alyce");
            lista.insertar(s1);
            //lista.imprimir();
            s1 = new Sucursal();
            s1.setId(lista.size() + 1);
            s1.setNombre("Marylin");
            lista.insertar(s1);
            lista.imprimir();
            lista.insertarPosicion(s1, 0);
            lista.imprimir();
            lista.deleteAll();
            lista.imprimir();
        
        } catch (PosicionException ex) {
            System.out.println(ex.getMessage());
        }

        // Add some example requests
       /* module.addRequest(new UserRequest("User 1", "Request 1"));
        module.addRequest(new UserRequest("User 2", "Request 2"));
        module.addRequest(new UserRequest("User 3", "Request 3"));

        // Print current requests
        module.printUserRequests();

        // Wait for requests to be removed
        try {
            Thread.sleep(60 * 60 * 1000); // Wait for 1 hour
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print remaining requests after 1 hour
        module.printUserRequests();
*/

       
    
}
}
