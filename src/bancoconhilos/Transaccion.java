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
public class Transaccion {
    private String nombre;
    private long timeStamp;

    public Transaccion() {
    }

    public Transaccion(String nombre, long timeStamp) {
        this.nombre = nombre;
        this.timeStamp = timeStamp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
    
    
}
