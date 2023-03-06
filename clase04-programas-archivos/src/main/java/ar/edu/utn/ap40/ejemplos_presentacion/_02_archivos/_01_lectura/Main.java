package ar.edu.utn.ap40.ejemplos_presentacion._02_archivos._01_lectura;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Archivos - Operaciones - Lectura
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {

		// String archivo = "/home/ihsanch/Desktop/colores.txt"; // Path absoluto
		String archivo = new File("src/main/resources/colores.txt").getAbsolutePath();

		for (String linea : Files.readAllLines(Paths.get(archivo))) {
			System.out.println(linea);
		}
	}

}
