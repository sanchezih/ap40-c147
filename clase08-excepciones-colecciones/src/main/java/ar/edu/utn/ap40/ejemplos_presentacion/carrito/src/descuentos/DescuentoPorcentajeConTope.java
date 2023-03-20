package ar.edu.utn.ap40.ejemplos_presentacion.carrito.src.descuentos;

public class DescuentoPorcentajeConTope extends Descuento {
	private int porcentaje;
	private int tope;

	public DescuentoPorcentajeConTope(int porcentaje, int tope) {
		super();
		this.porcentaje = porcentaje;
		this.tope = tope;
	}

	@Override
	public int descuento(int base) {
		int res = base * porcentaje / 100;
		return res < tope ? res : tope;
	}

}
