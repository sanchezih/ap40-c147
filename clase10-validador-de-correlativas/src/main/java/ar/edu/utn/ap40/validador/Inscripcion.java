package ar.edu.utn.ap40.validador;

import java.time.LocalDate;

public class Inscripcion {

	private Alumno alumno;
	private Materia materia;
	private LocalDate fecha;

	/*----------------------------------------------------------------------------*/

	public Inscripcion() {

	}

	public Inscripcion(Alumno alumno, Materia materia, LocalDate fecha) {
		super();
		this.alumno = alumno;
		this.materia = materia;
		this.fecha = fecha;
	}

	public Inscripcion(Alumno alumno, Materia materia) {
		super();
		this.alumno = alumno;
		this.materia = materia;
	}

	/*----------------------------------------------------------------------------*/

	public Alumno getAlumno() {
		return alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	/**
	 * 
	 * @return
	 */
	public boolean aprobdada() {
		return this.materia.puedeCursar(this.getAlumno());
	}

}
