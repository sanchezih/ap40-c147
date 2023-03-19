package ar.edu.utn.ap40.carrito.src;

public class Producto {

	private String nombre;
	private int precio;

	public Producto(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getPrecio() {
		return precio;
	}

}