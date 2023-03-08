package ar.edu.utn.ap40._07_constructores._2_constructor_parametrizado;

/**
 * A constructor which has a specific number of parameters is called a
 * parameterized constructor.
 * 
 * Why use the parameterized constructor? The parameterized constructor is used
 * to provide different values to distinct objects. However, you can provide the
 * same values also.
 * 
 * Example of parameterized constructor In this example, we have created the
 * constructor of Student class that have two parameters. We can have any number
 * of parameters in the constructor.
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String args[]) {

		// creating objects and passing values
		Estudiante s1 = new Estudiante(111, "Karan");
		Estudiante s2 = new Estudiante(222, "Aryan");

		// calling method to display the values of object
		s1.mostrar();
		s2.mostrar();
	}

}
