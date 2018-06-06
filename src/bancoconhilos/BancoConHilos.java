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
public class BancoConHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        	

                Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
                Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });

		Cajero cajera1 = new Cajero("Cajera 1");
		Cajero cajera2 = new Cajero("Cajera 2");

		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();

		cajera1.procesarTransacion(cliente1, initialTime);
		cajera2.procesarTransacion(cliente2, initialTime);
	}
    }
    

