/**
 * 
 */
package UT622;

/**
 * @author Diego
 *
 */
public class Libro {
String libro;
String titulo;
String autor;
int ejemplares;
int prestados=0;
//Constructor vacio
public Libro() {	
}
//constructor con datos:titulo, autor,ejemplares y prestados.
public Libro(String t, String a, int e, int p) {
	this.titulo=t;
	this.autor=a;
	this.ejemplares=e;
	this.prestados=p;
}
//Getters públicos para todos los atributos
public String getTitulo() {
	return titulo;
}
public String getAutor() {
	return autor;
}
public int getEjemplares() {
	return ejemplares;
}
public int getPrestados() {
	return prestados;
}
//Setters publicos para todos los atributos.
public void setTitulo(String t) {
	if (t.equals(""))
		this.titulo= "Sin titulo";
	else 
		this.titulo=t;
}
public void setAutor(String a) {
	if (a.equals(""))
		this.autor= "Sin autor";
	else 
		this.autor=a;
}
public void setEjemplares(int e) {
	if (e<0)
		this.ejemplares= 0;
	else 
		this.ejemplares=e;
}
public void setPrestados(int p) {
	if (p>=0)
		this.prestados=p;
}
//metodo que devuelve true si hay mas ejemplares que prestados.
public boolean prestamo() {
	boolean v= false;
	if(prestados< ejemplares) {
		prestados++;
		v=true;
		
	}
	return v;
}
//metodo que devuelve true si prestados mayor que 0.
public boolean devolucion() {
	boolean v= false;
	if(prestados> 0) {
		prestados--;
		v=true;
		
	}
	return v;
}
@Override
//metodo que devuelve el string con el titulo, autor, ejemplares y prestados. 
public String toString() {
	return "titulo del libro: "+getTitulo()+"\nnombre del autor: "+getAutor()+"\nejemplares del libro "+getEjemplares()+"\nlibros prestados "+getPrestados();
}
}
