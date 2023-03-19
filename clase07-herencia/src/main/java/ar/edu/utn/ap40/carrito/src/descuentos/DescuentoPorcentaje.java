package ar.edu.utn.ap40.carrito.src.descuentos;

public class DescuentoPorcentaje extends Descuento {

	private int porcentaje;

	/**
	 * 
	 * @param porcentaje
	 */
	public DescuentoPorcentaje(int porcentaje) {
		super();
		this.porcentaje = porcentaje;
	}

	/**
	 * 
	 */
	@Override
	public int descuento(int base) {
		return base * porcentaje / 100;
	}

}