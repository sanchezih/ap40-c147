package ar.edu.utn.ap40.guia_ejercicios.ej01b;

public class Main {

	public static void main(String[] args) {

		int numeroInicio = 5;
		int numeroFin = 14;

		while (numeroInicio <= numeroFin) {
			if (numeroInicio % 2 == 0) {
				System.out.println(numeroInicio);
			}
			numeroInicio++;
		}

	}

}
