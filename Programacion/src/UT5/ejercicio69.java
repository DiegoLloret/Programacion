/**
 * 
 */
package UT5;

import java.util.Scanner;

/**
 * @author f009979n
 *
 */
public class ejercicio69 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, pos;
		int array[]=new int[10];
		for (int i=0;i<8;i++)
		{
			System.out.println("introduce un numero para la posicion."+i+":");
			num=sc.nextInt();
			array[i]=num;
		}
		for (int i=0;i<2;i++)
		{
			System.out.println("introduce un numero :");
			num=sc.nextInt();
			System.out.println("introduce la posicion :");
			pos=sc.nextInt();
		}
	}

}
