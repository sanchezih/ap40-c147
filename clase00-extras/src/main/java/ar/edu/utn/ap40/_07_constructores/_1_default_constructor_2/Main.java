package ar.edu.utn.ap40._07_constructores._1_default_constructor_2;

/**
 * Q) What is the purpose of a default constructor?
 * 
 * The default constructor is used to provide the default values to the object
 * like 0, null, etc., depending on the type.
 * 
 * 
 * Explanation:In the above class,you are not creating any constructor so
 * compiler provides you a default constructor. Here 0 and null values are
 * provided by default constructor.
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String args[]) {

		// Creacion de los objetos
		Estudiante estudiante1 = new Estudiante();
		Estudiante estudiante2 = new Estudiante();

		// displaying values of the object
		estudiante1.mostrar();
		estudiante2.mostrar();
	}

}
