/**
 * 
 */
package UT725;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import UT622.Libro;

/**
 * @author Diego
 *
 */
public class Playlist {

	/**
	 * @param args
	 */
	String nombre_playlist;
	ArrayList<Cancion> Playlist;
	//constructor vacio
	public Playlist() {	
		this.Playlist=new ArrayList<Cancion>();
	}
	//constructor para dar nombre a la playlist
	public Playlist(String n) {
		this.nombre_playlist=n;
		this.Playlist=new ArrayList<Cancion>();	}
	//metodo añadir cancion
	public void anyadirCancion(Cancion c) {
		
		this.Playlist.add(c);
	}
	//metodo obtener cancion, controla que la posicion sea menor q el numero de canciones.
	public Cancion obtieneCancion(int posicion) {
		int idMax=Playlist.size();
		
		
		if(idMax>posicion) {
			
			return this.Playlist.get(posicion);
		}
		else 
			return null;
	}
	//metodo obtiene el numero de canciones.
	
	public int obtieneTotalCanciones() {
		return this.Playlist.size();
		 
	}
	// metodo que muestra el nombre de la playlist
	public void mostrarPlaylist() {
		System.out.println("El nombre del la playlist es: "+nombre_playlist);
	}
	//metodo que devuelve la duracion de la playlist
	public int totalDuracionPlaylist() {
		int sum=0;
		
		for (Cancion c: Playlist) sum=sum+c.getDuracionMinutos();
		
		return sum; 
	}
	//metodo que comprueba si hay canciones y las reproduce todas.
	public void reproducirPlaylist() {
		Cancion c;
		
		if(Playlist.size()!=0) {
			for (int i=0;i<Playlist.size();i++) {
			c= Playlist.get(i);
			System.out.println(c.reproducir());
			}
		}
		else
			System.out.println("La playlist no tiene canciones");
	}
	//metodo que reproduce las canciones
	public void reproducirCancion(int posicion) {
		Cancion c;
		c= Playlist.get(posicion);
		System.out.println(c.reproducir());
	}
	//metodo para borrar playlist
	public void limpiarPlaylist() {
		int t=Playlist.size();
		if(t!=0) {
			for (int i=0;i<t;i++) {
				Playlist.remove(0);
			}
			System.out.println("Lista vacía");
		}
		else 
			System.out.println("no hay ninguna cancion para eliminar");
	}
	//metodo que elimina canciones.
	public boolean eliminarCancion(int posicion) {
		int idMax=Playlist.size();
		
		if (idMax==0)
			return false;
		if(idMax>posicion) {
			Playlist.remove(posicion);
			return true;
		}
		else 
			return false;
	}
	//metodo para encontrar canciones por el titulo
	public Cancion encontrarCancionPorTitulo(String nombre) {
		 Iterator<Cancion> ite = Playlist.iterator();
		 Cancion c1= null;
	        while (ite.hasNext()){

	             c1 = ite.next();

	            System.out.println("La cancion es: "+c1.getTitulo());
	            if(c1.getTitulo().equals(nombre)) {
	            	 System.out.println("cancion encontrada");
	            	 return c1;
	            }
	           
	        }
	        System.out.println("cancion no encontrada");
	        return null;
	}
	//metodo que devuelve una lista con las canciones del artista
	public ArrayList<Cancion> encontrarCancionesPorArtista(String artista){
		 Iterator<Cancion> ite = Playlist.iterator();
		 Cancion c1= null;
			ArrayList<Cancion> ListaCanciones=new ArrayList<Cancion>();
			//System.out.println("el artista "+artista+" tiene las siguientes canciones: ");
	        while (ite.hasNext()){

	             c1 = ite.next();
	            if(c1.getArtista().equals(artista)) {
	            	// System.out.println(c1.getTitulo());
	            	 ListaCanciones.add(c1);
	            }
	           
	        }
	        
	      return ListaCanciones;
	      
	}
	
	
	
}
