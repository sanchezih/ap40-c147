package ar.edu.utn.ap40.qatar2022;

import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.utn.ap40.qatar2022.entidades.Departamento;
import ar.edu.utn.ap40.qatar2022.entidades.Empleado;
import ar.edu.utn.ap40.qatar2022.servicios.PublicacionService;
import ar.edu.utn.ap40.qatar2022.servicios.EmpleadoService;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String opcion = null;
		do {

			System.out.println("Elegir opcion:\n" + "\t1. Crear Departamento\n" + "\t2. Mostrar Departamento\n"
					+ "\t3. Mostrar Todos Los Departamentos \n" + "\t4. Mostrar Todos Los Empleados\n"
					+ "\t5. Crear Empleado\n" + "\t0. Salir");

			opcion = scanner.nextLine();
			switch (opcion) {
			case "1":
				crearDepartamento();
				break;
			case "2":
				mostrarDepartamento();
				break;
			case "3":
				mostrarDepartamentos();
				break;
			case "4":
				mostrarEmpleados();
				break;
			case "5":
				crearEmpleado();
				break;
			case "0":
				System.out.println("Adios!");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} while (!opcion.equals("0"));
	}

	/**
	* 
	*/
	private static void crearDepartamento() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el nombre del departamento: ");
		String nombre = scanner.nextLine();

		System.out.print("Ingrese el presupuesto asignado al departamento: ");
		int presupuesto = scanner.nextInt();

		Departamento departamento = new Departamento(nombre, presupuesto);

		PublicacionService departamentoService = new PublicacionService();
		departamentoService.crearDepartamento(departamento);
	}

	/**
	 * 
	 */
	private static void mostrarDepartamento() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el id del departamento a mostrar: ");
		int id = scanner.nextInt();

		PublicacionService departamentoService = new PublicacionService();
		Departamento departamento = departamentoService.getDepartamento(id);
		System.out.println(departamento.toString());
	}

	/**
	 * 
	 */
	private static void mostrarDepartamentos() {
		PublicacionService departamentoService = new PublicacionService();
		ArrayList<Departamento> departamento = departamentoService.getDepartamentos();
		System.out.println(departamento.toString());
	}

	/**
	 * 
	 */
	private static void mostrarEmpleados() {
		EmpleadoService empleadoService = new EmpleadoService();
		ArrayList<Empleado> empleados = empleadoService.getEmpleados();
		System.out.println(empleados.toString());
	}

	/**
	 * 
	 */
	private static void crearEmpleado() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el dni: ");
		String dni = scanner.nextLine();

		System.out.print("Ingrese el nombre: ");
		String nombre = scanner.nextLine();

		System.out.print("Ingrese el apellido: ");
		String apellido = scanner.nextLine();

		System.out.print("Ingrese la nacionalidad: ");
		String nacionalidad = scanner.nextLine();

		PublicacionService departamentoService = new PublicacionService();
		ArrayList<Departamento> departamentos = departamentoService.getDepartamentos();
		System.out.println(departamentos.toString());

		System.out.print("Ingrese el id del deparamento: ");
		int idDepartamento = scanner.nextInt();
		Departamento departamento = departamentoService.getDepartamento(idDepartamento);

		Empleado empleado = new Empleado(dni, nombre, apellido, nacionalidad, departamento);

		EmpleadoService empleadoService = new EmpleadoService();

		empleadoService.crearEmpleado(empleado);
	}
}