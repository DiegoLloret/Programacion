/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Diego Lloret
 * xd
 */
public class emociones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		int opcion;
		int i=0;
		while (i<1)
		{
			System.out.println("\n\nSELECCIONA UNA DE LAS SIGUIENTES OPCIONES.\n\n");
			System.out.println("1 >> aburrido, 2 >> deprimido, 3 >> triste, 4 >> feliz, 5 >> relajado y 6 >>salir.\n");
		opcion=entrada.nextInt();
		if(opcion==1)
		{
			System.out.println("Aburrido, El aburrimiento tiene cura si tienes amigos que te ayudan.\n");
		}
		else if(opcion==2)
		{
			System.out.println("deprimido, Lo que hoy parece un hurac�n en tu vida ma�ana comprender�s que solo era el viento abri�ndote un nuevo camino. .\n");
		}
		else if(opcion==3)
		{
			System.out.println(" triste, Cuando est�s feliz, disfrutas la m�sica, pero cuando est�s triste,entiendes la letra \n");
		}
		else if(opcion==4)
		{
			System.out.println(" feliz, Disfruta de la felicidad porque esta es ef�mera.\n");
		}
		else if(opcion==5)
		{
			System.out.println("Relajado, Mant�n la calma, sereno, siempre al mando de ti mismo .\n");
		}
		else if(opcion==6)
		{
			System.out.println("salir, hasta ma�ana\n");
		 i=24; //salir del bucle
		}
		else
		{
			System.out.println("esta opcion no es valida prueba de nuevo\n");
		}


	}
	}
}


