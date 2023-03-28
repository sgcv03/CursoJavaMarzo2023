package com.rf.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioCincoJava5 {
	
	/*Recibir una colección de números desde la linea de comandos, calcular su cuadrado y presentarlo en salida. 
	 * El bucle debe continuar hasta haber calculado todos los números que se le entreguen*/
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, cuadrado;
		ArrayList<Integer> coleccionNumeros = new ArrayList<Integer>();
		for (int i = 0; i < 6; i++) {
			System.out.println("Introduce un número:");
			numero = entrada.nextInt();
			coleccionNumeros.add(numero);
		}
		
		for (int i = 0; i < coleccionNumeros.size();i++) {
			cuadrado = (int) Math.pow(coleccionNumeros.get(i), 2);
			System.out.println(cuadrado);
		}
		
	}
}
