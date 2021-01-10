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
	
	
	public static int contar(int [] a1)
	{
		int cuenta=0;
		   for(int i=0;i<a1.length ;i++)
		   {
			   cuenta = cuenta + a1[i];
			  
		   }

		
		return cuenta;
	}
	
	
	public static int [] inicializa (int [] a1)
	{
		
		   for(int i=0;i<a1.length  ;i++)
		   {
			    a1[i]=0;
			  
		   }

		
		return a1;
	}
	

	public static int [] convierte_string_caracter (int [] a, String diego)
	{
		
		
		   for(int i=0; i<diego.length();i++)
		   {	
			   char c = diego.charAt(i);
			   a[c]=a[c] +1;
			  
		   }

		
		return a;
	}
	
	public static boolean comparar_arrays (int [] a1,int [] a2 )
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
	
	
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		Scanner ent1 = new Scanner(System.in);
		 
		
		
		
			   char letra=0;
			   String s1= "";
			   String s2="";
			   int [] frase1 = new int[256];
			   System.out.println("dime la frase 1  :");
			    s1 = ent.next();
			   frase1=inicializa(frase1);

			   int [] frase2 = new int[256];
			   System.out.println("dime la frase 2  :");
			    s2  = ent.next();
			
			   frase2=inicializa(frase2);
			   
			   frase1=convierte_string_caracter(frase1,s1);
			
			   frase2=convierte_string_caracter(frase2,s2);
			  
			if(comparar_arrays(frase1,frase2))
				System.out.println("coinciden");
			else
				System.out.println("no coinciden");

}
	 
	}