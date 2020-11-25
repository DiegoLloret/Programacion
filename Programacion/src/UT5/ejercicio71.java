/**
 * 
 */
package UT5;

/**
 * @author Diego Lloret
 *
 */
public class ejercicio71 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] []numero = new int [3][3]; 
		 int [] []numero1 = new int [3][3]; 
		 int [] []numero3 = new int [3][3];
		
		 for (int i=0; i<numero.length; i++) {
	        	for (int j=0; j<numero[i].length;j++) {
				
				numero[i][j]=i*j;	
 	        	System.out.print(numero[i][j]+"  ");
	        	}
	   	System.out.print(" \n");
}
	        	
	        
	       for ( int i=0; i<numero.length; i++) {
	 	        for (int j=0; j<numero[i].length;j++) {
	 				
	 	        	
	}

}
	  	 for (int i=0; i<numero1.length; i++) {
	        	for (int j=0; j<numero1[i].length;j++) {
				
				numero1[i][j]=i*j;	
 	        	System.out.print(numero1[i][j]+"  ");
	        	}
	   	System.out.print(" \n");
}
				
	        	
	        
	       for ( int i=0; i<numero1.length; i++) {
	 	        for (int j=0; j<numero1[i].length;j++) {
	 				
	 	        	
	}

}
	      for (int i=0; i<numero3.length; i++) {
	        	for (int j=0; j<numero3[i].length;j++) {
				
				numero3[i][j]=numero1[i][j]+numero[i][j];
	        	}
	        }
	       for ( int i=0; i<numero3.length; i++) {
	 	        for (int j=0; j<numero3[i].length;j++) {
	 				
	 	        	System.out.print(numero3[i][j]+"  ");
 	        	}
 	   	System.out.print(" \n");
	}

}
}
