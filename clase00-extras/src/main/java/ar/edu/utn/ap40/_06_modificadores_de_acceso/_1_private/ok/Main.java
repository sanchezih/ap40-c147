package ar.edu.utn.ap40._06_modificadores_de_acceso._1_private.ok;

public class Main {

	public static void main(String[] args) {

		EjemploPrivate ep = new EjemploPrivate();

		ep.setUnAtributoPrivado("Azul");
		System.out.println("El atributo tiene el valor: " + ep.getUnAtributoPrivado());
		System.out.println("El atributo fue modificado " + ep.getContador() + " veces");

		System.out.println();

		ep.setUnAtributoPrivado("Verde");
		System.out.println("El atributo tiene el valor: " + ep.getUnAtributoPrivado());
		System.out.println("El atributo fue modificado " + ep.getContador() + " veces");

		System.out.println();

		ep.setUnAtributoPrivado("Violeta");
		System.out.println("El atributo tiene el valor: " + ep.getUnAtributoPrivado());
		System.out.println("El atributo fue modificado " + ep.getContador() + " veces");
	}

}
