/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Diego Lloret
 *xd
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
			System.out.println("deprimido, Lo que hoy parece un huracán en tu vida mañana comprenderás que solo era el viento abriéndote un nuevo camino. .\n");
		}
		else if(opcion==3)
		{
			System.out.println(" triste, Cuando estás feliz, disfrutas la música, pero cuando estás triste,entiendes la letra \n");
		}
		else if(opcion==4)
		{
			System.out.println(" feliz, Disfruta de la felicidad porque esta es efímera.\n");
		}
		else if(opcion==5)
		{
			System.out.println("Relajado, Mantén la calma, sereno, siempre al mando de ti mismo .\n");
		}
		else if(opcion==6)
		{
			System.out.println("salir, hasta mañana\n");
		 i=24; //salir del bucle
		}
		else
		{
			System.out.println("esta opcion no es valida prueba de nuevo\n");
		}


	}
	}
}


