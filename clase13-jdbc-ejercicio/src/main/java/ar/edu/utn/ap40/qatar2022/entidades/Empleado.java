package ar.edu.utn.ap40.qatar2022.entidades;

public class Empleado {
	private int id;
	private String dni;
	private String nombre;
	private String apellido;
	private String nacionalidad;
	private Departamento departamento;

	public Empleado() {
	}

	public Empleado(String dni, String nombre, String apellido, String nacionalidad, Departamento departamento) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
		this.departamento = departamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", nacionalidad=" + nacionalidad + ", departamento=" + departamento + "]";
	}

}
