package ar.edu.utn.ap40._03_final._02_metodo_final.src;


public class Empleado extends Persona {
	
	protected int sueldo;

	public Empleado(String nombre, int edad, int sueldo) {
		super(nombre, edad);
		this.sueldo = sueldo;
	}

	public void imprimirSueldo() {
		System.out.println("El sueldo es: " + sueldo);
	}

	/**
	 * No podemos reescribir el metodo 'esMayor' para la clase Empleado indicando
	 * que 6 anios es mayor de edad
	 */
	
	/*
	public final boolean esMayor() {
		if (edad >= 6)
			return true;
		else
			return false;
	}
	*/

}