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
	
	@Test
	public void testConvertirNum2() {
		
		//Arrange
		int decimal = 2;
		String romano = "";
		DecimalARomano decimal_romano = null;
		
		//Act
		decimal_romano = new DecimalARomano();
		romano = decimal_romano.convertir(decimal);
		
		//Assert
		assertTrue("Se convierte número 2 a romano", romano.equals("II"));
	}
	
	@Test
	public void testConvertirNum3() {
		
		//Arrange
		int decimal = 3;
		String romano = "";
		DecimalARomano decimal_romano = null;
		
		//Act
		decimal_romano = new DecimalARomano();
		romano = decimal_romano.convertir(decimal);
		
		//Assert
		assertTrue("Se convierte número 3 a romano", romano.equals("III"));
	}
	
	@Test
	public void testConvertirNum4() {
		
		//Arrange
		int decimal = 4;
		String romano = "";
		DecimalARomano decimal_romano = null;
		
		//Act
		decimal_romano = new DecimalARomano();
		romano = decimal_romano.convertir(decimal);
		
		//Assert
		assertTrue("Se convierte número 4 a romano", romano.equals("IV"));
	}
	
	@Test
	public void testConvertirNum5() {
		
		//Arrange
		int decimal = 5;
		String romano = "";
		DecimalARomano decimal_romano = null;
		
		//Act
		decimal_romano = new DecimalARomano();
		romano = decimal_romano.convertir(decimal);
		
		//Assert
		assertTrue("Se convierte número 5 a romano", romano.equals("V"));
	}
	
	@Test
	public void testConvertirNum6() {
		
		//Arrange
		int decimal = 6;
		String romano = "";
		DecimalARomano decimal_romano = null;
		
		//Act
		decimal_romano = new DecimalARomano();
		romano = decimal_romano.convertir(decimal);
		
		//Assert
		assertTrue("Se convierte número 6 a romano", romano.equals("VI"));
	}
}
