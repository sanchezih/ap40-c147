package ar.edu.utn.ap40.ejemplos_presentacion; // El paquete de una clase se declara en la primer línea y permite que existan varias clases con el mismo nombre

import java.time.LocalDate; // Los import permiten utilizar clases de otros paquetes más convenientemente

/**
 * Nombre de la clase
 * 
 * @author ihsanch
 *
 */
public class Producto {

	/*
	 * Atributos, todos los objetos de una misma clase tienen los mismos atributos,
	 * pero con distintos valores
	 */
	private String nombre;
	private String descripcion;
	private LocalDate fechaAlta;
	private Integer pesoKg;
	private Double precio;

	/*
	 * Atributos de clase o estaticos, su valor es compartido por todos los objetos
	 * de la clase
	 */
	private static final Double minPrecio = 0.1;

	/*
	 * Constructor, se utiliza para crear objetos de la clase en cuestion. En este
	 * caso si queremos crear un nuevo producto la sintaxis es: Producto prod = new
	 * Producto("Atun");
	 */
	public Producto(String nombre) {
		this.nombre = nombre;
		this.fechaAlta = LocalDate.now();
		this.precio = minPrecio;
	}

	/*
	 * Metodos de instancia, funciones que se ejecutan en el contexto del objeto.
	 * Con la palabra clave "this" se accede al estado (valores de los atributos) de
	 * un objeto en particular. Por ejemplo, el metodo prod1.getNombre() y
	 * prod2.getNombre() retornan el valor correspondiente a su instancia.
	 */
	public String getNombre() {
		return this.nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}