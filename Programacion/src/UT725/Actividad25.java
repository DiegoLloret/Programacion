package UT725;

import java.util.ArrayList;
import java.util.Scanner;

import UT622.Libro;

public class Actividad25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 
		 String titulo="", artista;
		 int duracionminutos;
		 Cancion vuelta;
		 int menu=9;
		ArrayList<Cancion> Lc;
		Playlist p1=new Playlist("playlist coche");
		//menu
		while (menu != 0) {
			System.out.println(
					"\n0.Salir\n1.añadir cancion\n2.Obtener cancion\n3.Obtener total canciones\n4.mostrar playlist\n5.duracion total playlist\n6.reproducir playlist\n7.reproducir cancion\n8.limpiar playlist\n9.eliminar cancion\n10.encontrar Cancion Por Titulo\n11.EncontrarCanciones Por Artista");
			System.out.println("elige una opcion:");
			menu = sc.nextInt();
			// opcion1 añadir canciones
			if (menu == 1) {

				// crear objeto nueva cancion
				Cancion nuevaCancion = new Cancion();
				// pedir y poner los datos de la cancion
				System.out.print("Introduce titulo: ");
				nuevaCancion.setTitulo(sc.next());
				System.out.print("Introduce artista: ");
				nuevaCancion.setArtista(sc.next());
				System.out.print("duracion: ");
				nuevaCancion.setDuracionMinutos(sc.nextInt());
				p1.anyadirCancion(nuevaCancion);
			}
			//opcion 2 obtener canciones
			if (menu == 2) {

				System.out.print("introduce el id de la cancion que quiere");
				int id = sc.nextInt();
				vuelta = p1.obtieneCancion(id);
				if (vuelta != null)
					System.out.println("cancion1: " + vuelta.getTitulo() + "\nartista: " + vuelta.getArtista()
							+ "\nduracion: " + vuelta.getDuracionMinutos());
				else
					System.out.println("no existe esa cancion");
			}
			//opcion 3 obtener total canciones
			if (menu == 3) {
				System.out.println(
						"la playlist " + p1.nombre_playlist + " tiene " + p1.obtieneTotalCanciones() + " canciones");
			}
			//opcion 4 mostrar playlist
			if (menu == 4) {
				p1.mostrarPlaylist();
			}
			//opcion 5 duracion total playlist
			if (menu == 5) {
				System.out.println("la playlist " + p1.nombre_playlist + " dura "+p1.totalDuracionPlaylist()+" minutos");
			}
			//opcion 6 reproducir playlist
			if (menu == 6) {
				p1.reproducirPlaylist();
			}
			//opcion 7 reproducir cancion
			if (menu == 7) {
				System.out.println("dime que cancion quieres reproducir");
				int id = sc.nextInt();
				p1.reproducirCancion(id);
			}
			//opcion 8 limpiar playlist
			if (menu == 8) {
				p1.limpiarPlaylist();
			}
			//opcion 9 eliminar cancion
			if (menu == 9) {
				System.out.println("dime que cancion quieres borrar");
				int id = sc.nextInt();
				if(p1.eliminarCancion(id)==true) {
					System.out.println("Cancion eliminada");
				}
				else 
					System.out.println("la cancion no ha podido ser eliminada");
				
			}
			//opcion 10 Encontrar Cancion Por Titulo
			if (menu == 10) {
				System.out.println("digame el titulo");
				titulo=sc.nextLine();
				titulo+=sc.nextLine();
				System.out.println(titulo);
				vuelta=p1.encontrarCancionPorTitulo(titulo);
				if(vuelta==null) {
					System.out.println("la cancion "+titulo+" no ha sido encontrada");
					

				}
				else System.out.println("la cancion "+titulo+" encontrada");
			}
			//opcion 11 EncontrarCanciones Por Artista
			if (menu == 11) {
				System.out.println("dime el artista");
				artista=sc.nextLine();
				artista+=sc.nextLine();
				Lc=p1.encontrarCancionesPorArtista(artista);
				
				for(Cancion c: Lc)
				{
					
					System.out.println("canciones del artista "+artista+":" +c.getTitulo());
				}
			}
		}

}
}