/**
 * 
 */
package UT5;

import java.util.Scanner;

/**
 * @author Diego
 *
 */
public class anagrama {

	/**
	 * @param args
	 * @return 
	 */
	
	
	public  int [] inicializa (int [] a1)
	{
		
		   for(int i=0;i<a1.length  ;i++)
		   {
			    a1[i]=0;
			  
		   }

		
		return a1;
	}
	

	public  int [] convierte_string_caracter (int [] a, String diego)
	{
		
		
		   for(int i=0; i<diego.length();i++)
		   {	
			   char c = diego.charAt(i);
			   a[c]=a[c] +1;
			  
		   }

		
		return a;
	}
	
	public boolean comparar_arrays (int [] a1,int [] a2 )
	{
		
		if (a1.length!=a2.length)
			return false;
		else
		   for(int i=0; i<a1.length;i++)
		   {	
			   if(a1[i]!=a2[i]) {
				   return false;			   
		   }
		   }
			return true;
	}
	
	
	
	 
			 
	}