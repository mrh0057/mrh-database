// Generated from C:/Users/mrh0057/OneDrive/GitProjects/mrh-database/generator/src/main/java/net/matthoyt/database/config\DbConfig.g4 by ANTLR 4.5
package net.matthoyt.database.config;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DbConfigParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Int=3, Identifier=4, Newline=5, EQUALS=6, BLOCKCOMMENT=7, 
		ESCAPE_BLOCK=8, LEFT_BRACKET=9, RIGHT_BRACKET=10, CONNECTION_START=11, 
		CONNECTION_END=12, BooleanLiteral=13, LINE_COMMENT=14;
	public static final int
		RULE_config = 0, RULE_section = 1, RULE_sectionStart = 2, RULE_connection = 3, 
		RULE_offset = 4, RULE_property = 5;
	public static final String[] ruleNames = {
		"config", "section", "sectionStart", "connection", "offset", "property"
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

	@Override
	public String getGrammarFileName() { return "DbConfig.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DbConfigParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ConfigContext extends ParserRuleContext {
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public ConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbConfigListener ) ((DbConfigListener)listener).enterConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbConfigListener ) ((DbConfigListener)listener).exitConfig(this);
		}
	}

	public final ConfigContext config() throws RecognitionException {
		ConfigContext _localctx = new ConfigContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_config);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12); 
				section();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LEFT_BRACKET );
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

	public static class SectionContext extends ParserRuleContext {
		public SectionStartContext sectionStart() {
			return getRuleContext(SectionStartContext.class,0);
		}
		public ConnectionContext connection() {
			return getRuleContext(ConnectionContext.class,0);
		}
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbConfigListener ) ((DbConfigListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbConfigListener ) ((DbConfigListener)listener).exitSection(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			sectionStart();
			setState(18); 
			connection();
			setState(20);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(19); 
				offset();
				}
			}

			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(22); 
				property();
				}
				}
				setState(27);
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

	public static class SectionStartContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(DbConfigParser.LEFT_BRACKET, 0); }
		public TerminalNode Identifier() { return getToken(DbConfigParser.Identifier, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(DbConfigParser.RIGHT_BRACKET, 0); }
		public SectionStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbConfigListener ) ((DbConfigListener)listener).enterSectionStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbConfigListener ) ((DbConfigListener)listener).exitSectionStart(this);
		}
	}

	public final SectionStartContext sectionStart() throws RecognitionException {
		SectionStartContext _localctx = new SectionStartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sectionStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); 
			match(LEFT_BRACKET);
			setState(29); 
			match(Identifier);
			setState(30); 
			match(RIGHT_BRACKET);
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

	public static class ConnectionContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(DbConfigParser.EQUALS, 0); }
		public TerminalNode ESCAPE_BLOCK() { return getToken(DbConfigParser.ESCAPE_BLOCK, 0); }
		public ConnectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbConfigListener ) ((DbConfigListener)listener).enterConnection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbConfigListener ) ((DbConfigListener)listener).exitConnection(this);
		}
	}

	public final ConnectionContext connection() throws RecognitionException {
		ConnectionContext _localctx = new ConnectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_connection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); 
			match(T__0);
			setState(33); 
			match(EQUALS);
			setState(34); 
			match(ESCAPE_BLOCK);
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

	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(DbConfigParser.EQUALS, 0); }
		public TerminalNode Int() { return getToken(DbConfigParser.Int, 0); }
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbConfigListener ) ((DbConfigListener)listener).enterOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbConfigListener ) ((DbConfigListener)listener).exitOffset(this);
		}
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); 
			match(T__1);
			setState(37); 
			match(EQUALS);
			setState(38); 
			match(Int);
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

	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DbConfigParser.Identifier, 0); }
		public TerminalNode EQUALS() { return getToken(DbConfigParser.EQUALS, 0); }
		public TerminalNode ESCAPE_BLOCK() { return getToken(DbConfigParser.ESCAPE_BLOCK, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbConfigListener ) ((DbConfigListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbConfigListener ) ((DbConfigListener)listener).exitProperty(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); 
			match(Identifier);
			setState(41); 
			match(EQUALS);
			setState(42); 
			match(ESCAPE_BLOCK);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20/\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\3\3\3"+
		"\3\3\5\3\27\n\3\3\3\7\3\32\n\3\f\3\16\3\35\13\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2+"+
		"\2\17\3\2\2\2\4\23\3\2\2\2\6\36\3\2\2\2\b\"\3\2\2\2\n&\3\2\2\2\f*\3\2"+
		"\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2"+
		"\2\2\22\3\3\2\2\2\23\24\5\6\4\2\24\26\5\b\5\2\25\27\5\n\6\2\26\25\3\2"+
		"\2\2\26\27\3\2\2\2\27\33\3\2\2\2\30\32\5\f\7\2\31\30\3\2\2\2\32\35\3\2"+
		"\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\5\3\2\2\2\35\33\3\2\2\2\36\37\7\13"+
		"\2\2\37 \7\6\2\2 !\7\f\2\2!\7\3\2\2\2\"#\7\3\2\2#$\7\b\2\2$%\7\n\2\2%"+
		"\t\3\2\2\2&\'\7\4\2\2\'(\7\b\2\2()\7\5\2\2)\13\3\2\2\2*+\7\6\2\2+,\7\b"+
		"\2\2,-\7\n\2\2-\r\3\2\2\2\5\21\26\33";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}