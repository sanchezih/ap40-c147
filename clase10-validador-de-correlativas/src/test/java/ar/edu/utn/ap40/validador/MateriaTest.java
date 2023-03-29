package ar.edu.utn.ap40.validador;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MateriaTest {

	@Test
	public void test1() {
		Materia M1101 = new Materia("Analisis Matematico I", null);
		Assertions.assertEquals(M1101.getNombre(), "Analisis Matematico I");
	}
}
