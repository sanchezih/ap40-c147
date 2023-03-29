package ar.edu.utn.ap40.validador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		// Inicializar materias: crear 3 o 4 materias, con y sin correlativas entre
		// ellas

		ArrayList<Materia> materias = new ArrayList<Materia>();

		Materia M1101 = new Materia("Analisis Matematico I", null);
		Materia M1102 = new Materia("Fundamentos de Programacion", null);
		Materia M0129 = new Materia("Matematica Discreta", null);
		Materia M1103 = new Materia("Organizacion de Empresas", null);

		List<Materia> coorelM0100 = new ArrayList<Materia>();
		coorelM0100.add(M1101);
		Materia M0100 = new Materia("Algebra y Geometria Analitica", coorelM0100);

		List<Materia> coorelM0106 = new ArrayList<Materia>();
		coorelM0106.add(M1101);
		Materia M0106 = new Materia("Fisica I", coorelM0106);

		List<Materia> coorelM0113 = new ArrayList<Materia>();
		coorelM0113.add(M0129);
		Materia M0113 = new Materia("Arquitectura de Computadoras", coorelM0113);

		List<Materia> coorelM0210 = new ArrayList<Materia>();
		coorelM0210.add(M1103);
		Materia M0210 = new Materia("Analisis de Sistemas I", coorelM0210);

		List<Materia> coorelM1201 = new ArrayList<Materia>();
		coorelM1201.add(M1101);
		coorelM1201.add(M0100);
		Materia M1201 = new Materia("Analisis Matematico II A", coorelM1201);

		materias.add(M1101);
		materias.add(M1102);
		materias.add(M0129);
		materias.add(M1103);
		materias.add(M0100);
		materias.add(M0106);
		materias.add(M0113);
		materias.add(M0210);
		materias.add(M1201);

		/*----------------------------------------------------------------------------*/

		// Inicializar los alumnos, crear 2 o 3 alumnos, con y sin materias aprobadas.
		// Usar para las materias los MISMOS objetos de la coleccion de más arriba

		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

		Alumno emilce = new Alumno("Emilce", "11111111");
		emilce.agregarMateriaAprobada(M1101);
		emilce.agregarMateriaAprobada(M0100);

		Alumno facundo = new Alumno("Facundo", "22222222");
		facundo.agregarMateriaAprobada(M1103);
//		facundo.agregarMateriaAprobada(am2);

		// Alumno andres = new Alumno("Andres", "33333333");

		alumnos.add(emilce);
		alumnos.add(facundo);
//		alumnos.add(andres);

		/*----------------------------------------------------------------------------*/

		// Leer el archivo pasado por parametros de args y por cada linea instanciar un
		// objeto Inscripcion, pero para llenar las materias y alumnos DEBE usar los
		// objetos que creo mas arriba
		// Imprimir la linea, con el resultado si la inscripcion esta o no ok

		ArrayList<Inscripcion> listaDeInscripciones = new ArrayList<Inscripcion>();
		String archivo = new File(args[0]).getAbsolutePath();
		BufferedReader bufferLectura = null;

		try {
			bufferLectura = new BufferedReader(new FileReader(archivo)); // Abrir el .csv en buffer de lectura
			String linea = bufferLectura.readLine(); // Leer una linea del archivo

			while (linea != null) {

				String[] campos = linea.split(","); // Indico el caracter que separa los campos

				Alumno alumno = buscarAlumno((String) campos[0], alumnos);
				if (alumno == null) {
					alumno = new Alumno((String) campos[0]);
				}

				Materia materia = buscarMateria((String) campos[1], materias);
				if (materia == null) {
					materia = new Materia((String) campos[1]);
				}

				listaDeInscripciones.add(new Inscripcion(alumno, materia));
				linea = bufferLectura.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// Cierro el buffer de lectura
			if (bufferLectura != null) {
				try {
					bufferLectura.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		// Recorro la coleccion de inscripciones para escribir en el archivo de salida
		// cuales se pudieron realizar y cuales no

		ArrayList<String> listaDeResultados = new ArrayList<String>();

		for (Inscripcion inscripcion : listaDeInscripciones) {
			StringBuilder lineaAEscribir = new StringBuilder();

			String estado = null;

			if (buscarAlumno(inscripcion.getAlumno().getNombre(), alumnos) == null) {
				estado = "El alumno no existe";
			} else {
				if (buscarMateria(inscripcion.getMateria().getNombre(), materias) == null) {
					estado = "La materia no existe";
				} else {
					estado = inscripcion.aprobdada() ? "Aprobada" : "Rechazada";
				}
			}

			lineaAEscribir.append(inscripcion.getAlumno().getNombre());
			lineaAEscribir.append("\t" + inscripcion.getMateria().getNombre());
			lineaAEscribir.append("\t" + estado);

			listaDeResultados.add(lineaAEscribir.toString());

		}

		// Escribir en el archivo de salida
		FileWriter writer = new FileWriter("/home/ihsanch/Desktop/salida.txt");
		for (String str : listaDeResultados) {
			writer.write(str + System.lineSeparator());
		}
		writer.close();

	}

	/**
	 * 
	 * @param nombre
	 * @param materias
	 * @return
	 */
	private static Alumno buscarAlumno(String nombre, ArrayList<Alumno> materias) {
		Alumno res = null;
		for (Alumno materia : materias) {
			if (materia.getNombre().equals(nombre)) {
				res = materia;
			}
		}
		return res;

	}

	/**
	 * 
	 * @param nombre
	 * @param materias
	 * @return
	 */
	private static Materia buscarMateria(String nombre, ArrayList<Materia> materias) {
		Materia res = null;
		for (Materia materia : materias) {
			if (materia.getNombre().equals(nombre)) {
				res = materia;
			}
		}
		return res;
	}

}
