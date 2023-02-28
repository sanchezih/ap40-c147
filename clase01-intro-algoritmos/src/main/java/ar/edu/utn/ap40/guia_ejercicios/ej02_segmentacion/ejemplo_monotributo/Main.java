package ar.edu.utn.ap40.guia_ejercicios.ej02_segmentacion.ejemplo_monotributo;

public class Main {

	public static void main(String[] args) {

		/* pueden cambiar estas variables para ir probando */
		float ingresos = 299000;
		int superficie = 20;
		int energia = 900;
		/*********************************************/
		if ((ingresos <= 748382.07) && (superficie <= 30) && (energia <= 3330)) {
			System.out.println("Categoria A");
		} else if ((ingresos <= 1112459.83) && (superficie <= 45) && (energia <= 5000)) {
			System.out.println("Categoria B");
		}

	}

}
