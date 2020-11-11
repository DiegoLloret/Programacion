/**

 * 

 */

package UT3;



import java.util.Scanner;



/**

 * @author Alumno 3

 *

 */

public class ejercicio19 {



	/**

	 * @param args

	 */

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner numero=new Scanner(System.in);

		System.out.println("introduce un numero "); 

		int numero1= 1;

		int suma = 0;

		 while (numero1 !=0) {

			

			numero1=numero.nextInt();

			System.out.println("sigue escribiendo numeros "); 

			suma = suma + numero1;

			

		}

		 System.out.println("El resultado es: " + suma);     



		 numero.close(); 

	}



}







