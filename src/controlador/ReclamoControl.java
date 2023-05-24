/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.ed.lista.ListaEnlazada;
import java.util.Date;
import modelo.Reclamo;

/**
 *
 * @author marylin
 */
public class ReclamoControl {

    /**
     * Metodo listaEnlazada<Reclamo>
     */
    ListaEnlazada<Reclamo> ListaReclamo;
    /**
     * Metodo Reclamo
     */
    private Reclamo reclamo;
    /**
     * Metodo fecha
     */
    private Integer Id;
    private Date fecha;
    /**
     * Metodo hora
     */
    private Integer hora;
    
    
    
    /**
     * Metodo constructor
     * @param ListaReclamo
     * @param reclamo
     * @param fecha
     * @param hora 
     */

    public ReclamoControl(ListaEnlazada<Reclamo> ListaReclamo, Reclamo reclamo, Date fecha, Integer hora) {
        this.ListaReclamo = ListaReclamo;
        this.reclamo = reclamo;
        this.fecha = fecha;
        this.hora = hora;
    }

    public ReclamoControl() {
    }
    
    
    
    /**
     * Metodo get de ListaReclamo
     * @return 
     */

    public ListaEnlazada<Reclamo> getListaReclamo() {
        return ListaReclamo;
    }

    /**
     * Metodo set de lista reclamo
     * @param ListaReclamo 
     */
    public void setListaReclamo(ListaEnlazada<Reclamo> ListaReclamo) {
        this.ListaReclamo = ListaReclamo;
    }

    /**
     * Metodo get reclamo
     * @return 
     */
    public Reclamo getReclamo() {
        return reclamo;
    }

    /**
     * Metodo set de Reclamo
     * @param reclamo 
     */
    public void setReclamo(Reclamo reclamo) {
        this.reclamo = reclamo;
    }

    /**
     * Metodo get para fecha
     * @return 
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Metodo set para fecha
     * @param fecha 
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Metodo get para la hora
     * @return 
     */
    public Integer getHora() {
        return hora;
    }

    /**
     * Metodo set para la hora
     * @param hora 
     */
    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
    
    
    
    

}
