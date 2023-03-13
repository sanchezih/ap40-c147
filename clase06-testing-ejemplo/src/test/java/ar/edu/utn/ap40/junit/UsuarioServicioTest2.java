package ar.edu.utn.ap40.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UsuarioServicioTest2 {

	private UsuarioServicio usuarioServicio;

	@BeforeEach
	public void setup() {
		usuarioServicio = new UsuarioServicio();
		usuarioServicio.crearUsuario(1L, "Erica");
		usuarioServicio.crearUsuario(2L, "Melina");
	}

	@DisplayName("Buscar un usuario inexistente y validar que sea null")
	@Test
	public void test3() {
		final UsuarioDto resultado = usuarioServicio.obtenerUsuario(3L);
		Assertions.assertEquals(null, resultado);
	}

	@DisplayName("Actualizar el nombre de un usuario existente y validar que se haya actualizado correctamente")
	@Test
	public void test4() {
		UsuarioDto esperado = new UsuarioDto(1L, "Fernanda");
		UsuarioDto actualizado = usuarioServicio.actualizarUsuario(1L, "Fernanda");
		UsuarioDto resultado = usuarioServicio.obtenerUsuario(1L);
		Assertions.assertEquals(esperado.getNombre(), resultado.getNombre());
	}
}
