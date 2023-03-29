package ar.edu.utn.ap40.validador;

import java.util.List;

public class Materia {
	private String nombre;
	private List<Materia> correlativas;

	/*----------------------------------------------------------------------------*/

	public Materia(String nombre, List<Materia> correlativas) {
		super();
		this.nombre = nombre;
		this.correlativas = correlativas;
	}

	public Materia(String nombre) {
		super();
		this.nombre = nombre;
		this.correlativas = null;
	}

	/*----------------------------------------------------------------------------*/

	public String getNombre() {
		return nombre;
	}

	public List<Materia> getCorrelativas() {
		return correlativas;
	}

	/**
	 * 
	 * @param alumno
	 * @return
	 */
	public boolean puedeCursar(Alumno alumno) {
		boolean puedeCursar = true;
		int i = 0;

		if (this.correlativas != null) {
			while (puedeCursar && i < this.correlativas.size()) {
				puedeCursar = alumno.getMateriasAprobadas().contains(this.correlativas.get(i));
				i++;
			}
		}
		return puedeCursar;
	}

}
