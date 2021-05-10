package br.com.handit.calculadora_antlr;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import parsers.CalculadoraDesafio1Lexer;
import parsers.CalculadoraDesafio1Parser;

// ANTLRInputStream removed because it is depreciated 
public class Calculadora {

	public static Double resolverExpressao(final String expressao) {
		return resolve(expressao);
	}

	public static Double resolverExpressaoComVariaveis(final String expressao) {
		return resolve(expressao);
	}

	private static Double resolve(final String expressao) {
		final CalculadoraDesafio1Lexer lexer = new CalculadoraDesafio1Lexer(CharStreams.fromString(expressao));
		final CalculadoraDesafio1Parser parser = new CalculadoraDesafio1Parser(new CommonTokenStream(lexer));
		return new CalculadoraDesafio1Visitor().visitCalc(parser.calc());
	}

}
