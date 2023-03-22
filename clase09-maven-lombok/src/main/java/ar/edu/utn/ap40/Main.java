package ar.edu.utn.ap40;

import static java.lang.System.exit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Persona> personas = new ArrayList<>();

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Persona p1= new Persona(null, null, null);
		String[] opciones = { "1. Cargar Persona", "2. Mostrar Personas", "3. Salir" };
		Scanner scanner = new Scanner(System.in);
		int opcion = 1;
	
		while (opcion != 4) {
			imprimirMenu(opciones);
			try {
				opcion = scanner.nextInt();
				switch (opcion) {
				case 1:
					cargarPesona();
					break;
				case 2:
					mostrarPersonas();
					break;
				case 3:
					exit(0);
				}
			} catch (Exception ex) {
				System.out.println("Please enter an integer value between 1 and " + opciones.length);
				scanner.next();
			}
		}
	}

	/**
	 * 
	 * @param opciones
	 */
	public static void imprimirMenu(String[] opciones) {
		for (String opcion : opciones) {
			System.out.println(opcion);
		}
		System.out.print("Elija una opcion : ");
	}

	/**
	 * 
	 */
	private static void cargarPesona() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el nombre: ");
		String nombre = scanner.nextLine();

		System.out.print("Ingrese el apillido: ");
		String apillido = scanner.nextLine();

		System.out.print("Ingrese el dia de nacimiento: ");
		LocalDate dob = LocalDate.parse(scanner.next());

		personas.add(new Persona(nombre, apillido, dob));
	}

	/**
	 * 
	 */
	private static void mostrarPersonas() {
		System.out.println("Thanks for choosing option 2");
		for (Persona persona : personas) {
			
			System.out.println(persona.toString());
		}
	}

}