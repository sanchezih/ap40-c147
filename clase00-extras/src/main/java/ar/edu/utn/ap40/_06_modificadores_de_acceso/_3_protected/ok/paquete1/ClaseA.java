package ar.edu.utn.ap40._06_modificadores_de_acceso._3_protected.ok.paquete1;

public class ClaseA {

	protected static int atributo1; // Atributo protected
	private static int atributo2; // Atributo privado
	int atributo3; // Atributo default

	public static int getAtributo2() {
		return atributo2;
	}
}