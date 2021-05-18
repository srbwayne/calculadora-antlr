package br.com.handit.calculadora_antlr;

import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;

import br.com.handit.calculadora_antlr.di.Instance;
import br.com.handit.calculadora_antlr.engine.interfaces.IMemoryController;
import parsers.CalculadoraDesafio1BaseVisitor;
import parsers.CalculadoraDesafio1Parser;

public class CalculadoraDesafio1Visitor extends CalculadoraDesafio1BaseVisitor<Value> {

	// comparar numeros tipo float
	public static final double SMALL_VALUE = 0.00000000001;

	IMemoryController memoryController = Instance.get(IMemoryController.class);

	@Override
	public Value visitAssignment(CalculadoraDesafio1Parser.AssignmentContext ctx) {
		String id = ctx.ID().getText();
		Value value = this.visit(ctx.expr());
		return memoryController.put(id, value);
	}

	@Override
	public Value visitIdAtom(CalculadoraDesafio1Parser.IdAtomContext ctx) {
		String id = ctx.getText();
		Value value = memoryController.get(id);
		if (value == null) {
			throw new RuntimeException("no such variable: " + id);
		}
		return value;
	}

	@Override
	public Value visitStringAtom(CalculadoraDesafio1Parser.StringAtomContext ctx) {
		String str = ctx.getText();
		str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
		return new Value(str);
	}

	@Override
	public Value visitNumberAtom(CalculadoraDesafio1Parser.NumberAtomContext ctx) {
		return new Value(Double.valueOf(ctx.getText()));
	}

	@Override
	public Value visitBooleanAtom(CalculadoraDesafio1Parser.BooleanAtomContext ctx) {
		return new Value(Boolean.valueOf(ctx.getText()));
	}

	@Override
	public Value visitNilAtom(CalculadoraDesafio1Parser.NilAtomContext ctx) {
		return new Value(null);
	}

	@Override
	public Value visitParExpr(CalculadoraDesafio1Parser.ParExprContext ctx) {
		return this.visit(ctx.expr());
	}

	@Override
	public Value visitPowExpr(CalculadoraDesafio1Parser.PowExprContext ctx) {
		Value left = this.visit(ctx.expr(0));
		Value right = this.visit(ctx.expr(1));
		return new Value(Math.pow(left.asDouble(), right.asDouble()));
	}

	@Override
	public Value visitUnaryMinusExpr(CalculadoraDesafio1Parser.UnaryMinusExprContext ctx) {
		Value value = this.visit(ctx.expr());
		return new Value(-value.asDouble());
	}

	@Override
	public Value visitNotExpr(CalculadoraDesafio1Parser.NotExprContext ctx) {
		Value value = this.visit(ctx.expr());
		return new Value(!value.asBoolean());
	}

	@Override
	public Value visitMultiplicationExpr(@NotNull CalculadoraDesafio1Parser.MultiplicationExprContext ctx) {

		Value left = this.visit(ctx.expr(0));
		Value right = this.visit(ctx.expr(1));

		switch (ctx.op.getType()) {
		case CalculadoraDesafio1Parser.MULT:
			return new Value(left.asDouble() * right.asDouble());
		case CalculadoraDesafio1Parser.DIV:
			return new Value(left.asDouble() / right.asDouble());
		case CalculadoraDesafio1Parser.MOD:
			return new Value(left.asDouble() % right.asDouble());
		default:
			throw new RuntimeException("unknown operator: " + CalculadoraDesafio1Parser.tokenNames[ctx.op.getType()]);
		}
	}

	@Override
	public Value visitAdditiveExpr(@NotNull CalculadoraDesafio1Parser.AdditiveExprContext ctx) {

		Value left = this.visit(ctx.expr(0));
		Value right = this.visit(ctx.expr(1));

		switch (ctx.op.getType()) {
		case CalculadoraDesafio1Parser.PLUS:
			return left.isDouble() && right.isDouble() ? new Value(left.asDouble() + right.asDouble())
					: new Value(left.asString() + right.asString());
		case CalculadoraDesafio1Parser.MINUS:
			return new Value(left.asDouble() - right.asDouble());
		default:
			throw new RuntimeException("unknown operator: " + CalculadoraDesafio1Parser.tokenNames[ctx.op.getType()]);
		}
	}

	@Override
	public Value visitRelationalExpr(@NotNull CalculadoraDesafio1Parser.RelationalExprContext ctx) {

		Value left = this.visit(ctx.expr(0));
		Value right = this.visit(ctx.expr(1));

		switch (ctx.op.getType()) {
		case CalculadoraDesafio1Parser.LT:
			return new Value(left.asDouble() < right.asDouble());
		case CalculadoraDesafio1Parser.LTEQ:
			return new Value(left.asDouble() <= right.asDouble());
		case CalculadoraDesafio1Parser.GT:
			return new Value(left.asDouble() > right.asDouble());
		case CalculadoraDesafio1Parser.GTEQ:
			return new Value(left.asDouble() >= right.asDouble());
		default:
			throw new RuntimeException("unknown operator: " + CalculadoraDesafio1Parser.tokenNames[ctx.op.getType()]);
		}
	}

	@Override
	public Value visitEqualityExpr(@NotNull CalculadoraDesafio1Parser.EqualityExprContext ctx) {

		Value left = this.visit(ctx.expr(0));
		Value right = this.visit(ctx.expr(1));

		switch (ctx.op.getType()) {
		case CalculadoraDesafio1Parser.EQ:
			return left.isDouble() && right.isDouble()
					? new Value(Math.abs(left.asDouble() - right.asDouble()) < SMALL_VALUE)
					: new Value(left.equals(right));
		case CalculadoraDesafio1Parser.NEQ:
			return left.isDouble() && right.isDouble()
					? new Value(Math.abs(left.asDouble() - right.asDouble()) >= SMALL_VALUE)
					: new Value(!left.equals(right));
		default:
			throw new RuntimeException("unknown operator: " + CalculadoraDesafio1Parser.tokenNames[ctx.op.getType()]);
		}
	}

	@Override
	public Value visitAndExpr(CalculadoraDesafio1Parser.AndExprContext ctx) {
		Value left = this.visit(ctx.expr(0));
		Value right = this.visit(ctx.expr(1));
		return new Value(left.asBoolean() && right.asBoolean());
	}

	@Override
	public Value visitOrExpr(CalculadoraDesafio1Parser.OrExprContext ctx) {
		Value left = this.visit(ctx.expr(0));
		Value right = this.visit(ctx.expr(1));
		return new Value(left.asBoolean() || right.asBoolean());
	}

	@Override
	public Value visitLog(CalculadoraDesafio1Parser.LogContext ctx) {
		Value value = this.visit(ctx.expr());
		System.out.println(value);
		return value;
	}

	@Override
	public Value visitIf_stat(CalculadoraDesafio1Parser.If_statContext ctx) {

		List<CalculadoraDesafio1Parser.Condition_blockContext> conditions = ctx.condition_block();

		boolean evaluatedBlock = false;

		for (CalculadoraDesafio1Parser.Condition_blockContext condition : conditions) {

			Value evaluated = this.visit(condition.expr());

			if (evaluated.asBoolean()) {
				evaluatedBlock = true;
				this.visit(condition.stat_block());
				break;
			}
		}

		if (!evaluatedBlock && ctx.stat_block() != null) {
			this.visit(ctx.stat_block());
		}

		return Value.VOID;
	}

	@Override
	public Value visitWhile_stat(CalculadoraDesafio1Parser.While_statContext ctx) {

		Value value = this.visit(ctx.expr());

		while (value.asBoolean()) {

			this.visit(ctx.stat_block());
			value = this.visit(ctx.expr());
		}

		return Value.VOID;
	}

}
