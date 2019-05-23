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
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(@NotNull CalculadoraDesafio1Parser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(@NotNull CalculadoraDesafio1Parser.EofContext ctx);
}