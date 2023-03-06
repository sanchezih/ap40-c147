package ar.edu.utn.ap40.ejemplos_presentacion._03_entradas.ejemplo01;

/**
 * Parametros de comando
 * 
 * Cuando se inicia un programa cualquiera, al mismo se le pueden pasar
 * parametros. En el caso de Java, si al programa se la pasan, este los leera
 * desde la variable args en main. Los parámetros pueden ser cualquier string y
 * en cualquier cantidad.
 * 
 * @author ihsanch
 *
 */
public class Sumatoria {

	public static void main(String[] args) {

		int resultado = 0;
		for (int i = 0; i < args.length; i++) {
			int numero = Integer.parseInt(args[i]);
			resultado = resultado + numero;
		}
		System.out.println("La sumatoria de los int recibidos como argumento es: " + resultado);
	}
}