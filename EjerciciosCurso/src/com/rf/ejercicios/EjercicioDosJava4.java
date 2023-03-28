package com.rf.ejercicios;

public class EjercicioDosJava4 {
	
	public static void main(String[] args) {
		int cantidad, unidades, total;
		double precio;
		double importe;
		
		cantidad = 3;
		unidades = 12;
		precio = 5.4;
		
		importe = cantidad * unidades * precio;
		total = (int)(importe*1.21);
		
		System.out.println("cantidad\t=" + cantidad);
		System.out.println("unidades\t=" + unidades);
		System.out.println("precio\t\t=" + precio);
		System.out.println("Importe\t" + importe);
		System.out.println("IVA\t=");
		System.out.println("Total\t=" + total + " deberia ser: " + importe*1.21);





		
		
	}
}
