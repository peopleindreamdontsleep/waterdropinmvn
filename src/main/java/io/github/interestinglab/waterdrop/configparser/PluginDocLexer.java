package io.github.interestinglab.waterdrop.configparser;
// Generated from E:/wordspacesec/waterdropinmvn/src/main/antlr4\PluginDoc.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PluginDocLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WaterdropPlugin", "PluginGroup", "PluginName", "PluginDesc", "PluginAuthor", 
		"PluginHomepage", "PluginVersion", "PluginOption", "PluginOptionsExample", 
		"PluginUDF", "PluginUDFName", "PluginUDFDesc", "PluginUDFOptions", "PluginUDFExample", 
		"INPUT", "FILTER", "OUTPUT", "NUMBER", "STRING", "ARRAY", "BOOLEAN", "NULL", 
		"YES", "NO", "EQUAL", "IDENTIFIER", "VERSION_NUMBER", "URL", "URL_PATH_FRAGMENT", 
		"URL_PARAMS", "URL_VALID_CHARS", "TEXT", "WS"
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


	public PluginDocLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PluginDoc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u01c2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\7\33\u015a\n\33\f\33\16\33\u015d"+
		"\13\33\3\33\3\33\6\33\u0161\n\33\r\33\16\33\u0162\7\33\u0165\n\33\f\33"+
		"\16\33\u0168\13\33\3\34\6\34\u016b\n\34\r\34\16\34\u016c\3\34\3\34\6\34"+
		"\u0171\n\34\r\34\16\34\u0172\3\34\6\34\u0176\n\34\r\34\16\34\u0177\3\34"+
		"\6\34\u017b\n\34\r\34\16\34\u017c\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0185"+
		"\n\35\3\35\3\35\3\35\5\35\u018a\n\35\3\35\3\35\3\35\6\35\u018f\n\35\r"+
		"\35\16\35\u0190\3\35\3\35\7\35\u0195\n\35\f\35\16\35\u0198\13\35\3\35"+
		"\3\35\5\35\u019c\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\7\37\u01a9\n\37\f\37\16\37\u01ac\13\37\3 \6 \u01af\n \r \16 \u01b0"+
		"\3!\3!\7!\u01b5\n!\f!\16!\u01b8\13!\3!\3!\3\"\6\"\u01bd\n\"\r\"\16\"\u01be"+
		"\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\2=\2?\2A\37C \3\2\b\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\6\2"+
		"//\62;aac|\4\2\13\f$$\5\2\13\f\17\17\"\"\2\u01cf\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3"+
		"\2\2\2\5V\3\2\2\2\7c\3\2\2\2\to\3\2\2\2\13{\3\2\2\2\r\u0089\3\2\2\2\17"+
		"\u0099\3\2\2\2\21\u00a8\3\2\2\2\23\u00b6\3\2\2\2\25\u00cc\3\2\2\2\27\u00d7"+
		"\3\2\2\2\31\u00e6\3\2\2\2\33\u00f5\3\2\2\2\35\u0107\3\2\2\2\37\u0119\3"+
		"\2\2\2!\u011f\3\2\2\2#\u0126\3\2\2\2%\u012d\3\2\2\2\'\u0134\3\2\2\2)\u013b"+
		"\3\2\2\2+\u0141\3\2\2\2-\u0149\3\2\2\2/\u014e\3\2\2\2\61\u0152\3\2\2\2"+
		"\63\u0155\3\2\2\2\65\u0157\3\2\2\2\67\u016a\3\2\2\29\u0189\3\2\2\2;\u019d"+
		"\3\2\2\2=\u01a0\3\2\2\2?\u01ae\3\2\2\2A\u01b2\3\2\2\2C\u01bc\3\2\2\2E"+
		"F\7B\2\2FG\7y\2\2GH\7c\2\2HI\7v\2\2IJ\7g\2\2JK\7t\2\2KL\7f\2\2LM\7t\2"+
		"\2MN\7q\2\2NO\7r\2\2OP\7R\2\2PQ\7n\2\2QR\7w\2\2RS\7i\2\2ST\7k\2\2TU\7"+
		"p\2\2U\4\3\2\2\2VW\7B\2\2WX\7r\2\2XY\7n\2\2YZ\7w\2\2Z[\7i\2\2[\\\7k\2"+
		"\2\\]\7p\2\2]^\7I\2\2^_\7t\2\2_`\7q\2\2`a\7w\2\2ab\7r\2\2b\6\3\2\2\2c"+
		"d\7B\2\2de\7r\2\2ef\7n\2\2fg\7w\2\2gh\7i\2\2hi\7k\2\2ij\7p\2\2jk\7P\2"+
		"\2kl\7c\2\2lm\7o\2\2mn\7g\2\2n\b\3\2\2\2op\7B\2\2pq\7r\2\2qr\7n\2\2rs"+
		"\7w\2\2st\7i\2\2tu\7k\2\2uv\7p\2\2vw\7F\2\2wx\7g\2\2xy\7u\2\2yz\7e\2\2"+
		"z\n\3\2\2\2{|\7B\2\2|}\7r\2\2}~\7n\2\2~\177\7w\2\2\177\u0080\7i\2\2\u0080"+
		"\u0081\7k\2\2\u0081\u0082\7p\2\2\u0082\u0083\7C\2\2\u0083\u0084\7w\2\2"+
		"\u0084\u0085\7v\2\2\u0085\u0086\7j\2\2\u0086\u0087\7q\2\2\u0087\u0088"+
		"\7t\2\2\u0088\f\3\2\2\2\u0089\u008a\7B\2\2\u008a\u008b\7r\2\2\u008b\u008c"+
		"\7n\2\2\u008c\u008d\7w\2\2\u008d\u008e\7i\2\2\u008e\u008f\7k\2\2\u008f"+
		"\u0090\7p\2\2\u0090\u0091\7J\2\2\u0091\u0092\7q\2\2\u0092\u0093\7o\2\2"+
		"\u0093\u0094\7g\2\2\u0094\u0095\7r\2\2\u0095\u0096\7c\2\2\u0096\u0097"+
		"\7i\2\2\u0097\u0098\7g\2\2\u0098\16\3\2\2\2\u0099\u009a\7B\2\2\u009a\u009b"+
		"\7r\2\2\u009b\u009c\7n\2\2\u009c\u009d\7w\2\2\u009d\u009e\7i\2\2\u009e"+
		"\u009f\7k\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7X\2\2\u00a1\u00a2\7g\2\2"+
		"\u00a2\u00a3\7t\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6"+
		"\7q\2\2\u00a6\u00a7\7p\2\2\u00a7\20\3\2\2\2\u00a8\u00a9\7B\2\2\u00a9\u00aa"+
		"\7r\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7i\2\2\u00ad"+
		"\u00ae\7k\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7Q\2\2\u00b0\u00b1\7r\2\2"+
		"\u00b1\u00b2\7v\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5"+
		"\7p\2\2\u00b5\22\3\2\2\2\u00b6\u00b7\7B\2\2\u00b7\u00b8\7r\2\2\u00b8\u00b9"+
		"\7n\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7i\2\2\u00bb\u00bc\7k\2\2\u00bc"+
		"\u00bd\7p\2\2\u00bd\u00be\7Q\2\2\u00be\u00bf\7r\2\2\u00bf\u00c0\7v\2\2"+
		"\u00c0\u00c1\7k\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4"+
		"\7u\2\2\u00c4\u00c5\7G\2\2\u00c5\u00c6\7z\2\2\u00c6\u00c7\7c\2\2\u00c7"+
		"\u00c8\7o\2\2\u00c8\u00c9\7r\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7g\2\2"+
		"\u00cb\24\3\2\2\2\u00cc\u00cd\7B\2\2\u00cd\u00ce\7r\2\2\u00ce\u00cf\7"+
		"n\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7i\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3"+
		"\7p\2\2\u00d3\u00d4\7W\2\2\u00d4\u00d5\7F\2\2\u00d5\u00d6\7H\2\2\u00d6"+
		"\26\3\2\2\2\u00d7\u00d8\7B\2\2\u00d8\u00d9\7r\2\2\u00d9\u00da\7n\2\2\u00da"+
		"\u00db\7w\2\2\u00db\u00dc\7i\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7p\2\2"+
		"\u00de\u00df\7W\2\2\u00df\u00e0\7F\2\2\u00e0\u00e1\7H\2\2\u00e1\u00e2"+
		"\7P\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7o\2\2\u00e4\u00e5\7g\2\2\u00e5"+
		"\30\3\2\2\2\u00e6\u00e7\7B\2\2\u00e7\u00e8\7r\2\2\u00e8\u00e9\7n\2\2\u00e9"+
		"\u00ea\7w\2\2\u00ea\u00eb\7i\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7p\2\2"+
		"\u00ed\u00ee\7W\2\2\u00ee\u00ef\7F\2\2\u00ef\u00f0\7H\2\2\u00f0\u00f1"+
		"\7F\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7e\2\2\u00f4"+
		"\32\3\2\2\2\u00f5\u00f6\7B\2\2\u00f6\u00f7\7r\2\2\u00f7\u00f8\7n\2\2\u00f8"+
		"\u00f9\7w\2\2\u00f9\u00fa\7i\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7p\2\2"+
		"\u00fc\u00fd\7W\2\2\u00fd\u00fe\7F\2\2\u00fe\u00ff\7H\2\2\u00ff\u0100"+
		"\7Q\2\2\u0100\u0101\7r\2\2\u0101\u0102\7v\2\2\u0102\u0103\7k\2\2\u0103"+
		"\u0104\7q\2\2\u0104\u0105\7p\2\2\u0105\u0106\7u\2\2\u0106\34\3\2\2\2\u0107"+
		"\u0108\7B\2\2\u0108\u0109\7r\2\2\u0109\u010a\7n\2\2\u010a\u010b\7w\2\2"+
		"\u010b\u010c\7i\2\2\u010c\u010d\7k\2\2\u010d\u010e\7p\2\2\u010e\u010f"+
		"\7W\2\2\u010f\u0110\7F\2\2\u0110\u0111\7H\2\2\u0111\u0112\7G\2\2\u0112"+
		"\u0113\7z\2\2\u0113\u0114\7c\2\2\u0114\u0115\7o\2\2\u0115\u0116\7r\2\2"+
		"\u0116\u0117\7n\2\2\u0117\u0118\7g\2\2\u0118\36\3\2\2\2\u0119\u011a\7"+
		"k\2\2\u011a\u011b\7p\2\2\u011b\u011c\7r\2\2\u011c\u011d\7w\2\2\u011d\u011e"+
		"\7v\2\2\u011e \3\2\2\2\u011f\u0120\7h\2\2\u0120\u0121\7k\2\2\u0121\u0122"+
		"\7n\2\2\u0122\u0123\7v\2\2\u0123\u0124\7g\2\2\u0124\u0125\7t\2\2\u0125"+
		"\"\3\2\2\2\u0126\u0127\7q\2\2\u0127\u0128\7w\2\2\u0128\u0129\7v\2\2\u0129"+
		"\u012a\7r\2\2\u012a\u012b\7w\2\2\u012b\u012c\7v\2\2\u012c$\3\2\2\2\u012d"+
		"\u012e\7p\2\2\u012e\u012f\7w\2\2\u012f\u0130\7o\2\2\u0130\u0131\7d\2\2"+
		"\u0131\u0132\7g\2\2\u0132\u0133\7t\2\2\u0133&\3\2\2\2\u0134\u0135\7u\2"+
		"\2\u0135\u0136\7v\2\2\u0136\u0137\7t\2\2\u0137\u0138\7k\2\2\u0138\u0139"+
		"\7p\2\2\u0139\u013a\7i\2\2\u013a(\3\2\2\2\u013b\u013c\7c\2\2\u013c\u013d"+
		"\7t\2\2\u013d\u013e\7t\2\2\u013e\u013f\7c\2\2\u013f\u0140\7{\2\2\u0140"+
		"*\3\2\2\2\u0141\u0142\7d\2\2\u0142\u0143\7q\2\2\u0143\u0144\7q\2\2\u0144"+
		"\u0145\7n\2\2\u0145\u0146\7g\2\2\u0146\u0147\7c\2\2\u0147\u0148\7p\2\2"+
		"\u0148,\3\2\2\2\u0149\u014a\7p\2\2\u014a\u014b\7w\2\2\u014b\u014c\7n\2"+
		"\2\u014c\u014d\7n\2\2\u014d.\3\2\2\2\u014e\u014f\7{\2\2\u014f\u0150\7"+
		"g\2\2\u0150\u0151\7u\2\2\u0151\60\3\2\2\2\u0152\u0153\7p\2\2\u0153\u0154"+
		"\7q\2\2\u0154\62\3\2\2\2\u0155\u0156\7?\2\2\u0156\64\3\2\2\2\u0157\u015b"+
		"\t\2\2\2\u0158\u015a\t\3\2\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u0166\3\2\2\2\u015d\u015b\3\2"+
		"\2\2\u015e\u0160\7\60\2\2\u015f\u0161\t\3\2\2\u0160\u015f\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2"+
		"\2\2\u0164\u015e\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\66\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016b\t\4\2"+
		"\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\7\60\2\2\u016f\u0171\t\4\2\2"+
		"\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173"+
		"\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0176\7\60\2\2\u0175\u0174\3\2\2\2"+
		"\u0176\u0177\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a"+
		"\3\2\2\2\u0179\u017b\t\4\2\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d8\3\2\2\2\u017e\u017f\7j\2\2\u017f"+
		"\u0180\7v\2\2\u0180\u0181\7v\2\2\u0181\u0182\7r\2\2\u0182\u0184\3\2\2"+
		"\2\u0183\u0185\7u\2\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186"+
		"\3\2\2\2\u0186\u0187\7<\2\2\u0187\u0188\7\61\2\2\u0188\u018a\7\61\2\2"+
		"\u0189\u017e\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018e"+
		"\5? \2\u018c\u018d\7\60\2\2\u018d\u018f\5? \2\u018e\u018c\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0196\3\2"+
		"\2\2\u0192\u0195\7\61\2\2\u0193\u0195\5;\36\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0193\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u019b\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019a\7A\2\2\u019a"+
		"\u019c\5=\37\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c:\3\2\2\2"+
		"\u019d\u019e\7\61\2\2\u019e\u019f\5? \2\u019f<\3\2\2\2\u01a0\u01a1\5?"+
		" \2\u01a1\u01a2\7?\2\2\u01a2\u01aa\5? \2\u01a3\u01a4\7(\2\2\u01a4\u01a5"+
		"\5? \2\u01a5\u01a6\7?\2\2\u01a6\u01a7\5? \2\u01a7\u01a9\3\2\2\2\u01a8"+
		"\u01a3\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab>\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01af\t\5\2\2\u01ae\u01ad"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"@\3\2\2\2\u01b2\u01b6\7$\2\2\u01b3\u01b5\n\6\2\2\u01b4\u01b3\3\2\2\2\u01b5"+
		"\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\3\2"+
		"\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01ba\7$\2\2\u01baB\3\2\2\2\u01bb\u01bd"+
		"\t\7\2\2\u01bc\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bc\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\b\"\2\2\u01c1D\3\2\2\2"+
		"\24\2\u015b\u0162\u0166\u016c\u0172\u0177\u017c\u0184\u0189\u0190\u0194"+
		"\u0196\u019b\u01aa\u01b0\u01b6\u01be\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}