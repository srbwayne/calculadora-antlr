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
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#calc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc(@NotNull CalculadoraDesafio1Parser.CalcContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(@NotNull CalculadoraDesafio1Parser.EofContext ctx);
}