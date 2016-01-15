// Generated from C:\Users\Miguel\Desktop\-MiEI-\-MEI-\Gramáticas na Compreensão de Software\TrabalhoGitHub\GAMu\gramaticaGAMu\grammar\GAMu.g4 by ANTLR 4.4

        import java.util.*;
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;
        import java.sql.ResultSet;
        import java.sql.Statement;
        import java.sql.Time;
        import java.time.Instant;
        import java.io.PrintWriter;
        import java.io.FileNotFoundException;
        import java.util.logging.Level;
        import java.util.logging.Logger;
        
        
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
		T__0=17, COMMENT=18, IDA=19, IDP=20, IDO=21, IDI=22, ID=23, INT=24, WS=25, 
		STRING=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'"
	};
	public static final String[] ruleNames = {
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"COMMENT", "IDA", "IDP", "IDO", "IDI", "ID", "INT", "WS", "STRING", "ESC_SEQ", 
		"OCTAL_ESC", "UNICODE_ESC", "HEX_DIGIT"
	};


	            // JDBC driver name and database URL
	            String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	            String DB_URL = "jdbc:mysql://127.0.0.1:3306/gamu";
	            // Database credentials
	            String USER = "usrPRI";
	            String PASS = "popo";
	            // Database connection
	            Connection conn = null;
	            Statement stmt = null;
	            
	            // Grammar variables 
	            long hora_de_inicio = 0;
	            long total_audition_time = 0;
	            int max_audition_time = 0;
	            StringBuilder audicao_xml = new StringBuilder();
	            
	        

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u012f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\7\23"+
		"\u00be\n\23\f\23\16\23\u00c1\13\23\3\23\5\23\u00c4\n\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u00cb\n\23\f\23\16\23\u00ce\13\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00d4\n\23\3\23\3\23\3\24\3\24\7\24\u00da\n\24\f\24\16\24\u00dd"+
		"\13\24\3\25\3\25\7\25\u00e1\n\25\f\25\16\25\u00e4\13\25\3\26\3\26\7\26"+
		"\u00e8\n\26\f\26\16\26\u00eb\13\26\3\27\3\27\7\27\u00ef\n\27\f\27\16\27"+
		"\u00f2\13\27\3\30\3\30\7\30\u00f6\n\30\f\30\16\30\u00f9\13\30\3\31\6\31"+
		"\u00fc\n\31\r\31\16\31\u00fd\3\31\3\31\6\31\u0102\n\31\r\31\16\31\u0103"+
		"\5\31\u0106\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u010f\n\33\f"+
		"\33\16\33\u0112\13\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u011a\n\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0125\n\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\u00cc\2 \3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\29\2;\2=\2\3\2\r\4\2\f\f\17\17\4"+
		"\2CCcc\4\2RRrr\4\2QQqq\4\2KKkk\5\2C\\aac|\7\2//\62;C\\aac|\5\2\13\f\17"+
		"\17\"\"\3\2$$\n\2$$))^^ddhhppttvv\5\2\62;CHch\u013d\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\3?\3\2\2\2\5E\3\2\2\2\7K\3\2\2\2\tQ\3\2\2\2\13S"+
		"\3\2\2\2\r[\3\2\2\2\17b\3\2\2\2\21o\3\2\2\2\23u\3\2\2\2\25w\3\2\2\2\27"+
		"\u0087\3\2\2\2\31\u008e\3\2\2\2\33\u0095\3\2\2\2\35\u00a0\3\2\2\2\37\u00aa"+
		"\3\2\2\2!\u00ac\3\2\2\2#\u00b7\3\2\2\2%\u00d3\3\2\2\2\'\u00d7\3\2\2\2"+
		")\u00de\3\2\2\2+\u00e5\3\2\2\2-\u00ec\3\2\2\2/\u00f3\3\2\2\2\61\u00fb"+
		"\3\2\2\2\63\u0107\3\2\2\2\65\u010b\3\2\2\2\67\u0119\3\2\2\29\u0124\3\2"+
		"\2\2;\u0126\3\2\2\2=\u012d\3\2\2\2?@\7v\2\2@A\7g\2\2AB\7o\2\2BC\7c\2\2"+
		"CD\7<\2\2D\4\3\2\2\2EF\7f\2\2FG\7c\2\2GH\7v\2\2HI\7c\2\2IJ\7<\2\2J\6\3"+
		"\2\2\2KL\7j\2\2LM\7q\2\2MN\7t\2\2NO\7c\2\2OP\7<\2\2P\b\3\2\2\2QR\7<\2"+
		"\2R\n\3\2\2\2ST\7v\2\2TU\7k\2\2UV\7v\2\2VW\7w\2\2WX\7n\2\2XY\7q\2\2YZ"+
		"\7<\2\2Z\f\3\2\2\2[\\\7i\2\2\\]\7t\2\2]^\7w\2\2^_\7r\2\2_`\7q\2\2`a\7"+
		"<\2\2a\16\3\2\2\2bc\7q\2\2cd\7t\2\2de\7i\2\2ef\7c\2\2fg\7p\2\2gh\7k\2"+
		"\2hi\7|\2\2ij\7c\2\2jk\7f\2\2kl\7q\2\2lm\7t\2\2mn\7<\2\2n\20\3\2\2\2o"+
		"p\7u\2\2pq\7q\2\2qr\7n\2\2rs\7q\2\2st\7<\2\2t\22\3\2\2\2uv\7%\2\2v\24"+
		"\3\2\2\2wx\7f\2\2xy\7w\2\2yz\7t\2\2z{\7c\2\2{|\7e\2\2|}\7c\2\2}~\7q\2"+
		"\2~\177\7/\2\2\177\u0080\7o\2\2\u0080\u0081\7c\2\2\u0081\u0082\7z\2\2"+
		"\u0082\u0083\7k\2\2\u0083\u0084\7o\2\2\u0084\u0085\7c\2\2\u0085\u0086"+
		"\7<\2\2\u0086\26\3\2\2\2\u0087\u0088\7n\2\2\u0088\u0089\7q\2\2\u0089\u008a"+
		"\7e\2\2\u008a\u008b\7c\2\2\u008b\u008c\7n\2\2\u008c\u008d\7<\2\2\u008d"+
		"\30\3\2\2\2\u008e\u008f\7q\2\2\u008f\u0090\7d\2\2\u0090\u0091\7t\2\2\u0091"+
		"\u0092\7c\2\2\u0092\u0093\7u\2\2\u0093\u0094\7<\2\2\u0094\32\3\2\2\2\u0095"+
		"\u0096\7u\2\2\u0096\u0097\7w\2\2\u0097\u0098\7d\2\2\u0098\u0099\7v\2\2"+
		"\u0099\u009a\7k\2\2\u009a\u009b\7v\2\2\u009b\u009c\7w\2\2\u009c\u009d"+
		"\7n\2\2\u009d\u009e\7q\2\2\u009e\u009f\7<\2\2\u009f\34\3\2\2\2\u00a0\u00a1"+
		"\7c\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7c\2\2\u00a4"+
		"\u00a5\7e\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7u\2\2"+
		"\u00a8\u00a9\7<\2\2\u00a9\36\3\2\2\2\u00aa\u00ab\7.\2\2\u00ab \3\2\2\2"+
		"\u00ac\u00ad\7g\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7g\2\2\u00af\u00b0"+
		"\7o\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7v\2\2\u00b3"+
		"\u00b4\7q\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7<\2\2\u00b6\"\3\2\2\2\u00b7"+
		"\u00b8\7/\2\2\u00b8$\3\2\2\2\u00b9\u00ba\7\61\2\2\u00ba\u00bb\7\61\2\2"+
		"\u00bb\u00bf\3\2\2\2\u00bc\u00be\n\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1"+
		"\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c4\7\17\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3"+
		"\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00d4\7\f\2\2\u00c6\u00c7\7\61\2\2\u00c7"+
		"\u00c8\7,\2\2\u00c8\u00cc\3\2\2\2\u00c9\u00cb\13\2\2\2\u00ca\u00c9\3\2"+
		"\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7,\2\2\u00d0\u00d4\7\61"+
		"\2\2\u00d1\u00d2\7^\2\2\u00d2\u00d4\7p\2\2\u00d3\u00b9\3\2\2\2\u00d3\u00c6"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b\23\2\2"+
		"\u00d6&\3\2\2\2\u00d7\u00db\t\3\2\2\u00d8\u00da\4\62;\2\u00d9\u00d8\3"+
		"\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"(\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e2\t\4\2\2\u00df\u00e1\4\62;\2"+
		"\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3*\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e9\t\5\2\2\u00e6"+
		"\u00e8\4\62;\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea,\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00f0"+
		"\t\6\2\2\u00ed\u00ef\4\62;\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1.\3\2\2\2\u00f2\u00f0\3\2\2\2"+
		"\u00f3\u00f7\t\7\2\2\u00f4\u00f6\t\b\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9"+
		"\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\60\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00fc\4\62;\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0105\3\2\2\2\u00ff"+
		"\u0101\7\60\2\2\u0100\u0102\4\62;\2\u0101\u0100\3\2\2\2\u0102\u0103\3"+
		"\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105"+
		"\u00ff\3\2\2\2\u0105\u0106\3\2\2\2\u0106\62\3\2\2\2\u0107\u0108\t\t\2"+
		"\2\u0108\u0109\3\2\2\2\u0109\u010a\b\32\2\2\u010a\64\3\2\2\2\u010b\u0110"+
		"\7$\2\2\u010c\u010f\5\67\34\2\u010d\u010f\n\n\2\2\u010e\u010c\3\2\2\2"+
		"\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7$\2\2\u0114"+
		"\66\3\2\2\2\u0115\u0116\7^\2\2\u0116\u011a\t\13\2\2\u0117\u011a\5;\36"+
		"\2\u0118\u011a\59\35\2\u0119\u0115\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u0118"+
		"\3\2\2\2\u011a8\3\2\2\2\u011b\u011c\7^\2\2\u011c\u011d\4\62\65\2\u011d"+
		"\u011e\4\629\2\u011e\u0125\4\629\2\u011f\u0120\7^\2\2\u0120\u0121\4\62"+
		"9\2\u0121\u0125\4\629\2\u0122\u0123\7^\2\2\u0123\u0125\4\629\2\u0124\u011b"+
		"\3\2\2\2\u0124\u011f\3\2\2\2\u0124\u0122\3\2\2\2\u0125:\3\2\2\2\u0126"+
		"\u0127\7^\2\2\u0127\u0128\7w\2\2\u0128\u0129\5=\37\2\u0129\u012a\5=\37"+
		"\2\u012a\u012b\5=\37\2\u012b\u012c\5=\37\2\u012c<\3\2\2\2\u012d\u012e"+
		"\t\f\2\2\u012e>\3\2\2\2\23\2\u00bf\u00c3\u00cc\u00d3\u00db\u00e2\u00e9"+
		"\u00f0\u00f7\u00fd\u0103\u0105\u010e\u0110\u0119\u0124\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}