/**
 * 
 */
package UT622;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Diego
 *
 */
public class Biblioteca {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu=9;
		int id=0;
		 String titulo, autor;
		 int ejemplares, prestados;
		Scanner entrada=new Scanner(System.in);
		ArrayList<Libro> biblioteca=new ArrayList<Libro>();
		Libro libro1 = new Libro("la casa de la pradera", " Chiquito de la calzada", 10, 9);
		biblioteca.add(libro1);
		Libro libro2 = new Libro("el ultimo mohicano", " kiko rivera", 5, 4);
		biblioteca.add(libro2);
		Libro nuevolibro= new Libro();
		while(menu!=0) {
			System.out.println("\n0.Salir\n1.Alta libro\n2.Consulta libro\n3. baja libro\n4.prestamos de libro");
			System.out.println("elige una opcion:");
			menu=entrada.nextInt();
				if(menu==1) {
					añadirLibro(biblioteca);
				}
				else if(menu==2) {
					for(int i=0;i<biblioteca.size();i++){
					System.out.print("id libro: "+i);
					System.out.print("\ntitulo del libro: "+biblioteca.get(i).getTitulo());
					System.out.print("\nautor del libro: "+biblioteca.get(i).getAutor());
					System.out.print("\nnumero de ejemplares:"+biblioteca.get(i).getEjemplares());
					System.out.print("\nnumero de prestados: "+biblioteca.get(i).getPrestados()+"\n\n");
					}	
				}
				else if(menu==3) {
					int id_max=biblioteca.size();
					do{
					 System.out.print("dime el id del libro que desea eliminar menor que "+id_max+ ": ");
					id=entrada.nextInt();
					} while(id>=id_max);
		
					biblioteca.remove(id);
					}
				else if(menu==4) {
					int id_max=biblioteca.size();
					int y=0;
					while(y==0) {
						 System.out.print("dime el id del libro que desea coger prestado, tiene q ser menor que "+id_max+ " : ");
						 id=entrada.nextInt();
						if(id<id_max)
							y=1;
						
			
					}

					 nuevolibro=biblioteca.get(id);
					 if (nuevolibro.prestamo()) {
						 System.out.println("Se ha prestado el libro " + nuevolibro.getTitulo());
						 } else {
						 System.out.println("No quedan ejemplares del libro " + nuevolibro.getTitulo() + " para prestar");
						 }
					 
				}
			/*	else if(menu==5) {
					 System.out.print("dime el titulo del libro que desea eliminar: ");
					 titulo= entrada.nextLine();
				        titulo+=entrada.nextLine();
					
					id=buscaLibro(biblioteca,titulo);
		
					if(id>-1)
						biblioteca.remove(id);
				}*/
				}
			}
	private static void añadirLibro(ArrayList<Libro>l) {
		Scanner entrada=new Scanner(System.in);
		Libro nuevolibro=new Libro();
		System.out.print("Introduce titulo: ");
		nuevolibro.setTitulo(entrada.next()); 
		 System.out.print("Introduce autor: ");
		 nuevolibro.setAutor(entrada.next());  
		 System.out.print("Numero de ejemplares: ");
		 nuevolibro.setEjemplares(entrada.nextInt()); 
		 l.add(nuevolibro);
		 System.out.print("has añadido un libro nuevo.");
	}
	/*private static int buscaLibro(ArrayList<Libro>b,String t) {
		Libro libro;
		int id_max=b.size();
		for(int i=0;i<b.size();i++) {
			libro=b.get(i);
			if(t.equals(libro.getTitulo())) {
				return i;
			}
		}
		return -1;
	}*/
	
	}


