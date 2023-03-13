package ar.edu.utn.ap40.junit;

import java.util.Objects;

public class UsuarioDto {

	final Long id;
	final String nombre;

	public UsuarioDto(Long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "UsuarioDto [id=" + id + ", nombre=" + nombre + "]";
	}

	/**
	 * 
	 */
//	public boolean equals(Object o) {
//		if (this == o)
//			return true;
//		if (o == null || getClass() != o.getClass())
//			return false;
//		UsuarioDto that = (UsuarioDto) o;
//		return Objects.equals(id, that.id) && Objects.equals(nombre, that.nombre);
//	}

	

}
