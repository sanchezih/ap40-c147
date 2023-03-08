package ar.edu.utn.ap40._07_constructores._2_constructor_parametrizado;

/**
 * Java Program to demonstrate the use of the parameterized constructor.
 * 
 * @author ihsanch
 *
 */
public class Estudiante {

	int id;
	String nombre;

	// creating a parameterized constructor
	Estudiante(int i, String n) {
		id = i;
		nombre = n;
	}

	// method to display the values
	void mostrar() {
		System.out.println(id + " " + nombre);
	}
}
