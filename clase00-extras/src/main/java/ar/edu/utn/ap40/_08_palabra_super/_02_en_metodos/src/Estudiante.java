package ar.edu.utn.ap40._08_palabra_super._02_en_metodos.src;

public class Estudiante extends Persona {

	void message() {
		System.out.println("Esta es una clase estudiante");
	}

	/**
	 * display() solo esta en la clase Estudiante
	 */
	void display() {

		message(); // llamara al metodo message() de la clase actual

		super.message(); // llamara al metodo message() de la clase padre
	}
}