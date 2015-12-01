package co.edu.udea;

public class DecimalARomano {
	
	private String uno = "I";
	private String cuatro = "IV";
	private String cinco = "V";
	private String nueve = "IX";
	private String diez = "X";
	private String cuarenta = "XL";
	private String cincuenta = "L";
	private String noventa = "XC";
	private String cien = "C";
	private String cuatrocientos = "CD";
	
	public String convertir(int decimal) {
		
		String respuesta = "";
		
		while(decimal > 0) {
			
			if((decimal - 400) >= 0) {
				respuesta = respuesta + cuatrocientos;
				decimal = decimal - 400;
			} else if((decimal - 100) >= 0) {
				respuesta = respuesta + cien;
				decimal = decimal - 100;
			} else if((decimal - 90) >= 0) {
				respuesta = respuesta + noventa;
				decimal = decimal - 90;
			} else if((decimal - 50) >= 0) {
				respuesta = respuesta + cincuenta;
				decimal = decimal - 50;
			} else if((decimal - 40) >= 0) {
				respuesta = respuesta + cuarenta;
				decimal = decimal - 40;
			} else if((decimal - 10) >= 0) {
				respuesta = respuesta + diez;
				decimal = decimal - 10;
			} else if((decimal - 9) >= 0) {
				respuesta = respuesta + nueve;
				decimal = decimal - 9;
			} else if((decimal - 5) >= 0) {
				respuesta = respuesta + cinco;
				decimal = decimal - 5;
			} else if((decimal - 4) >= 0) {
				respuesta = respuesta + cuatro;
				decimal = decimal - 4;
			} else if((decimal - 1) >= 0) {
				respuesta = respuesta + uno;
				decimal = decimal - 1;
			}
		}

		
		return(respuesta);
	}

}
