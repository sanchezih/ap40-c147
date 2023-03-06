package ar.edu.utn.ap40.guia_ejercicios;

import java.util.Arrays;

/**
 * Haga un main, donde por parametro ponga 3 numeros y una letra que represente
 * ascendente o descendente y los muestre ordenados por tal criterio
 * 
 * @author ihsanch
 *
 */
public class Ej01a {

	public static void main(String[] args) {

		// Obtengo los 3 primeros parametros
		int[] resultado = new int[3];

		resultado[0] = Integer.parseInt(args[0]);
		resultado[1] = Integer.parseInt(args[1]);
		resultado[2] = Integer.parseInt(args[2]);

		// Obtengo el ultimo parametro
		char orden = args[args.length - 1].charAt(0);

		int temp = 0;

		if (orden == 'A') { // Ascendente
			for (int i = 0; i < resultado.length; i++) {
				for (int j = i + 1; j < resultado.length; j++) {
					if (resultado[i] > resultado[j]) {
						temp = resultado[i];
						resultado[i] = resultado[j];
						resultado[j] = temp;
					}
				}
			}
		} else if (orden == 'D') { // Descendente
			for (int i = 0; i < resultado.length; i++) {
				for (int j = i + 1; j < resultado.length; j++) {
					if (resultado[i] < resultado[j]) {
						temp = resultado[i];
						resultado[i] = resultado[j];
						resultado[j] = temp;
					}
				}
			}
		}

		System.out.println(Arrays.toString(resultado));

	}
}
