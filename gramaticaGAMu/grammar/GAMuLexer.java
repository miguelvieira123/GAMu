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
        
        import java.io.ByteArrayInputStream;
        import java.io.File;
        import java.io.IOException;
        import java.io.PrintStream;
        import javax.xml.parsers.DocumentBuilder;
        import javax.xml.parsers.DocumentBuilderFactory;
        import javax.xml.parsers.ParserConfigurationException;
        import javax.xml.transform.Transformer;
        import javax.xml.transform.TransformerException;
        import javax.xml.transform.TransformerFactory;
        import javax.xml.transform.dom.DOMSource;
        import javax.xml.transform.stream.StreamResult;
        import javax.xml.xpath.XPath;
        import javax.xml.xpath.XPathConstants;
        import javax.xml.xpath.XPathExpression;
        import javax.xml.xpath.XPathExpressionException;
        import javax.xml.xpath.XPathFactory;
        import org.w3c.dom.Document;
        import org.w3c.dom.Element;
        import org.w3c.dom.Node;
        import org.xml.sax.InputSource;
        import org.xml.sax.SAXException;

        
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
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, COMMENT=20, IDA=21, IDP=22, IDO=23, IDI=24, 
		ID=25, INT=26, WS=27, STRING=28;
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
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "COMMENT", "IDA", "IDP", "IDO", "IDI", "ID", "INT", "WS", 
		"STRING", "ESC_SEQ", "OCTAL_ESC", "UNICODE_ESC", "HEX_DIGIT"
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
	            String titulo;
	            String anoLetivo;
	            
	        

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u0141\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\7\25"+
		"\u00d0\n\25\f\25\16\25\u00d3\13\25\3\25\5\25\u00d6\n\25\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u00dd\n\25\f\25\16\25\u00e0\13\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00e6\n\25\3\25\3\25\3\26\3\26\7\26\u00ec\n\26\f\26\16\26\u00ef"+
		"\13\26\3\27\3\27\7\27\u00f3\n\27\f\27\16\27\u00f6\13\27\3\30\3\30\7\30"+
		"\u00fa\n\30\f\30\16\30\u00fd\13\30\3\31\3\31\7\31\u0101\n\31\f\31\16\31"+
		"\u0104\13\31\3\32\3\32\7\32\u0108\n\32\f\32\16\32\u010b\13\32\3\33\6\33"+
		"\u010e\n\33\r\33\16\33\u010f\3\33\3\33\6\33\u0114\n\33\r\33\16\33\u0115"+
		"\5\33\u0118\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u0121\n\35\f"+
		"\35\16\35\u0124\13\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u012c\n\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0137\n\37\3 \3 \3 \3"+
		" \3 \3 \3 \3!\3!\3\u00de\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\2=\2?\2A\2\3\2\r\4\2\f\f\17\17\4\2CCcc\4\2"+
		"RRrr\4\2QQqq\4\2KKkk\5\2C\\aac|\7\2//\62;C\\aac|\5\2\13\f\17\17\"\"\3"+
		"\2$$\n\2$$))^^ddhhppttvv\5\2\62;CHch\u014f\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3C\3\2\2\2\5E\3\2\2\2\7K\3\2\2\2"+
		"\tQ\3\2\2\2\13W\3\2\2\2\rY\3\2\2\2\17a\3\2\2\2\21h\3\2\2\2\23u\3\2\2\2"+
		"\25{\3\2\2\2\27}\3\2\2\2\31\u008d\3\2\2\2\33\u0099\3\2\2\2\35\u00a0\3"+
		"\2\2\2\37\u00a7\3\2\2\2!\u00b2\3\2\2\2#\u00bc\3\2\2\2%\u00be\3\2\2\2\'"+
		"\u00c9\3\2\2\2)\u00e5\3\2\2\2+\u00e9\3\2\2\2-\u00f0\3\2\2\2/\u00f7\3\2"+
		"\2\2\61\u00fe\3\2\2\2\63\u0105\3\2\2\2\65\u010d\3\2\2\2\67\u0119\3\2\2"+
		"\29\u011d\3\2\2\2;\u012b\3\2\2\2=\u0136\3\2\2\2?\u0138\3\2\2\2A\u013f"+
		"\3\2\2\2CD\7\61\2\2D\4\3\2\2\2EF\7v\2\2FG\7g\2\2GH\7o\2\2HI\7c\2\2IJ\7"+
		"<\2\2J\6\3\2\2\2KL\7f\2\2LM\7c\2\2MN\7v\2\2NO\7c\2\2OP\7<\2\2P\b\3\2\2"+
		"\2QR\7j\2\2RS\7q\2\2ST\7t\2\2TU\7c\2\2UV\7<\2\2V\n\3\2\2\2WX\7<\2\2X\f"+
		"\3\2\2\2YZ\7v\2\2Z[\7k\2\2[\\\7v\2\2\\]\7w\2\2]^\7n\2\2^_\7q\2\2_`\7<"+
		"\2\2`\16\3\2\2\2ab\7i\2\2bc\7t\2\2cd\7w\2\2de\7r\2\2ef\7q\2\2fg\7<\2\2"+
		"g\20\3\2\2\2hi\7q\2\2ij\7t\2\2jk\7i\2\2kl\7c\2\2lm\7p\2\2mn\7k\2\2no\7"+
		"|\2\2op\7c\2\2pq\7f\2\2qr\7q\2\2rs\7t\2\2st\7<\2\2t\22\3\2\2\2uv\7u\2"+
		"\2vw\7q\2\2wx\7n\2\2xy\7q\2\2yz\7<\2\2z\24\3\2\2\2{|\7%\2\2|\26\3\2\2"+
		"\2}~\7f\2\2~\177\7w\2\2\177\u0080\7t\2\2\u0080\u0081\7c\2\2\u0081\u0082"+
		"\7e\2\2\u0082\u0083\7c\2\2\u0083\u0084\7q\2\2\u0084\u0085\7/\2\2\u0085"+
		"\u0086\7o\2\2\u0086\u0087\7c\2\2\u0087\u0088\7z\2\2\u0088\u0089\7k\2\2"+
		"\u0089\u008a\7o\2\2\u008a\u008b\7c\2\2\u008b\u008c\7<\2\2\u008c\30\3\2"+
		"\2\2\u008d\u008e\7c\2\2\u008e\u008f\7p\2\2\u008f\u0090\7q\2\2\u0090\u0091"+
		"\7/\2\2\u0091\u0092\7n\2\2\u0092\u0093\7g\2\2\u0093\u0094\7v\2\2\u0094"+
		"\u0095\7k\2\2\u0095\u0096\7x\2\2\u0096\u0097\7q\2\2\u0097\u0098\7<\2\2"+
		"\u0098\32\3\2\2\2\u0099\u009a\7n\2\2\u009a\u009b\7q\2\2\u009b\u009c\7"+
		"e\2\2\u009c\u009d\7c\2\2\u009d\u009e\7n\2\2\u009e\u009f\7<\2\2\u009f\34"+
		"\3\2\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7d\2\2\u00a2\u00a3\7t\2\2\u00a3"+
		"\u00a4\7c\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7<\2\2\u00a6\36\3\2\2\2\u00a7"+
		"\u00a8\7u\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa\7d\2\2\u00aa\u00ab\7v\2\2"+
		"\u00ab\u00ac\7k\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af"+
		"\7n\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7<\2\2\u00b1 \3\2\2\2\u00b2\u00b3"+
		"\7c\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6\7c\2\2\u00b6"+
		"\u00b7\7e\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7u\2\2"+
		"\u00ba\u00bb\7<\2\2\u00bb\"\3\2\2\2\u00bc\u00bd\7.\2\2\u00bd$\3\2\2\2"+
		"\u00be\u00bf\7g\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2"+
		"\7o\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7v\2\2\u00c5"+
		"\u00c6\7q\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7<\2\2\u00c8&\3\2\2\2\u00c9"+
		"\u00ca\7/\2\2\u00ca(\3\2\2\2\u00cb\u00cc\7\61\2\2\u00cc\u00cd\7\61\2\2"+
		"\u00cd\u00d1\3\2\2\2\u00ce\u00d0\n\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3"+
		"\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d4\u00d6\7\17\2\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3"+
		"\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00e6\7\f\2\2\u00d8\u00d9\7\61\2\2\u00d9"+
		"\u00da\7,\2\2\u00da\u00de\3\2\2\2\u00db\u00dd\13\2\2\2\u00dc\u00db\3\2"+
		"\2\2\u00dd\u00e0\3\2\2\2\u00de\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7,\2\2\u00e2\u00e6\7\61"+
		"\2\2\u00e3\u00e4\7^\2\2\u00e4\u00e6\7p\2\2\u00e5\u00cb\3\2\2\2\u00e5\u00d8"+
		"\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\b\25\2\2"+
		"\u00e8*\3\2\2\2\u00e9\u00ed\t\3\2\2\u00ea\u00ec\4\62;\2\u00eb\u00ea\3"+
		"\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		",\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f4\t\4\2\2\u00f1\u00f3\4\62;\2"+
		"\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5.\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fb\t\5\2\2\u00f8"+
		"\u00fa\4\62;\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\60\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0102"+
		"\t\6\2\2\u00ff\u0101\4\62;\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\62\3\2\2\2\u0104\u0102\3\2\2"+
		"\2\u0105\u0109\t\7\2\2\u0106\u0108\t\b\2\2\u0107\u0106\3\2\2\2\u0108\u010b"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\64\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010c\u010e\4\62;\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0117\3\2\2\2\u0111"+
		"\u0113\7\60\2\2\u0112\u0114\4\62;\2\u0113\u0112\3\2\2\2\u0114\u0115\3"+
		"\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117"+
		"\u0111\3\2\2\2\u0117\u0118\3\2\2\2\u0118\66\3\2\2\2\u0119\u011a\t\t\2"+
		"\2\u011a\u011b\3\2\2\2\u011b\u011c\b\34\2\2\u011c8\3\2\2\2\u011d\u0122"+
		"\7$\2\2\u011e\u0121\5;\36\2\u011f\u0121\n\n\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7$\2\2\u0126"+
		":\3\2\2\2\u0127\u0128\7^\2\2\u0128\u012c\t\13\2\2\u0129\u012c\5? \2\u012a"+
		"\u012c\5=\37\2\u012b\u0127\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2"+
		"\2\2\u012c<\3\2\2\2\u012d\u012e\7^\2\2\u012e\u012f\4\62\65\2\u012f\u0130"+
		"\4\629\2\u0130\u0137\4\629\2\u0131\u0132\7^\2\2\u0132\u0133\4\629\2\u0133"+
		"\u0137\4\629\2\u0134\u0135\7^\2\2\u0135\u0137\4\629\2\u0136\u012d\3\2"+
		"\2\2\u0136\u0131\3\2\2\2\u0136\u0134\3\2\2\2\u0137>\3\2\2\2\u0138\u0139"+
		"\7^\2\2\u0139\u013a\7w\2\2\u013a\u013b\5A!\2\u013b\u013c\5A!\2\u013c\u013d"+
		"\5A!\2\u013d\u013e\5A!\2\u013e@\3\2\2\2\u013f\u0140\t\f\2\2\u0140B\3\2"+
		"\2\2\23\2\u00d1\u00d5\u00de\u00e5\u00ed\u00f4\u00fb\u0102\u0109\u010f"+
		"\u0115\u0117\u0120\u0122\u012b\u0136\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}