package co.edu.udea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// Clase con método para convertir números decimales a romanos
		DecimalARomano decimal_romano = new DecimalARomano();
		
		// Se crea un canal de entrada
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        // Variable para capturar decimal a convertir
        int decimal = 0;
		
        // Capturar números que se van a convertir a romano
        while(decimal != -1) {
    		System.out.println("Ingrese el número decimal que desea convertir a romano: (-1 para salir)");
    		
            try{
            	decimal = Integer.parseInt(in.readLine());
            } catch (NumberFormatException e){
                System.err.println("Error en la entrada. Número invalido. Intente de nuevo");
            }
    		
    		if(decimal != -1) {
                // Salida: número ingresado y su conversión a romano
        		System.out.println("Usted ingresó: " + decimal);
        		System.out.println("En romano este número es: " + decimal_romano.convertir(decimal) + "\n");
    		}

        }


	}

}
