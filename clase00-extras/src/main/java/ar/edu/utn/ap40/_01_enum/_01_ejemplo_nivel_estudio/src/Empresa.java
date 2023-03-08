package ar.edu.utn.ap40._01_enum._01_ejemplo_nivel_estudio.src;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Persona> personas;

	public Empresa() {
		this.personas = new ArrayList<>();
	}

	public void agregarPersona(Persona persona) {
		this.personas.add(persona);
	}

	public void mostrarPorNivel(NivelDeEstudio nivelEstudio) {
		for (Persona persona : personas) {
			if (persona.getNivelDeEstudio() == nivelEstudio) {
				System.out.println(persona);
			}
		}
	}
}
