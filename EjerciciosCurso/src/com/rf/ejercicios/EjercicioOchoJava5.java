package com.rf.ejercicios;

public class EjercicioOchoJava5 {

	//Calcular el factorial del numero 8.
	
	public static void main(String[] args) {
		int resultado = 1;
		int numero = 8;
		
		for (int i = numero; i > 0 ; i--) { 
			resultado = resultado * i;
		}
		System.out.println(resultado);
	}

}
