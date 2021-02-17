package UT5;

import java.util.Scanner;


public class semana6 {
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner ent = new Scanner(System.in);
			anagrama a1= new anagrama();
		
			char letra = 0;
			String salir = "salir";
			String s1 = "";
			String s2 = "";
			int[] frase1 = new int[256];
			int[] frase2 = new int[256];

			while (!s1.equals(salir)) {
				System.out.println("dime la frase 1 o escribe salir para acabar  :");
				s1 = ent.next();
				
				if (s1.length() < 1000 ) {
					// if (s1.equals(salir))
					// return;
					frase1 = a1.inicializa(frase1);

					System.out.println("dime la frase 2  :");
					s2 = ent.next();
					if (s2.length() < 1000  ) {
					frase2 = a1.inicializa(frase2);

					frase1 = a1.convierte_string_caracter(frase1, s1);

					frase2 = a1.convierte_string_caracter(frase2, s2);

					if (a1.comparar_arrays(frase1, frase2))
						System.out.println("si");
					else
						System.out.println("no ");
					}
					}
			}
		}

	}
