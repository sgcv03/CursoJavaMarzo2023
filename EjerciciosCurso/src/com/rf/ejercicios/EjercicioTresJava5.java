package com.rf.ejercicios;

public class EjercicioTresJava5 {

	/*
	 * 3- hacer una clase, definiendo día=20, mes =8,año = 2015, y luego añadir el
	 * código para comprobar que la fecha es correcta.
	 * 
	 * En la primera version, asumir meses de 30 dias 
	 * En la segunda version, utilizar los días reales de cada mes, sin arrays.
	 * En la tercera, utilizar arrays.
	 * En la cuarta, tened en cuenta los años bisiestos
	 */

	public static void main(String[] args) {
		// Primera version
		System.out.print("Primera version --> ");
		int dia = 29;
		int mes = 2;
		int year = 2015;

		if (dia >= 1 && dia <= 30) {
			if (mes >= 1 && mes <= 12) {
				if (year != 0) {
					System.out.println("Fecha introducida correcta");
				}else {
					System.out.println("Año incorrecto");
				}
			}else {
				System.out.println("Mes incorrecto");
			}
		} else {
			System.out.println("Fecha incorrecta");
		}

		// Segunda version
		System.out.print("Segunda version --> ");
		boolean diaValido = false;
		if (mes >= 1 && mes <= 12) {
			if(year != 0) {
				switch (mes) {
				case 1: 
				case 3: 
				case 5: 
				case 7: 
				case 8: 
				case 10: 
				case 12:
					if (dia <= 31) {
						diaValido = true;
					}
					break;
				case 4: 
				case 6: 
				case 9: 
				case 11:
					if (dia <= 30) {
						diaValido = true;
					}
					break;
				default:
					if (dia<=28) {
						diaValido = true;
					}
				}
				if (diaValido) {
					System.out.println("Fecha introducida correcta");
				}else {
					System.out.println("Dia incorrecto");
				}
			}else {
				System.out.println("Mes incorrecto");
			}
			
		}else {
			System.out.println("Fecha incorrecta");
		}
		
		//Tercera version
		System.out.print("Tercera versión --> ");
		int diasMeses[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		if (mes >= 1 && mes <= 12) {
			if(year != 0) {
				if (dia <= diasMeses[mes-1]) {
					System.out.println("Fecha introducida correcta");
				}else {
					System.out.println("Dia incorrecto");
				}
			}else {
				System.out.println("Año incorrecto");
			}
		
		}else {
			System.out.println("Mes incorrecto");
		}
		
		//Cuarta version
		System.out.print("Cuarta version --> ");
		int diaMes[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		if (mes >= 1 && mes <= 12) {
			if(year != 0) {
				if (year % 4 == 0) {
					diaMes[1] = 29;
				}
				if (dia <= diaMes[mes-1]) {
					System.out.println("Fecha introducida correcta");
				}else {
					System.out.println("Dia incorrecto");
				}
			}else {
				System.out.println("Año incorrecto");
			}
		
		}else {
			System.out.println("Mes incorrecto");
		}
	}
}
