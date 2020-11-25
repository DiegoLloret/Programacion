/**
 * 
 */
package UT5;



/**
 * @author Alumno 3
 *
 */
public class ejercicio70 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 

         
		 	
	        int [][]numero = new int [10][10]; 
	        
	        for (int i=0; i<numero.length; i++) {
	        	for (int j=0; j<numero[i].length;j++) {
				
				numero[i][j]=i*j;
	        	}
	        }
	       for ( int i=0; i<numero.length; i++) {
	 	        for (int j=0; j<numero[i].length;j++) {
	 				
	 	        	System.out.print(numero[i][j]+"  ");
	 	        	}
	 	   	System.out.print(" \n");
}
		   
}
}
