package ar.edu.utn.ap40.ejemplos_presentacion.carrito.src.descuentos;

public class DescuentoFijo extends Descuento {
	private int monto;

	public DescuentoFijo(int monto) {
		super();
		this.monto = monto;
	}

	@Override
	public int descuento(int base) {
		return monto;
	}

}