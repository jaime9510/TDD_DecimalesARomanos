package co.edu.udea;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecimalARomanoTest {

	@Test
	public void testConvertirNum1() {
		
		//Arrange
		int decimal = 1;
		String romano = "";
		DecimalARomano decimal_romano = null;
		
		//Act
		decimal_romano = new DecimalARomano();
		romano = decimal_romano.convertir(decimal);
		
		//Assert
		assertTrue("Se convierte número 1 a romano", romano.equals("I"));
	}
}
