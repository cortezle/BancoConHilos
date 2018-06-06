/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoconhilos;

/**
 *
 * @author Lucho
 */
public class Cliente {
    private String nombre;
    private int[] TiempoTransaciones;

    public Cliente() {
    }

    public Cliente(String nombre, int[] TiempoTransaciones) {
        this.nombre = nombre;
        this.TiempoTransaciones = TiempoTransaciones;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getTiempoTransaciones() {
        return TiempoTransaciones;
    }

    public void setTiempoTransaciones(int[] TiempoTransaciones) {
        this.TiempoTransaciones = TiempoTransaciones;
    }
    
    
    
}
