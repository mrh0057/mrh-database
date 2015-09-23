// Generated from D:/MyProjects/mrh-database/generator/src/main/java/net/matthoyt/database/generator\DbGen.g4 by ANTLR 4.5.1
package net.matthoyt.database.generator;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DbGenParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		Identifier=10, Newline=11, BLOCKCOMMENT=12, LINE_COMMENT=13, SqlBlock=14, 
		WS=15, SQL_START=16, SQL_END=17, ARROW=18, END=19;
	public static final int
		RULE_prog = 0, RULE_module = 1, RULE_table = 2, RULE_name = 3, RULE_database = 4, 
		RULE_column = 5, RULE_skipColumn = 6, RULE_columnEnum = 7, RULE_primaryKey = 8, 
		RULE_additionalOptions = 9, RULE_qualifiedName = 10, RULE_sqlBlock = 11;
	public static final String[] ruleNames = {
		"prog", "module", "table", "name", "database", "column", "skipColumn", 
		"columnEnum", "primaryKey", "additionalOptions", "qualifiedName", "sqlBlock"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$module'", "'$table'", "'$name'", "'$database'", "'$column'", 
		"'$skip'", "'$enum'", "'$primaryKey'", "'.'", null, null, null, null, 
		null, null, "'<<!'", "'!>>'", "'->'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "Identifier", 
		"Newline", "BLOCKCOMMENT", "LINE_COMMENT", "SqlBlock", "WS", "SQL_START", 
		"SQL_END", "ARROW", "END"
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

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DbGen.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DbGenParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public SqlBlockContext sqlBlock() {
			return getRuleContext(SqlBlockContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public List<AdditionalOptionsContext> additionalOptions() {
			return getRuleContexts(AdditionalOptionsContext.class);
		}
		public AdditionalOptionsContext additionalOptions(int i) {
			return getRuleContext(AdditionalOptionsContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			module();
			setState(25);
			name();
			setState(26);
			database();
			setState(29);
			switch (_input.LA(1)) {
			case SqlBlock:
				{
				setState(27);
				sqlBlock();
				}
				break;
			case T__1:
				{
				setState(28);
				table();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(37);
			switch (_input.LA(1)) {
			case EOF:
				{
				}
				break;
			case T__4:
			case T__5:
			case T__6:
			case T__7:
				{
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(32);
					additionalOptions();
					}
					}
					setState(35); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode END() { return getToken(DbGenParser.END, 0); }
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).exitModule(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_module);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__0);
			setState(40);
			qualifiedName();
			setState(41);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode END() { return getToken(DbGenParser.END, 0); }
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).exitTable(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__1);
			setState(44);
			qualifiedName();
			setState(45);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DbGenParser.Identifier, 0); }
		public TerminalNode END() { return getToken(DbGenParser.END, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__2);
			setState(48);
			match(Identifier);
			setState(49);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabaseContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DbGenParser.Identifier, 0); }
		public TerminalNode END() { return getToken(DbGenParser.END, 0); }
		public DatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).enterDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).exitDatabase(this);
		}
	}

	public final DatabaseContext database() throws RecognitionException {
		DatabaseContext _localctx = new DatabaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__3);
			setState(52);
			match(Identifier);
			setState(53);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(DbGenParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(DbGenParser.Identifier, i);
		}
		public TerminalNode END() { return getToken(DbGenParser.END, 0); }
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).exitColumn(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__4);
			setState(56);
			match(Identifier);
			setState(57);
			match(ARROW);
			setState(58);
			match(Identifier);
			setState(59);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkipColumnContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DbGenParser.Identifier, 0); }
		public TerminalNode END() { return getToken(DbGenParser.END, 0); }
		public SkipColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).enterSkipColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).exitSkipColumn(this);
		}
	}

	public final SkipColumnContext skipColumn() throws RecognitionException {
		SkipColumnContext _localctx = new SkipColumnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_skipColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__5);
			setState(62);
			match(Identifier);
			setState(63);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnEnumContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DbGenParser.Identifier, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode END() { return getToken(DbGenParser.END, 0); }
		public ColumnEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnEnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).enterColumnEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).exitColumnEnum(this);
		}
	}

	public final ColumnEnumContext columnEnum() throws RecognitionException {
		ColumnEnumContext _localctx = new ColumnEnumContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_columnEnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__6);
			setState(66);
			match(Identifier);
			setState(67);
			match(ARROW);
			setState(68);
			qualifiedName();
			setState(69);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryKeyContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DbGenParser.Identifier, 0); }
		public TerminalNode END() { return getToken(DbGenParser.END, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).enterPrimaryKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).exitPrimaryKey(this);
		}
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primaryKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__7);
			setState(72);
			match(Identifier);
			setState(73);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionalOptionsContext extends ParserRuleContext {
		public ColumnEnumContext columnEnum() {
			return getRuleContext(ColumnEnumContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public SkipColumnContext skipColumn() {
			return getRuleContext(SkipColumnContext.class,0);
		}
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public AdditionalOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).enterAdditionalOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).exitAdditionalOptions(this);
		}
	}

	public final AdditionalOptionsContext additionalOptions() throws RecognitionException {
		AdditionalOptionsContext _localctx = new AdditionalOptionsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_additionalOptions);
		try {
			setState(79);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				columnEnum();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				column();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				skipColumn();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				primaryKey();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(DbGenParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(DbGenParser.Identifier, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(Identifier);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(82);
				match(T__8);
				setState(83);
				match(Identifier);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlBlockContext extends ParserRuleContext {
		public TerminalNode SqlBlock() { return getToken(DbGenParser.SqlBlock, 0); }
		public SqlBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).enterSqlBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbGenListener ) ((DbGenListener)listener).exitSqlBlock(this);
		}
	}

	public final SqlBlockContext sqlBlock() throws RecognitionException {
		SqlBlockContext _localctx = new SqlBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sqlBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(SqlBlock);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25^\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\5\2 \n\2\3\2\3\2\6\2$\n\2\r\2\16\2"+
		"%\5\2(\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13R\n\13\3\f\3\f\3\f\7\fW\n\f\f\f"+
		"\16\fZ\13\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2X\2\32"+
		"\3\2\2\2\4)\3\2\2\2\6-\3\2\2\2\b\61\3\2\2\2\n\65\3\2\2\2\f9\3\2\2\2\16"+
		"?\3\2\2\2\20C\3\2\2\2\22I\3\2\2\2\24Q\3\2\2\2\26S\3\2\2\2\30[\3\2\2\2"+
		"\32\33\5\4\3\2\33\34\5\b\5\2\34\37\5\n\6\2\35 \5\30\r\2\36 \5\6\4\2\37"+
		"\35\3\2\2\2\37\36\3\2\2\2 \'\3\2\2\2!(\3\2\2\2\"$\5\24\13\2#\"\3\2\2\2"+
		"$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'!\3\2\2\2\'#\3\2\2\2(\3\3\2"+
		"\2\2)*\7\3\2\2*+\5\26\f\2+,\7\25\2\2,\5\3\2\2\2-.\7\4\2\2./\5\26\f\2/"+
		"\60\7\25\2\2\60\7\3\2\2\2\61\62\7\5\2\2\62\63\7\f\2\2\63\64\7\25\2\2\64"+
		"\t\3\2\2\2\65\66\7\6\2\2\66\67\7\f\2\2\678\7\25\2\28\13\3\2\2\29:\7\7"+
		"\2\2:;\7\f\2\2;<\7\24\2\2<=\7\f\2\2=>\7\25\2\2>\r\3\2\2\2?@\7\b\2\2@A"+
		"\7\f\2\2AB\7\25\2\2B\17\3\2\2\2CD\7\t\2\2DE\7\f\2\2EF\7\24\2\2FG\5\26"+
		"\f\2GH\7\25\2\2H\21\3\2\2\2IJ\7\n\2\2JK\7\f\2\2KL\7\25\2\2L\23\3\2\2\2"+
		"MR\5\20\t\2NR\5\f\7\2OR\5\16\b\2PR\5\22\n\2QM\3\2\2\2QN\3\2\2\2QO\3\2"+
		"\2\2QP\3\2\2\2R\25\3\2\2\2SX\7\f\2\2TU\7\13\2\2UW\7\f\2\2VT\3\2\2\2WZ"+
		"\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\27\3\2\2\2ZX\3\2\2\2[\\\7\20\2\2\\\31\3"+
		"\2\2\2\7\37%\'QX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}