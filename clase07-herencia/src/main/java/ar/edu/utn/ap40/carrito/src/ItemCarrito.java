package ar.edu.utn.ap40.carrito.src;

public class ItemCarrito {

	private int cantidad;
	private Producto producto;

	/**
	 * 
	 * @param cantidad
	 * @param producto
	 */
	public ItemCarrito(int cantidad, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.producto = producto;
	}

	/**
	 * 
	 * @return
	 */
	public int precio() {
		return cantidad * producto.getPrecio();
	}
}
