package com.rf.ejercicios;

public class EjercicioUnoJava4 {

	public static void main(String[] args) {
		int valor = 0;
		valor = 23;
		valor +=10;
		System.out.println("Resultado de a=" + --valor); //El resultado será 32
		System.out.println("Resultado de b="+ ++valor); // El resultado será 33
		System.out.println("Resultado de c="+ valor++); //El resultado será 33
		System.out.println("Resultado de d="+ valor--);
		System.out.println("Resultado de e="+ valor); //El resultado será 33
	}

}
