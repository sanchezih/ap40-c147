package ar.edu.utn.ap40._09_operador_instanceof.src;

class Main {
	public static void main(String[] args) {

		Perro firulais = new Perro();

		if (firulais instanceof Animal) {
			System.out.println("Firulais es un perro y tambien un animal");
		}

		/* Creacion */
		Animal perro = new Perro();
		Perro.downCast(perro);
	}
}