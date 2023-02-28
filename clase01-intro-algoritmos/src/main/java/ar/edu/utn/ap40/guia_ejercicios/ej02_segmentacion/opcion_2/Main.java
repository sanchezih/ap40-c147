package ar.edu.utn.ap40.guia_ejercicios.ej02_segmentacion.opcion_2;

/**
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) {

		float ingresosMensualesTotales = 100000;
		int cantidadDeVehiculos = 1;
		int cantidadDeInmuebles = 1;
		boolean posserEmbarcacionOAeronave = false;

		if ((ingresosMensualesTotales > 489083) && //
				(cantidadDeVehiculos >= 3) && //
				(cantidadDeInmuebles >= 3) && //
				(posserEmbarcacionOAeronave == true) //
		) {
			System.out.println("SI es de segmento alto");
		} else {
			System.out.println("NO es de segmento alto");
		}
	}
}
