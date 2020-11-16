/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Diego Lloret
 *ejemplo pedir datos por pantalla
 */
public class ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner entrada= new Scanner(System.in);
		System.out.println("Por favor, introduce un numero:");
		
		int numero = entrada.nextInt();
		
		System.out.print("El numero introducido es: ");
		System.out.println(numero);
		System.out.printf("%d x 1 =%d \n", numero, numero*1);
		System.out.printf("%d x 2 =%d \n", numero, numero*2);
		System.out.printf("%d x 3 =%d \n", numero, numero*3);
		System.out.printf("%d x 4 =%d \n", numero, numero*4);
		System.out.printf("%d x 5 =%d \n", numero, numero*5);
		System.out.printf("%d x 6 =%d \n", numero, numero*6);
		System.out.printf("%d x 7 =%d \n", numero, numero*7);
		System.out.printf("%d x 8 =%d \n", numero, numero*8);
		System.out.printf("%d x 9 =%d \n", numero, numero*9);
		System.out.printf("%d x 10 =%d \n", numero, numero*10);
	}

}
