// Generated from parsers\CalculadoraDesafio1.g4 by ANTLR 4.2
package parsers;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculadoraDesafio1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculadoraDesafio1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#booleanAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(@NotNull CalculadoraDesafio1Parser.BooleanAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#idAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(@NotNull CalculadoraDesafio1Parser.IdAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(@NotNull CalculadoraDesafio1Parser.LogContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(@NotNull CalculadoraDesafio1Parser.Condition_blockContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#atomExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(@NotNull CalculadoraDesafio1Parser.AtomExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#additiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(@NotNull CalculadoraDesafio1Parser.AdditiveExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#parExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(@NotNull CalculadoraDesafio1Parser.ParExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#unaryMinusExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(@NotNull CalculadoraDesafio1Parser.UnaryMinusExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(@NotNull CalculadoraDesafio1Parser.While_statContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull CalculadoraDesafio1Parser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(@NotNull CalculadoraDesafio1Parser.If_statContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(@NotNull CalculadoraDesafio1Parser.StatContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull CalculadoraDesafio1Parser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(@NotNull CalculadoraDesafio1Parser.OrExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#nilAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilAtom(@NotNull CalculadoraDesafio1Parser.NilAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(@NotNull CalculadoraDesafio1Parser.ParseContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#relationalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(@NotNull CalculadoraDesafio1Parser.RelationalExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#numberAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(@NotNull CalculadoraDesafio1Parser.NumberAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(@NotNull CalculadoraDesafio1Parser.NotExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#stringAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(@NotNull CalculadoraDesafio1Parser.StringAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#multiplicationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(@NotNull CalculadoraDesafio1Parser.MultiplicationExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(@NotNull CalculadoraDesafio1Parser.Stat_blockContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#powExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(@NotNull CalculadoraDesafio1Parser.PowExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#equalityExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(@NotNull CalculadoraDesafio1Parser.EqualityExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(@NotNull CalculadoraDesafio1Parser.AndExprContext ctx);
}