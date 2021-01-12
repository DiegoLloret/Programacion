/**
 * 
 */
package UT5;

import java.util.Scanner;

/**
 * @author Diego
 *
 */
public class ejercicio80b {

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
		System.out.println("Escribe un numero entero:");
		int n3 =sc.nextInt();;
		int maxi= maximo (n1,n2,n3);
		
		System.out.println("El maximo es "+maxi);
		sc.close();
	}
	private static int maximo(int num1, int num2, int num3) {
		int max=0;
	
		if (num1> num2 && num1>num3){
		max= num1;}
		if(num2> num1 && num2>num3) {
			max= num2;}
		if(num3> num1 && num3>num2) {
			max= num3;
		}
		return max;
		}
}
