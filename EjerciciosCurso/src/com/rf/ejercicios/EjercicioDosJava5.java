package com.rf.ejercicios;

public class EjercicioDosJava5 {

	/*
	 * 2-Crear una variable (nota) con el valor 6, y decidir el texto que se ha de
	 * presentar según la siguiente escala.
	 * 
	 */

	public static void main(String[] args) {
		double nota = 6;
		if (nota >= 0 || nota <= 4) {
			System.out.println("INSUFICIENTE");
		} else if (nota == 5) {
			System.out.println("SUFICIENTE");
		} else if (nota == 6) {
			System.out.println("BIEN");
		} else if (nota == 7 || nota == 8) {
			System.out.println("NOTABLE");
		} else if (nota == 9 || nota == 10) {
			System.out.println("SOBRESALIENTE");
		}
	}

}
