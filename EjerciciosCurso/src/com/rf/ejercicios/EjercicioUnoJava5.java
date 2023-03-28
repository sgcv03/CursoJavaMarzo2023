package com.rf.ejercicios;

public class EjercicioUnoJava5 {

	/*
	 * 1- Cargar dos variables int con los valores 10 y 20, e indicar cual es mayor,
	 * si son iguales, o si uno es múltiplo de otro. Para probar el programa, ir
	 * cargando distintos valores en las variables
	 */

	public static void main(String[] args) {
		int primerValor = 7;
		int segundoValor = 5;

		if (primerValor > segundoValor) {
			System.out.println("El primer valor es mayor que el segundo");
		} else if (primerValor == segundoValor) {
			System.out.println("Son iguales");
		} else {
			System.out.println("El segundo valor es mayor que el primero");
		}
		
		if (primerValor % segundoValor == 0) {
			System.out.println("El primer valor es múltiplo del segundo ");
		} else if (segundoValor % primerValor == 0){
			System.out.println("El segundo valor es múltiplo del primero");

		}else {
			System.out.println("No son multiplos");
		}
	}

}
