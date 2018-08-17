package io.github.interestinglab.waterdrop.configparser;
// Generated from E:/wordspacesec/waterdropinmvn/src/main/antlr4\Config.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConfigLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, COMMENT=11, DQ_STRING=12, SQ_STRING=13, NULL=14, WS=15, IF=16, 
		ELSE=17, AND=18, OR=19, NOT=20, TRUE=21, FALSE=22, GT=23, GE=24, LT=25, 
		LE=26, EQ=27, LPAREN=28, RPAREN=29, DECIMAL=30, IDENTIFIER=31, FIELD_REFERENCE=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "COMMENT", "BSLASH", "DQUOTE", "SQUOTE", "DQ_STRING_ESC", "SQ_STRING_ESC", 
		"DQ_STRING", "SQ_STRING", "NULL", "WS", "IF", "ELSE", "AND", "OR", "NOT", 
		"TRUE", "FALSE", "GT", "GE", "LT", "LE", "EQ", "LPAREN", "RPAREN", "DECIMAL", 
		"IDENTIFIER", "FIELD_REFERENCE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'spark'", "'input'", "'filter'", "'output'", "'{'", "'}'", "'='", 
		"'['", "','", "']'", null, null, null, "'null'", null, "'if'", "'else'", 
		"'AND'", "'OR'", "'NOT'", "'true'", "'false'", "'>'", "'>='", "'<'", "'<='", 
		"'=='", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "COMMENT", 
		"DQ_STRING", "SQ_STRING", "NULL", "WS", "IF", "ELSE", "AND", "OR", "NOT", 
		"TRUE", "FALSE", "GT", "GE", "LT", "LE", "EQ", "LPAREN", "RPAREN", "DECIMAL", 
		"IDENTIFIER", "FIELD_REFERENCE"
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


	public ConfigLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Config.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u0112\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\5\fw\n"+
		"\f\3\f\7\fz\n\f\f\f\16\f}\13\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\7\22\u0090\n\22\f\22\16\22\u0093"+
		"\13\22\3\22\3\22\3\23\3\23\3\23\7\23\u009a\n\23\f\23\16\23\u009d\13\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\6\25\u00a7\n\25\r\25\16\25\u00a8"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3"+
		"!\3!\3\"\3\"\3#\3#\3$\5$\u00dd\n$\3$\6$\u00e0\n$\r$\16$\u00e1\3$\3$\6"+
		"$\u00e6\n$\r$\16$\u00e7\5$\u00ea\n$\3%\3%\7%\u00ee\n%\f%\16%\u00f1\13"+
		"%\3%\3%\6%\u00f5\n%\r%\16%\u00f6\7%\u00f9\n%\f%\16%\u00fc\13%\3&\3&\3"+
		"&\3&\6&\u0102\n&\r&\16&\u0103\3&\3&\6&\u0108\n&\r&\16&\u0109\7&\u010c"+
		"\n&\f&\16&\u010f\13&\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\2\33\2\35\2\37\2!\2#\16%\17\'\20)\21+\22-\23/\24\61\25"+
		"\63\26\65\27\67\309\31;\32=\33?\34A\35C\36E\37G I!K\"\3\2\f\4\2\f\f\17"+
		"\17\n\2$$\61\61^^ddhhppttvv\n\2))\61\61^^ddhhppttvv\3\2$$\3\2))\5\2\13"+
		"\f\17\17\"\"\3\2\62;\5\2C\\aac|\7\2//\62;C\\aac|\6\2\62;C\\aac|\2\u011d"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5S\3\2\2\2\7Y\3\2\2\2\t`\3"+
		"\2\2\2\13g\3\2\2\2\ri\3\2\2\2\17k\3\2\2\2\21m\3\2\2\2\23o\3\2\2\2\25q"+
		"\3\2\2\2\27v\3\2\2\2\31\u0080\3\2\2\2\33\u0082\3\2\2\2\35\u0084\3\2\2"+
		"\2\37\u0086\3\2\2\2!\u0089\3\2\2\2#\u008c\3\2\2\2%\u0096\3\2\2\2\'\u00a0"+
		"\3\2\2\2)\u00a6\3\2\2\2+\u00ac\3\2\2\2-\u00af\3\2\2\2/\u00b4\3\2\2\2\61"+
		"\u00b8\3\2\2\2\63\u00bb\3\2\2\2\65\u00bf\3\2\2\2\67\u00c4\3\2\2\29\u00ca"+
		"\3\2\2\2;\u00cc\3\2\2\2=\u00cf\3\2\2\2?\u00d1\3\2\2\2A\u00d4\3\2\2\2C"+
		"\u00d7\3\2\2\2E\u00d9\3\2\2\2G\u00dc\3\2\2\2I\u00eb\3\2\2\2K\u00fd\3\2"+
		"\2\2MN\7u\2\2NO\7r\2\2OP\7c\2\2PQ\7t\2\2QR\7m\2\2R\4\3\2\2\2ST\7k\2\2"+
		"TU\7p\2\2UV\7r\2\2VW\7w\2\2WX\7v\2\2X\6\3\2\2\2YZ\7h\2\2Z[\7k\2\2[\\\7"+
		"n\2\2\\]\7v\2\2]^\7g\2\2^_\7t\2\2_\b\3\2\2\2`a\7q\2\2ab\7w\2\2bc\7v\2"+
		"\2cd\7r\2\2de\7w\2\2ef\7v\2\2f\n\3\2\2\2gh\7}\2\2h\f\3\2\2\2ij\7\177\2"+
		"\2j\16\3\2\2\2kl\7?\2\2l\20\3\2\2\2mn\7]\2\2n\22\3\2\2\2op\7.\2\2p\24"+
		"\3\2\2\2qr\7_\2\2r\26\3\2\2\2sw\7%\2\2tu\7\61\2\2uw\7\61\2\2vs\3\2\2\2"+
		"vt\3\2\2\2w{\3\2\2\2xz\n\2\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2"+
		"|~\3\2\2\2}{\3\2\2\2~\177\b\f\2\2\177\30\3\2\2\2\u0080\u0081\7^\2\2\u0081"+
		"\32\3\2\2\2\u0082\u0083\7$\2\2\u0083\34\3\2\2\2\u0084\u0085\7)\2\2\u0085"+
		"\36\3\2\2\2\u0086\u0087\5\31\r\2\u0087\u0088\t\3\2\2\u0088 \3\2\2\2\u0089"+
		"\u008a\5\31\r\2\u008a\u008b\t\4\2\2\u008b\"\3\2\2\2\u008c\u0091\5\33\16"+
		"\2\u008d\u0090\5\37\20\2\u008e\u0090\n\5\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\5\33\16\2\u0095"+
		"$\3\2\2\2\u0096\u009b\5\35\17\2\u0097\u009a\5!\21\2\u0098\u009a\n\6\2"+
		"\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u009f\5\35\17\2\u009f&\3\2\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7w\2\2"+
		"\u00a2\u00a3\7n\2\2\u00a3\u00a4\7n\2\2\u00a4(\3\2\2\2\u00a5\u00a7\t\7"+
		"\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\25\2\2\u00ab*\3\2\2\2"+
		"\u00ac\u00ad\7k\2\2\u00ad\u00ae\7h\2\2\u00ae,\3\2\2\2\u00af\u00b0\7g\2"+
		"\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7g\2\2\u00b3.\3\2"+
		"\2\2\u00b4\u00b5\7C\2\2\u00b5\u00b6\7P\2\2\u00b6\u00b7\7F\2\2\u00b7\60"+
		"\3\2\2\2\u00b8\u00b9\7Q\2\2\u00b9\u00ba\7T\2\2\u00ba\62\3\2\2\2\u00bb"+
		"\u00bc\7P\2\2\u00bc\u00bd\7Q\2\2\u00bd\u00be\7V\2\2\u00be\64\3\2\2\2\u00bf"+
		"\u00c0\7v\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7g\2\2"+
		"\u00c3\66\3\2\2\2\u00c4\u00c5\7h\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7"+
		"n\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7g\2\2\u00c98\3\2\2\2\u00ca\u00cb"+
		"\7@\2\2\u00cb:\3\2\2\2\u00cc\u00cd\7@\2\2\u00cd\u00ce\7?\2\2\u00ce<\3"+
		"\2\2\2\u00cf\u00d0\7>\2\2\u00d0>\3\2\2\2\u00d1\u00d2\7>\2\2\u00d2\u00d3"+
		"\7?\2\2\u00d3@\3\2\2\2\u00d4\u00d5\7?\2\2\u00d5\u00d6\7?\2\2\u00d6B\3"+
		"\2\2\2\u00d7\u00d8\7*\2\2\u00d8D\3\2\2\2\u00d9\u00da\7+\2\2\u00daF\3\2"+
		"\2\2\u00db\u00dd\7/\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00e0\t\b\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e9\3\2\2\2\u00e3"+
		"\u00e5\7\60\2\2\u00e4\u00e6\t\b\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3"+
		"\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9"+
		"\u00e3\3\2\2\2\u00e9\u00ea\3\2\2\2\u00eaH\3\2\2\2\u00eb\u00ef\t\t\2\2"+
		"\u00ec\u00ee\t\n\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00fa\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f4\7\60\2\2\u00f3\u00f5\t\n\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3"+
		"\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8"+
		"\u00f2\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fbJ\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7&\2\2\u00fe\u00ff"+
		"\7}\2\2\u00ff\u0101\3\2\2\2\u0100\u0102\t\13\2\2\u0101\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u010d\3\2"+
		"\2\2\u0105\u0107\7\60\2\2\u0106\u0108\t\13\2\2\u0107\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2"+
		"\2\2\u010b\u0105\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\7\177"+
		"\2\2\u0111L\3\2\2\2\24\2v{\u008f\u0091\u0099\u009b\u00a8\u00dc\u00e1\u00e7"+
		"\u00e9\u00ef\u00f6\u00fa\u0103\u0109\u010d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}