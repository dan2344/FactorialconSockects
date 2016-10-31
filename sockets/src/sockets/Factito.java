/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets;

/**
 *
 * @author Alumno
 */
public class Factito {
     float numero;
	 float total;
	 float cont;

    
		
    public float factorializar(float numero) {
       for(total=1; (numero)>1 ; numero--) {
        
		total *= numero;
        
		System.out.println("multiplicando " + total);
                          }
		System.out.println("resultado" +  total);
	return total;
	}
}
