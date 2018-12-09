// Generated from Demo.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DemoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__24=1, T__23=2, T__22=3, T__21=4, T__20=5, T__19=6, T__18=7, T__17=8, 
		T__16=9, T__15=10, T__14=11, T__13=12, T__12=13, T__11=14, T__10=15, T__9=16, 
		T__8=17, T__7=18, T__6=19, T__5=20, T__4=21, T__3=22, T__2=23, T__1=24, 
		T__0=25, IDENTIFIER=26, NUMBER=27, WHITESPACE=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'"
	};
	public static final String[] ruleNames = {
		"T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", 
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"IDENTIFIER", "NUMBER", "WHITESPACE"
	};


	public DemoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Demo.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u009a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\7\33\u008a\n\33\f\33\16"+
		"\33\u008d\13\33\3\34\6\34\u0090\n\34\r\34\16\34\u0091\3\35\6\35\u0095"+
		"\n\35\r\35\16\35\u0096\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36\3\2\6\4\2C\\c|\5\2\62;C\\c|\3\2\62"+
		";\5\2\13\f\17\17\"\"\u009c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7F\3\2\2\2\tM\3\2\2\2\13P\3"+
		"\2\2\2\rR\3\2\2\2\17X\3\2\2\2\21Z\3\2\2\2\23\\\3\2\2\2\25^\3\2\2\2\27"+
		"a\3\2\2\2\31d\3\2\2\2\33h\3\2\2\2\35j\3\2\2\2\37l\3\2\2\2!n\3\2\2\2#p"+
		"\3\2\2\2%s\3\2\2\2\'v\3\2\2\2)x\3\2\2\2+z\3\2\2\2-|\3\2\2\2/\u0081\3\2"+
		"\2\2\61\u0083\3\2\2\2\63\u0085\3\2\2\2\65\u0087\3\2\2\2\67\u008f\3\2\2"+
		"\29\u0094\3\2\2\2;<\7\61\2\2<\4\3\2\2\2=>\7r\2\2>?\7t\2\2?@\7k\2\2@A\7"+
		"p\2\2AB\7v\2\2BC\7n\2\2CD\7p\2\2DE\7*\2\2E\6\3\2\2\2FG\7t\2\2GH\7g\2\2"+
		"HI\7v\2\2IJ\7w\2\2JK\7t\2\2KL\7p\2\2L\b\3\2\2\2MN\7#\2\2NO\7?\2\2O\n\3"+
		"\2\2\2PQ\7}\2\2Q\f\3\2\2\2RS\7y\2\2ST\7j\2\2TU\7k\2\2UV\7n\2\2VW\7g\2"+
		"\2W\16\3\2\2\2XY\7=\2\2Y\20\3\2\2\2Z[\7?\2\2[\22\3\2\2\2\\]\7\177\2\2"+
		"]\24\3\2\2\2^_\7k\2\2_`\7h\2\2`\26\3\2\2\2ab\7>\2\2bc\7?\2\2c\30\3\2\2"+
		"\2de\7k\2\2ef\7p\2\2fg\7v\2\2g\32\3\2\2\2hi\7*\2\2i\34\3\2\2\2jk\7,\2"+
		"\2k\36\3\2\2\2lm\7.\2\2m \3\2\2\2no\7]\2\2o\"\3\2\2\2pq\7@\2\2qr\7?\2"+
		"\2r$\3\2\2\2st\7?\2\2tu\7?\2\2u&\3\2\2\2vw\7>\2\2w(\3\2\2\2xy\7_\2\2y"+
		"*\3\2\2\2z{\7@\2\2{,\3\2\2\2|}\7g\2\2}~\7n\2\2~\177\7u\2\2\177\u0080\7"+
		"g\2\2\u0080.\3\2\2\2\u0081\u0082\7+\2\2\u0082\60\3\2\2\2\u0083\u0084\7"+
		"-\2\2\u0084\62\3\2\2\2\u0085\u0086\7/\2\2\u0086\64\3\2\2\2\u0087\u008b"+
		"\t\2\2\2\u0088\u008a\t\3\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\66\3\2\2\2\u008d\u008b\3\2\2"+
		"\2\u008e\u0090\t\4\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u00928\3\2\2\2\u0093\u0095\t\5\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b\35\2\2\u0099:\3\2\2\2\6\2\u008b"+
		"\u0091\u0096\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}