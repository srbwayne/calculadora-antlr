package br.com.handit.calculadora_antlr;

import junit.framework.TestCase;

public class CalculadoraTest extends TestCase {

	public void testeArgumento() {
		final String args = "n = 9;\r\n" + "while n > 0 {\r\n" + "if (n % 2 == 0) {\r\n" + "log n + \" -> even\";\r\n"
				+ "}" + "else { \r\n" + "log n + \" -> odd\"; \r\n" + "} \r\n" + "n = n - 1; \r\n" + "}";
		System.out.println(args);
		try {
			assertEquals(33.0D, Calculadora.resolverArgumentosCondicional(args));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
