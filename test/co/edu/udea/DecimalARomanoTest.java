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
	
	@Test
	public void testConvertirNum7() {
		
		//Arrange
		int decimal = 7;
		String romano = "";
		DecimalARomano decimal_romano = null;
		
		//Act
		decimal_romano = new DecimalARomano();
		romano = decimal_romano.convertir(decimal);
		
		//Assert
		assertTrue("Se convierte número 7 a romano", romano.equals("VII"));
	}
	
	@Test
	public void testConvertirNum8() {
		
		//Arrange
		int decimal = 8;
		String romano = "";
		DecimalARomano decimal_romano = null;
		
		//Act
		decimal_romano = new DecimalARomano();
		romano = decimal_romano.convertir(decimal);
		
		//Assert
		assertTrue("Se convierte número 8 a romano", romano.equals("VIII"));
	}
	
	@Test
	public void testConvertirNum9() {
		
		//Arrange
		int decimal = 9;
		String romano = "";
		DecimalARomano decimal_romano = null;
		
		//Act
		decimal_romano = new DecimalARomano();
		romano = decimal_romano.convertir(decimal);
		
		//Assert
		assertTrue("Se convierte número 9 a romano", romano.equals("IX"));
	}
	
	@Test
	public void testConvertirNum10() {
		
		//Arrange
		int decimal = 10;
		String romano = "";
		DecimalARomano decimal_romano = null;
		
		//Act
		decimal_romano = new DecimalARomano();
		romano = decimal_romano.convertir(decimal);
		
		//Assert
		assertTrue("Se convierte número 10 a romano", romano.equals("X"));
	}
	
	@Test
	public void testConvertirNum14() {
		
		//Arrange
		int decimal = 14;
		String romano = "";
		DecimalARomano decimal_romano = null;
		
		//Act
		decimal_romano = new DecimalARomano();
		romano = decimal_romano.convertir(decimal);
		
		//Assert
		assertTrue("Se convierte número 14 a romano", romano.equals("XIV"));
	}
	
	@Test
	public void testConvertirNum26() {
		
		//Arrange
		int decimal = 26;
		String romano = "";
		DecimalARomano decimal_romano = null;
		
		//Act
		decimal_romano = new DecimalARomano();
		romano = decimal_romano.convertir(decimal);
		
		//Assert
		assertTrue("Se convierte número 26 a romano", romano.equals("XXVI"));
	}
	
	@Test
	public void testConvertirNum38() {
		
		//Arrange
		int decimal = 38;
		String romano = "";
		DecimalARomano decimal_romano = null;
		
		//Act
		decimal_romano = new DecimalARomano();
		romano = decimal_romano.convertir(decimal);
		
		//Assert
		assertTrue("Se convierte número 38 a romano", romano.equals("XXXVIII"));
	}
	
	@Test
	public void testConvertirNum40() {
		
		//Arrange
		int decimal = 40;
		String romano = "";
		DecimalARomano decimal_romano = null;
		
		//Act
		decimal_romano = new DecimalARomano();
		romano = decimal_romano.convertir(decimal);
		
		//Assert
		assertTrue("Se convierte número 40 a romano", romano.equals("XL"));
	}
	
	@Test
	public void testConvertirNum50() {
		
		//Arrange
		int decimal = 50;
		String romano = "";
		DecimalARomano decimal_romano = null;
		
		//Act
		decimal_romano = new DecimalARomano();
		romano = decimal_romano.convertir(decimal);
		
		//Assert
		assertTrue("Se convierte número 50 a romano", romano.equals("L"));
	}
	
	@Test
	public void testConvertirNum90() {
		
		//Arrange
		int decimal = 90;
		String romano = "";
		DecimalARomano decimal_romano = null;
		
		//Act
		decimal_romano = new DecimalARomano();
		romano = decimal_romano.convertir(decimal);
		
		//Assert
		assertTrue("Se convierte número 90 a romano", romano.equals("XC"));
	}
	
	@Test
	public void testConvertirNum100() {
		
		//Arrange
		int decimal = 100;
		String romano = "";
		DecimalARomano decimal_romano = null;
		
		//Act
		decimal_romano = new DecimalARomano();
		romano = decimal_romano.convertir(decimal);
		
		//Assert
		assertTrue("Se convierte número 100 a romano", romano.equals("C"));
	}
	
	@Test
	public void testConvertirNum363() {
		
		//Arrange
		int decimal = 363;
		String romano = "";
		DecimalARomano decimal_romano = null;
		
		//Act
		decimal_romano = new DecimalARomano();
		romano = decimal_romano.convertir(decimal);
		
		//Assert
		assertTrue("Se convierte número 363 a romano", romano.equals("CCCLXIII"));
	}
	
	@Test
	public void testConvertirNum422() {
		
		//Arrange
		int decimal = 422;
		String romano = "";
		DecimalARomano decimal_romano = null;
		
		//Act
		decimal_romano = new DecimalARomano();
		romano = decimal_romano.convertir(decimal);
		
		//Assert
		assertTrue("Se convierte número 422 a romano", romano.equals("CDXXII"));
	}
	
	@Test
	public void testConvertirNum500() {
		
		//Arrange
		int decimal = 500;
		String romano = "";
		DecimalARomano decimal_romano = null;
		
		//Act
		decimal_romano = new DecimalARomano();
		romano = decimal_romano.convertir(decimal);
		
		//Assert
		assertTrue("Se convierte número 500 a romano", romano.equals("D"));
	}
	
	@Test
	public void testConvertirNum900() {
		
		//Arrange
		int decimal = 900;
		String romano = "";
		DecimalARomano decimal_romano = null;
		
		//Act
		decimal_romano = new DecimalARomano();
		romano = decimal_romano.convertir(decimal);
		
		//Assert
		assertTrue("Se convierte número 900 a romano", romano.equals("CM"));
	}
	
	@Test
	public void testConvertirNum1000() {
		
		//Arrange
		int decimal = 1000;
		String romano = "";
		DecimalARomano decimal_romano = null;
		
		//Act
		decimal_romano = new DecimalARomano();
		romano = decimal_romano.convertir(decimal);
		
		//Assert
		assertTrue("Se convierte número 1000 a romano", romano.equals("M"));
	}
	
}
