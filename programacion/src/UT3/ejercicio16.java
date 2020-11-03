/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author f009979n
 *xd lolcc
 */
public class ejercicio16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int aux=0;
		 System.out.println("escriba el primer numero");
		 int start =sc.nextInt();
		 System.out.println("escriba segundo numero");
		 int stop =sc.nextInt();
		 System.out.println("escriba el intervalo");
		 int intervalo=sc.nextInt();
		 if(start>stop){
			 aux=start;
		 start=stop;
		 stop=aux;
		 }
		 for(int i=start; i<=stop;i +=intervalo)
			 System.out.print(i+",");
		 

	}

	 
}
