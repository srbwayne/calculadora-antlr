package br.com.handit.calculadora_antlr;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import parsers.CalculadoraDesafio1Lexer;
import parsers.CalculadoraDesafio1Parser;

// ANTLRInputStream removed because it is depreciated 
public class Calculadora {

	
	public static Value resolverExpressao(final String expressao) {
		return resolve(expressao);
	}

	public static Value resolverExpressaoComVariaveis(final String expressao) {
		return resolve(expressao);
	}

	private static Value resolve(final String expressao) {
		final CalculadoraDesafio1Lexer lexer = new CalculadoraDesafio1Lexer(CharStreams.fromString(expressao));
		final CalculadoraDesafio1Parser parser = new CalculadoraDesafio1Parser(new CommonTokenStream(lexer));
		
		ParseTree tree = parser.parse();
		CalculadoraDesafio1Visitor visitor = new CalculadoraDesafio1Visitor();
		return new CalculadoraDesafio1Visitor().visit(tree);
	}

}
