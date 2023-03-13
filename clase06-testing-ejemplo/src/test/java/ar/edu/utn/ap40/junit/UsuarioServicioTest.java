//package ar.edu.utn.ap40.junit;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//public class UsuarioServicioTest {
//
//	@DisplayName("Dado un usuario que queremos crear, esperamos que cuando creamos el usuario...")
//	@Test
//	public void test1() {
//
//		UsuarioDto esperado = new UsuarioDto(1L, "Martin");
//
//		UsuarioServicio usuarioServicio = new UsuarioServicio();
//		UsuarioDto resultado = usuarioServicio.crearUsuario(1L, "NombreDePrueba");
//		// Assertions.assertEquals(esperado, resultado); // Esto usara el metodo equals
//		Assertions.assertEquals(esperado.id, resultado.id);
//
//	}
//
//	@Test
//	public void test2() {
//
//		UsuarioDto esperado = new UsuarioDto(1L, "NombreDePruebaErroneo");
//
//		UsuarioServicio usuarioServicio = new UsuarioServicio();
//		final UsuarioDto resultado = usuarioServicio.crearUsuario(1L, "NombreDePrueba");
//		Assertions.assertNotEquals(esperado, resultado);
//		Assertions.assertNotEquals(esperado.nombre, resultado.nombre);
//
//	}
//
//}
