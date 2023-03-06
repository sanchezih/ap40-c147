package ar.edu.utn.ap40.ejemplos_presentacion._02_archivos._03_info;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

/**
 * Manipulacion de archivos, creacion e informacion extra
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {

		Path unArchivo = Paths.get("/home/ihsanch/Desktop/saludo.txt");
		System.out.println(unArchivo.toAbsolutePath());

		FileTime lastModifiedTime = Files.getLastModifiedTime(unArchivo);
		System.out.println(lastModifiedTime);

		Path otroArch = Paths.get("/home/ihsanch/Desktop/algoQueNoExiste.txt");
		System.out.println(Files.exists(otroArch));
		Files.createFile(otroArch);
		System.out.println(Files.exists(otroArch));

		Path unTemporal = Files.createTempFile("unPrefijo", ".txt");
		System.out.println(unTemporal);

		System.out.println(Files.isDirectory(unTemporal));
//		Files.copy(arch1, arch2);
//		Files.move(arch1, arch3);

	}

}
