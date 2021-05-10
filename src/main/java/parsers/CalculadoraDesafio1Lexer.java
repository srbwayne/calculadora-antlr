// Generated from parsers\CalculadoraDesafio1.g4 by ANTLR 4.2
package parsers;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculadoraDesafio1Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, LPAREN=2, RPAREN=3, ATRIB=4, PLUS=5, MINUS=6, TIMES=7, DIV=8, 
		POW=9, WS=10, VAR=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"NUMBER", "'('", "')'", "ATRIB", "'+'", "'-'", "'*'", "'/'", "'^'", "WS", 
		"VAR"
	};
	public static final String[] ruleNames = {
		"NUMBER", "LPAREN", "RPAREN", "ATRIB", "PLUS", "MINUS", "TIMES", "DIV", 
		"POW", "WS", "VAR"
	};


	public CalculadoraDesafio1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CalculadoraDesafio1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\rE\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\6\2\33\n\2\r\2\16\2\34\3\2\3\2\6\2!\n\2\r\2\16\2\"\5\2"+
		"%\n\2\3\3\3\3\3\4\3\4\3\5\5\5,\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\6\13;\n\13\r\13\16\13<\3\13\3\13\3\f\6\fB\n\f\r\f\16"+
		"\fC\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\4\5\2"+
		"\13\f\17\17\"\"\6\2\62;C\\aac|J\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\32\3\2\2\2\5&\3\2\2\2\7(\3\2\2\2\t+\3"+
		"\2\2\2\13/\3\2\2\2\r\61\3\2\2\2\17\63\3\2\2\2\21\65\3\2\2\2\23\67\3\2"+
		"\2\2\25:\3\2\2\2\27A\3\2\2\2\31\33\4\62;\2\32\31\3\2\2\2\33\34\3\2\2\2"+
		"\34\32\3\2\2\2\34\35\3\2\2\2\35$\3\2\2\2\36 \7\60\2\2\37!\4\62;\2 \37"+
		"\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\36\3\2\2\2$%\3\2"+
		"\2\2%\4\3\2\2\2&\'\7*\2\2\'\6\3\2\2\2()\7+\2\2)\b\3\2\2\2*,\7<\2\2+*\3"+
		"\2\2\2+,\3\2\2\2,-\3\2\2\2-.\7?\2\2.\n\3\2\2\2/\60\7-\2\2\60\f\3\2\2\2"+
		"\61\62\7/\2\2\62\16\3\2\2\2\63\64\7,\2\2\64\20\3\2\2\2\65\66\7\61\2\2"+
		"\66\22\3\2\2\2\678\7`\2\28\24\3\2\2\29;\t\2\2\2:9\3\2\2\2;<\3\2\2\2<:"+
		"\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\b\13\2\2?\26\3\2\2\2@B\t\3\2\2A@\3\2\2"+
		"\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\30\3\2\2\2\t\2\34\"$+<C\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}