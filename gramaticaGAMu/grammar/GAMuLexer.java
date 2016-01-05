// Generated from C:\Users\Miguel\Desktop\-MiEI-\-MEI-\Gramáticas na Compreensão de Software\TrabalhoGitHub\GAMu\gramaticaGAMu\grammar\GAMu.g4 by ANTLR 4.4

        import java.util.*;
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;
        import java.sql.ResultSet;
        import java.sql.Statement;
        
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
		T__16=1, T__15=2, T__14=3, T__13=4, T__12=5, T__11=6, T__10=7, T__9=8, 
		T__8=9, T__7=10, T__6=11, T__5=12, T__4=13, T__3=14, T__2=15, T__1=16, 
		T__0=17, IDA=18, IDP=19, IDO=20, ID=21, INT=22, WS=23, STRING=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'"
	};
	public static final String[] ruleNames = {
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"IDA", "IDP", "IDO", "ID", "INT", "WS", "STRING", "ESC_SEQ", "OCTAL_ESC", 
		"UNICODE_ESC", "HEX_DIGIT"
	};


	            // JDBC driver name and database URL
	            String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	            String DB_URL = "jdbc:mysql://127.0.0.1:3306/gamu";
	            // Database credentials
	            String USER = "usrPRI";
	            String PASS = "popo";
	            
	        

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u0106\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\23\3\23\7\23\u00b8\n\23\f\23\16\23\u00bb\13"+
		"\23\3\24\3\24\7\24\u00bf\n\24\f\24\16\24\u00c2\13\24\3\25\3\25\7\25\u00c6"+
		"\n\25\f\25\16\25\u00c9\13\25\3\26\3\26\7\26\u00cd\n\26\f\26\16\26\u00d0"+
		"\13\26\3\27\6\27\u00d3\n\27\r\27\16\27\u00d4\3\27\3\27\6\27\u00d9\n\27"+
		"\r\27\16\27\u00da\5\27\u00dd\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\7"+
		"\31\u00e6\n\31\f\31\16\31\u00e9\13\31\3\31\3\31\3\32\3\32\3\32\3\32\5"+
		"\32\u00f1\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00fc"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\2\2\36\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\2\65\2\67\29\2\3\2\13\4\2CCcc\4\2R"+
		"Rrr\4\2QQqq\5\2C\\aac|\7\2//\62;C\\aac|\5\2\13\f\17\17\"\"\3\2$$\n\2$"+
		"$))^^ddhhppttvv\5\2\62;CHch\u010e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3;\3\2\2\2\5A\3\2\2\2"+
		"\7G\3\2\2\2\tM\3\2\2\2\13O\3\2\2\2\rW\3\2\2\2\17^\3\2\2\2\21k\3\2\2\2"+
		"\23q\3\2\2\2\25s\3\2\2\2\27\u0083\3\2\2\2\31\u008a\3\2\2\2\33\u0091\3"+
		"\2\2\2\35\u009c\3\2\2\2\37\u00a6\3\2\2\2!\u00a8\3\2\2\2#\u00b3\3\2\2\2"+
		"%\u00b5\3\2\2\2\'\u00bc\3\2\2\2)\u00c3\3\2\2\2+\u00ca\3\2\2\2-\u00d2\3"+
		"\2\2\2/\u00de\3\2\2\2\61\u00e2\3\2\2\2\63\u00f0\3\2\2\2\65\u00fb\3\2\2"+
		"\2\67\u00fd\3\2\2\29\u0104\3\2\2\2;<\7v\2\2<=\7g\2\2=>\7o\2\2>?\7c\2\2"+
		"?@\7<\2\2@\4\3\2\2\2AB\7f\2\2BC\7c\2\2CD\7v\2\2DE\7c\2\2EF\7<\2\2F\6\3"+
		"\2\2\2GH\7j\2\2HI\7q\2\2IJ\7t\2\2JK\7c\2\2KL\7<\2\2L\b\3\2\2\2MN\7<\2"+
		"\2N\n\3\2\2\2OP\7v\2\2PQ\7k\2\2QR\7v\2\2RS\7w\2\2ST\7n\2\2TU\7q\2\2UV"+
		"\7<\2\2V\f\3\2\2\2WX\7i\2\2XY\7t\2\2YZ\7w\2\2Z[\7r\2\2[\\\7q\2\2\\]\7"+
		"<\2\2]\16\3\2\2\2^_\7q\2\2_`\7t\2\2`a\7i\2\2ab\7c\2\2bc\7p\2\2cd\7k\2"+
		"\2de\7|\2\2ef\7c\2\2fg\7f\2\2gh\7q\2\2hi\7t\2\2ij\7<\2\2j\20\3\2\2\2k"+
		"l\7u\2\2lm\7q\2\2mn\7n\2\2no\7q\2\2op\7<\2\2p\22\3\2\2\2qr\7%\2\2r\24"+
		"\3\2\2\2st\7f\2\2tu\7w\2\2uv\7t\2\2vw\7c\2\2wx\7e\2\2xy\7c\2\2yz\7q\2"+
		"\2z{\7/\2\2{|\7o\2\2|}\7c\2\2}~\7z\2\2~\177\7k\2\2\177\u0080\7o\2\2\u0080"+
		"\u0081\7c\2\2\u0081\u0082\7<\2\2\u0082\26\3\2\2\2\u0083\u0084\7n\2\2\u0084"+
		"\u0085\7q\2\2\u0085\u0086\7e\2\2\u0086\u0087\7c\2\2\u0087\u0088\7n\2\2"+
		"\u0088\u0089\7<\2\2\u0089\30\3\2\2\2\u008a\u008b\7q\2\2\u008b\u008c\7"+
		"d\2\2\u008c\u008d\7t\2\2\u008d\u008e\7c\2\2\u008e\u008f\7u\2\2\u008f\u0090"+
		"\7<\2\2\u0090\32\3\2\2\2\u0091\u0092\7u\2\2\u0092\u0093\7w\2\2\u0093\u0094"+
		"\7d\2\2\u0094\u0095\7v\2\2\u0095\u0096\7k\2\2\u0096\u0097\7v\2\2\u0097"+
		"\u0098\7w\2\2\u0098\u0099\7n\2\2\u0099\u009a\7q\2\2\u009a\u009b\7<\2\2"+
		"\u009b\34\3\2\2\2\u009c\u009d\7c\2\2\u009d\u009e\7v\2\2\u009e\u009f\7"+
		"w\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7e\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3"+
		"\7g\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7<\2\2\u00a5\36\3\2\2\2\u00a6\u00a7"+
		"\7.\2\2\u00a7 \3\2\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab"+
		"\7g\2\2\u00ab\u00ac\7o\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\u00af\7v\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7<\2\2"+
		"\u00b2\"\3\2\2\2\u00b3\u00b4\7/\2\2\u00b4$\3\2\2\2\u00b5\u00b9\t\2\2\2"+
		"\u00b6\u00b8\4\62;\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba&\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00c0\t\3\2\2\u00bd\u00bf\4\62;\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1(\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c3\u00c7\t\4\2\2\u00c4\u00c6\4\62;\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8*\3\2\2\2"+
		"\u00c9\u00c7\3\2\2\2\u00ca\u00ce\t\5\2\2\u00cb\u00cd\t\6\2\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		",\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3\4\62;\2\u00d2\u00d1\3\2\2\2"+
		"\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00dc"+
		"\3\2\2\2\u00d6\u00d8\7\60\2\2\u00d7\u00d9\4\62;\2\u00d8\u00d7\3\2\2\2"+
		"\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd"+
		"\3\2\2\2\u00dc\u00d6\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd.\3\2\2\2\u00de"+
		"\u00df\t\7\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\b\30\2\2\u00e1\60\3\2\2"+
		"\2\u00e2\u00e7\7$\2\2\u00e3\u00e6\5\63\32\2\u00e4\u00e6\n\b\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u00eb\7$\2\2\u00eb\62\3\2\2\2\u00ec\u00ed\7^\2\2\u00ed\u00f1\t\t\2\2"+
		"\u00ee\u00f1\5\67\34\2\u00ef\u00f1\5\65\33\2\u00f0\u00ec\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\64\3\2\2\2\u00f2\u00f3\7^\2\2"+
		"\u00f3\u00f4\4\62\65\2\u00f4\u00f5\4\629\2\u00f5\u00fc\4\629\2\u00f6\u00f7"+
		"\7^\2\2\u00f7\u00f8\4\629\2\u00f8\u00fc\4\629\2\u00f9\u00fa\7^\2\2\u00fa"+
		"\u00fc\4\629\2\u00fb\u00f2\3\2\2\2\u00fb\u00f6\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fc\66\3\2\2\2\u00fd\u00fe\7^\2\2\u00fe\u00ff\7w\2\2\u00ff\u0100"+
		"\59\35\2\u0100\u0101\59\35\2\u0101\u0102\59\35\2\u0102\u0103\59\35\2\u0103"+
		"8\3\2\2\2\u0104\u0105\t\n\2\2\u0105:\3\2\2\2\16\2\u00b9\u00c0\u00c7\u00ce"+
		"\u00d4\u00da\u00dc\u00e5\u00e7\u00f0\u00fb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}