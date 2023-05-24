/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import controlador.ed.lista.ListaEnlazada;
 import modelo.EnumMes;

/**
 *
 * @author marylin
 */
public class Venta {
    
    
    private Integer id;
    private Double valor;
    private EnumMes mes;
    private Integer anio;
    ListaEnlazada siguiente;

    public Venta(Integer id, Double valor, EnumMes mes, Integer anio) {
        this.id = id;
        this.valor = valor;
        this.mes = mes;
        this.anio = anio;
        this.siguiente = null;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public EnumMes getMes() {
        return mes;
    }

    public void setMes(EnumMes mes) {
        this.mes = mes;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", valor=" + valor + ", mes=" + mes + ", anio=" + anio + '}';
    }
    
    

   
    
    
    
}
