package br.com.handit.calculadora_antlr;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import parsers.CalculadoraDesafio1Lexer;
import parsers.CalculadoraDesafio1Parser;
import parsers.CalculadoraDesafio2Lexer;
import parsers.CalculadoraDesafio2Parser;

public class Calculadora {

    public static Double resolverExpressao(final String expressao) {
        final CalculadoraDesafio1Lexer lexer = new CalculadoraDesafio1Lexer(new ANTLRInputStream(expressao));
        final CalculadoraDesafio1Parser parser = new CalculadoraDesafio1Parser(new CommonTokenStream(lexer));
        return new CalculadoraDesafio1Visitor().visitCalc(parser.calc());
    }

    public static Double resolverExpressaoComVariaveis(final String expressao) {
        final CalculadoraDesafio2Lexer lexer = new CalculadoraDesafio2Lexer(new ANTLRInputStream(expressao));
        final CalculadoraDesafio2Parser parser = new CalculadoraDesafio2Parser(new CommonTokenStream(lexer));
        return new CalculadoraDesafio2Visitor().visitCalc(parser.calc());
    }

}
