package ar.edu.utn.ap40._06_modificadores_de_acceso._2_default.ok.src;

public class Bicicleta {

	private static String color;// Este atributo es privado
	static int contador = 0; // Contador con acceso por defecto

	public static void setColor(String color) {
		contador++; // Contador que lleva el registro de ediciones del atributo1
		color = color; // Establecemos el valor del atributo
	}

	public static String getColor() {
		return color; // Retornamos el valor actual del atributo
	}
}