package ar.edu.utn.ap40.ejemplos_presentacion._01_sintaxis_basica;

/**
 * Java - Sintaxis Basica - Bucles
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) {

		int unNum = 10;

		while (unNum > 0) {
			System.out.println(unNum);
			unNum = unNum - 1;
		}

		for (int otroNum = 0; otroNum < 10; otroNum++) {
			System.out.println(otroNum);
		}

	}

}
