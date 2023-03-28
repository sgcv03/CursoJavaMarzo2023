package com.rf.ejercicios;

public class EjercicioDiezJava5 {

	//10-Dibuja un cuadrado, como en la imagen que acompaña, con ocho * de lado:
	
	public static void main(String[] args) {
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j<=8;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
