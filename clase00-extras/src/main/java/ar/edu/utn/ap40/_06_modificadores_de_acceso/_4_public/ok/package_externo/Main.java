package ar.edu.utn.ap40._06_modificadores_de_acceso._4_public.ok.package_externo;

import ar.edu.utn.ap40._06_modificadores_de_acceso._4_public.ok.package_interno.Saludador;

public class Main {

	public static void main(String[] args) {

		System.out.println("Accedo al atributo publico directamente: " + Saludador.atributoPublico);
		Saludador.saludadorPublico(); // Metodo1 tambien es publico
	}
}