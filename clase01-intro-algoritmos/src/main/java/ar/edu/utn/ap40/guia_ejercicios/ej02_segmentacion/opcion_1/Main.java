package ar.edu.utn.ap40.guia_ejercicios.ej02_segmentacion.opcion_1;

/**
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) {

		float ingresosMensualesTotales = 80000;
		int cantidadDeVehiculos = 1;
		int cantidadDeInmuebles = 1;
		boolean posserEmbarcacionOAeronave = false;

		if (ingresosMensualesTotales > 489083) {
			System.out.println("SI es de segmento alto");
		} else {
			if (cantidadDeVehiculos >= 3) {
				System.out.println("SI es de segmento alto");
			} else {
				if (cantidadDeInmuebles >= 3) {
					System.out.println("SI es de segmento alto");
				} else {
					if (posserEmbarcacionOAeronave == true) {
						System.out.println("SI es de segmento alto");
					} else {
						System.out.println("NO es de segmento alto");
					}
				}
			}
		}

	}
}
