package com.rf.ejercicios;

import java.util.ArrayList;
import java.util.Iterator;

public class EjercicioOnceJava5 {

	// 11-Calcular cuantos números primos hay entre 1 y 100, y cuales son.

	public static void main(String[] args) {
		ArrayList<Integer> numerosPrimos = new ArrayList<Integer>();
		
		for (int i = 1; i <= 100 ; i++) {
			if (esPrimo(i)) {
				numerosPrimos.add(i);
			}
		}
		
		for (int i = 0; i < numerosPrimos.size();i++){
			System.out.println(numerosPrimos.get(i));	
		}
		System.out.println("Hay " + numerosPrimos.size()+" numeros primos");
		
	}

	public static boolean esPrimo(int numero) {
		int acumulador = 0;

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				acumulador += 1;
			}
		}

		if (acumulador == 2) {
			return true;
		}
		return false;
	}
}
