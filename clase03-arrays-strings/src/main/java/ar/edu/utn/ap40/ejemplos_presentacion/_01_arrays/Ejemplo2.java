package ar.edu.utn.ap40.ejemplos_presentacion._01_arrays;

/**
 * Java - Sintaxis Basica - Vectores/Arrays basicos
 * 
 * @author ihsanch
 *
 */
public class Ejemplo2 {

	public static void main(String[] args) {

		int numeros[] = new int[10];
		char letras[] = { 'a', 'b', 'c' };
		char letras2[] = new char[5];
		letras2[0]='l';
		letras2[1]='u';
		letras2[2]='n';
		letras2[3]='e';
		letras2[4]='s';


		numeros[0] = 10;
		numeros[5] = 14;

		System.out.println(numeros[5] / 7);
		// 2

		for (char letra : letras2) {
			System.out.println(letra);
		}
		// a
		// b
		// c

	}

}
