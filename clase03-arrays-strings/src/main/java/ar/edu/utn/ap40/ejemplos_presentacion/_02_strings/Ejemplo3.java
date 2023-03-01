package ar.edu.utn.ap40.ejemplos_presentacion._02_strings;

/**
 * String - Operaciones
 * 
 * @author ihsanch
 *
 */
public class Ejemplo3 {

	public static void main(String[] args) {

		String unTexto = "laLA";

		// Pasar a mayuscula o minuscula
		System.out.println(unTexto.toLowerCase() + unTexto.toUpperCase()); // lalaLALA

		// Indicar si contiene otro string
		System.out.println(unTexto.contains("la")); // true
		System.out.println(unTexto.contains("aL")); // true
		System.out.println(unTexto.contains("La")); // false

		// Ver si inicia o termina con otra cadena
		System.out.println(unTexto.startsWith("la")); // true
		System.out.println(unTexto.endsWith("LE")); // false

		// Reemplazar
		System.out.println(unTexto.replace("la", "le")); // leLA
		System.out.println("hola que tal?".replace("hola", "chau").toUpperCase()); // CHAU QUE TAL?

	}
}
