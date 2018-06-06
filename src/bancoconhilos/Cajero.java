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
public class Cajero {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cajero(String nombre) {
        this.nombre = nombre;
    }

    public Cajero() {
    }
    
    
    
    
    
        public void procesarTransacion(Cliente cliente, long timeStamp){
            
	

		System.out.println("La cajera " + this.nombre + 
				" COMIENZA A PROCESAR LA TRANSACCION DEL CLIENTE " + cliente.getNombre() + 
				" EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000	+
				"seg");

		for (int i = 0; i < cliente.getTiempoTransaciones().length; i++) { 
				this.esperarXsegundos(cliente.getTiempoTransaciones()[i]); 
				System.out.println("Procesado la transaccion " + (i + 1) +  
				" ->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + 
				"seg");
		}

		System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " + 
				cliente.getNombre() + " EN EL TIEMPO: " + 
				(System.currentTimeMillis() - timeStamp) / 1000 + "seg");

	}


	private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
        }

