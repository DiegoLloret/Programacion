/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author f009979n
 *
 */
public class ejercicio26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner primo = new Scanner(System.in);
		int operacion = 0;
		System.out.println("Escribe un numero y te dire todos los primos entre 0 y tu numero");
		int primo1 = primo.nextInt();
		int primo2 =0;
		for (int j = 2; j < primo1; j++) {
			operacion=0;primo2=j;
				for (int i = 2; i < primo2; i++) {
					if (primo2 % i == 0) {
		
						//System.out.println(" no es primo");
						operacion = 1;
						i = i + primo2;
					}
		
				}
				if (operacion == 0) {
					System.out.println(primo2 +" es primo");
				}
			}
	}
}
