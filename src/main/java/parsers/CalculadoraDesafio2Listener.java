// Generated from parsers\CalculadoraDesafio2.g4 by ANTLR 4.2
package parsers;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculadoraDesafio2Parser}.
 */
public interface CalculadoraDesafio2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio2Parser#calc}.
	 * @param ctx the parse tree
	 */
	void enterCalc(@NotNull CalculadoraDesafio2Parser.CalcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio2Parser#calc}.
	 * @param ctx the parse tree
	 */
	void exitCalc(@NotNull CalculadoraDesafio2Parser.CalcContext ctx);
}