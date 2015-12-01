package co.edu.udea;

public class DecimalARomano {
	
	private String uno = "I";
	
	public String convertir(int decimal) {
		
		String respuesta = "";
		
		if(decimal == 1) {
			respuesta = uno;
		}
		
		return(respuesta);
	}

}
