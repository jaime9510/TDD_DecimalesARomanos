package co.edu.udea;

public class DecimalARomano {
	
	private String uno = "I";
	private String quatro = "IV";
	private String cinco = "V";
	
	public String convertir(int decimal) {
		
		String respuesta = "";
		
		while(decimal > 0) {
			
			if((decimal - 5) >= 0) {
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
