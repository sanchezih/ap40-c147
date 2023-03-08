package ar.edu.utn.ap40._04_herencia.src;

public class Coche extends Vehiculo {

	private int cilindrada;

	/**
	 * Los constructores no se heredan, las subclases deben definir su propio
	 * constructor. Sera necesario inicializar los atributos de la superclase, para
	 * ello se llama a su constructor desde el de la subclase.
	 * 
	 * @param color
	 * @param numSerie
	 * @param cilindrada
	 */
	public Coche(Color color, int numSerie, int cilindrada) {
		super(color, numSerie);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

}