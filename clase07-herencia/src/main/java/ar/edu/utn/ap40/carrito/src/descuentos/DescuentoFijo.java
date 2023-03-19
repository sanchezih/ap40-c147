package ar.edu.utn.ap40.carrito.src.descuentos;

public class DescuentoFijo extends Descuento {

	private int monto;

	/**
	 * 
	 * @param monto
	 */
	public DescuentoFijo(int monto) {
		super();
		this.monto = monto;
	}

	/**
	 * 
	 */
	@Override
	public int descuento(int base) {
		return monto;
	}

}