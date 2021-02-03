/**
 * 
 */
package UT725;

import java.util.ArrayList;

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
	
	public Playlist() {	
		this.Playlist=new ArrayList<Cancion>();
	}
	public Playlist(String n) {
		this.nombre_playlist=n;
		this.Playlist=new ArrayList<Cancion>();	}

	public void anyadirCancion(Cancion c) {
		this.Playlist.add(c);
	}
	public Cancion obtieneCancion(int posici�n) {
		return this.Playlist.get(posici�n);
		 
	}
	public int obtieneTotalCanciones() {
		return this.Playlist.size();
		 
	}
	public void mostrarPlaylist() {
		System.out.println("El nombre del la playlist es: "+nombre_playlist);
	}
	public int totalDuracionPlaylist() {
		int sum=0;
		
		for (Cancion c: Playlist) sum=sum+c.getDuracionMinutos();
		
		return sum; 
	}
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
	public void limpiarPlaylist()
}
