/**
 * 
 */
package UT5;

import java.util.Scanner;

/**
 * @author Diego
 *
 */
public class ejercicio80 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero entero:");
		int n1=sc.nextInt();
		System.out.println("Escribe un numero entero:");
		int n2 =sc.nextInt();
		
		int maxi= maximo (n1,n2);
		
		System.out.println("El maximo es "+maxi);
		sc.close();
	}
	private static int maximo(int num1, int num2) {
	int max=0;
	
	if (num1> num2)
		max= num1;
	else
		max=num2;
	return max;
}
}
