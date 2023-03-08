package ar.edu.utn.ap40._03_final._03_variable_final.src;

/**
 * Programa Java para demostrar la variable final de referencia
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) {

		final StringBuilder cadena = new StringBuilder("Java"); // Una variable final de referencia

		System.out.println(cadena);

		/*
		 * Cambio estado interno de referencia del objeto por variable de referencia
		 * final 'cadena'
		 */
		cadena.append("desdeCero");
		System.out.println(cadena);
	}
}