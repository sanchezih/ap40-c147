package ar.edu.utn.ap40.carrito.src;

import ar.edu.utn.ap40.carrito.src.descuentos.Descuento;

public class CarritoCompra {

	private final static int MAX_ITEMS = 3;
	private int fecha;
	private ItemCarrito[] items;
	private int posicionQueAloja;

	/**
	 * 
	 * @param fecha
	 */
	public CarritoCompra(int fecha) {
		this.fecha = fecha;
		this.items = new ItemCarrito[MAX_ITEMS];
		this.posicionQueAloja = 0;
	}

	/**
	 * 
	 * @param desc
	 * @return
	 */
	public double precio(Descuento desc) {
		int base = 0;
		for (int i = 0; i < items.length; i++) {
			base = base + items[i].precio();
		}
		return base - desc.descuento(base);
	}

	/**
	 * 
	 * @param item
	 */
	public void agregarItem(ItemCarrito item) {
		if (this.posicionQueAloja < MAX_ITEMS) {
			this.items[posicionQueAloja] = item;
			this.posicionQueAloja++;
		}
	}

}