package testsDebug;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComplexTest {
// 1 a
	@Test
	@DisplayName(value = "Suma de (2+3j)+(4+j)=(6+4j)")
	void testSumar() {
		Complex a= new Complex(2,3);
		Complex b= new Complex(4,1);
		
		Complex esperado= new Complex(6,4);
		Complex resultado = null;
		resultado= b.sumar(a);
		assertEquals(esperado, resultado);
	}
	@Test
	@DisplayName(value = "resta de (2+3j)-(4+j)=(-2+2j)")
	void testRestar() {
		Complex a= new Complex(2,3);
		Complex b= new Complex(4,1);
		
		Complex esperado= new Complex(-2,2);
		Complex resultado = null;
		resultado= a.restar(b);
		assertEquals(esperado, resultado);
	}
	@Test
	@DisplayName(value = "multiplicacion de dos complejos (2+3j)*(4+j)=(8-3,2j+12j)=(5,14j)")
	void testMultiplicar() {
		Complex a= new Complex(2,3);
		Complex b= new Complex(4,1);
		
		Complex esperado= new Complex(5,14);
		Complex resultado = null;
		resultado= a.multiplicar(b);
		assertEquals(esperado, resultado);
	}
	@Test
	@DisplayName(value = "multiplicacion de un complejo y un double (2+3j)*(4)=(8,12j)")
	void testMultiplicarD() {
		Complex a= new Complex(2,3);
		double b= 4;
		
		Complex esperado= new Complex(8,12);
		Complex resultado = null;
		resultado= a.multiplicar(b);
		assertEquals(esperado, resultado);
	}
	@Test
	@DisplayName(value = " division de dos complejos (8, 4) / (2, 7) = ((8*2 + 4*7) / (2^2 + 7^2) , (4*2 – 8*7) / (2^2 + 7^2))=(44/53,-48/53)=(0,83,-0,90)")
	void testDividir() {
		Complex a= new Complex(8,4);
		Complex b= new Complex(2,7);
		
		Complex esperado= new Complex(0.8301886792452831,-0.9056603773584906);
		Complex resultado = null;
		resultado= a.dividir(b);
		assertEquals(esperado, resultado);
	}
	@Test
	@DisplayName(value = "saber si dos numeros complejos son iguales true si son iguales false si son diferentes")
	void testEquals() {
		Complex a= new Complex(8,4);
		Complex b= new Complex(8,4);
		
		boolean esperado=true;
		boolean resultado ;
		resultado= a.equals(b);
		assertEquals(esperado, resultado);
	}
	//1 b
	@Test
	@DisplayName(value = "resta de (1+3j)-(1+3j)=(0+0j)")
	void testRestar1() {
		Complex a= new Complex(1,3);
		Complex b= new Complex(1,3);
		
		Complex esperado= new Complex(0,0);
		Complex resultado = null;
		resultado= a.restar(b);
		assertEquals(esperado, resultado);
	}
	@Test
	@DisplayName(value = "resta de (0+0j)-(1+3j)=(-1+-3j)")
	void testRestar2() {
		Complex a= new Complex(0,0);
		Complex b= new Complex(1,3);
		
		Complex esperado= new Complex(-1,-3);
		Complex resultado = null;
		resultado= a.restar(b);
		assertEquals(esperado, resultado);
	}
	@Test
	@DisplayName(value = "resta de (1+3j)-(1+8j)=(0+-5j)")
	void testRestar3() {
		Complex a= new Complex(1,3);
		Complex b= new Complex(1,8);
		
		Complex esperado= new Complex(0,-5);
		Complex resultado = null;
		resultado= a.restar(b);
		assertEquals(esperado, resultado);
	}
	@Test
	@DisplayName(value = " division de dos complejos ")
	void testDividir1() {
		Complex a= new Complex(8,4);
		Complex b= new Complex(0,1);
		
		Complex esperado= new Complex(4, -8);
		Complex resultado = null;
		resultado= a.dividir(b);
		assertEquals(esperado, resultado);
	}
	@Test
	@DisplayName(value = " division de dos complejos ")
	void testDividir2() {
		Complex a= new Complex(0,0);
		Complex b= new Complex(-5,1);
		
		Complex esperado= new Complex(0, 0);
		Complex resultado = null;
		resultado= a.dividir(b);
		assertEquals(esperado, resultado);
	}
	@Test
	@DisplayName(value = " division de dos complejos ")
	void testDividir3() {
		Complex a= new Complex(8,0);
		Complex b= new Complex(4,0);
		
		Complex esperado= new Complex(2,0);
		Complex resultado = null;
		resultado= a.dividir(b);
		assertEquals(esperado, resultado);
	}
}
