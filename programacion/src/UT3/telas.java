/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Fabiadmin
 *
 */
public class telas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		
		int elefantes=1;
		int i=0;
		int suma = 0;

		System.out.println("introduce el peso maximo soportado por la tela de araña: ");
		int telas = ent.nextInt();
		while (telas != 0) {
		suma=0;
		i=0;
			while ((suma <= telas) && (elefantes != 0)) {
				i = i + 1;
				System.out.println("cuanto pesa el elefante " + i + ":");

				elefantes = ent.nextInt();

				if (elefantes != 0) {
					suma = suma + elefantes;

				} else {
					System.out.println("la tela aun resiste ");
				}

			}
			System.out.println("La suma del peso de los elefantes es: " + suma + " kilos y se rompió");
			System.out.println("\n \n introduce el peso maximo soportado por la tela de araña: ");
			telas = ent.nextInt();
		}
	}
}