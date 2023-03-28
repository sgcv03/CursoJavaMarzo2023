package com.rf.ejercicios;

public class Vuelta {

	public static void main(String[] args) {
		String entrada = "";

		int size = args.length;
		for (int i = 0; i < size; i++) {
			entrada += args[i] + " ";
		}

		/*
		 * Sobre el ejercicio anterior, hacer lo mismo, pero va dejando los caracteres
		 * en una string, volcandola al final. (Asumimos la ineficacia del sistema por
		 * trabajar con string, pero de momento, ya nos vale).
		 */
		System.out.println(entrada);
		for (int i = entrada.length() - 1; i >= 0; i--) {
			System.out.print(entrada.charAt(i));
		}
		/*
		 * Para complicar un poco las cosas, os propongo que durante la inversión,
		 * cambies las vocales por números, utilizando switch
		 */
		System.out.println();
		for (int i = entrada.length() - 1; i >= 0; i--) {
			char vocal = entrada.charAt(i);
			switch (vocal) {
			case 'a':
				entrada = entrada.replace(vocal, '1');
			case 'e':
				entrada = entrada.replace(vocal, '2');
			case 'i':
				entrada = entrada.replace(vocal, '3');
			case 'o':
				entrada = entrada.replace(vocal, '4');
			case 'u':
				entrada = entrada.replace(vocal, '0');
				System.out.print(entrada.charAt(i));
				break;

			default:
				System.out.print(entrada.charAt(i));

			}
		}
		System.out.println();
		/*
		 * Otra propuesta mas, Ahora se me ocurre que la cadena de entrada la podría
		 * recibir delimitada con cualquier carácter, y no vamos a utilizar el atributo
		 * length, si no que vamos a calcular la longitud, buscando el caracter del
		 * final.
		 */
		String entradaDelimitada = entrada.substring(1, entrada.lastIndexOf("*"));
		System.out.println(entradaDelimitada);

		/*
		 * Y nuestra ultima implementación, basada en esta que acabamos de hacer, pero
		 * ahora vamos a trabajar sin calcular la longitud de la string
		 */

	}

}
