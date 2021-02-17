/**
 * 
 */
package testsDebug;

/**
 * @author Diego
 *
 */
public class ejercicio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//llamada a constructor vacio
		Nif minif = new Nif(51195324, 'S');
		System.out.println(minif.getDni()+ "-"+minif.getLetra());
		minif.setLetra('D');
		
		System.out.println(minif.getDni()+ "-"+minif.getLetra());
		

	}

}

