package ar.edu.utn.ap40.ejemplos_presentacion._01_arrays;

/**
 * Ejemplo de array de numeros
 * 
 * @author ihsanch
 *
 */
public class Ejemplo1 {

	public static void main(String[] args) {

		// Asi se declara un arreglo de enteros
		int numeros[] = new int[3];

		// Asignacion
		numeros[0] = 1;
		numeros[1] = 37;
		numeros[2] = 16;

		// Tambien puede inicializarse directo con valores
		int otroArrayDenumeros[] = new int[] { 1, 37, 16 };

		// Imprime por pantalla el numero 3
		System.out.println(numeros.length);

		// La sintaxis de punto "." indica que estamos accediendo a una propiedad de
		// la variable. Lo que vimos como "tipos primitivos" no lo permiten, pero los
		// arrays tienen una fundamental: "length", que nos dice el tamanio del array.

		
		
		
		
		for (int indice = 0; indice < numeros.length; indice++) {
			System.out.println(numeros[indice]);// imprime por pantalla cada elemento
		}

	}

}
