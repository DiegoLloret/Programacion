/**
 * 
 */
package UT5;

import java.util.Scanner;

/**
 * @author Alumno 3
 *
 */
public class ejercicio66 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
        
        int []numero=new int[10]; 
        
        for(int i=0; i<10; i++) { 
            System.out.println("Escribe un numero:"); 
            numero[i]=sc.nextInt(); 
        }         
        for(int i=0; i<10; i++) { 
            for(int j=0; j<10; j++) { 
                if(j!=i) { 
                    if(numero[j]==numero[i]) { 
                        System.out.printf("%d y %d estos numero se repite\n",numero[j],numero[i]); 
                    }else { 
                        System.out.printf("%d y %d estos numero no se repite\n",numero[j],numero[i]); 
                    } 
                } 
            } 
        } 
        sc.close(); 
	}
}
