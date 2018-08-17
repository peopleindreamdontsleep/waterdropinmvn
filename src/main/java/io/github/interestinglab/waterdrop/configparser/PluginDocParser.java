package io.github.interestinglab.waterdrop.configparser;
// Generated from E:/wordspacesec/waterdropinmvn/src/main/antlr4\PluginDoc.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PluginDocParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WaterdropPlugin=1, PluginGroup=2, PluginName=3, PluginDesc=4, PluginAuthor=5, 
		PluginHomepage=6, PluginVersion=7, PluginOption=8, PluginOptionsExample=9, 
		PluginUDF=10, PluginUDFName=11, PluginUDFDesc=12, PluginUDFOptions=13, 
		PluginUDFExample=14, INPUT=15, FILTER=16, OUTPUT=17, NUMBER=18, STRING=19, 
		ARRAY=20, BOOLEAN=21, NULL=22, YES=23, NO=24, EQUAL=25, IDENTIFIER=26, 
		VERSION_NUMBER=27, URL=28, TEXT=29, WS=30;
	public static final int
		RULE_waterdropPlugin = 0, RULE_pluginBlock = 1, RULE_definition = 2, RULE_pluginGroup = 3, 
		RULE_pluginName = 4, RULE_pluginDesc = 5, RULE_pluginAuthor = 6, RULE_pluginHomepage = 7, 
		RULE_pluginVersion = 8, RULE_pluginOption = 9, RULE_optionType = 10, RULE_optionName = 11, 
		RULE_optionRequired = 12, RULE_optionDefaultValue = 13, RULE_optionDesc = 14;
	public static final String[] ruleNames = {
		"waterdropPlugin", "pluginBlock", "definition", "pluginGroup", "pluginName", 
		"pluginDesc", "pluginAuthor", "pluginHomepage", "pluginVersion", "pluginOption", 
		"optionType", "optionName", "optionRequired", "optionDefaultValue", "optionDesc"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@waterdropPlugin'", "'@pluginGroup'", "'@pluginName'", "'@pluginDesc'", 
		"'@pluginAuthor'", "'@pluginHomepage'", "'@pluginVersion'", "'@pluginOption'", 
		"'@pluginOptionsExample'", "'@pluginUDF'", "'@pluginUDFName'", "'@pluginUDFDesc'", 
		"'@pluginUDFOptions'", "'@pluginUDFExample'", "'input'", "'filter'", "'output'", 
		"'number'", "'string'", "'array'", "'boolean'", "'null'", "'yes'", "'no'", 
		"'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WaterdropPlugin", "PluginGroup", "PluginName", "PluginDesc", "PluginAuthor", 
		"PluginHomepage", "PluginVersion", "PluginOption", "PluginOptionsExample", 
		"PluginUDF", "PluginUDFName", "PluginUDFDesc", "PluginUDFOptions", "PluginUDFExample", 
		"INPUT", "FILTER", "OUTPUT", "NUMBER", "STRING", "ARRAY", "BOOLEAN", "NULL", 
		"YES", "NO", "EQUAL", "IDENTIFIER", "VERSION_NUMBER", "URL", "TEXT", "WS"
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
	public String getGrammarFileName() { return "PluginDoc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PluginDocParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class WaterdropPluginContext extends ParserRuleContext {
		public TerminalNode WaterdropPlugin() { return getToken(PluginDocParser.WaterdropPlugin, 0); }
		public PluginBlockContext pluginBlock() {
			return getRuleContext(PluginBlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PluginDocParser.EOF, 0); }
		public WaterdropPluginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waterdropPlugin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).enterWaterdropPlugin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).exitWaterdropPlugin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PluginDocVisitor ) return ((PluginDocVisitor<? extends T>)visitor).visitWaterdropPlugin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaterdropPluginContext waterdropPlugin() throws RecognitionException {
		WaterdropPluginContext _localctx = new WaterdropPluginContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_waterdropPlugin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(WaterdropPlugin);
			setState(31);
			pluginBlock();
			setState(32);
			match(EOF);
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

	public static class PluginBlockContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public PluginBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pluginBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).enterPluginBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).exitPluginBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PluginDocVisitor ) return ((PluginDocVisitor<? extends T>)visitor).visitPluginBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PluginBlockContext pluginBlock() throws RecognitionException {
		PluginBlockContext _localctx = new PluginBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pluginBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				definition();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PluginGroup) | (1L << PluginName) | (1L << PluginDesc) | (1L << PluginAuthor) | (1L << PluginHomepage) | (1L << PluginVersion) | (1L << PluginOption))) != 0) );
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

	public static class DefinitionContext extends ParserRuleContext {
		public PluginGroupContext pluginGroup() {
			return getRuleContext(PluginGroupContext.class,0);
		}
		public PluginNameContext pluginName() {
			return getRuleContext(PluginNameContext.class,0);
		}
		public PluginDescContext pluginDesc() {
			return getRuleContext(PluginDescContext.class,0);
		}
		public PluginAuthorContext pluginAuthor() {
			return getRuleContext(PluginAuthorContext.class,0);
		}
		public PluginHomepageContext pluginHomepage() {
			return getRuleContext(PluginHomepageContext.class,0);
		}
		public PluginVersionContext pluginVersion() {
			return getRuleContext(PluginVersionContext.class,0);
		}
		public PluginOptionContext pluginOption() {
			return getRuleContext(PluginOptionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PluginDocVisitor ) return ((PluginDocVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PluginGroup:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				pluginGroup();
				}
				break;
			case PluginName:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				pluginName();
				}
				break;
			case PluginDesc:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				pluginDesc();
				}
				break;
			case PluginAuthor:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				pluginAuthor();
				}
				break;
			case PluginHomepage:
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				pluginHomepage();
				}
				break;
			case PluginVersion:
				enterOuterAlt(_localctx, 6);
				{
				setState(44);
				pluginVersion();
				}
				break;
			case PluginOption:
				enterOuterAlt(_localctx, 7);
				{
				setState(45);
				pluginOption();
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

	public static class PluginGroupContext extends ParserRuleContext {
		public TerminalNode PluginGroup() { return getToken(PluginDocParser.PluginGroup, 0); }
		public TerminalNode INPUT() { return getToken(PluginDocParser.INPUT, 0); }
		public TerminalNode FILTER() { return getToken(PluginDocParser.FILTER, 0); }
		public TerminalNode OUTPUT() { return getToken(PluginDocParser.OUTPUT, 0); }
		public PluginGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pluginGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).enterPluginGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).exitPluginGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PluginDocVisitor ) return ((PluginDocVisitor<? extends T>)visitor).visitPluginGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PluginGroupContext pluginGroup() throws RecognitionException {
		PluginGroupContext _localctx = new PluginGroupContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pluginGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(PluginGroup);
			setState(49);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << FILTER) | (1L << OUTPUT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PluginNameContext extends ParserRuleContext {
		public TerminalNode PluginName() { return getToken(PluginDocParser.PluginName, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PluginDocParser.IDENTIFIER, 0); }
		public PluginNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pluginName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).enterPluginName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).exitPluginName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PluginDocVisitor ) return ((PluginDocVisitor<? extends T>)visitor).visitPluginName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PluginNameContext pluginName() throws RecognitionException {
		PluginNameContext _localctx = new PluginNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pluginName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(PluginName);
			setState(52);
			match(IDENTIFIER);
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

	public static class PluginDescContext extends ParserRuleContext {
		public TerminalNode PluginDesc() { return getToken(PluginDocParser.PluginDesc, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PluginDocParser.IDENTIFIER, 0); }
		public TerminalNode TEXT() { return getToken(PluginDocParser.TEXT, 0); }
		public PluginDescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pluginDesc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).enterPluginDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).exitPluginDesc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PluginDocVisitor ) return ((PluginDocVisitor<? extends T>)visitor).visitPluginDesc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PluginDescContext pluginDesc() throws RecognitionException {
		PluginDescContext _localctx = new PluginDescContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pluginDesc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(PluginDesc);
			setState(55);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PluginAuthorContext extends ParserRuleContext {
		public TerminalNode PluginAuthor() { return getToken(PluginDocParser.PluginAuthor, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PluginDocParser.IDENTIFIER, 0); }
		public TerminalNode TEXT() { return getToken(PluginDocParser.TEXT, 0); }
		public PluginAuthorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pluginAuthor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).enterPluginAuthor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).exitPluginAuthor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PluginDocVisitor ) return ((PluginDocVisitor<? extends T>)visitor).visitPluginAuthor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PluginAuthorContext pluginAuthor() throws RecognitionException {
		PluginAuthorContext _localctx = new PluginAuthorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pluginAuthor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(PluginAuthor);
			setState(58);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PluginHomepageContext extends ParserRuleContext {
		public TerminalNode PluginHomepage() { return getToken(PluginDocParser.PluginHomepage, 0); }
		public TerminalNode URL() { return getToken(PluginDocParser.URL, 0); }
		public PluginHomepageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pluginHomepage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).enterPluginHomepage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).exitPluginHomepage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PluginDocVisitor ) return ((PluginDocVisitor<? extends T>)visitor).visitPluginHomepage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PluginHomepageContext pluginHomepage() throws RecognitionException {
		PluginHomepageContext _localctx = new PluginHomepageContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pluginHomepage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(PluginHomepage);
			setState(61);
			match(URL);
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

	public static class PluginVersionContext extends ParserRuleContext {
		public TerminalNode PluginVersion() { return getToken(PluginDocParser.PluginVersion, 0); }
		public TerminalNode VERSION_NUMBER() { return getToken(PluginDocParser.VERSION_NUMBER, 0); }
		public PluginVersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pluginVersion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).enterPluginVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).exitPluginVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PluginDocVisitor ) return ((PluginDocVisitor<? extends T>)visitor).visitPluginVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PluginVersionContext pluginVersion() throws RecognitionException {
		PluginVersionContext _localctx = new PluginVersionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pluginVersion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(PluginVersion);
			setState(64);
			match(VERSION_NUMBER);
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

	public static class PluginOptionContext extends ParserRuleContext {
		public TerminalNode PluginOption() { return getToken(PluginDocParser.PluginOption, 0); }
		public OptionTypeContext optionType() {
			return getRuleContext(OptionTypeContext.class,0);
		}
		public OptionNameContext optionName() {
			return getRuleContext(OptionNameContext.class,0);
		}
		public OptionRequiredContext optionRequired() {
			return getRuleContext(OptionRequiredContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(PluginDocParser.EQUAL, 0); }
		public OptionDefaultValueContext optionDefaultValue() {
			return getRuleContext(OptionDefaultValueContext.class,0);
		}
		public OptionDescContext optionDesc() {
			return getRuleContext(OptionDescContext.class,0);
		}
		public PluginOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pluginOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).enterPluginOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).exitPluginOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PluginDocVisitor ) return ((PluginDocVisitor<? extends T>)visitor).visitPluginOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PluginOptionContext pluginOption() throws RecognitionException {
		PluginOptionContext _localctx = new PluginOptionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pluginOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(PluginOption);
			setState(67);
			optionType();
			setState(68);
			optionName();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(69);
				match(EQUAL);
				setState(70);
				optionDefaultValue();
				}
			}

			setState(73);
			optionRequired();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXT) {
				{
				setState(74);
				optionDesc();
				}
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

	public static class OptionTypeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PluginDocParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(PluginDocParser.STRING, 0); }
		public TerminalNode ARRAY() { return getToken(PluginDocParser.ARRAY, 0); }
		public TerminalNode BOOLEAN() { return getToken(PluginDocParser.BOOLEAN, 0); }
		public TerminalNode NULL() { return getToken(PluginDocParser.NULL, 0); }
		public OptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).enterOptionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).exitOptionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PluginDocVisitor ) return ((PluginDocVisitor<? extends T>)visitor).visitOptionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionTypeContext optionType() throws RecognitionException {
		OptionTypeContext _localctx = new OptionTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_optionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << ARRAY) | (1L << BOOLEAN) | (1L << NULL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OptionNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PluginDocParser.IDENTIFIER, 0); }
		public OptionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).enterOptionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).exitOptionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PluginDocVisitor ) return ((PluginDocVisitor<? extends T>)visitor).visitOptionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionNameContext optionName() throws RecognitionException {
		OptionNameContext _localctx = new OptionNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_optionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(IDENTIFIER);
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

	public static class OptionRequiredContext extends ParserRuleContext {
		public TerminalNode YES() { return getToken(PluginDocParser.YES, 0); }
		public TerminalNode NO() { return getToken(PluginDocParser.NO, 0); }
		public OptionRequiredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionRequired; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).enterOptionRequired(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).exitOptionRequired(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PluginDocVisitor ) return ((PluginDocVisitor<? extends T>)visitor).visitOptionRequired(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionRequiredContext optionRequired() throws RecognitionException {
		OptionRequiredContext _localctx = new OptionRequiredContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_optionRequired);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !(_la==YES || _la==NO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OptionDefaultValueContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(PluginDocParser.TEXT, 0); }
		public OptionDefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionDefaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).enterOptionDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).exitOptionDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PluginDocVisitor ) return ((PluginDocVisitor<? extends T>)visitor).visitOptionDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionDefaultValueContext optionDefaultValue() throws RecognitionException {
		OptionDefaultValueContext _localctx = new OptionDefaultValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_optionDefaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(TEXT);
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

	public static class OptionDescContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(PluginDocParser.TEXT, 0); }
		public OptionDescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionDesc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).enterOptionDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PluginDocListener ) ((PluginDocListener)listener).exitOptionDesc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PluginDocVisitor ) return ((PluginDocVisitor<? extends T>)visitor).visitOptionDesc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionDescContext optionDesc() throws RecognitionException {
		OptionDescContext _localctx = new OptionDescContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_optionDesc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(TEXT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 Z\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\3\6\3&\n"+
		"\3\r\3\16\3\'\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\61\n\4\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\5\13J\n\13\3\13\3\13\5\13N\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		"\2\6\3\2\21\23\4\2\34\34\37\37\3\2\24\30\3\2\31\32\2S\2 \3\2\2\2\4%\3"+
		"\2\2\2\6\60\3\2\2\2\b\62\3\2\2\2\n\65\3\2\2\2\f8\3\2\2\2\16;\3\2\2\2\20"+
		">\3\2\2\2\22A\3\2\2\2\24D\3\2\2\2\26O\3\2\2\2\30Q\3\2\2\2\32S\3\2\2\2"+
		"\34U\3\2\2\2\36W\3\2\2\2 !\7\3\2\2!\"\5\4\3\2\"#\7\2\2\3#\3\3\2\2\2$&"+
		"\5\6\4\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\5\3\2\2\2)\61\5\b"+
		"\5\2*\61\5\n\6\2+\61\5\f\7\2,\61\5\16\b\2-\61\5\20\t\2.\61\5\22\n\2/\61"+
		"\5\24\13\2\60)\3\2\2\2\60*\3\2\2\2\60+\3\2\2\2\60,\3\2\2\2\60-\3\2\2\2"+
		"\60.\3\2\2\2\60/\3\2\2\2\61\7\3\2\2\2\62\63\7\4\2\2\63\64\t\2\2\2\64\t"+
		"\3\2\2\2\65\66\7\5\2\2\66\67\7\34\2\2\67\13\3\2\2\289\7\6\2\29:\t\3\2"+
		"\2:\r\3\2\2\2;<\7\7\2\2<=\t\3\2\2=\17\3\2\2\2>?\7\b\2\2?@\7\36\2\2@\21"+
		"\3\2\2\2AB\7\t\2\2BC\7\35\2\2C\23\3\2\2\2DE\7\n\2\2EF\5\26\f\2FI\5\30"+
		"\r\2GH\7\33\2\2HJ\5\34\17\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KM\5\32\16\2"+
		"LN\5\36\20\2ML\3\2\2\2MN\3\2\2\2N\25\3\2\2\2OP\t\4\2\2P\27\3\2\2\2QR\7"+
		"\34\2\2R\31\3\2\2\2ST\t\5\2\2T\33\3\2\2\2UV\7\37\2\2V\35\3\2\2\2WX\7\37"+
		"\2\2X\37\3\2\2\2\6\'\60IM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}