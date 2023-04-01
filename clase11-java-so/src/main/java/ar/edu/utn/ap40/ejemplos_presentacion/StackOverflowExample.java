package ar.edu.utn.ap40.ejemplos_presentacion;

/**
 * 
 * @author ihsanch
 *
 */
public class StackOverflowExample {

	public static void main(String[] args) {
		algo(1);
	}

	/**
	 * 
	 * @param i
	 */
	public static void algo(int i) {
		System.err.println(i);
		algo(i + 1);
	}

}
