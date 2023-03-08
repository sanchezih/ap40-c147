package ar.edu.utn.ap40._09_operador_instanceof.src;

class Perro extends Animal {

	public static void downCast(Animal animal) {
		if (animal instanceof Perro) {

			Perro perro = (Perro) animal; // Downcasting
			perro.ladrar();
		}
	}

	public void ladrar() {
		System.out.println("Guau guau guau...");
	}
}