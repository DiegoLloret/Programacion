/**
 * 
 */
package UT5;

import java.util.Scanner;

/**
 * @author f009979n
 *
 */
public class ejercicio64 {

	/**
	 * @param args
	 */
	
	
	
	
	//cambio de hoy bbb
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 

        int a[]; 

        int b[]; 

        int c[]; 

        int i,j; 

        a=new int[5]; 

        b=new int[5]; 

        c = new int [10]; 

        // leemos la tabla a 

        System.out.println("Leyendo la tabla a"); 

        for (i=0;i<5;i++){ 

            System.out.print("n�mero: "); 

            a[i]=sc.nextInt(); 

        } 

        // leemos la tabla b 

        System.out.println("Leyendo la tabla b"); 

        for (i=0;i<5;i++){ 

            System.out.print("n�mero: "); 

            b[i]=sc.nextInt(); 

        } 

         

        j=0; 

        for (i=0;i<5;i++){ 

            c[j]=a[i]; 

            j++; 

            c[j]=b[i]; 

            j++; 

        } 

        System.out.println("La tabla c queda: "); 

        for (j=0;j<10;j++) 

            System.out.print(c[j]+" "); 

            System.out.println(""); 
	}

}
