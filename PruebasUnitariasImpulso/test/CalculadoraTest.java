import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalculadoraTest {
	Calculadora calc;
	
	@Before
	public void setupTests(){
		calc = new Calculadora();
		
	}

	@Test
	public void testSuma() {
		int a = 5;
		int b = 3;
		int result = 8;
		
		assertEquals(result, calc.Suma(a,b));
		
	}
	
	@Test
	public void testResta(){
		int a = 5;
		int b = 3;
		int result = 2;
		
		assertEquals(result, calc.Resta(a,b));		
	}
	
	@Test
	public void testMultiplicaci—n(){
		int a = 5;
		int b = 3;
		int result = 15;
		
		assertEquals(result,calc.Multiplicacion(a,b));
		
	}
	
	@Test
	public void testDivision(){
		int a = 5;
		int b = 3;
		float result = 1.66f;
		
		assertEquals(result,calc.Division(a,b),0.01f);
		
	}	

}
