package ar.edu.utn.ap40.ejemplos_presentacion._02_archivos._02_escritura;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Archivos - Operaciones - Escritura
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {

		/*
		 * writeString recibe la ruta generada y como segundo parametro un String con
		 * contenido. Nuevamente, este metodo es efectivo, cuando el String a escribir
		 * no es muy grande
		 */
		Files.writeString(Paths.get("/home/ihsanch/Desktop/saludo.txt"), "hola\n que tal?\n");

	}

}
