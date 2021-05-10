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
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(@NotNull CalculadoraDesafio1Parser.DivContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull CalculadoraDesafio1Parser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(@NotNull CalculadoraDesafio1Parser.MinusContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(@NotNull CalculadoraDesafio1Parser.ParensContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(@NotNull CalculadoraDesafio1Parser.MultContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull CalculadoraDesafio1Parser.VarContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#pow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(@NotNull CalculadoraDesafio1Parser.PowContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#calc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc(@NotNull CalculadoraDesafio1Parser.CalcContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(@NotNull CalculadoraDesafio1Parser.PlusContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull CalculadoraDesafio1Parser.AssignContext ctx);
}