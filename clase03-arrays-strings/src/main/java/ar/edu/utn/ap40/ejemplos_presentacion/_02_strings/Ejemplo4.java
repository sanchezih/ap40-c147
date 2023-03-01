package ar.edu.utn.ap40.ejemplos_presentacion._02_strings;

/**
 * String - Operaciones - Split
 * 
 * @author ihsanch
 *
 */
public class Ejemplo4 {

	public static void main(String[] args) {

		/**
		 * Quizas la operacion mas usada de String, es "split" el cual convierte un
		 * String en un String[] (es decir un array de strings), a partir de un
		 * separador. Por ejemplo:
		 */

		String saludo = "hola que tal?";

		String[] saludoPartido1 = saludo.split(" "); // "hola", "que", "tal?"

		String[] saludoPartido2 = saludo.split("a"); // "hol", " que t", "l?" --> notar la presencia de espacios

	}
}
