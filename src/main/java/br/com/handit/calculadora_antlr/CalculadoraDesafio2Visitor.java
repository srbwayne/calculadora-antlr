package br.com.handit.calculadora_antlr;

import parsers.CalculadoraDesafio2BaseVisitor;
import parsers.CalculadoraDesafio2Parser.CalcContext;

public class CalculadoraDesafio2Visitor extends CalculadoraDesafio2BaseVisitor<Double> {

    @Override
    public Double visitCalc(final CalcContext ctx) {
        // TODO Auto-generated method stub
        return super.visitCalc(ctx);
    }

}
