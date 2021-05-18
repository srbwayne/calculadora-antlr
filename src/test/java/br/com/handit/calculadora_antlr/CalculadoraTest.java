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
	 public void testeCalculadoraDesafio1() {
	        assertEquals(6D, Calculadora.resolverExpressao("n = 1+5;\r\n" + "log n;"));
	        assertEquals(-4D, Calculadora.resolverExpressao("n1 = 1-5;\r\n" + "log n1;"));
	        assertEquals(5D, Calculadora.resolverExpressao("n2 = 1*5;\r\n" + "log n2;"));
	        assertEquals(0.2D, Calculadora.resolverExpressao("n3 = 1/5; \r\n" + "log n3;"));
	        assertEquals(3125D, Calculadora.resolverExpressao("n4 = 5^5;\r\n" + "log n4;"));
	        assertEquals(40.22D, Calculadora.resolverExpressao("n5 = (1+(10+20*100))/50;\r\n" + "log n5;"));
	        assertEquals(1900D, Calculadora.resolverExpressao("n6 = ((100/5)*100)-100;\r\n" + "log n6;"));
	    }
	 
	 public void testeCalculadoraDesafio2() {
	        final String expressao1 = "a = 1+2;\r\n" + "b = a^2;\r\n" + "c = a + b * (a - 1);\r\n" + "n = a + b + c;\r\n" 
	        		+"log n;" ;
	        System.out.println(expressao1);
	        assertEquals(33.0D, Calculadora.resolverExpressaoComVariaveis(expressao1));
	    }
}
