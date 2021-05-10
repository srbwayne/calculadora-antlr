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
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(@NotNull CalculadoraDesafio1Parser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(@NotNull CalculadoraDesafio1Parser.DivContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull CalculadoraDesafio1Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull CalculadoraDesafio1Parser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(@NotNull CalculadoraDesafio1Parser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(@NotNull CalculadoraDesafio1Parser.MinusContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#parens}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull CalculadoraDesafio1Parser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#parens}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull CalculadoraDesafio1Parser.ParensContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(@NotNull CalculadoraDesafio1Parser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(@NotNull CalculadoraDesafio1Parser.MultContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull CalculadoraDesafio1Parser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull CalculadoraDesafio1Parser.VarContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPow(@NotNull CalculadoraDesafio1Parser.PowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPow(@NotNull CalculadoraDesafio1Parser.PowContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#calc}.
	 * @param ctx the parse tree
	 */
	void enterCalc(@NotNull CalculadoraDesafio1Parser.CalcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#calc}.
	 * @param ctx the parse tree
	 */
	void exitCalc(@NotNull CalculadoraDesafio1Parser.CalcContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(@NotNull CalculadoraDesafio1Parser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(@NotNull CalculadoraDesafio1Parser.PlusContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull CalculadoraDesafio1Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull CalculadoraDesafio1Parser.AssignContext ctx);
}