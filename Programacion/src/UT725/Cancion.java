/**
 * 
 */
package UT725;

import java.util.Scanner;

import UT622.Libro;

/**
 * @author Diego
 *
 */
public class Cancion {
	
	private String titulo;
	private String artista;
	private int duracionMinutos;
	public Cancion() {	
	}
	//constructor con datos:titulo, artista, y duracion.
	public Cancion(String t, String a, int d) {
		this.titulo=t;
		this.artista=a;
		this.duracionMinutos=d;
		
	}
	//Getters publicos para todos los atributos
	public String getTitulo() {
		return titulo;
	}
	public String getArtista() {
		return artista;
	}
	public int getDuracionMinutos() {
		return duracionMinutos;
	}
	//Setters publico para todos los atributos.
	public void setTitulo(String t) {
		if (t.equals(""))
			this.titulo= "Sin titulo";
		else 
			this.titulo=t;
	}
	public void setArtista(String a) {
		if (a.equals(""))
			this.artista= "Sin artista";
		else 
			this.artista=a;
	}
	public void setDuracionMinutos(int d) {
		if (d<0)
			this.duracionMinutos= 0;
		else 
			this.duracionMinutos=d;
}
	public String toString() {
		return getTitulo()+"-"+getArtista()+"("+getDuracionMinutos()+" minutos)";
	}
	public String reproducir() {
		return "Reproduciendo "+getTitulo();
	}
	
	
}