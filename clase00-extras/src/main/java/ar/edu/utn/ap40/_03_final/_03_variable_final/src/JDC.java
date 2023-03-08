package ar.edu.utn.ap40._03_final._03_variable_final.src;

/**
 * Programa Java para demostrar diferentes formas de inicializar una variable
 * final
 * 
 * @author ihsanch
 *
 */
public class JDC {

	final int LIMITE = 5; // Variable final con inicialización directa

	final int CAPACIDAD; // Variable final en blanco

	final int MINIMO; // Otra variable final en blanco

	static final double PI = 3.141592653589793; // Una variable static final PI con inicializacion directa

	static final double CONSTANTEEULER; // Variable static final en blanco

	/* Bloque inicializador de instancias para inicializar CAPACIDAD */
	{
		CAPACIDAD = 25;
	}

	/* Bloque inicializador static para inicializar CONSTANTEEULER */
	static {
		CONSTANTEEULER = 2.3;
	}

	/*
	 * Consctructor para inicializar MINIMO. Tener en cuenta que si hay mas de un
	 * constructor, se debe inicializar MINIMO en ellos tambien
	 */
	public JDC() {
		MINIMO = -1;
	}

}