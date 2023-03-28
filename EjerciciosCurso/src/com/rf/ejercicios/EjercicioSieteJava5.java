package com.rf.ejercicios;

public class EjercicioSieteJava5 {

	// 7-Calcular la suma de los primeros 10 números múltiplos de 5
	
	public static void main(String[] args) {
		int suma = 0;
		
		for (int i = 0; i < 50; i++) {
			if (i % 5 == 0) {
				suma += i;
			}
			 
		}
		System.out.println(suma);
	}

}
