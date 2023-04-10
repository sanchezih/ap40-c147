package ar.edu.utn.ap40.ejemplos_presentacion._02_complejo;

public class ItemCarrito {

	private int cantidad;
	private Producto producto;

	public ItemCarrito() {

	}

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

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
