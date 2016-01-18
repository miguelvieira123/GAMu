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
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, COMMENT=19, IDA=20, IDP=21, IDO=22, IDI=23, ID=24, INT=25, 
		WS=26, STRING=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'"
	};
	public static final String[] ruleNames = {
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "COMMENT", "IDA", "IDP", "IDO", "IDI", "ID", "INT", "WS", "STRING", 
		"ESC_SEQ", "OCTAL_ESC", "UNICODE_ESC", "HEX_DIGIT"
	};


	            // JDBC driver name and database URL
	            String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	            String DB_URL = "jdbc:mysql://127.0.0.1:3306/gamu";
	            // Database credentials
	            String USER = "root";
	            String PASS = "qweqwe";
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
	            int flag = 0;
	            
	        

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u013d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00cc\n\24\f\24"+
		"\16\24\u00cf\13\24\3\24\5\24\u00d2\n\24\3\24\3\24\3\24\3\24\3\24\7\24"+
		"\u00d9\n\24\f\24\16\24\u00dc\13\24\3\24\3\24\3\24\3\24\5\24\u00e2\n\24"+
		"\3\24\3\24\3\25\3\25\7\25\u00e8\n\25\f\25\16\25\u00eb\13\25\3\26\3\26"+
		"\7\26\u00ef\n\26\f\26\16\26\u00f2\13\26\3\27\3\27\7\27\u00f6\n\27\f\27"+
		"\16\27\u00f9\13\27\3\30\3\30\7\30\u00fd\n\30\f\30\16\30\u0100\13\30\3"+
		"\31\3\31\7\31\u0104\n\31\f\31\16\31\u0107\13\31\3\32\6\32\u010a\n\32\r"+
		"\32\16\32\u010b\3\32\3\32\6\32\u0110\n\32\r\32\16\32\u0111\5\32\u0114"+
		"\n\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u011d\n\34\f\34\16\34\u0120"+
		"\13\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u0128\n\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\5\36\u0133\n\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3\u00da\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\2;\2=\2?\2\3\2\t\4\2\f\f\17\17\5\2C\\aac|\7\2//\62"+
		";C\\aac|\5\2\13\f\17\17\"\"\3\2$$\n\2$$))^^ddhhppttvv\5\2\62;CHch\u014b"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\3A\3\2\2\2\5C\3"+
		"\2\2\2\7I\3\2\2\2\tO\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17_\3\2\2\2\21f\3"+
		"\2\2\2\23s\3\2\2\2\25y\3\2\2\2\27{\3\2\2\2\31\u008b\3\2\2\2\33\u0097\3"+
		"\2\2\2\35\u009e\3\2\2\2\37\u00a5\3\2\2\2!\u00b0\3\2\2\2#\u00ba\3\2\2\2"+
		"%\u00bc\3\2\2\2\'\u00e1\3\2\2\2)\u00e5\3\2\2\2+\u00ec\3\2\2\2-\u00f3\3"+
		"\2\2\2/\u00fa\3\2\2\2\61\u0101\3\2\2\2\63\u0109\3\2\2\2\65\u0115\3\2\2"+
		"\2\67\u0119\3\2\2\29\u0127\3\2\2\2;\u0132\3\2\2\2=\u0134\3\2\2\2?\u013b"+
		"\3\2\2\2AB\7\61\2\2B\4\3\2\2\2CD\7v\2\2DE\7g\2\2EF\7o\2\2FG\7c\2\2GH\7"+
		"<\2\2H\6\3\2\2\2IJ\7f\2\2JK\7c\2\2KL\7v\2\2LM\7c\2\2MN\7<\2\2N\b\3\2\2"+
		"\2OP\7j\2\2PQ\7q\2\2QR\7t\2\2RS\7c\2\2ST\7<\2\2T\n\3\2\2\2UV\7<\2\2V\f"+
		"\3\2\2\2WX\7v\2\2XY\7k\2\2YZ\7v\2\2Z[\7w\2\2[\\\7n\2\2\\]\7q\2\2]^\7<"+
		"\2\2^\16\3\2\2\2_`\7i\2\2`a\7t\2\2ab\7w\2\2bc\7r\2\2cd\7q\2\2de\7<\2\2"+
		"e\20\3\2\2\2fg\7q\2\2gh\7t\2\2hi\7i\2\2ij\7c\2\2jk\7p\2\2kl\7k\2\2lm\7"+
		"|\2\2mn\7c\2\2no\7f\2\2op\7q\2\2pq\7t\2\2qr\7<\2\2r\22\3\2\2\2st\7u\2"+
		"\2tu\7q\2\2uv\7n\2\2vw\7q\2\2wx\7<\2\2x\24\3\2\2\2yz\7%\2\2z\26\3\2\2"+
		"\2{|\7f\2\2|}\7w\2\2}~\7t\2\2~\177\7c\2\2\177\u0080\7e\2\2\u0080\u0081"+
		"\7c\2\2\u0081\u0082\7q\2\2\u0082\u0083\7/\2\2\u0083\u0084\7o\2\2\u0084"+
		"\u0085\7c\2\2\u0085\u0086\7z\2\2\u0086\u0087\7k\2\2\u0087\u0088\7o\2\2"+
		"\u0088\u0089\7c\2\2\u0089\u008a\7<\2\2\u008a\30\3\2\2\2\u008b\u008c\7"+
		"c\2\2\u008c\u008d\7p\2\2\u008d\u008e\7q\2\2\u008e\u008f\7/\2\2\u008f\u0090"+
		"\7n\2\2\u0090\u0091\7g\2\2\u0091\u0092\7v\2\2\u0092\u0093\7k\2\2\u0093"+
		"\u0094\7x\2\2\u0094\u0095\7q\2\2\u0095\u0096\7<\2\2\u0096\32\3\2\2\2\u0097"+
		"\u0098\7n\2\2\u0098\u0099\7q\2\2\u0099\u009a\7e\2\2\u009a\u009b\7c\2\2"+
		"\u009b\u009c\7n\2\2\u009c\u009d\7<\2\2\u009d\34\3\2\2\2\u009e\u009f\7"+
		"q\2\2\u009f\u00a0\7d\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3"+
		"\7u\2\2\u00a3\u00a4\7<\2\2\u00a4\36\3\2\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7"+
		"\7w\2\2\u00a7\u00a8\7d\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7k\2\2\u00aa"+
		"\u00ab\7v\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7q\2\2"+
		"\u00ae\u00af\7<\2\2\u00af \3\2\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7v\2"+
		"\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6"+
		"\7q\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7<\2\2\u00b9"+
		"\"\3\2\2\2\u00ba\u00bb\7.\2\2\u00bb$\3\2\2\2\u00bc\u00bd\7g\2\2\u00bd"+
		"\u00be\7n\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7o\2\2\u00c0\u00c1\7g\2\2"+
		"\u00c1\u00c2\7p\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5"+
		"\7u\2\2\u00c5\u00c6\7<\2\2\u00c6&\3\2\2\2\u00c7\u00c8\7\61\2\2\u00c8\u00c9"+
		"\7\61\2\2\u00c9\u00cd\3\2\2\2\u00ca\u00cc\n\2\2\2\u00cb\u00ca\3\2\2\2"+
		"\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d1"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d2\7\17\2\2\u00d1\u00d0\3\2\2\2"+
		"\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00e2\7\f\2\2\u00d4\u00d5"+
		"\7\61\2\2\u00d5\u00d6\7,\2\2\u00d6\u00da\3\2\2\2\u00d7\u00d9\13\2\2\2"+
		"\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00db\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7,\2\2\u00de"+
		"\u00e2\7\61\2\2\u00df\u00e0\7^\2\2\u00e0\u00e2\7p\2\2\u00e1\u00c7\3\2"+
		"\2\2\u00e1\u00d4\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e4\b\24\2\2\u00e4(\3\2\2\2\u00e5\u00e9\7C\2\2\u00e6\u00e8\4\62;\2"+
		"\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea*\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00f0\7R\2\2\u00ed\u00ef"+
		"\4\62;\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1,\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f7\7Q\2\2\u00f4"+
		"\u00f6\4\62;\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8.\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fe"+
		"\7K\2\2\u00fb\u00fd\4\62;\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\60\3\2\2\2\u0100\u00fe\3\2\2"+
		"\2\u0101\u0105\t\3\2\2\u0102\u0104\t\4\2\2\u0103\u0102\3\2\2\2\u0104\u0107"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\62\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u010a\4\62;\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0113\3\2\2\2\u010d"+
		"\u010f\7\60\2\2\u010e\u0110\4\62;\2\u010f\u010e\3\2\2\2\u0110\u0111\3"+
		"\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113"+
		"\u010d\3\2\2\2\u0113\u0114\3\2\2\2\u0114\64\3\2\2\2\u0115\u0116\t\5\2"+
		"\2\u0116\u0117\3\2\2\2\u0117\u0118\b\33\2\2\u0118\66\3\2\2\2\u0119\u011e"+
		"\7$\2\2\u011a\u011d\59\35\2\u011b\u011d\n\6\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7$\2\2\u0122"+
		"8\3\2\2\2\u0123\u0124\7^\2\2\u0124\u0128\t\7\2\2\u0125\u0128\5=\37\2\u0126"+
		"\u0128\5;\36\2\u0127\u0123\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2"+
		"\2\2\u0128:\3\2\2\2\u0129\u012a\7^\2\2\u012a\u012b\4\62\65\2\u012b\u012c"+
		"\4\629\2\u012c\u0133\4\629\2\u012d\u012e\7^\2\2\u012e\u012f\4\629\2\u012f"+
		"\u0133\4\629\2\u0130\u0131\7^\2\2\u0131\u0133\4\629\2\u0132\u0129\3\2"+
		"\2\2\u0132\u012d\3\2\2\2\u0132\u0130\3\2\2\2\u0133<\3\2\2\2\u0134\u0135"+
		"\7^\2\2\u0135\u0136\7w\2\2\u0136\u0137\5? \2\u0137\u0138\5? \2\u0138\u0139"+
		"\5? \2\u0139\u013a\5? \2\u013a>\3\2\2\2\u013b\u013c\t\b\2\2\u013c@\3\2"+
		"\2\2\23\2\u00cd\u00d1\u00da\u00e1\u00e9\u00f0\u00f7\u00fe\u0105\u010b"+
		"\u0111\u0113\u011c\u011e\u0127\u0132\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}