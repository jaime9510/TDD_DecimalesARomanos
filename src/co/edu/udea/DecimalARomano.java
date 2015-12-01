package co.edu.udea;

public class DecimalARomano {
	
	private String uno = "I";
	private String quatro = "IV";
	private String cinco = "V";
	private String nueve = "IX";
	private String diez = "X";
	
	public String convertir(int decimal) {
		
		String respuesta = "";
		
		while(decimal > 0) {
			
			if((decimal - 10) >= 0) {
				respuesta = respuesta + diez;
				decimal = decimal - 10;
			} else if((decimal - 9) >= 0) {
				respuesta = respuesta + nueve;
				decimal = decimal - 9;
			} else if((decimal - 5) >= 0) {
				respuesta = respuesta + cinco;
				decimal = decimal - 5;
			} else if((decimal - 4) >= 0) {
				respuesta = respuesta + quatro;
				decimal = decimal - 4;
			} else if((decimal - 1) >= 0) {
				respuesta = respuesta + uno;
				decimal = decimal - 1;
			}
		}

		
		return(respuesta);
	}

}
