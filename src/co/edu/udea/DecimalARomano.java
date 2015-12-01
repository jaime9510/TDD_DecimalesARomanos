package co.edu.udea;

public class DecimalARomano {
	
	private String uno = "I";
	private String quatro = "IV";
	private String cinco = "V";
	
	public String convertir(int decimal) {
		
		String respuesta = "";
		
		if(decimal < 4) {
			while(decimal > 0) {
				respuesta = respuesta + uno;
				decimal = decimal - 1;
			}
		} else if (decimal == 4){
			respuesta = quatro;
		} else if (decimal == 5) {
			respuesta = cinco;
		}

		
		return(respuesta);
	}

}
