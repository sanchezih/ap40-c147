package ar.edu.utn.ap40._07_constructores._3_sobrecarga_de_constructor;

public class Main {

	public static void main(String args[]) {

		Estudiante estudiante1 = new Estudiante(111, "Karan");
		Estudiante estudiante2 = new Estudiante(222, "Aryan", 25);

		estudiante1.mostrar();
		estudiante2.mostrar();
	}

}
