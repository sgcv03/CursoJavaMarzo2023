package com.rf.ejercicios;

import java.util.Scanner;

public class EjercicioCuatroJava5 {

	/*Hacer una clase que convierta de números a letras, definiendo num=72. 
	 * Podéis hacer una primera version en donde los números del 11 al 15 salgan como diez y uno, diez y dos…. 
	 * y una segunda version corregida.*/
	
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduce un número (0-99)");
		int numero = entrada.nextInt();
		metodoFacil(numero);
		System.out.println();
		metodoDificil(numero);
	}
	
	public static void metodoFacil(int num) {
		int decenas = num / 10;
		
		switch (decenas) {
		case 0:
			System.out.print("");
			break;
		case 1:
			System.out.print("Dieci");
			break;
		case 2:
			System.out.print("Veinti");
			break;
		case 3:
			System.out.print("Treintai");
			break;
		case 4:
			System.out.print("Cuarentai");
			break;
		case 5:
			System.out.print("Cincuentai");
			break;
		case 6:
			System.out.print("Sesentai");
			break;
		case 7:
			System.out.print("Setentai");
			break;
		case 8:
			System.out.print("Ochentai");
			break;
		case 9:
			System.out.print("Noventai");
			break;
			
		}
		
		int unidades = num % 10;
		switch (unidades) {
		case 0:
			System.out.print("Cero");
			break;
		case 1:
			System.out.print("uno");
			break;
		case 2:
			System.out.print("dos");
			break;
		case 3:
			System.out.print("tres");
			break;
		case 4:
			System.out.print("cuatro");
			break;
		case 5:
			System.out.print("cinco");
			break;
		case 6:
			System.out.print("seis");
			break;
		case 7:
			System.out.print("siete");
			break;
		case 8:
			System.out.print("ocho");
			break;
		case 9:
			System.out.print("nueve");
			break;
			
		}
	}
	
	public static void metodoDificil(int num) {
		String[] unidades = {"Uno","Dos","Tres","Cuuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez","Once","Doce","Trece","Catorce","Quince"};
		String[] decimales = {"Dieci","Veinti","Treintai","Cuarentai","Cincuentai","Sesentai","Setentai","Ochentai","Noventai"};
		
		int decenas = num / 10;
		int uds = num % 10;
		
		if (num > 0) {
			if (num<16) {
				System.out.println(unidades[num-1]);
			}else {
				System.out.println(decimales[decenas-1] + unidades[uds-1]);
			}
		}
		
	}

}
