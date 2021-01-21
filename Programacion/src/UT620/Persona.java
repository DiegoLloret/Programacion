/**
 * 
 */
package UT620;

import java.util.Date;

/**
 * @author Diego
 * Clase persona con nombre, apellidos edad y saludo
 */
public class Persona {
	private String nombre;
	private String apellidos;
	private int anioNacimiento;
	private int mesNacimiento;
	private int diaNacimiento;
	private char sexo;
	//constructor vacio
	public Persona() {
	}
	//constructor
	public Persona(String nombre, String apellidos,int anio, int mes, int dia, char sexo) {
	
		setNombre(nombre);
		setApellido(apellidos);
		setAnio(anio);
		setMes(mes);
		setDia(dia);
		setSexo(sexo);
	}
	//getters publicos para todos los atributos
	public String getNombre() {
	return this.nombre;
	}
	public String getApellidos() {
		return this.apellidos;
		}
	public int getAnioNacimiento() {
		return this.anioNacimiento;
		}
	public int getMesNacimiento() {
		return this.mesNacimiento;
		}
	public int getDiaNacimiento() {
		return this.diaNacimiento;
		}
	public char getSexo() {
		return this.sexo;
		}
	public void setNombre(String nombre) {
		//convierto el nombre a palabra con la primera en mayusculas
		nombre = convertirNombresPropios(nombre);
		
		//si es menor que 4, uso sin especificar
		if(nombre.length() < 4 )
			nombre="Sin especificar";
		
		this.nombre = nombre;
	}
	public void setApellido(String apellidos) {
		apellidos = convertirNombresPropios(apellidos);
		
		//si es menor que 4, uso sin especificar
		if(apellidos.length() < 4 )
			apellidos="Sin especificar";
		
		this.apellidos = apellidos;
	}
	public void setAnio(int anio) {
		if(anio<1900 || anio>2020)
			anioNacimiento=2000;
		this.anioNacimiento=anio;
	}
	public void setMes(int mes) {
		if(mes<1 || mes>12)
			mes=1;
		this.mesNacimiento=mes;
	}
	public void setDia(int dia) {
		if(dia<1 || dia>31)
			dia=1;
		this.diaNacimiento=dia;
	}
	public void setSexo(char sexo) {
		if(sexo!= 'H' || sexo!='M')
			sexo='X';
		this.sexo=sexo;
	}
	public int getEdad() {
		int edad = java.time.LocalDate.now().getYear() - this.anioNacimiento;	
		return edad;
	}
	public void mostrarEdad() {
		System.out.printf("en la actualidad tengo %d años.\n", getEdad());
	}
	public void saludar() {
		 System.out.printf("hola, soy "+nombre+" "+apellidos+"y naci el "+diaNacimiento+"/"+mesNacimiento+"/"+anioNacimiento+ "");
		 
	}
	private String toUpperprimeraletra(String palabra) {
		String npropio = palabra.toLowerCase();
		String letra=palabra.substring(0,1).toUpperCase();
		npropio=letra + npropio.substring(1);	
		return npropio;
	}
	private String convertirNombresPropios(String nombrespropios) {
		//convierto los apellidos en un array de strings separandolo por espacios
		String[] array_propios = nombrespropios.split(" ");
				
		//convierto cada elemento del array , en una palabra con la primera en mayusculas
		for (int i=0;i<array_propios.length;i++)
			array_propios[i] = toUpperprimeraletra(array_propios[i]);
				
		//creo la cadena de apellidos ya formateada concatenando los apellidos del array
		String nombres_formateado = "";
		for (int i=0;i<array_propios.length;i++)
			nombres_formateado = nombres_formateado + array_propios[i] +" ";
		
		return nombres_formateado;
	}
	}