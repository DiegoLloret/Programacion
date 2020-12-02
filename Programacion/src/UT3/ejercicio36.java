/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Alumno 3
 *
 */
public class ejercicio36 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numero = new Scanner(System.in);
		System.out.println("Escribe un numero");
		int numero1=numero.nextInt();
		
		for (int i=1; i<=numero1; i++) {
			System.out.println("");
			for (int j=1; j<=numero1;j++)
				System.out.printf("* ");
				
			
		}
	}

}
