package ar.edu.utn.ap40.ejemplos_presentacion._02_strings;

/**
 * String - Operaciones
 * 
 * @author ihsanch
 *
 */
public class Ejemplo2 {

	public static void main(String[] args) {

		// Existen numerosas operaciones que se pueden hacer con los strings, vamos a
		// tomar las variables de ejemplo:
		String txt1 = "Hola!";
		String txt2 = "Chau!";

		// Concatenar Strings con "+"
		String txt3 = txt1 + txt2; // "Hola!Chau!"
		String txt4 = txt1 + " " + txt2; // "Hola! Chau!"

		// Comparar
		txt1.equals(txt2); // false
		txt1.equals(txt1); // true
		// notar que NO debe usarse el operador == para comparar Strings

		// Largo de un String
		txt1.length(); // 5

	}
}
