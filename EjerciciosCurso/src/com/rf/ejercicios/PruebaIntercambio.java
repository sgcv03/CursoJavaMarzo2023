package com.rf.ejercicios;

public class PruebaIntercambio {

	public static void main(String[] args) {
		Intercambio<String> textos = new Intercambio<String>();
		textos.setElemento1("Juan");
		textos.setElemento2("Alberto");
		System.out.println("ANTES DE INVERTIR");
		System.out.println(textos.toString());
		System.out.println("DESPUES DE INVERTIR");
		textos.invierte();
		System.out.println(textos.toString());

	}

}
