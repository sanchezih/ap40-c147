package ar.edu.utn.ap40.ejemplos_presentacion._01_funciones;

/**
 * 
 * @author ihsanch
 *
 */
public class Promedio {

	public static void main(String[] args) {

		int numeros[] = new int[] { 4, 6, 8, 11 };

		int resultado = 0;

		for (int i = 0; i < numeros.length; i++) {
			resultado = resultado + numeros[i];
		}

		resultado = resultado / numeros.length;

		System.out.println(resultado);
	}
}