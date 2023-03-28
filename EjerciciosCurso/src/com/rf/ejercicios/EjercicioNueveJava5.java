package com.rf.ejercicios;

public class EjercicioNueveJava5 {

	// 9-Presentar en consola las tablas de multiplicar del 1 al 10, como se muestra
	// en la imagen.

	public static void main(String[] args) {
		System.out.println("TABLAS DE MULTIPLICAR");
		for (int i = 1; i <= 10; i++) {
			System.out.println();
			System.out.println("La tabla del " + i);
			System.out.println("-------------------");
			for (int j = 0; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}

}
