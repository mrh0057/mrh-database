// Generated from C:/Users/mrh0057/OneDrive/GitProjects/mrh-database/generator/src/main/java/net/matthoyt/database/config\DbConfig.g4 by ANTLR 4.5
package net.matthoyt.database.config;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DbConfigLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Int=3, Identifier=4, Newline=5, EQUALS=6, BLOCKCOMMENT=7, 
		ESCAPE_BLOCK=8, LEFT_BRACKET=9, RIGHT_BRACKET=10, CONNECTION_START=11, 
		CONNECTION_END=12, BooleanLiteral=13, LINE_COMMENT=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "Int", "Identifier", "Newline", "EQUALS", "Letter", "LetterOrDigit", 
		"BLOCKCOMMENT", "ESCAPE_BLOCK", "LEFT_BRACKET", "RIGHT_BRACKET", "CONNECTION_START", 
		"CONNECTION_END", "BooleanLiteral", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'connection'", "'offset'", null, null, null, "'='", null, null, 
		"'['", "']'", "'<<'", "'>>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "Int", "Identifier", "Newline", "EQUALS", "BLOCKCOMMENT", 
		"ESCAPE_BLOCK", "LEFT_BRACKET", "RIGHT_BRACKET", "CONNECTION_START", "CONNECTION_END", 
		"BooleanLiteral", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public DbConfigLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DbConfig.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20\u0087\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\6\4\67\n\4\r\4\16\48\3\5\3\5\7\5=\n\5\f\5\16\5@\13\5\3\6\3\6\5\6D\n\6"+
		"\3\6\5\6G\n\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\7\nU\n\n"+
		"\f\n\16\nX\13\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13a\n\13\f\13\16\13d\13"+
		"\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20{\n\20\3\21\3\21\3\21\3\21\7\21"+
		"\u0081\n\21\f\21\16\21\u0084\13\21\3\21\3\21\4Vb\2\22\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\2\21\2\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20\3\2\6\3"+
		"\2\62;\6\2&&C\\aac|\7\2&&\62;C\\aac|\4\2\f\f\17\17\u008c\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5.\3\2\2\2\7\66\3\2\2\2\t:\3\2\2\2\13"+
		"F\3\2\2\2\rJ\3\2\2\2\17L\3\2\2\2\21N\3\2\2\2\23P\3\2\2\2\25^\3\2\2\2\27"+
		"g\3\2\2\2\31i\3\2\2\2\33k\3\2\2\2\35n\3\2\2\2\37z\3\2\2\2!|\3\2\2\2#$"+
		"\7e\2\2$%\7q\2\2%&\7p\2\2&\'\7p\2\2\'(\7g\2\2()\7e\2\2)*\7v\2\2*+\7k\2"+
		"\2+,\7q\2\2,-\7p\2\2-\4\3\2\2\2./\7q\2\2/\60\7h\2\2\60\61\7h\2\2\61\62"+
		"\7u\2\2\62\63\7g\2\2\63\64\7v\2\2\64\6\3\2\2\2\65\67\t\2\2\2\66\65\3\2"+
		"\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29\b\3\2\2\2:>\5\17\b\2;=\5\21\t"+
		"\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\n\3\2\2\2@>\3\2\2\2AC\7\17"+
		"\2\2BD\7\f\2\2CB\3\2\2\2CD\3\2\2\2DG\3\2\2\2EG\7\f\2\2FA\3\2\2\2FE\3\2"+
		"\2\2GH\3\2\2\2HI\b\6\2\2I\f\3\2\2\2JK\7?\2\2K\16\3\2\2\2LM\t\3\2\2M\20"+
		"\3\2\2\2NO\t\4\2\2O\22\3\2\2\2PQ\7\61\2\2QR\7,\2\2RV\3\2\2\2SU\13\2\2"+
		"\2TS\3\2\2\2UX\3\2\2\2VW\3\2\2\2VT\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7,\2"+
		"\2Z[\7\61\2\2[\\\3\2\2\2\\]\b\n\2\2]\24\3\2\2\2^b\5\33\16\2_a\13\2\2\2"+
		"`_\3\2\2\2ad\3\2\2\2bc\3\2\2\2b`\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\5\35\17"+
		"\2f\26\3\2\2\2gh\7]\2\2h\30\3\2\2\2ij\7_\2\2j\32\3\2\2\2kl\7>\2\2lm\7"+
		">\2\2m\34\3\2\2\2no\7@\2\2op\7@\2\2p\36\3\2\2\2qr\7v\2\2rs\7t\2\2st\7"+
		"w\2\2t{\7g\2\2uv\7h\2\2vw\7c\2\2wx\7n\2\2xy\7u\2\2y{\7g\2\2zq\3\2\2\2"+
		"zu\3\2\2\2{ \3\2\2\2|}\7\61\2\2}~\7\61\2\2~\u0082\3\2\2\2\177\u0081\n"+
		"\5\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\b\21"+
		"\2\2\u0086\"\3\2\2\2\13\28>CFVbz\u0082\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}