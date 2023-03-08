package ar.edu.utn.ap40._03_final._02_metodo_final.src;

public class Persona {

	private static final int LIMITE_MENOR_EDAD = 18;

	private String nombre;
	private String apellido;
	private String dni;
	private int edad;

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;

	}

	public Persona(String nombre, String apellido, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void imprimirDatosPersonales() {
		System.out.println("Nombre:" + nombre);
		System.out.println("Edad:" + edad);
	}

	public final boolean esMayor() {
		boolean esMayor = false;
		if (edad >= LIMITE_MENOR_EDAD) {
			esMayor = true;
		}
		return esMayor;
	}

	@Override
	public String toString() {
		return nombre;
	}

}
