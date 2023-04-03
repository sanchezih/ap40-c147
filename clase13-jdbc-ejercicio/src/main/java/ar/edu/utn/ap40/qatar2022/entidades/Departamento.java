package ar.edu.utn.ap40.qatar2022.entidades;

public class Departamento {
	
	private int id;
	private String nombre;
	private int presupuesto;

	public Departamento() {
	}

	public Departamento(String nombre, int presupuesto) {
		this.nombre = nombre;
		this.presupuesto = presupuesto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nombre=" + nombre + ", presupuesto=" + presupuesto + "]";
	}

}
