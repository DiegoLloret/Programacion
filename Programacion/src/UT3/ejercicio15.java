/**
 * 
 */
package UT3;

/**
 * @author Alumno 3
 *
 */
import java.util.Scanner;
public class ejercicio15 {

	/**
	 * @param args xd lol
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("introduce tu nota ");
		Scanner nota=new Scanner(System.in);
		
		float nota1=nota.nextInt(); 
		if( nota1 >=0 && nota1 <5)
		{
			System.out.println(nota1 + "=> insuficiente");
		}
		else if(nota1 <6)
		{
			System.out.println(nota1 + "=> suficiente");
		}
		else if(nota1 <7)
			{
				System.out.println(nota1 + "=> bien");	
			}
	
		else if(nota1 <=8)
		{
		System.out.println(nota1 + "=> notable");
		}
		else if(nota1 <=10)
		{
			System.out.println(nota1 + "=> sobresaliente");
		}
		else if(nota1 >10)
		{
		System.out.println(nota1 + "=> error");
		}
		else if(nota1 <0)
		{
		System.out.println(nota1 + "=> suficiente");
		}
				
	}
	
}