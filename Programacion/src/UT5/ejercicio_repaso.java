/**
 * 
 */
package UT5;

import java.util.Scanner;

/**
 * @author Diego
 *
 */
public class ejercicio_repaso {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		ejercicio_repaso a1 = new ejercicio_repaso();

		String salir = "salir";
		String s1 = "";
		int[] frase1 = new int[256];
		int contador = 0;
		s1 = "hola pepe";

		while (!s1.equals(salir)) {
			System.out.println("dime una frase  o escribe salir para acabar  :");
			s1 = ent.next();

			if (s1.length() < 1000) {
				contador = 0;
				// if (s1.equals(salir))
				// return;
				String c1 = "";
				for (int i = 0; i < s1.length(); i++) {
					c1 = s1.substring(i, i + 1);
					if (c1.equals("á") || c1.equals("é") || c1.equals("í") || c1.equals("ó") || c1.equals("ú")
							|| c1.equals("Á") || c1.equals("É") || c1.equals("Í") || c1.equals("Ó") || c1.equals("Ú"))
						contador++;

				}

				System.out.println("hay un total de " + contador + " tildes en la frase");

			}
		}
	}

}