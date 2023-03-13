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

	@DisplayName("Dado un usuario que queremos crear, esperamos que cuando creamos el usuario...")
	@Test
	public void test1() {

		UsuarioDto esperado = new UsuarioDto(3L, "Martin");

		UsuarioDto resultado = usuarioServicio.crearUsuario(3L, "Martin");
		//Assertions.assertEquals(esperado, resultado); // Esto usara el metodo equals
		Assertions.assertEquals(esperado.id, resultado.id);

	}

	@Test
	public void test2() {

		UsuarioDto esperado = new UsuarioDto(1L, "NombreDePruebaErroneo");

		final UsuarioDto resultado = usuarioServicio.crearUsuario(1L, "NombreDePrueba");
		Assertions.assertNotEquals(esperado, resultado);
		Assertions.assertNotEquals(esperado.nombre, resultado.nombre);

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
