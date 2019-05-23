package br.com.handit.calculadora_antlr;

import parsers.CalculadoraDesafio1BaseVisitor;
import parsers.CalculadoraDesafio1Parser.CalcContext;

public class CalculadoraDesafio1Visitor extends CalculadoraDesafio1BaseVisitor<Double> {

    @Override
    public Double visitCalc(final CalcContext ctx) {
        // TODO Auto-generated method stub
        return super.visitCalc(ctx);
    }
}
