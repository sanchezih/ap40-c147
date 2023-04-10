package ar.edu.utn.ap40.ejemplos_presentacion._01_simple;

public class Producto {

	private String nombre;
	private int stock;
	private float precio;

	/**
	 * Constructor por default necesario para parseo de json a object
	 */
	public Producto() {

	}

	public Producto(String nombre, int stock, float precio) {
		super();
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
	}

	/*
	 * Para la serializacion, es necesario tener getters y setters
	 */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", stock=" + stock + ", precio=" + precio + "]";
	}

}