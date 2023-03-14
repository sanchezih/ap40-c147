package ar.edu.utn.ap40.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UsuarioServicioTest {

	private UsuarioServicio usuarioServicio;

	@BeforeEach
	public void setup() {
		usuarioServicio = new UsuarioServicio();
		usuarioServicio.crearUsuario(1L, "Erica");
		usuarioServicio.crearUsuario(2L, "Melina");
	}

	@DisplayName("Validar que un usuario creado tenga el id valido")
	@Test
	public void test1() {
		UsuarioDto esperado = new UsuarioDto(3L, "Martin");
		UsuarioDto resultado = usuarioServicio.crearUsuario(3L, "Martin");

		Assertions.assertEquals(esperado.getId(), resultado.getId());
	}

	@DisplayName("Validar que un usuario creado sea igual al usuario creado para el test")
	@Test
	public void test2() {
		UsuarioDto esperado = new UsuarioDto(3L, "Martin");
		UsuarioDto resultado = usuarioServicio.crearUsuario(3L, "Martin");

		Assertions.assertEquals(esperado, resultado); // Esto usara el metodo equals
	}

	@DisplayName("Crear un usuario y validar que su noombre sea distinto al que tiene el usuario creado para el test")
	@Test
	public void test3() {
		UsuarioDto esperado = new UsuarioDto(3L, "Enrique");
		final UsuarioDto resultado = usuarioServicio.crearUsuario(3L, "Felipe");

		Assertions.assertNotEquals(esperado.getNombre(), resultado.getNombre());

	}

	@DisplayName("Buscar un usuario inexistente y validar que sea null")
	@Test
	public void test4() {
		final UsuarioDto resultado = usuarioServicio.obtenerUsuario(3L);
		Assertions.assertEquals(null, resultado);
	}

	@DisplayName("Actualizar el nombre de un usuario existente y validar que se haya actualizado correctamente")
	@Test
	public void test5() {
		UsuarioDto esperado = new UsuarioDto(1L, "Fernanda");
		UsuarioDto actualizado = usuarioServicio.actualizarUsuario(1L, "Fernanda");
		UsuarioDto resultado = usuarioServicio.obtenerUsuario(1L);

		Assertions.assertEquals(esperado.getNombre(), resultado.getNombre());
	}

}
