package ar.edu.utn.ap40.validador;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
	private String nombre;
	private String legajo;
	private List<Materia> materiasAprobadas;

	public Alumno(String nombre, String legajo) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.materiasAprobadas = new ArrayList<Materia>();
	}

	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
		this.legajo = null;
		this.materiasAprobadas = new ArrayList<Materia>();
	}

	public String getNombre() {
		return nombre;
	}

	public List<Materia> getMateriasAprobadas() {
		return materiasAprobadas;
	}

	public void agregarMateriaAprobada(Materia materia) {
		this.materiasAprobadas.add(materia);
	}

}
