/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author marylin
 */
public class TimeControl {

    private Node cabecera;

    public TimeControl() {
        cabecera = null;
    }

    public void AniadirSolicitud(SolicitudUsuario request) {
        Node newNode = new Node(request);
        newNode.siguiente = cabecera;
        cabecera = newNode;

        programarEliminación(newNode);
    }

    private void programarEliminación(Node node) {
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                EliminarSolicitud(node);
            }
        };

        Timer timer = new Timer();
        timer.schedule(tarea, 60 * 60 * 1000); // Eliminar solicitud después de 1 hora (60 minutos * 60 segundos * 1000 milisegundos)
    }

    private void EliminarSolicitud(Node node) {
        if (cabecera == node) {
            cabecera = cabecera.siguiente;
        } else {
            Node prev = encontrarNodoAnterior(node);
            prev.siguiente = node.siguiente;
        }

        System.out.println("Solicitud eliminada: " + node.request);
    }

    private Node encontrarNodoAnterior(Node node) {
        Node actual = cabecera;
        while (actual != null && actual.siguiente != node) {
            actual = actual.siguiente;
        }
        return actual;
    }

    public void ImprimirSolicitudUsuario() {
        System.out.println("Solicitudes de usuario:");
        Node actual = cabecera;
        while (actual != null) {
            System.out.println(actual.request);
            actual = actual.siguiente;
        }
    }

    /* public static void main(String[] args) {
        UserRequestsModule module = new UserRequestsModule();
        
        // Add some example requests
        module.addRequest(new UserRequest("User 1", "Request 1"));
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
    }
     */
}

class Node {

    public SolicitudUsuario request;
    public Node siguiente;

    public Node(SolicitudUsuario request) {
        this.request = request;
        siguiente = null;
    }
}

class SolicitudUsuario {

    private String user;
    private String request;

    public SolicitudUsuario(String user, String request) {
        this.user = user;
        this.request = request;
    }

    @Override
    public String toString() {
        return "Usuario: " + user + ", Solicitud: " + request;
    }

}
