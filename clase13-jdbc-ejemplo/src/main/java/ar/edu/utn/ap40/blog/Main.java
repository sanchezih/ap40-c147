package ar.edu.utn.ap40.blog;

import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;

import ar.edu.utn.ap40.blog.entidades.Comentario;
import ar.edu.utn.ap40.blog.entidades.Publicacion;
import ar.edu.utn.ap40.blog.servicios.ComentarioService;
import ar.edu.utn.ap40.blog.servicios.PublicacionService;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String opcion = null;
		do {

			System.out.println("Elegir opcion:\n" + //
					"\t1. Crear Publicacion\n" + //
					"\t2. Mostrar Publicacion\n" + //
					"\t3. Mostrar Todas Las Publicaciones \n" + //
					"\t4. Crear un comentario para una publicacion\n" + //
					"\t0. Salir");

			opcion = scanner.nextLine();
			switch (opcion) {
			case "1":
				crearPublicacion();
				break;
			case "2":
				mostrarPublicacion();
				break;
			case "3":
				mostrarPublicaciones();
				break;
			case "4":
				crearComentario();
				break;
			case "0":
				System.out.println("Adios!");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} while (!opcion.equals("0"));
		scanner.close();
	}

	/**
	* 
	*/
	private static void crearPublicacion() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el titulo: ");
		String titulo = scanner.nextLine();

		System.out.print("Ingrese el cuerpo: ");
		String cuerpo = scanner.nextLine();

		Publicacion publicacion = new Publicacion(titulo, cuerpo);

		PublicacionService publiaccionService = new PublicacionService();
		publiaccionService.crearPublicacion(publicacion);
	}

	/**
	 * 
	 */
	private static void mostrarPublicacion() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el id de la publicacion a mostrar: ");
		int id = scanner.nextInt();

		PublicacionService publicacionService = new PublicacionService();
		Publicacion publicacion = publicacionService.getPublicaciones(id).get(0);
		System.out.println(publicacion.mostrar());
	}

	/**
	 * 
	 */
	private static void mostrarPublicaciones() {
		PublicacionService publicacionService = new PublicacionService();
		ArrayList<Publicacion> publicaciones = publicacionService.getPublicaciones(-1);
		System.out.println("Publicaciones: " + new Gson().toJson(publicaciones));
	}

	/**
	 * 
	 */
	private static void crearComentario() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el nombre: ");
		String nombre = scanner.nextLine();

		System.out.print("Ingrese el cuerpo: ");
		String cuerpo = scanner.nextLine();

		PublicacionService publicacionService = new PublicacionService();
		ArrayList<Publicacion> publicaciones = publicacionService.getPublicaciones(-1);
		System.out.println(publicaciones.toString());

		System.out.print("Ingrese el id de la publicacion: ");
		int idPub = scanner.nextInt();
		Publicacion publicacion = publicacionService.getPublicaciones(idPub).get(0);

		Comentario comentario = new Comentario(nombre, cuerpo);

		ComentarioService comentarioService = new ComentarioService();
		comentarioService.crearComentario(comentario, publicacion.getId());

	}
}