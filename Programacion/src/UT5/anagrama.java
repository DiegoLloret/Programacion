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
	 */
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
			   for(int i=0;i<256;i++) {
				   frase1[i]=0;
				  
			   }

			   int [] frase2 = new int[256];
			   System.out.println("dime la frase 2  :");
			    s2  = ent.next();
			
			   for(int i=0;i<256;i++) {
				   frase2[i]=0;
				   
				
			   }
			   
			  
			   //frase1[65]=frase1[65] +1;
			  // frase1[letra]=frase1[letra] +1;
			  /* for(int i=0;i<256;i++) {
				   System.out.println (i +" valor de frase 1 "+frase1[i]);
			   }*/
			   for(int i=0; i<s1.length();i++){  
			        char c = s1.charAt(i);  
			        System.out.println("char at "+i+" index is: "+c); 
			        frase1[c]=frase1[c] +1;
			}   
			   for(int i=0;i<256;i++) {
				  
				   if(frase1[i]>0) {
					   System.out.println (i +" valor de frase 1 "+frase1[i]);
				   }
			     }  
			   for(int i=0; i<s2.length();i++){  
			        char c = s2.charAt(i);  
			        System.out.println("char at "+i+" index is: "+c); 
			        frase2[c]=frase2[c] +1;
			}   
			   for(int i=0;i<256;i++) {
				  
				   if(frase2[i]>0) {
					   System.out.println (i +" valor de frase 1 "+frase2[i]);
				   }
			     } 
			  for (int i=0;i<256;i++) {
			   if(frase1[i]==frase2[i]) {
				   System.out.println("coinciden");
				   
			   }
			   else {
				   
				   System.out.println(" no coinciden");
			   }
}
}
	}