// Generated from C:/Users/mrh0057/OneDrive/GitProjects/mrh-database/generator/src/main/java/net/matthoyt/database/generator\DbGen.g4 by ANTLR 4.5
package net.matthoyt.database.generator;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DbGenLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		Identifier=10, Newline=11, BLOCKCOMMENT=12, LINE_COMMENT=13, SqlBlock=14, 
		WS=15, SQL_START=16, SQL_END=17, ARROW=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"Identifier", "Newline", "BLOCKCOMMENT", "LINE_COMMENT", "SqlBlock", "WS", 
		"SQL_START", "SQL_END", "ARROW"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'module'", "'table'", "'name'", "'database'", "'column'", "'skip'", 
		"'enum'", "'primaryKey'", "'.'", null, null, null, null, null, null, "'<<!'", 
		"'!>>'", "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "Identifier", 
		"Newline", "BLOCKCOMMENT", "LINE_COMMENT", "SqlBlock", "WS", "SQL_START", 
		"SQL_END", "ARROW"
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


	public DbGenLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DbGen.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24\u00a2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\6\13b\n\13\r\13\16\13c\3\f\3\f"+
		"\5\fh\n\f\3\f\5\fk\n\f\3\f\3\f\3\r\3\r\3\r\3\r\7\rs\n\r\f\r\16\rv\13\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u0081\n\16\f\16\16\16\u0084"+
		"\13\16\3\16\3\16\3\17\3\17\7\17\u008a\n\17\f\17\16\17\u008d\13\17\3\17"+
		"\3\17\3\20\6\20\u0092\n\20\r\20\16\20\u0093\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\4t\u008b\2\24\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3"+
		"\2\5\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u00a8\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\3\'\3\2\2\2\5.\3\2\2\2\7\64\3\2\2\2\t9\3\2\2\2\13B\3\2\2\2\rI\3\2\2"+
		"\2\17N\3\2\2\2\21S\3\2\2\2\23^\3\2\2\2\25a\3\2\2\2\27j\3\2\2\2\31n\3\2"+
		"\2\2\33|\3\2\2\2\35\u0087\3\2\2\2\37\u0091\3\2\2\2!\u0097\3\2\2\2#\u009b"+
		"\3\2\2\2%\u009f\3\2\2\2\'(\7o\2\2()\7q\2\2)*\7f\2\2*+\7w\2\2+,\7n\2\2"+
		",-\7g\2\2-\4\3\2\2\2./\7v\2\2/\60\7c\2\2\60\61\7d\2\2\61\62\7n\2\2\62"+
		"\63\7g\2\2\63\6\3\2\2\2\64\65\7p\2\2\65\66\7c\2\2\66\67\7o\2\2\678\7g"+
		"\2\28\b\3\2\2\29:\7f\2\2:;\7c\2\2;<\7v\2\2<=\7c\2\2=>\7d\2\2>?\7c\2\2"+
		"?@\7u\2\2@A\7g\2\2A\n\3\2\2\2BC\7e\2\2CD\7q\2\2DE\7n\2\2EF\7w\2\2FG\7"+
		"o\2\2GH\7p\2\2H\f\3\2\2\2IJ\7u\2\2JK\7m\2\2KL\7k\2\2LM\7r\2\2M\16\3\2"+
		"\2\2NO\7g\2\2OP\7p\2\2PQ\7w\2\2QR\7o\2\2R\20\3\2\2\2ST\7r\2\2TU\7t\2\2"+
		"UV\7k\2\2VW\7o\2\2WX\7c\2\2XY\7t\2\2YZ\7{\2\2Z[\7M\2\2[\\\7g\2\2\\]\7"+
		"{\2\2]\22\3\2\2\2^_\7\60\2\2_\24\3\2\2\2`b\t\2\2\2a`\3\2\2\2bc\3\2\2\2"+
		"ca\3\2\2\2cd\3\2\2\2d\26\3\2\2\2eg\7\17\2\2fh\7\f\2\2gf\3\2\2\2gh\3\2"+
		"\2\2hk\3\2\2\2ik\7\f\2\2je\3\2\2\2ji\3\2\2\2kl\3\2\2\2lm\b\f\2\2m\30\3"+
		"\2\2\2no\7\61\2\2op\7,\2\2pt\3\2\2\2qs\13\2\2\2rq\3\2\2\2sv\3\2\2\2tu"+
		"\3\2\2\2tr\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7,\2\2xy\7\61\2\2yz\3\2\2\2z"+
		"{\b\r\2\2{\32\3\2\2\2|}\7\61\2\2}~\7\61\2\2~\u0082\3\2\2\2\177\u0081\n"+
		"\3\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\b\16"+
		"\2\2\u0086\34\3\2\2\2\u0087\u008b\5!\21\2\u0088\u008a\13\2\2\2\u0089\u0088"+
		"\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\5#\22\2\u008f\36\3\2\2"+
		"\2\u0090\u0092\t\4\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\b\20\2\2"+
		"\u0096 \3\2\2\2\u0097\u0098\7>\2\2\u0098\u0099\7>\2\2\u0099\u009a\7#\2"+
		"\2\u009a\"\3\2\2\2\u009b\u009c\7#\2\2\u009c\u009d\7@\2\2\u009d\u009e\7"+
		"@\2\2\u009e$\3\2\2\2\u009f\u00a0\7/\2\2\u00a0\u00a1\7@\2\2\u00a1&\3\2"+
		"\2\2\n\2cgjt\u0082\u008b\u0093\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}