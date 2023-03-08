package ar.edu.utn.ap40._01_enum._02_enums_con_atributos_y_metodos.src;

public enum Continente {

	/*
	 * Cada enum es un objeto de tipo Continente. Se llamara al constructor con
	 * parametros long y double.
	 */
	AMERICA(910000000, 42330000), // public static final Continente AMERICA = new Continente(910000000, 42330000);
	EUROPA(731000000, 10180000), // public static final Continente EUROPA = new Continente(731000000, 10180000);
	AFRICA(922011000, 30370000), //
	ASIA(3879000000l, 43810000), //
	OCEANIA(27000000, 8720710), //
	ANTARTIDA(1000, 13720000);

	// Atributos
	private long cantHabitantes;
	private double superficie;

	// Constructor private para evitar que se haga new
	private Continente(long cantHabitantes, double superficie) {
		this.cantHabitantes = cantHabitantes;
		this.superficie = superficie;
	}

	// Metodos
	public double densidadPoblacion() {
		return this.cantHabitantes / this.superficie;
	}

	@Override
	public String toString() {
		return "Continente{" + "cantHabitantes=" + cantHabitantes + ", superficie=" + superficie + '}';
	}

}