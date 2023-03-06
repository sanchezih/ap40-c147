package ar.edu.utn.ap40.ejemplos_presentacion._01_funciones;

public class PromedioBienHecho {

	public static void main(String[] args) {

		int numeros[] = new int[] { 6, 8 };

		int resultado = sumatoria(numeros);

		resultado = resultado / numeros.length;

		System.out.println(resultado);
	}

	/**
	 * Metodo que recibe como parametro un array de enteros y retorna la sumatoria
	 * de los elementos que contiene
	 * 
	 * @param numerosASumar
	 * @return
	 */
	private static int sumatoria(int[] numerosASumar) {
		int sumatoria = 0;

		for (int i = 0; i < numerosASumar.length; i++) {
			sumatoria = sumatoria + numerosASumar[i];
		}
		return sumatoria;
	}
}