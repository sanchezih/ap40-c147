package ar.edu.utn.ap40._05_has_a_vs_is_a.src;

class Vehiculo {

	private String color;
	private int velocidadMaxima;

	public void getInformacion() {
		System.out.println("Color= " + color + " Velocidad maxima= " + velocidadMaxima);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
}
