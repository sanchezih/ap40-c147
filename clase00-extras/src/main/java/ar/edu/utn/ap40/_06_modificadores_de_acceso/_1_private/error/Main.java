package ar.edu.utn.ap40._06_modificadores_de_acceso._1_private.error;

/**
 * Programa Java para ilustrar el error al usar la clase desde un mismo paquete
 * con modificador private
 * 
 * @author ihsanch
 *
 */
class Main {

	public static void main(String[] args) {

		Persona persona = new Persona();

		/* Trato de acceder a un metodo privado la clase Persona */
		// persona.saludar(); // DESCOMENTAR
	}
}