package ar.edu.utn.ap40.ejemplos_presentacion._02_strings;

/**
 * String - Escape y caracteres especiales
 * 
 * @author ihsanch
 *
 */
public class Ejemplo5 {

	public static void main(String[] args) {

		/*
		 * Todos los lenguajes de programacion cuentan con caracteres "especiales", ya
		 * que hay cosas que o bien no se pueden escribir, coinciden con palabras
		 * reservadas o la sintaxis no las soporta. En el caso de Java, el caracter
		 * especial es la contrabarra "\" ( la barra que no es la de dividido ). Vamos
		 * con unos ejemplos:
		 */

		/* Enter / Cambio de linea */
		String a = "hola que tal?\n"; // \n es la forma de hacer un cambio de linea, ya que java no permite strings
										// multilinea
		System.out.println(a);

		/* Tabulacion (no es lo mismo que varios espacios) */
		String b = "Pedro\t18\tprogramador\n"; // \t escribe una tabulacion
		System.out.println(b);

		/*
		 * Escribir una comilla doble: si con " declaramos un string, como hacemos para
		 * que aparezca en el medio del texto que queremos escribir?
		 */
		String c = "hola, \"que tal\" "; // con \ decimos que "escapamos" el caracter
		System.out.println(c);

		/* Escribir una contrabarra "\" */
		String d = "Esto es una contra barra \\ "; // con \ escapamos a la \ misma, si lo imprimimos esto dice: Esto es
													// una contrabarra \
		System.out.println(d);

	}
}
