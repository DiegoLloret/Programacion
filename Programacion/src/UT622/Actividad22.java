/**
 * 
 */
package UT622;

import java.util.Scanner;

/**
 * @author Diego
 *
 */
public class Actividad22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String titulo, autor;
		 int ejemplares, prestados;
		Libro libro1 = new Libro(" la casa de la pradera", " Chiquito de la calzada", 10, 9);
		Libro libro2 = new Libro("el ultimo mohicano ", " kiko rivera", 5, 4);
		Libro libro3 =new Libro();
		if (libro1.prestamo()) {
			 System.out.println("Se ha prestado el libro " + libro1.getTitulo());
			 } else {
			 System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
			 }
		 libro1.getPrestados();
		 System.out.println("el numero de ejemplares prestados de "+libro1.getTitulo()+" es de "+libro1.getPrestados());
		 if (libro1.prestamo()) {
			 System.out.println("Se ha prestado el libro " + libro1.getTitulo());
			 } else {
			 System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
			 }
		 System.out.println("el numero de ejemplares prestados de "+libro1.getTitulo()+" es de "+libro1.getPrestados());
	libro1.setPrestados(0);
	if (libro1.devolucion()) {
		 System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
		 } else {
		 System.out.println("No hay ejemplares del libro " + libro1.getTitulo() + " prestados");
		 }
	
	System.out.println("\n\n"+libro3.toString());
	System.out.print("Introduce titulo: ");
	 titulo = sc.nextLine();
	 System.out.print("Introduce autor: ");
	 autor = sc.nextLine();
	 System.out.print("Numero de ejemplares: ");
	 ejemplares = sc.nextInt();
	 System.out.print("Numero de ejemplares prestados: ");
	 prestados = sc.nextInt();
	 
	
	 libro3.setTitulo(titulo);
	 libro3.setAutor(autor);
	 libro3.setEjemplares(ejemplares);
	 System.out.println("Libro 3:");
	 System.out.println("Titulo: " + libro3.getTitulo());
	 System.out.println("Autor: " + libro3.getAutor());
	 System.out.println("Ejemplares: " + libro3.getEjemplares());
	 System.out.println("Prestados: " + libro3.getPrestados());
	 System.out.println();
	}
	
	/*
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String titulo, autor;
		 int ejemplares;
		 //se crea el objeto libro1 utilizando el constructor con parámetros
		 Libro libro1 = new Libro(" la casa de la pradera", " Chiquito de la calzada", 10, 9);
		 //se crea el objeto libro2 utilizando el constructor por defecto
		 Libro libro2 = new Libro();
		 System.out.print("Introduce titulo: ");
		 titulo = sc.nextLine();
		 System.out.print("Introduce autor: ");
		 autor = sc.nextLine();
		 System.out.print("Numero de ejemplares: ");
		 ejemplares = sc.nextInt();
		 //se asigna a libro2 los datos pedidos por teclado.
		 //para ello se utilizan los métodos setters
		 libro2.setTitulo(titulo);
		 libro2.setAutor(autor);
		 libro2.setEjemplares(ejemplares);
		 //se muestran por pantalla los datos del objeto libro1
		 //se utilizan los métodos getters para acceder al valor de los atributos
		 System.out.println("Libro 1:");
		 System.out.println("Titulo: " + libro1.getTitulo());
		 System.out.println("Autor: " + libro1.getAutor());
		 System.out.println("Ejemplares: " + libro1.getEjemplares());
		 System.out.println("Prestados: " + libro1.getPrestados());
		 System.out.println();
		 //se realiza un préstamo de libro1. El método devuelve true si se ha podido
		 //realizar el préstamo y false en caso contrario
		 if (libro1.prestamo()) {
		 System.out.println("Se ha prestado el libro " + libro1.getTitulo());
		 } else {
		 System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
		 }
		 //se realiza una devolución de libro1. El método devuelve true si se ha podido Programación
		 //realizar la devolución y false en caso contrario
		 if (libro1.devolucion()) {
		 System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
		 } else {
		 System.out.println("No hay ejemplares del libro " + libro1.getTitulo() + " prestados");
		 }
		 //se realiza otro préstamo de libro1
		 if (libro1.prestamo()) {
		 System.out.println("Se ha prestado el libro " + libro1.getTitulo());
		 } else {
		 System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
		 }
		 //se realiza otro préstamo de libro1. En este caso no se podrá realizar ya que
		 //solo hay un ejemplar de este libro y ya está prestado. Se mostrará por
		 //pantalla el mensaje No quedan ejemplares del libro…
		 if (libro1.prestamo()) {
		 System.out.println("Se ha prestado el libro " + libro1.getTitulo());
		 } else {
		 System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
		 }
		 //mostrar los datos del objeto libro1
		 System.out.println("Libro 1:");
		 System.out.println("Titulo: " + libro1.getTitulo());
		 System.out.println("Autor: " + libro1.getAutor());
		 System.out.println("Ejemplares: " + libro1.getEjemplares());
		 System.out.println("Prestados: " + libro1.getPrestados());
		 System.out.println();
		 //mostrar los datos del objeto libro2
		 System.out.println("Libro 2:");
		 System.out.println("Titulo: " + libro2.getTitulo());
		 System.out.println("Autor: " + libro2.getAutor());
		 System.out.println("Ejemplares: " + libro2.getEjemplares());
		 System.out.println("Prestados: " + libro2.getPrestados());
		 System.out.println();
		 }
*/
}

