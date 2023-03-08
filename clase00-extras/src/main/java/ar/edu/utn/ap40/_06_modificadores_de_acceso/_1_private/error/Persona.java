package ar.edu.utn.ap40._06_modificadores_de_acceso._1_private.error;

public class Persona {

	private void saludar() { // <-- private dara error
		System.out.println("Hola!");
	}
}