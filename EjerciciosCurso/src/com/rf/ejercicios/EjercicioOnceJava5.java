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
		for (int i = 2; i < numero/2 ; i++) {
			if (numero % i == 0) {
				return false;
			}
		}

		return true;
	}
}
