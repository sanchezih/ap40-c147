package ar.edu.utn.ap40.guia_ejercicios.ej02;

/**
 * Clase para realizar la codificacion y decodificacion de un string, dado un
 * numero de desplazamiento.
 * 
 * Por ejemplo, con desplazo de 1:
 * 
 * "hola que tal" -> "ipmbarvfaubm"
 * 
 * h -> i
 * 
 * o -> p
 * 
 * @author ihsanch
 *
 */
public class CodificadorDecodificador {

	/**
	 * 
	 * @param cadena
	 * @param desplazamiento
	 * @return
	 */
	public static String codificar(String cadena, int desplazamiento) {

		String stringCodificado = new String();

		for (int i = 0; i < cadena.length(); i++) {
			stringCodificado += (char) (cadena.charAt(i) + desplazamiento);
		}

		return stringCodificado;
	}

	/**
	 * 
	 * @param cadena
	 * @param desplazamiento
	 * @return
	 */
	public static String decodificar(String cadena, int desplazamiento) {

		String stringDecodificado = new String();

		for (int i = 0; i < cadena.length(); i++) {
			stringDecodificado += (char) (cadena.charAt(i) - desplazamiento);
		}

		return stringDecodificado;
	}
}
