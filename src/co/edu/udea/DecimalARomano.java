package co.edu.udea;

public class DecimalARomano {
	
	private String uno = "I";
	
	public String convertir(int decimal) {
		
		String respuesta = "";
		
		while(decimal > 0) {
			respuesta = respuesta + uno;
			decimal = decimal - 1;
		}
		
		return(respuesta);
	}

}
