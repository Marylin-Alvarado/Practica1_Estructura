/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.Dao;

import modelo.Sucursal;

/**
 *
 * @author marylin
 */
public class SucursalDao  extends AdaptadorDao<Sucursal>{
    private Sucursal sucursal;

    public SucursalDao() {
        super(Sucursal.class);
    }

    public Sucursal getSucursal() {
        if (sucursal == null){
            sucursal = new Sucursal();
        }
        return sucursal;
    }

    public void setPersona(Sucursal sucursal) {
        this.sucursal= sucursal;
    }

    public boolean guardar() throws Exception {
        this.sucursal.setId(generarId());
        guardar(this.sucursal);
        return true;
    }

    public boolean modificar(Integer pos) throws Exception {
        modificar(this.sucursal, pos);
        return true;
    }
    
    
//    public boolean modificar(E dato, Integer pos) throws Exception{
//        try {
//            lista.modificarDato(pos, dato);
//            return true;
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return false;
//    }
    
    private Integer generarId(){
        return 0;
    }

    
}
