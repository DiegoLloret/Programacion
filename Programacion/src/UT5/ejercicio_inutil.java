/**
 * 
 */
package UT5;

import java.util.Scanner;

/**
 * @author Diego
 *
 */
public class ejercicio_inutil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numero=999999999;
		int numero1=9;
		while (numero!=0) {
			System.out.println("escribe un numero menor que 100 o 0 para salir");
			numero= entrada.nextInt();
			if(numero==0)
				break;
			if (numero<100) {
				if(numero%2==0) {
					int y=0;
					while(y==0) {
						System.out.println("escribe un numero impar");
						numero= entrada.nextInt();
						if(numero%2!=0)
							y=1;
						else
							System.out.println("numero no impar");
							
					}
						
				}
				else {
					int y=0;
					while(y==0) {
						System.out.println("escribe un numero par");
						numero= entrada.nextInt();
						if(numero%2==0 ) {
							y=1;
							if(numero==0)
								numero=1;
						}
						else
							System.out.println("numero no par");
							
					}
				}
			}
				
		}
		
	}

}
