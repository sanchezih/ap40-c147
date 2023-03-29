package ar.edu.utn.ap40.validador;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InscripcionTest {

	Alumno ivana = null;

	@BeforeEach
	public void setup() {
		this.ivana = new Alumno("Ivana", "99999999");
	}

	@DisplayName("Una materia sin correlativas")
	@Test
	public void test1() {
		Materia M1101 = new Materia("Analisis Matematico I", null);
		Inscripcion inscripcion = new Inscripcion(ivana, M1101);
		Assertions.assertEquals(true, inscripcion.aprobdada());
	}

	@DisplayName("Una materia con correlativas y que el alumno las tenga")
	@Test
	public void test2() {
		Materia M1101 = new Materia("Analisis Matematico I", null);
		List<Materia> coorelM0100 = new ArrayList<Materia>();
		coorelM0100.add(M1101);
		Materia M0100 = new Materia("Algebra y Geometria Analitica", coorelM0100);
		this.ivana.agregarMateriaAprobada(M1101);
		Inscripcion inscripcion = new Inscripcion(this.ivana, M0100);
		Assertions.assertEquals(true, inscripcion.aprobdada());
	}

	@DisplayName("Otra materia con correlativas, y que el alumno no las tenga")
	@Test
	public void test3() {
		Materia M0129 = new Materia("Matematica Discreta", null);
		List<Materia> coorelM0113 = new ArrayList<Materia>();
		coorelM0113.add(M0129);
		Materia M0113 = new Materia("Arquitectura de Computadoras", coorelM0113);
		Inscripcion inscripcion = new Inscripcion(ivana, M0113);
		Assertions.assertEquals(false, inscripcion.aprobdada());
	}
}
