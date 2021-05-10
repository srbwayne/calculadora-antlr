package br.com.handit.calculadora_antlr;

import static br.com.handit.calculadora_antlr.engine.CalcEngine.processDiv;
import static br.com.handit.calculadora_antlr.engine.CalcEngine.processMinus;
import static br.com.handit.calculadora_antlr.engine.CalcEngine.processPlus;
import static br.com.handit.calculadora_antlr.engine.CalcEngine.processPow;
import static br.com.handit.calculadora_antlr.engine.CalcEngine.processTimes;

import br.com.handit.calculadora_antlr.di.Instance;
import br.com.handit.calculadora_antlr.engine.interfaces.IMemoryController;
import br.com.handit.calculadora_antlr.exceptions.VarNotDefinedException;
import parsers.CalculadoraDesafio1BaseVisitor;
import parsers.CalculadoraDesafio1Parser.AssignContext;
import parsers.CalculadoraDesafio1Parser.CalcContext;
import parsers.CalculadoraDesafio1Parser.DivContext;
import parsers.CalculadoraDesafio1Parser.MinusContext;
import parsers.CalculadoraDesafio1Parser.MultContext;
import parsers.CalculadoraDesafio1Parser.NumberContext;
import parsers.CalculadoraDesafio1Parser.ParensContext;
import parsers.CalculadoraDesafio1Parser.PlusContext;
import parsers.CalculadoraDesafio1Parser.PowContext;
import parsers.CalculadoraDesafio1Parser.VarContext;

public class CalculadoraDesafio1Visitor extends CalculadoraDesafio1BaseVisitor<Double> {
	
	IMemoryController memoryController = Instance.get(IMemoryController.class);

	@Override
	public Double visitCalc(final CalcContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCalc(ctx);
	}
	
	@Override
	public Double visitDiv(DivContext ctx) {
		return processDiv(visit(ctx.expression(0)), visit(ctx.expression(1)));
	}

	@Override
	public Double visitNumber(NumberContext ctx) {
		return Double.valueOf(ctx.NUMBER().toString());
	}

	@Override
	public Double visitMinus(MinusContext ctx) {
		return processMinus(visit(ctx.expression(0)), visit(ctx.expression(1)));
	}

	@Override
	public Double visitParens(ParensContext ctx) {
		return visit(ctx.expression());
	}

	@Override
	public Double visitMult(MultContext ctx) {
		return processTimes(visit(ctx.expression(0)), visit(ctx.expression(1)));
	}

	@Override
	public Double visitPow(PowContext ctx) {
		return processPow(visit(ctx.expression(0)), visit(ctx.expression(1)));
	}

	@Override
	public Double visitPlus(PlusContext ctx) {
		return processPlus(visit(ctx.expression(0)), visit(ctx.expression(1)));
	}
	@Override
	public Double visitVar(VarContext ctx) {
		final String var = ctx.VAR().getText();
		try {
			return memoryController.get(var);
		} catch (VarNotDefinedException e) {
			throw new VarNotDefinedException(String.format("var '%s' was not defined at line %d, column %d", var,
					ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()), e);
		}
	}

	@Override
	public Double visitAssign(AssignContext ctx) {
		final String var = ctx.VAR().getText();
		final Double value = visit(ctx.expression());

		memoryController.put(var, value);

		return value;
	}

}
