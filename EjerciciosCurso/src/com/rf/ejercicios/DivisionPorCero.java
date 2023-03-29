package com.rf.ejercicios;

public class DivisionPorCero {

	public static void main(String[] args) {
		int a = 0;
		int b = 300;
		int c;
		
		try {
			c = b/a;
			System.out.println("El resultado es: "+c);
		} catch (ArithmeticException e) {
			System.err.println("Se ha producido un error! /by zero");
		}
		finally {
			System.out.println("EJECUCION FINALIZADA");
		}
	}

}
