/**
 * 
 */
package UT5;

import java.util.Scanner;

/**
 * @author Alumno 3
 *
 */
public class ejercicio63 {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numero = new Scanner(System.in);
		int numeros[];
		numeros= new int[10];
		int suma=0;
		int media=0;
		
		for (int i=0; i<numeros.length; i++) {
			System.out.println("ponme el numero "+(i+1));
			numeros[i]=numero.nextInt();
			
		}
	
		for (int i=0; i<numeros.length; i++) {
			suma=suma+numeros[i];
			}
		media=suma/numeros.length;
			System.out.println("la media es "+(media));
	}
	}

