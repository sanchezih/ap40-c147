package ar.edu.utn.ap40.ejemplos_presentacion.carrito.src;

import ar.edu.utn.ap40.ejemplos_presentacion.carrito.src.excepciones.NoHayStockException;

public class ItemCarrito {

	private int cantidad;
	private Producto producto;

	public ItemCarrito(int cantidad, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.producto = producto;
	}

	/**
	 * 
	 * @return
	 * @throws NoHayStockException
	 */
	public float precio() throws NoHayStockException {
		if (!producto.hayStock()) {
			throw new NoHayStockException(producto);
		}
		return this.cantidad * this.producto.getPrecio();
	}

}
