// Generated from XQuery.g4 by ANTLR 4.9.1

	package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XQueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, ID=38, FILENAME=39, 
		StringConstant=40, Letter=41, Digit=42, WS=43, IGNORE=44, IGNORE2=45, 
		IGNORE3=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "ID", "FILENAME", "StringConstant", 
			"Letter", "Digit", "WS", "IGNORE", "IGNORE2", "IGNORE3"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'doc(\"'", "'\")'", "'/'", "'//'", "'*'", "'.'", "'..'", "'text()'", 
			"'@'", "'('", "')'", "'['", "']'", "','", "'='", "'eq'", "'=='", "'is'", 
			"'and'", "'or'", "'not'", "'<'", "'>'", "'{'", "'}'", "'</'", "'for'", 
			"'in'", "'let'", "':='", "'where'", "'return'", "'empty'", "'some'", 
			"'satisfies'", "'join'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "FILENAME", "StringConstant", "Letter", "Digit", "WS", 
			"IGNORE", "IGNORE2", "IGNORE3"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public XQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u010e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3"+
		"\'\6\'\u00e1\n\'\r\'\16\'\u00e2\3(\6(\u00e6\n(\r(\16(\u00e7\3)\3)\7)\u00ec"+
		"\n)\f)\16)\u00ef\13)\3)\3)\3*\3*\3+\3+\3,\6,\u00f8\n,\r,\16,\u00f9\3,"+
		"\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\5/\u010b\n/\3/\3/\2\2\60\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\f\7\2//\62;C\\aac|\7\2\60\60"+
		"\62;C\\aac|\n\2\"#..\60\60\62=AAC\\aac|\4\2C\\c|\3\2\62;\5\2\13\f\17\17"+
		"\"\"\3\2^^\3\2pp\3\2vv\4\2\f\f\"\"\2\u0112\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5e\3\2\2\2\7h\3\2\2\2\tj\3\2\2\2"+
		"\13m\3\2\2\2\ro\3\2\2\2\17q\3\2\2\2\21t\3\2\2\2\23{\3\2\2\2\25}\3\2\2"+
		"\2\27\177\3\2\2\2\31\u0081\3\2\2\2\33\u0083\3\2\2\2\35\u0085\3\2\2\2\37"+
		"\u0087\3\2\2\2!\u0089\3\2\2\2#\u008c\3\2\2\2%\u008f\3\2\2\2\'\u0092\3"+
		"\2\2\2)\u0096\3\2\2\2+\u0099\3\2\2\2-\u009d\3\2\2\2/\u009f\3\2\2\2\61"+
		"\u00a1\3\2\2\2\63\u00a3\3\2\2\2\65\u00a5\3\2\2\2\67\u00a8\3\2\2\29\u00ac"+
		"\3\2\2\2;\u00af\3\2\2\2=\u00b3\3\2\2\2?\u00b6\3\2\2\2A\u00bc\3\2\2\2C"+
		"\u00c3\3\2\2\2E\u00c9\3\2\2\2G\u00ce\3\2\2\2I\u00d8\3\2\2\2K\u00dd\3\2"+
		"\2\2M\u00e0\3\2\2\2O\u00e5\3\2\2\2Q\u00e9\3\2\2\2S\u00f2\3\2\2\2U\u00f4"+
		"\3\2\2\2W\u00f7\3\2\2\2Y\u00fd\3\2\2\2[\u0102\3\2\2\2]\u010a\3\2\2\2_"+
		"`\7f\2\2`a\7q\2\2ab\7e\2\2bc\7*\2\2cd\7$\2\2d\4\3\2\2\2ef\7$\2\2fg\7+"+
		"\2\2g\6\3\2\2\2hi\7\61\2\2i\b\3\2\2\2jk\7\61\2\2kl\7\61\2\2l\n\3\2\2\2"+
		"mn\7,\2\2n\f\3\2\2\2op\7\60\2\2p\16\3\2\2\2qr\7\60\2\2rs\7\60\2\2s\20"+
		"\3\2\2\2tu\7v\2\2uv\7g\2\2vw\7z\2\2wx\7v\2\2xy\7*\2\2yz\7+\2\2z\22\3\2"+
		"\2\2{|\7B\2\2|\24\3\2\2\2}~\7*\2\2~\26\3\2\2\2\177\u0080\7+\2\2\u0080"+
		"\30\3\2\2\2\u0081\u0082\7]\2\2\u0082\32\3\2\2\2\u0083\u0084\7_\2\2\u0084"+
		"\34\3\2\2\2\u0085\u0086\7.\2\2\u0086\36\3\2\2\2\u0087\u0088\7?\2\2\u0088"+
		" \3\2\2\2\u0089\u008a\7g\2\2\u008a\u008b\7s\2\2\u008b\"\3\2\2\2\u008c"+
		"\u008d\7?\2\2\u008d\u008e\7?\2\2\u008e$\3\2\2\2\u008f\u0090\7k\2\2\u0090"+
		"\u0091\7u\2\2\u0091&\3\2\2\2\u0092\u0093\7c\2\2\u0093\u0094\7p\2\2\u0094"+
		"\u0095\7f\2\2\u0095(\3\2\2\2\u0096\u0097\7q\2\2\u0097\u0098\7t\2\2\u0098"+
		"*\3\2\2\2\u0099\u009a\7p\2\2\u009a\u009b\7q\2\2\u009b\u009c\7v\2\2\u009c"+
		",\3\2\2\2\u009d\u009e\7>\2\2\u009e.\3\2\2\2\u009f\u00a0\7@\2\2\u00a0\60"+
		"\3\2\2\2\u00a1\u00a2\7}\2\2\u00a2\62\3\2\2\2\u00a3\u00a4\7\177\2\2\u00a4"+
		"\64\3\2\2\2\u00a5\u00a6\7>\2\2\u00a6\u00a7\7\61\2\2\u00a7\66\3\2\2\2\u00a8"+
		"\u00a9\7h\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7t\2\2\u00ab8\3\2\2\2\u00ac"+
		"\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae:\3\2\2\2\u00af\u00b0\7n\2\2\u00b0"+
		"\u00b1\7g\2\2\u00b1\u00b2\7v\2\2\u00b2<\3\2\2\2\u00b3\u00b4\7<\2\2\u00b4"+
		"\u00b5\7?\2\2\u00b5>\3\2\2\2\u00b6\u00b7\7y\2\2\u00b7\u00b8\7j\2\2\u00b8"+
		"\u00b9\7g\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7g\2\2\u00bb@\3\2\2\2\u00bc"+
		"\u00bd\7t\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7w\2\2"+
		"\u00c0\u00c1\7t\2\2\u00c1\u00c2\7p\2\2\u00c2B\3\2\2\2\u00c3\u00c4\7g\2"+
		"\2\u00c4\u00c5\7o\2\2\u00c5\u00c6\7r\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8"+
		"\7{\2\2\u00c8D\3\2\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc"+
		"\7o\2\2\u00cc\u00cd\7g\2\2\u00cdF\3\2\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0"+
		"\7c\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7u\2\2\u00d3"+
		"\u00d4\7h\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7u\2\2"+
		"\u00d7H\3\2\2\2\u00d8\u00d9\7l\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7k\2"+
		"\2\u00db\u00dc\7p\2\2\u00dcJ\3\2\2\2\u00dd\u00de\7&\2\2\u00deL\3\2\2\2"+
		"\u00df\u00e1\t\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3N\3\2\2\2\u00e4\u00e6\t\3\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8P\3\2\2\2\u00e9\u00ed\7$\2\2\u00ea\u00ec\t\4\2\2\u00eb\u00ea"+
		"\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7$\2\2\u00f1R\3\2\2\2\u00f2"+
		"\u00f3\t\5\2\2\u00f3T\3\2\2\2\u00f4\u00f5\t\6\2\2\u00f5V\3\2\2\2\u00f6"+
		"\u00f8\t\7\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\b,\2\2\u00fc"+
		"X\3\2\2\2\u00fd\u00fe\t\b\2\2\u00fe\u00ff\t\t\2\2\u00ff\u0100\3\2\2\2"+
		"\u0100\u0101\b-\2\2\u0101Z\3\2\2\2\u0102\u0103\t\b\2\2\u0103\u0104\t\n"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\u0106\b.\2\2\u0106\\\3\2\2\2\u0107\u010b"+
		"\t\13\2\2\u0108\u0109\7\"\2\2\u0109\u010b\7\f\2\2\u010a\u0107\3\2\2\2"+
		"\u010a\u0108\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\b/\2\2\u010d^\3\2"+
		"\2\2\b\2\u00e2\u00e7\u00ed\u00f9\u010a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}