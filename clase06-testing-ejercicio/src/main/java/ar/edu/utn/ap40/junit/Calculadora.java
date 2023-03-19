package ar.edu.utn.ap40.junit;

public class Calculadora {

	/**
	 * 
	 * @param unNumero
	 * @param otroNumero
	 * @return
	 */
	public static double sumar(double unNumero, double otroNumero) {
		double resultado = 0;
		resultado = unNumero + otroNumero;
		return resultado;
	}

	/**
	 * 
	 * @param unNumero
	 * @param otroNumero
	 * @return
	 */
	public static double restar(double unNumero, double otroNumero) {
		double resultado = 0;
		resultado = unNumero - otroNumero;
		return resultado;
	}

	/**
	 * 
	 * @param unNumero
	 * @param otroNumero
	 * @return
	 */
	public static double multiplicar(double unNumero, double otroNumero) {
		double resultado = 0;
		resultado = unNumero * otroNumero;
		return resultado;
	}

	/**
	 * 
	 * @param unNumero
	 * @param otroNumero
	 * @return
	 */
	public static double dividir(double unNumero, double otroNumero) {
		double resultado = 0;
		resultado = unNumero / otroNumero;
		return resultado;
	}
}
