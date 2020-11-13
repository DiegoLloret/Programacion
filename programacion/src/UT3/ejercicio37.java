/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author f009979n kekw kappa
 *
 */
public class ejercicio37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numero = new Scanner(System.in);
		System.out.println("Escribe el alto");
		int numero1=numero.nextInt();
		System.out.println("Escribe el ancho");
		int numero2=numero.nextInt();
		
		for (int i=1; i<=numero1; i++) {
			System.out.println("");
			for (int j=1; j<=numero2;j++)
				System.out.printf("* ");
				
			
		}
	}

}
