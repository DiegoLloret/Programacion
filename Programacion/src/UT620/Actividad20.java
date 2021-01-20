package UT620;

public class Actividad20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona yo = new Persona();		
		yo.setNombre("DiEgo");
		System.out.println(yo.getNombre());
		yo.setApellido("lloret domínguez");
		System.out.println(yo.getApellidos());
		yo.setAnio(2001);
		yo.setMes(5);
		yo.setDia(28);
		yo.setSexo('M');
		yo.saludar();
		yo.mostrarEdad();
		
	}
	
	

}