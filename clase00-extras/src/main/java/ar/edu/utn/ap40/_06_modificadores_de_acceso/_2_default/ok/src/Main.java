package ar.edu.utn.ap40._06_modificadores_de_acceso._2_default.ok.src;

public class Main {

	public static void main(String[] args) {

		System.out.println("El color fue modificado " + UnaClaseDeEjemplo.getColorDeLaBicicleta() + " veces");

		Bicicleta.setColor("Verde");

		System.out.println("El color fue modificado " + UnaClaseDeEjemplo.getColorDeLaBicicleta() + " veces");

		Bicicleta.setColor("Rojo");

		System.out.println("El color fue modificado " + UnaClaseDeEjemplo.getColorDeLaBicicleta() + " veces");

	}

}
