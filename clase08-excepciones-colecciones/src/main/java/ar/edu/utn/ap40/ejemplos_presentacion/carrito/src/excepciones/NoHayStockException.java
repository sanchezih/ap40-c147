package ar.edu.utn.ap40.ejemplos_presentacion.carrito.src.excepciones;

import ar.edu.utn.ap40.ejemplos_presentacion.carrito.src.Producto;

public class NoHayStockException extends Exception {

	private final Producto producto;

	public NoHayStockException(Producto producto) {
		this.producto = producto;
	}
}