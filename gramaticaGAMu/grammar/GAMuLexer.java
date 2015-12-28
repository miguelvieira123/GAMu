// Generated from C:\Users\Miguel\Desktop\-MiEI-\-MEI-\Gramáticas na Compreensão de Software\TrabalhoGitHub\GAMu\gramaticaGAMu\grammar\GAMu.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GAMuLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		ID=10, INT=11, WS=12, STRING=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'"
	};
	public static final String[] ruleNames = {
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"ID", "INT", "WS", "STRING", "ESC_SEQ", "OCTAL_ESC", "UNICODE_ESC", "HEX_DIGIT"
	};


	public GAMuLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GAMu.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13S\n\13\f\13\16\13"+
		"V\13\13\3\f\6\fY\n\f\r\f\16\fZ\3\f\3\f\6\f_\n\f\r\f\16\f`\5\fc\n\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\7\16l\n\16\f\16\16\16o\13\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\5\17w\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0082\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\2\2\23\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\2\37"+
		"\2!\2#\2\3\2\b\5\2C\\aac|\7\2//\62;C\\aac|\5\2\13\f\17\17\"\"\3\2$$\n"+
		"\2$$))^^ddhhppttvv\5\2\62;CHch\u0091\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3%\3\2\2"+
		"\2\5\'\3\2\2\2\7,\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2\17;\3"+
		"\2\2\2\21E\3\2\2\2\23G\3\2\2\2\25P\3\2\2\2\27X\3\2\2\2\31d\3\2\2\2\33"+
		"h\3\2\2\2\35v\3\2\2\2\37\u0081\3\2\2\2!\u0083\3\2\2\2#\u008a\3\2\2\2%"+
		"&\7%\2\2&\4\3\2\2\2\'(\7f\2\2()\7c\2\2)*\7v\2\2*+\7c\2\2+\6\3\2\2\2,-"+
		"\7c\2\2-.\7w\2\2./\7f\2\2/\60\7k\2\2\60\61\7e\2\2\61\62\7c\2\2\62\63\7"+
		"q\2\2\63\64\7<\2\2\64\b\3\2\2\2\65\66\7*\2\2\66\n\3\2\2\2\678\7+\2\28"+
		"\f\3\2\2\29:\7<\2\2:\16\3\2\2\2;<\7c\2\2<=\7v\2\2=>\7w\2\2>?\7c\2\2?@"+
		"\7e\2\2@A\7q\2\2AB\7g\2\2BC\7u\2\2CD\7<\2\2D\20\3\2\2\2EF\7.\2\2F\22\3"+
		"\2\2\2GH\7o\2\2HI\7w\2\2IJ\7u\2\2JK\7k\2\2KL\7e\2\2LM\7q\2\2MN\7u\2\2"+
		"NO\7<\2\2O\24\3\2\2\2PT\t\2\2\2QS\t\3\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2"+
		"\2TU\3\2\2\2U\26\3\2\2\2VT\3\2\2\2WY\4\62;\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2"+
		"\2\2Z[\3\2\2\2[b\3\2\2\2\\^\7\60\2\2]_\4\62;\2^]\3\2\2\2_`\3\2\2\2`^\3"+
		"\2\2\2`a\3\2\2\2ac\3\2\2\2b\\\3\2\2\2bc\3\2\2\2c\30\3\2\2\2de\t\4\2\2"+
		"ef\3\2\2\2fg\b\r\2\2g\32\3\2\2\2hm\7$\2\2il\5\35\17\2jl\n\5\2\2ki\3\2"+
		"\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7$"+
		"\2\2q\34\3\2\2\2rs\7^\2\2sw\t\6\2\2tw\5!\21\2uw\5\37\20\2vr\3\2\2\2vt"+
		"\3\2\2\2vu\3\2\2\2w\36\3\2\2\2xy\7^\2\2yz\4\62\65\2z{\4\629\2{\u0082\4"+
		"\629\2|}\7^\2\2}~\4\629\2~\u0082\4\629\2\177\u0080\7^\2\2\u0080\u0082"+
		"\4\629\2\u0081x\3\2\2\2\u0081|\3\2\2\2\u0081\177\3\2\2\2\u0082 \3\2\2"+
		"\2\u0083\u0084\7^\2\2\u0084\u0085\7w\2\2\u0085\u0086\5#\22\2\u0086\u0087"+
		"\5#\22\2\u0087\u0088\5#\22\2\u0088\u0089\5#\22\2\u0089\"\3\2\2\2\u008a"+
		"\u008b\t\7\2\2\u008b$\3\2\2\2\13\2TZ`bkmv\u0081\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}