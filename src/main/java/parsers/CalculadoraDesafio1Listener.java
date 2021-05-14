// Generated from parsers\CalculadoraDesafio1.g4 by ANTLR 4.2
package parsers;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculadoraDesafio1Parser}.
 */
public interface CalculadoraDesafio1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#booleanAtom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(@NotNull CalculadoraDesafio1Parser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#booleanAtom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(@NotNull CalculadoraDesafio1Parser.BooleanAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#idAtom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(@NotNull CalculadoraDesafio1Parser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#idAtom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(@NotNull CalculadoraDesafio1Parser.IdAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(@NotNull CalculadoraDesafio1Parser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(@NotNull CalculadoraDesafio1Parser.LogContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(@NotNull CalculadoraDesafio1Parser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(@NotNull CalculadoraDesafio1Parser.Condition_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(@NotNull CalculadoraDesafio1Parser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(@NotNull CalculadoraDesafio1Parser.AtomExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(@NotNull CalculadoraDesafio1Parser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(@NotNull CalculadoraDesafio1Parser.AdditiveExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#parExpr}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(@NotNull CalculadoraDesafio1Parser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#parExpr}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(@NotNull CalculadoraDesafio1Parser.ParExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#unaryMinusExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(@NotNull CalculadoraDesafio1Parser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#unaryMinusExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(@NotNull CalculadoraDesafio1Parser.UnaryMinusExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(@NotNull CalculadoraDesafio1Parser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(@NotNull CalculadoraDesafio1Parser.While_statContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull CalculadoraDesafio1Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull CalculadoraDesafio1Parser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(@NotNull CalculadoraDesafio1Parser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(@NotNull CalculadoraDesafio1Parser.If_statContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull CalculadoraDesafio1Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull CalculadoraDesafio1Parser.StatContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull CalculadoraDesafio1Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull CalculadoraDesafio1Parser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(@NotNull CalculadoraDesafio1Parser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(@NotNull CalculadoraDesafio1Parser.OrExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#nilAtom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(@NotNull CalculadoraDesafio1Parser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#nilAtom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(@NotNull CalculadoraDesafio1Parser.NilAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull CalculadoraDesafio1Parser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull CalculadoraDesafio1Parser.ParseContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(@NotNull CalculadoraDesafio1Parser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(@NotNull CalculadoraDesafio1Parser.RelationalExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#numberAtom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(@NotNull CalculadoraDesafio1Parser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#numberAtom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(@NotNull CalculadoraDesafio1Parser.NumberAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(@NotNull CalculadoraDesafio1Parser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(@NotNull CalculadoraDesafio1Parser.NotExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(@NotNull CalculadoraDesafio1Parser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(@NotNull CalculadoraDesafio1Parser.StringAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#multiplicationExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(@NotNull CalculadoraDesafio1Parser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#multiplicationExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(@NotNull CalculadoraDesafio1Parser.MultiplicationExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(@NotNull CalculadoraDesafio1Parser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(@NotNull CalculadoraDesafio1Parser.Stat_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#powExpr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(@NotNull CalculadoraDesafio1Parser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#powExpr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(@NotNull CalculadoraDesafio1Parser.PowExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(@NotNull CalculadoraDesafio1Parser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(@NotNull CalculadoraDesafio1Parser.EqualityExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(@NotNull CalculadoraDesafio1Parser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(@NotNull CalculadoraDesafio1Parser.AndExprContext ctx);
}