package co.edu.udea;

public class DecimalARomano {
	
	private String uno = "I";
	
	public String convertir(int decimal) {
		
		String respuesta = "";
		
		if(decimal < 4) {
			while(decimal > 0) {
				respuesta = respuesta + uno;
				decimal = decimal - 1;
			}
		} else {
			respuesta = "IV";
		}

		
		return(respuesta);
	}

}
