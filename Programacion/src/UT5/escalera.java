/**
 * 
 */
package UT5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author f009979n
 *
 */
public class escalera {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		boolean igualpalo=false;
		int menor=0;
		int resta=0;
		int [] carta = new int[5];
		char [] palo = new char[5];  
		while(true)
		{
			for (int i = 1; i < 5; i++) {

				carta[i] = -1;
				while (carta[i] < 0 || carta[i] > 13) {

					System.out.println("dime la carta " + i + " :");
					carta[i] = ent.nextInt();

				}
				if (carta[i] == 0) {
					return;
				}
				palo[i] = 'x';
				while (palo[i] != 'c' && palo[i] != 'd' && palo[i] != 't' && palo[i] != 'p') {
					System.out.println("dime el  palo " + i + " :");
					palo[i] = ent.next().charAt(0);
				}

			}

			if (palo[1] == palo[2] && palo[1] == palo[3] && palo[1] == palo[4]) {
				System.out.println("los palos son iguales");
				igualpalo = true;
			}

			if (igualpalo == false) {
				System.out.println("No se puede hacer escalera de color.");
			}

			else {

				// algoritmo para ver si es escalera

				Arrays.sort(carta);
				for (int i = 1; i < carta.length; i++) {
					System.out.println(carta[i] + " " + palo[i]);
				}
				resta = carta[4] - carta[1];
				if (resta > 4) {
					System.out.println("No se puede hacer escalera de color.");
				} else if (resta == 3) {
					System.out.println("Falta un " + (carta[4] + 1) + " " + palo[4] + " para hacer escalera de color.");
				} else // resta=4
				{
					// System.out.println("Falta un hueco para hacer escalera de color.");

					for (int i = 1; i < carta.length - 1; i++) {

						if (carta[i + 1] - carta[i] != 1) {

							System.out.println(
									"Falta un " + (carta[i] + 1) + " " + palo[i] + " para hacer escalera de color.");

						}
					}

				}
			}
		}
	}
}
