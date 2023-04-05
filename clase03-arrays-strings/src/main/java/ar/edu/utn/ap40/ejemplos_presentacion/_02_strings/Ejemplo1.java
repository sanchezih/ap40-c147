package ar.edu.utn.ap40.ejemplos_presentacion._02_strings;

/**
 * String
 * 
 * @author ihsanch
 *
 */
public class Ejemplo1 {

	public static void main(String[] args) {

		/*
		 * String es el tipo de dato (Clase en realidad, ya veremos de que se trata) de
		 * Java Para representar cadenas de texto, de cualquier tamanio.
		 * 
		 * Todos los lenguajes de programacion tienen este dato
		 * 
		 * Los Strings se declaran con comillas dobles
		 */
		String txt1 = "Hola!";
		String txt2 = "Chau!";

		/*
		 * Se puede pensar como un array del tipo de dato "char", aunque como veremos,
		 * tiene muchas operaciones particulares. Por ejemplo para acceder a un caracter
		 * en particular se puede hacer:
		 */
		char letra = txt1.charAt(2); // "l"
		System.out.println(letra);

	}
}
