/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author f009979n
 *
 */
public class ejercicio25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner primo=new Scanner(System.in); 
		int operacion=0;
		System.out.println("Escribe un numero y te dire si es primo o no"); 
		int primo1 =primo.nextInt();
		for (int i=2;i< primo1;i++) {
			if (primo1 %i==0) {
				
				System.out.println("El numero no es primo" ); 
				operacion=1;
				i=i+primo1;
			}
			
		}
		if (operacion==0) {
			System.out.println("El numero es primo" );
		}
		}
	}


