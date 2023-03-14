package ar.edu.utn.ap40.junit;

import java.util.HashMap;

public class UsuarioServicio {

	// HashMap que simula una base de datos
	private final HashMap<Long, UsuarioDto> usuarios = new HashMap<>();

	/**
	 * 
	 */
	public UsuarioServicio() {
	}

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @return
	 */
	public UsuarioDto crearUsuario(Long id, String nombre) {
		UsuarioDto usuarioDto = usuarios.put(id, new UsuarioDto(id, nombre));
		return usuarios.get(id);
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public UsuarioDto obtenerUsuario(Long id) {
		return usuarios.get(id);
	}

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @return
	 */
	public UsuarioDto actualizarUsuario(Long id, String nombre) {
		UsuarioDto dto = new UsuarioDto(id, nombre);
		UsuarioDto resultado = usuarios.put(id, dto);
		UsuarioDto actualizado = usuarios.get(id);
		return actualizado;
	}
}
