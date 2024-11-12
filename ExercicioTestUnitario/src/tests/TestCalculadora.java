package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import application.Calculadora;

class TestCalculadora {

	
	@Test
	void TesteClientePrimeComQuantidadePadrao() throws Exception {
		Calculadora c = new Calculadora();
		double resultado = c.precoFinal(50.0, 3, true, "");
		assertEquals(45.0, resultado);
	}

	@Test
	void TesteClienteNaoPrimeComQuantidadePadrao() throws Exception {
		Calculadora c = new Calculadora();
		double resultado = c.precoFinal(50.0, 3, false, "");
		assertEquals(50.0, resultado);
	}

	@Test
	void TesteDescontoAdicionalPorQuantidade() throws Exception {
		Calculadora c = new Calculadora();
		double resultado = c.precoFinal(300.0, 8, false, "");
		assertEquals(285.0, resultado);
	}
	

	@Test
	void TesteCupomDescontoDESC15() throws Exception {
		Calculadora c = new Calculadora();
		double resultado = c.precoFinal(100.0, 2, false, "DESC15");
		assertEquals(85.0, resultado);
	}

	@Test
	void TesteCupomDescontoPRIMEIRACOMPRA() throws Exception {
		Calculadora c = new Calculadora();
		double resultado = c.precoFinal(80.0, 1, true, "PRIMEIRACOMPRA");
		assertEquals(72.0, resultado);
	}


	@Test
	void TestePrecoBaseNegativo() {
		Calculadora c = new Calculadora();
		assertThrows(Exception.class, () -> c.precoFinal(-50.0, 3, false, ""));
	}

	@Test
	void TesteQuantidadeNegativa() {
		Calculadora c = new Calculadora();
		assertThrows(Exception.class, () -> c.precoFinal(30.0, -2, true, "DESC10"));
	}

	@Test
	void TesteQuantidadeZero() {
		Calculadora c = new Calculadora();
		assertThrows(Exception.class, () -> c.precoFinal(20.0, 0, false, ""));
	}

	@Test
	void TesteCupomDescontoInvalido() {
		Calculadora c = new Calculadora();
		assertThrows(Exception.class, () -> c.precoFinal(40.0, 4, true, "CUPOMINVALIDO"));
	}

}
