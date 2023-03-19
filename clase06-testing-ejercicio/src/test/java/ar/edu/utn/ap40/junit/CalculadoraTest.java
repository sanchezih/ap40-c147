package ar.edu.utn.ap40.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author ihsanch
 *
 */
public class CalculadoraTest {

	@DisplayName("El resultado de multiplicar 80 por 3 da 240")
	@Test
	public void test1() {
		double resultadoEsperado = 240;
		double resultado = Calculadora.multiplicar(80, 3);
		Assertions.assertEquals(resultadoEsperado, resultado);
	}

	@DisplayName("El resultado de sumar 150 y 180, dividido por 3, da 110")
	@Test
	public void test2() {
		double resultadoEsperado = 110;
		double resultado = Calculadora.dividir(Calculadora.sumar(150, 180), 3);
		Assertions.assertEquals(resultadoEsperado, resultado);
	}

	@DisplayName("El resultado de restar 90 y 50, multiplicado por 15, no da 605")
	@Test
	public void test3() {
		double resultadoEsperado = 605;
		double resultado = Calculadora.multiplicar(Calculadora.restar(90, 50), 15);
		Assertions.assertNotEquals(resultadoEsperado, resultado);
	}

	@DisplayName("El resultado de sumar 70 y 40, multiplicado por 25, no da 2700")
	@Test
	public void test4() {
		double resultadoEsperado = 2700;
		double resultado = Calculadora.multiplicar(Calculadora.sumar(70, 40), 25);
		Assertions.assertNotEquals(resultadoEsperado, resultado);
	}

}
