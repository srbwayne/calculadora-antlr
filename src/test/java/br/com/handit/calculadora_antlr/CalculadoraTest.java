package br.com.handit.calculadora_antlr;

import junit.framework.TestCase;

public class CalculadoraTest extends TestCase {

    public void testeCalculadoraDesafio1() {
        assertEquals(6D, Calculadora.resolverExpressao("1+5"));
        assertEquals(-4D, Calculadora.resolverExpressao("1-5"));
        assertEquals(5D, Calculadora.resolverExpressao("1*5"));
        assertEquals(0.2D, Calculadora.resolverExpressao("1/5"));
        assertEquals(3125D, Calculadora.resolverExpressao("5^5"));
        assertEquals(40.22D, Calculadora.resolverExpressao("(1+(10+20*100))/50"));
        assertEquals(1900D, Calculadora.resolverExpressao("((100/5)*100)-100"));
    }

    public void testeCalculadoraDesafio2() {
        final String expressao1 = "a = 1+2\r\n" + "b = a^2\r\n" + "c = a + b * (a - 1)\r\n" + "a + b + c";
        System.out.println(expressao1);
        assertEquals(33.0D, Calculadora.resolverExpressaoComVariaveis(expressao1));
    }
}
