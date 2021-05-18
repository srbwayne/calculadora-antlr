package br.com.handit.calculadora_antlr;

import junit.framework.TestCase;

public class CalculadoraTest extends TestCase {

	public void testeArgumento() {
		final String args = "n = 9;\r\n" + "while n > 0 {\r\n" + "if (n % 2 == 0) {\r\n" + "log n + \" -> par\";\r\n"
				+ "}" + "else { \r\n" + "log n + \" -> impar\"; \r\n" + "} \r\n" + "n = n - 1; \r\n" + "}";
		try {
			Calculadora.resolverArgumentosCondicional(args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void testeCalculadoraDesafio1() {
		assertEquals(6D, Calculadora.resolverExpressao("n = 1+5;\r\n" + "log n;"));
	}

	public void testeCalculadoraDesafio2() {
		final String expressao1 = "a = 1+2;\r\n" + "b = a^2;\r\n" + "c = a + b * (a - 1);\r\n" + "n = a + b + c;\r\n"
				+ "log n;";
		System.out.println(expressao1);
		assertEquals(33.0D, Calculadora.resolverExpressaoComVariaveis(expressao1));
	}
}
