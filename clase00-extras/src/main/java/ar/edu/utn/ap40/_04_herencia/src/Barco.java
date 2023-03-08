package ar.edu.utn.ap40._04_herencia.src;

public class Barco extends Vehiculo {

	/**
	 * Los constructores no se heredan, las subclases deben definir su propio
	 * constructor. Sera necesario inicializar los atributos de la superclase, para
	 * ello se llama a su constructor desde el de la subclase.
	 * 
	 * @param color
	 * @param numSerie
	 */
	public Barco(Color color, int numSerie) {
		super(color, numSerie);
	}
}