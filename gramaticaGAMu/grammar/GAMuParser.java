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

        
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GAMuParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, COMMENT=20, IDA=21, IDP=22, IDO=23, IDI=24, 
		ID=25, INT=26, WS=27, STRING=28;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'tema:'", "'data:'", "'hora:'", "':'", "'titulo:'", 
		"'grupo:'", "'organizador:'", "'solo:'", "'#'", "'duracao-maxima:'", "'ano-letivo:'", 
		"'local:'", "'obras:'", "'subtitulo:'", "'atuacoes:'", "','", "'elementos:'", 
		"'-'", "COMMENT", "IDA", "IDP", "IDO", "IDI", "ID", "INT", "WS", "STRING"
	};
	public static final int
		RULE_audicao = 0, RULE_metaAud = 1, RULE_data = 2, RULE_hora = 3, RULE_duracao = 4, 
		RULE_atuacoes = 5, RULE_atuacao = 6, RULE_grupo = 7, RULE_solo = 8, RULE_obras = 9, 
		RULE_musicos = 10, RULE_musico = 11, RULE_idObra = 12, RULE_idProf = 13, 
		RULE_idAluno = 14, RULE_idInstrumento = 15;
	public static final String[] ruleNames = {
		"audicao", "metaAud", "data", "hora", "duracao", "atuacoes", "atuacao", 
		"grupo", "solo", "obras", "musicos", "musico", "idObra", "idProf", "idAluno", 
		"idInstrumento"
	};

	@Override
	public String getGrammarFileName() { return "GAMu.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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
	            
	        
	public GAMuParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AudicaoContext extends ParserRuleContext {
		public AtuacoesContext atuacoes() {
			return getRuleContext(AtuacoesContext.class,0);
		}
		public MetaAudContext metaAud() {
			return getRuleContext(MetaAudContext.class,0);
		}
		public AudicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_audicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).enterAudicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).exitAudicao(this);
		}
	}

	public final AudicaoContext audicao() throws RecognitionException {
		AudicaoContext _localctx = new AudicaoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_audicao);

		                   try{
		                      //STEP 2: Register JDBC driver
		                      Class.forName("com.mysql.jdbc.Driver");
		                      //STEP 3: Open a connection
		                      conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
		                      //STEP 4: Execute a query
		                      stmt = (Statement) conn.createStatement();
		                      
		                   }catch(SQLException se){
		                      //Handle errors for JDBC
		                      se.printStackTrace();
		                   }catch(Exception e){
		                      //Handle errors for Class.forName
		                      e.printStackTrace();
		                   }
		                   //iniciar a construcao do XML
		                   audicao_xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		                   
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); metaAud();
			audicao_xml.append("</metainfo><atuacoes>");
			setState(34); atuacoes();
			audicao_xml.append("</atuacoes></audicao>");
			}
			 
			                   Time audicao = new Time(total_audition_time * 1000);
			                   System.out.println("tempo total audicao: "+ audicao.toString());
			                   Time max = new Time(max_audition_time*1000);
			                   System.out.println("duracao-maxima: "+ max.toString());
			                   
			                    if(max_audition_time < total_audition_time){
			                        long dif = total_audition_time - max_audition_time - 3600;
			                        Time time = new Time(dif * 1000);
			                        System.out.println("tempo total ultrapasssa duracao estimada:<font color=\"red\"> +"+time.toString()+"</font>");
			                    }
			                    try{
			                        if(stmt!=null)
			                            stmt.close();
			                        if(conn!=null)
			                            conn.close();
			                    }catch(SQLException se){
			                      //Handle errors for JDBC
			                      se.printStackTrace();
			                    }
			                    
			                    
			                    //--------------XML---------------
			                    try {
			                        String filepath = "audition/"+anoLetivo +".xml";
			                        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			                        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			                        Document doc = docBuilder.parse(filepath);

			                        String xml = audicao_xml.toString();
			                        Document audi_xml = docBuilder.parse( new InputSource(new ByteArrayInputStream(xml.getBytes("utf-8")))); 

			                        Element basket = (Element) doc.getFirstChild();
			                        Element fruit = (Element) audi_xml.getFirstChild();

			                        // remover Nodo antigo
			                        XPathFactory xpf = XPathFactory.newInstance();
			                        XPath xpath = xpf.newXPath();
			                        XPathExpression expression = xpath.compile("//audicao[@id="+titulo+"]");
			                        Node audicao_antiga = (Node) expression.evaluate(doc, XPathConstants.NODE);
			                        if(audicao_antiga != null){
			                            audicao_antiga.getParentNode().removeChild(audicao_antiga);
			                        }

			                        // Adicionar novo novo
			                        Node imported = doc.importNode(fruit,true);
			                        basket.appendChild(imported);

			                        // write the content into xml file
			                        TransformerFactory transformerFactory = TransformerFactory.newInstance();
			                        Transformer transformer = transformerFactory.newTransformer();
			                        DOMSource source = new DOMSource(doc);
			                        StreamResult result = new StreamResult(new File(filepath));
			                        transformer.transform(source, result);


			                   } catch (ParserConfigurationException | TransformerException | IOException |XPathExpressionException | SAXException pce) {
			                        pce.printStackTrace();
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

	public static class MetaAudContext extends ParserRuleContext {
		public Token a1;
		public Token a2;
		public Token STRING;
		public HoraContext hora;
		public IdProfContext idProf;
		public DuracaoContext duracao;
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TerminalNode INT(int i) {
			return getToken(GAMuParser.INT, i);
		}
		public TerminalNode STRING(int i) {
			return getToken(GAMuParser.STRING, i);
		}
		public DuracaoContext duracao() {
			return getRuleContext(DuracaoContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(GAMuParser.STRING); }
		public IdProfContext idProf() {
			return getRuleContext(IdProfContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(GAMuParser.INT); }
		public HoraContext hora() {
			return getRuleContext(HoraContext.class,0);
		}
		public MetaAudContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metaAud; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).enterMetaAud(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).exitMetaAud(this);
		}
	}

	public final MetaAudContext metaAud() throws RecognitionException {
		MetaAudContext _localctx = new MetaAudContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_metaAud);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(T__7);
			setState(38); ((MetaAudContext)_localctx).a1 = match(INT);
			setState(39); match(T__18);
			setState(40); ((MetaAudContext)_localctx).a2 = match(INT);
			anoLetivo = (((MetaAudContext)_localctx).a1!=null?((MetaAudContext)_localctx).a1.getText():null)+"_"+(((MetaAudContext)_localctx).a2!=null?((MetaAudContext)_localctx).a2.getText():null);
			setState(42); match(T__13);
			setState(43); ((MetaAudContext)_localctx).STRING = match(STRING);

			                                    titulo = (((MetaAudContext)_localctx).STRING!=null?((MetaAudContext)_localctx).STRING.getText():null);
			                                    audicao_xml.append("<audicao id="+(((MetaAudContext)_localctx).STRING!=null?((MetaAudContext)_localctx).STRING.getText():null)+">");
			                                    audicao_xml.append("<metainfo>");
			                                  
			setState(48);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(45); match(T__4);
				setState(46); ((MetaAudContext)_localctx).STRING = match(STRING);
				audicao_xml.append("<subtitulo>"+(((MetaAudContext)_localctx).STRING!=null?((MetaAudContext)_localctx).STRING.getText():null)+"</subtitulo>");
				}
			}

			setState(53);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(50); match(T__17);
				setState(51); ((MetaAudContext)_localctx).STRING = match(STRING);
				audicao_xml.append("<tema>"+(((MetaAudContext)_localctx).STRING!=null?((MetaAudContext)_localctx).STRING.getText():null)+"</tema>");
				}
			}

			setState(55); match(T__16);
			setState(56); data();
			setState(57); match(T__15);
			setState(58); ((MetaAudContext)_localctx).hora = hora();
			 hora_de_inicio = ((MetaAudContext)_localctx).hora.seconds-3600;
			setState(60); match(T__6);
			setState(61); ((MetaAudContext)_localctx).STRING = match(STRING);
			audicao_xml.append("<local>"+(((MetaAudContext)_localctx).STRING!=null?((MetaAudContext)_localctx).STRING.getText():null)+"</local>");
			setState(63); match(T__11);
			setState(64); ((MetaAudContext)_localctx).idProf = idProf();

			                                         try{
			                                                String sql = "SELECT * FROM professor WHERE id='"+((MetaAudContext)_localctx).idProf.id+"'";
			                                                ResultSet rs = (ResultSet) stmt.executeQuery(sql);
			                                                if(rs.next()){
			                                                    audicao_xml.append("<organizador id=\""+((MetaAudContext)_localctx).idProf.id+"\">"+rs.getString("nome")+"</organizador>");
			                                                }else{
			                                                    System.out.print("line "+((MetaAudContext)_localctx).idProf.linha+" coluna: "+ ((MetaAudContext)_localctx).idProf.coluna);
			                                                    System.out.println("  professor: "+((MetaAudContext)_localctx).idProf.id+" nao existe");
			                                                }
			                                                rs.close();
			                                            }catch(SQLException se){
			                                                se.printStackTrace();
			                                            }
			                                      
			setState(66); match(T__8);
			setState(67); ((MetaAudContext)_localctx).duracao = duracao();

			                                            max_audition_time = ((MetaAudContext)_localctx).duracao.seconds-3600;
			                                          
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

	public static class DataContext extends ParserRuleContext {
		public Token dia;
		public Token mes;
		public Token ano;
		public TerminalNode INT(int i) {
			return getToken(GAMuParser.INT, i);
		}
		public List<TerminalNode> INT() { return getTokens(GAMuParser.INT); }
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).exitData(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); ((DataContext)_localctx).dia = match(INT);
			setState(71); match(T__0);
			setState(72); ((DataContext)_localctx).mes = match(INT);
			setState(73); match(T__0);
			setState(74); ((DataContext)_localctx).ano = match(INT);
			audicao_xml.append("<data>"+(((DataContext)_localctx).dia!=null?Integer.valueOf(((DataContext)_localctx).dia.getText()):0)+"/"+(((DataContext)_localctx).mes!=null?Integer.valueOf(((DataContext)_localctx).mes.getText()):0)+"/"+(((DataContext)_localctx).ano!=null?Integer.valueOf(((DataContext)_localctx).ano.getText()):0)+"</data>");
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

	public static class HoraContext extends ParserRuleContext {
		public int seconds;
		public Token horas;
		public Token minutos;
		public TerminalNode INT(int i) {
			return getToken(GAMuParser.INT, i);
		}
		public List<TerminalNode> INT() { return getTokens(GAMuParser.INT); }
		public HoraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hora; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).enterHora(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).exitHora(this);
		}
	}

	public final HoraContext hora() throws RecognitionException {
		HoraContext _localctx = new HoraContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_hora);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); ((HoraContext)_localctx).horas = match(INT);
			setState(78); match(T__14);
			setState(79); ((HoraContext)_localctx).minutos = match(INT);

			                                            ((HoraContext)_localctx).seconds =  ((((HoraContext)_localctx).horas!=null?Integer.valueOf(((HoraContext)_localctx).horas.getText()):0)*60*60 + (((HoraContext)_localctx).minutos!=null?Integer.valueOf(((HoraContext)_localctx).minutos.getText()):0)*60);
			                                            audicao_xml.append("<hora>"+(((HoraContext)_localctx).horas!=null?Integer.valueOf(((HoraContext)_localctx).horas.getText()):0)+":"+(((HoraContext)_localctx).minutos!=null?Integer.valueOf(((HoraContext)_localctx).minutos.getText()):0)+"</hora>");
			                                        
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

	public static class DuracaoContext extends ParserRuleContext {
		public int seconds;
		public Token horas;
		public Token minutos;
		public TerminalNode INT(int i) {
			return getToken(GAMuParser.INT, i);
		}
		public List<TerminalNode> INT() { return getTokens(GAMuParser.INT); }
		public DuracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).enterDuracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).exitDuracao(this);
		}
	}

	public final DuracaoContext duracao() throws RecognitionException {
		DuracaoContext _localctx = new DuracaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_duracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); ((DuracaoContext)_localctx).horas = match(INT);
			setState(83); match(T__14);
			setState(84); ((DuracaoContext)_localctx).minutos = match(INT);

			                                            ((DuracaoContext)_localctx).seconds =  ((((DuracaoContext)_localctx).horas!=null?Integer.valueOf(((DuracaoContext)_localctx).horas.getText()):0)*60*60 + (((DuracaoContext)_localctx).minutos!=null?Integer.valueOf(((DuracaoContext)_localctx).minutos.getText()):0)*60);
			                                            audicao_xml.append("<duracao>"+(((DuracaoContext)_localctx).horas!=null?Integer.valueOf(((DuracaoContext)_localctx).horas.getText()):0)+":"+(((DuracaoContext)_localctx).minutos!=null?Integer.valueOf(((DuracaoContext)_localctx).minutos.getText()):0)+"</duracao>");
			                                        
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

	public static class AtuacoesContext extends ParserRuleContext {
		public long tempo;
		public AtuacaoContext atuacao;
		public AtuacaoContext atuacao(int i) {
			return getRuleContext(AtuacaoContext.class,i);
		}
		public List<AtuacaoContext> atuacao() {
			return getRuleContexts(AtuacaoContext.class);
		}
		public AtuacoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atuacoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).enterAtuacoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).exitAtuacoes(this);
		}
	}

	public final AtuacoesContext atuacoes() throws RecognitionException {
		AtuacoesContext _localctx = new AtuacoesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atuacoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(T__3);
			setState(88); ((AtuacoesContext)_localctx).atuacao = atuacao(_localctx.tempo-3600);
			((AtuacoesContext)_localctx).tempo =  ((AtuacoesContext)_localctx).atuacao.tempo;
			setState(90); match(T__9);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__10) {
				{
				{
				setState(91); ((AtuacoesContext)_localctx).atuacao = atuacao(_localctx.tempo);
				((AtuacoesContext)_localctx).tempo =  ((AtuacoesContext)_localctx).atuacao.tempo;
				setState(93); match(T__9);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			total_audition_time = _localctx.tempo;
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

	public static class AtuacaoContext extends ParserRuleContext {
		public long tempoIn;
		public long tempo;
		public GrupoContext grupo;
		public SoloContext solo;
		public SoloContext solo() {
			return getRuleContext(SoloContext.class,0);
		}
		public GrupoContext grupo() {
			return getRuleContext(GrupoContext.class,0);
		}
		public AtuacaoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AtuacaoContext(ParserRuleContext parent, int invokingState, long tempoIn) {
			super(parent, invokingState);
			this.tempoIn = tempoIn;
		}
		@Override public int getRuleIndex() { return RULE_atuacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).enterAtuacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).exitAtuacao(this);
		}
	}

	public final AtuacaoContext atuacao(long tempoIn) throws RecognitionException {
		AtuacaoContext _localctx = new AtuacaoContext(_ctx, getState(), tempoIn);
		enterRule(_localctx, 12, RULE_atuacao);
		try {
			setState(110);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				audicao_xml.append("<atuacao tipo=\"grupo\">");
				setState(103); ((AtuacaoContext)_localctx).grupo = grupo(_localctx.tempoIn);

				                                    ((AtuacaoContext)_localctx).tempo = ((AtuacaoContext)_localctx).grupo.tempo;
				                                    audicao_xml.append("</atuacao>");
				                                
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				audicao_xml.append("<atuacao tipo=\"solo\">");
				setState(107); ((AtuacaoContext)_localctx).solo = solo(_localctx.tempoIn);

				                                    ((AtuacaoContext)_localctx).tempo = ((AtuacaoContext)_localctx).solo.tempo;
				                                    audicao_xml.append("</atuacao>");
				                                
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

	public static class GrupoContext extends ParserRuleContext {
		public long tempoIn;
		public long tempo;
		public Token STRING;
		public ObrasContext obras;
		public ObrasContext obras() {
			return getRuleContext(ObrasContext.class,0);
		}
		public MusicosContext musicos() {
			return getRuleContext(MusicosContext.class,0);
		}
		public TerminalNode STRING() { return getToken(GAMuParser.STRING, 0); }
		public GrupoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public GrupoContext(ParserRuleContext parent, int invokingState, long tempoIn) {
			super(parent, invokingState);
			this.tempoIn = tempoIn;
		}
		@Override public int getRuleIndex() { return RULE_grupo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).enterGrupo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).exitGrupo(this);
		}
	}

	public final GrupoContext grupo(long tempoIn) throws RecognitionException {
		GrupoContext _localctx = new GrupoContext(_ctx, getState(), tempoIn);
		enterRule(_localctx, 14, RULE_grupo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(T__12);
			setState(113); ((GrupoContext)_localctx).STRING = match(STRING);

			                                    audicao_xml.append("<nome_grupo>"+(((GrupoContext)_localctx).STRING!=null?((GrupoContext)_localctx).STRING.getText():null)+"</nome_grupo>");
			                                    Time hora_ini = new Time( (hora_de_inicio +_localctx.tempoIn ) * 1000);
			                                    audicao_xml.append("<hora_inicio>"+hora_ini.toString()+"</hora_inicio>");
			                                
			setState(115); match(T__1);
			audicao_xml.append("<musicos>");
			setState(117); musicos();
			audicao_xml.append("</musicos>");
			setState(119); match(T__5);
			audicao_xml.append("<obras>");
			setState(121); ((GrupoContext)_localctx).obras = obras(_localctx.tempoIn);
			audicao_xml.append("</obras>");((GrupoContext)_localctx).tempo =  ((GrupoContext)_localctx).obras.tempo;
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

	public static class SoloContext extends ParserRuleContext {
		public long tempoIn;
		public long tempo;
		public ObrasContext obras;
		public ObrasContext obras() {
			return getRuleContext(ObrasContext.class,0);
		}
		public MusicoContext musico() {
			return getRuleContext(MusicoContext.class,0);
		}
		public SoloContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SoloContext(ParserRuleContext parent, int invokingState, long tempoIn) {
			super(parent, invokingState);
			this.tempoIn = tempoIn;
		}
		@Override public int getRuleIndex() { return RULE_solo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).enterSolo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).exitSolo(this);
		}
	}

	public final SoloContext solo(long tempoIn) throws RecognitionException {
		SoloContext _localctx = new SoloContext(_ctx, getState(), tempoIn);
		enterRule(_localctx, 16, RULE_solo);
		try {
			enterOuterAlt(_localctx, 1);
			{

			                    Time hora_ini = new Time( (hora_de_inicio +_localctx.tempoIn) * 1000);
			                    audicao_xml.append("<hora_inicio>"+hora_ini.toString()+"</hora_inicio>");
			                
			setState(125); match(T__10);
			audicao_xml.append("<musicos>");
			setState(127); musico();
			audicao_xml.append("</musicos>");
			setState(129); match(T__5);
			audicao_xml.append("<obras>");
			setState(131); ((SoloContext)_localctx).obras = obras(_localctx.tempoIn);
			audicao_xml.append("</obras>");((SoloContext)_localctx).tempo =  ((SoloContext)_localctx).obras.tempo;
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

	public static class ObrasContext extends ParserRuleContext {
		public long tempoIn;
		public long tempo;
		public IdObraContext idObra;
		public List<IdObraContext> idObra() {
			return getRuleContexts(IdObraContext.class);
		}
		public IdObraContext idObra(int i) {
			return getRuleContext(IdObraContext.class,i);
		}
		public ObrasContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ObrasContext(ParserRuleContext parent, int invokingState, long tempoIn) {
			super(parent, invokingState);
			this.tempoIn = tempoIn;
		}
		@Override public int getRuleIndex() { return RULE_obras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).enterObras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).exitObras(this);
		}
	}

	public final ObrasContext obras(long tempoIn) throws RecognitionException {
		ObrasContext _localctx = new ObrasContext(_ctx, getState(), tempoIn);
		enterRule(_localctx, 18, RULE_obras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); ((ObrasContext)_localctx).idObra = idObra();
			 
			                            try{
			                                String sql = "SELECT * FROM obra WHERE id='"+((ObrasContext)_localctx).idObra.id+"'";
			                                ResultSet rs = (ResultSet) stmt.executeQuery(sql);
			                                if(rs.next()){
			                                    _localctx.tempo += rs.getTime("duracao").toLocalTime().toSecondOfDay();
			                                    _localctx.tempo += _localctx.tempoIn;
			                                    if(_localctx.tempo>max_audition_time){
			                                        System.out.println(" obra: "+((ObrasContext)_localctx).idObra.id+" tempo _max ultrapassado");
			                                    }else{
			                                        audicao_xml.append("<obra id=\""+((ObrasContext)_localctx).idObra.id+"\">");
			                                        audicao_xml.append("<nome>"+rs.getString("nome")+"</nome>");
			                                        audicao_xml.append("<duracao>"+rs.getString("duracao")+"</duracao>");
			                                        audicao_xml.append("</obra>");
			                                    }
			                                }else{
			                                    System.out.print("line "+((ObrasContext)_localctx).idObra.linha);
			                                    System.out.println(" obra: "+((ObrasContext)_localctx).idObra.id+" nao existe");
			                                }
			                                rs.close();
			                            }catch(SQLException se){
			                                se.printStackTrace();
			                            }
			                        
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(136); match(T__2);
				setState(137); ((ObrasContext)_localctx).idObra = idObra();

				                                try{
				                                    String sql = "SELECT * FROM obra WHERE id='"+((ObrasContext)_localctx).idObra.id+"'";
				                                    ResultSet rs = (ResultSet) stmt.executeQuery(sql);
				                                    if(rs.next()){
				                                        _localctx.tempo += rs.getTime("duracao").toLocalTime().toSecondOfDay();
				                                        if(_localctx.tempo>max_audition_time){
				                                            System.out.println(" obra: "+((ObrasContext)_localctx).idObra.id+" tempo _max ultrapassado");
				                                        }else{
				                                            audicao_xml.append("<obra id=\""+((ObrasContext)_localctx).idObra.id+"\">");
				                                            audicao_xml.append("<nome>"+rs.getString("nome")+"</nome>");
				                                            audicao_xml.append("<duracao>"+rs.getString("duracao")+"</duracao>");
				                                            audicao_xml.append("</obra>");
				                                        }
				                                    }else{
				                                        System.out.print("line "+((ObrasContext)_localctx).idObra.linha);
				                                        System.out.println(" obra: "+((ObrasContext)_localctx).idObra.id+" nao existe");
				                                    }
				                                    rs.close();
				                                }catch(SQLException se){
				                                    se.printStackTrace();
				                                }
				                            
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MusicosContext extends ParserRuleContext {
		public MusicoContext musico(int i) {
			return getRuleContext(MusicoContext.class,i);
		}
		public List<MusicoContext> musico() {
			return getRuleContexts(MusicoContext.class);
		}
		public MusicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_musicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).enterMusicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).exitMusicos(this);
		}
	}

	public final MusicosContext musicos() throws RecognitionException {
		MusicosContext _localctx = new MusicosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_musicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); musico();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDA || _la==IDP) {
				{
				{
				setState(146); musico();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MusicoContext extends ParserRuleContext {
		public IdAlunoContext idAluno;
		public IdInstrumentoContext idInstrumento;
		public IdProfContext idProf;
		public IdInstrumentoContext idInstrumento() {
			return getRuleContext(IdInstrumentoContext.class,0);
		}
		public IdProfContext idProf() {
			return getRuleContext(IdProfContext.class,0);
		}
		public IdAlunoContext idAluno() {
			return getRuleContext(IdAlunoContext.class,0);
		}
		public MusicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_musico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).enterMusico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).exitMusico(this);
		}
	}

	public final MusicoContext musico() throws RecognitionException {
		MusicoContext _localctx = new MusicoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_musico);
		try {
			setState(162);
			switch (_input.LA(1)) {
			case IDA:
				enterOuterAlt(_localctx, 1);
				{
				setState(152); ((MusicoContext)_localctx).idAluno = idAluno();
				setState(153); match(T__2);
				setState(154); ((MusicoContext)_localctx).idInstrumento = idInstrumento();

				                                            audicao_xml.append("<musico tipo=\"aluno\" id=\""+((MusicoContext)_localctx).idAluno.id+"\">");
				                                            try{
				                                                String sql = "SELECT * FROM aluno WHERE id='"+((MusicoContext)_localctx).idAluno.id+"'";
				                                                ResultSet rs = (ResultSet) stmt.executeQuery(sql);
				                                                if(rs.next()){
				                                                    String nome_aluno = rs.getString("nome");
				                                                    sql = "SELECT * FROM instrumento WHERE id='"+((MusicoContext)_localctx).idInstrumento.id+"'";
				                                                    rs = (ResultSet) stmt.executeQuery(sql);
				                                                    if(rs.next()){
				                                                        //aluno sabe tocar instrumento?
				                                                        String designacao_instrumento = rs.getString("designacao");
				                                                        sql = "SELECT * FROM aluno_instrumento WHERE id_aluno='"+((MusicoContext)_localctx).idAluno.id+"' AND id_instrumento='"+((MusicoContext)_localctx).idInstrumento.id+"'";
				                                                        rs = (ResultSet) stmt.executeQuery(sql);
				                                                        if(rs.next()){
				                                                            //OK
				                                                            audicao_xml.append("<nome>"+nome_aluno+"</nome>");
				                                                            audicao_xml.append("<instrumento id=\""+((MusicoContext)_localctx).idInstrumento.id+"\">"+designacao_instrumento+"</instrumento>");
				                                                        }else{
				                                                            System.out.print("line "+((MusicoContext)_localctx).idAluno.linha);
				                                                            System.out.print(" (aluno: "+((MusicoContext)_localctx).idAluno.id+" - "+ nome_aluno+")" );
				                                                            System.out.println(" nao tem habilitacoes para ("+((MusicoContext)_localctx).idInstrumento.id+" - "+ designacao_instrumento+")");
				                                                        }
				                                                        //posso guardar as informações do instrumento
				                                                    }else{
				                                                        System.out.print("line "+((MusicoContext)_localctx).idInstrumento.linha);
				                                                        System.out.println("  instrumento: "+((MusicoContext)_localctx).idInstrumento.id+" nao existe");   
				                                                    }
				                                                    //posso guardar as informações do aluno
				                                                    //guardar info do aluno
				                                                }else{
				                                                    System.out.print("line "+((MusicoContext)_localctx).idAluno.linha);
				                                                    System.out.println("  aluno: "+((MusicoContext)_localctx).idAluno.id+" nao existe");   
				                                                }
				                                                rs.close();
				                                            }catch(SQLException se){
				                                                se.printStackTrace();
				                                            }
				                                            audicao_xml.append("</musico>");
				                                         
				}
				break;
			case IDP:
				enterOuterAlt(_localctx, 2);
				{
				setState(157); ((MusicoContext)_localctx).idProf = idProf();
				setState(158); match(T__2);
				setState(159); ((MusicoContext)_localctx).idInstrumento = idInstrumento();

				                                            audicao_xml.append("<musico tipo=\"professor\" id=\""+((MusicoContext)_localctx).idProf.id+"\">");
				                                            try{
				                                                String sql = "SELECT * FROM professor WHERE id='"+((MusicoContext)_localctx).idProf.id+"'";
				                                                ResultSet rs = (ResultSet) stmt.executeQuery(sql);
				                                                if(rs.next()){
				                                                    String nome_prof = rs.getString("nome");
				                                                    sql = "SELECT * FROM instrumento WHERE id='"+((MusicoContext)_localctx).idInstrumento.id+"'";
				                                                    rs = (ResultSet) stmt.executeQuery(sql);
				                                                    if(rs.next()){
				                                                        //professor sabe tocar instrumento?
				                                                        String designacao_instrumento = rs.getString("designacao");
				                                                        sql = "SELECT * FROM professor INNER JOIN professor_habilitacao ON professor.id=professor_habilitacao.id_professor INNER JOIN habilitacao ON professor_habilitacao.id_habilitacao=habilitacao.id WHERE professor.id = '"+((MusicoContext)_localctx).idProf.id+"'AND id_instrumento='"+((MusicoContext)_localctx).idInstrumento.id+"'";                  
				                                                        rs = (ResultSet) stmt.executeQuery(sql);
				                                                        if(rs.next()){
				                                                            //OK
				                                                            audicao_xml.append("<nome>"+nome_prof+"</nome>");
				                                                            audicao_xml.append("<instrumento id=\""+((MusicoContext)_localctx).idInstrumento.id+"\">"+designacao_instrumento+"</instrumento>");
				                                                        }else{
				                                                            System.out.print("line "+((MusicoContext)_localctx).idProf.linha);
				                                                            System.out.print(" (professor: "+((MusicoContext)_localctx).idProf.id+" - "+ nome_prof+")" );
				                                                            System.out.println(" nao tem habilitacoes para ("+((MusicoContext)_localctx).idInstrumento.id+" - "+ designacao_instrumento+")");
				                                                        }
				                                                        //posso guardar as informações do instrumento
				                                                    }else{
				                                                        System.out.print("line "+((MusicoContext)_localctx).idInstrumento.linha);
				                                                        System.out.println("  instrumento: "+((MusicoContext)_localctx).idInstrumento.id+" nao existe");   
				                                                    }
				                                                    //posso guardar as informações do aluno
				                                                    //guardar info do aluno
				                                                }else{
				                                                    System.out.print("line "+((MusicoContext)_localctx).idProf.linha);
				                                                    System.out.println("  professor: "+((MusicoContext)_localctx).idProf.id+" nao existe");   
				                                                }
				                                                rs.close();
				                                            }catch(SQLException se){
				                                                se.printStackTrace();
				                                            }
				                                            audicao_xml.append("</musico>");
				                                         
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

	public static class IdObraContext extends ParserRuleContext {
		public String id;
		public int linha;
		public int coluna;
		public Token IDO;
		public TerminalNode IDO() { return getToken(GAMuParser.IDO, 0); }
		public IdObraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idObra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).enterIdObra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).exitIdObra(this);
		}
	}

	public final IdObraContext idObra() throws RecognitionException {
		IdObraContext _localctx = new IdObraContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_idObra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); ((IdObraContext)_localctx).IDO = match(IDO);
			   ((IdObraContext)_localctx).id =  (((IdObraContext)_localctx).IDO!=null?((IdObraContext)_localctx).IDO.getText():null);
			                                                            ((IdObraContext)_localctx).linha =  ((IdObraContext)_localctx).IDO.getLine();
			                                                            ((IdObraContext)_localctx).coluna =  ((IdObraContext)_localctx).IDO.getCharPositionInLine();
			                                                        
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

	public static class IdProfContext extends ParserRuleContext {
		public String id;
		public int linha;
		public int coluna;
		public Token IDP;
		public TerminalNode IDP() { return getToken(GAMuParser.IDP, 0); }
		public IdProfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idProf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).enterIdProf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).exitIdProf(this);
		}
	}

	public final IdProfContext idProf() throws RecognitionException {
		IdProfContext _localctx = new IdProfContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_idProf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); ((IdProfContext)_localctx).IDP = match(IDP);
			   ((IdProfContext)_localctx).id =  (((IdProfContext)_localctx).IDP!=null?((IdProfContext)_localctx).IDP.getText():null);
			                                                            ((IdProfContext)_localctx).linha =  ((IdProfContext)_localctx).IDP.getLine();
			                                                            ((IdProfContext)_localctx).coluna =  ((IdProfContext)_localctx).IDP.getCharPositionInLine();
			                                                        
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

	public static class IdAlunoContext extends ParserRuleContext {
		public String id;
		public int linha;
		public int coluna;
		public Token IDA;
		public TerminalNode IDA() { return getToken(GAMuParser.IDA, 0); }
		public IdAlunoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idAluno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).enterIdAluno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).exitIdAluno(this);
		}
	}

	public final IdAlunoContext idAluno() throws RecognitionException {
		IdAlunoContext _localctx = new IdAlunoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_idAluno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); ((IdAlunoContext)_localctx).IDA = match(IDA);
			   ((IdAlunoContext)_localctx).id =  (((IdAlunoContext)_localctx).IDA!=null?((IdAlunoContext)_localctx).IDA.getText():null);
			                                                            ((IdAlunoContext)_localctx).linha =  ((IdAlunoContext)_localctx).IDA.getLine();
			                                                            ((IdAlunoContext)_localctx).coluna =  ((IdAlunoContext)_localctx).IDA.getCharPositionInLine();
			                                                        
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

	public static class IdInstrumentoContext extends ParserRuleContext {
		public String id;
		public int linha;
		public int coluna;
		public Token IDI;
		public TerminalNode IDI() { return getToken(GAMuParser.IDI, 0); }
		public IdInstrumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idInstrumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).enterIdInstrumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).exitIdInstrumento(this);
		}
	}

	public final IdInstrumentoContext idInstrumento() throws RecognitionException {
		IdInstrumentoContext _localctx = new IdInstrumentoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_idInstrumento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); ((IdInstrumentoContext)_localctx).IDI = match(IDI);
			   ((IdInstrumentoContext)_localctx).id =  (((IdInstrumentoContext)_localctx).IDI!=null?((IdInstrumentoContext)_localctx).IDI.getText():null);
			                                                                    ((IdInstrumentoContext)_localctx).linha =  ((IdInstrumentoContext)_localctx).IDI.getLine();
			                                                                    ((IdInstrumentoContext)_localctx).coluna =  ((IdInstrumentoContext)_localctx).IDI.getCharPositionInLine();
			                                                                
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36\u00b3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\63\n\3\3"+
		"\3\3\3\3\3\5\38\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7b\n\7\f\7\16\7e\13\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bq\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\7\13\u008f\n\13\f\13\16\13\u0092\13\13\3\f\3\f"+
		"\7\f\u0096\n\f\f\f\16\f\u0099\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u00a5\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\u00a9"+
		"\2\"\3\2\2\2\4\'\3\2\2\2\6H\3\2\2\2\bO\3\2\2\2\nT\3\2\2\2\fY\3\2\2\2\16"+
		"p\3\2\2\2\20r\3\2\2\2\22~\3\2\2\2\24\u0088\3\2\2\2\26\u0093\3\2\2\2\30"+
		"\u00a4\3\2\2\2\32\u00a6\3\2\2\2\34\u00a9\3\2\2\2\36\u00ac\3\2\2\2 \u00af"+
		"\3\2\2\2\"#\5\4\3\2#$\b\2\1\2$%\5\f\7\2%&\b\2\1\2&\3\3\2\2\2\'(\7\16\2"+
		"\2()\7\34\2\2)*\7\3\2\2*+\7\34\2\2+,\b\3\1\2,-\7\b\2\2-.\7\36\2\2.\62"+
		"\b\3\1\2/\60\7\21\2\2\60\61\7\36\2\2\61\63\b\3\1\2\62/\3\2\2\2\62\63\3"+
		"\2\2\2\63\67\3\2\2\2\64\65\7\4\2\2\65\66\7\36\2\2\668\b\3\1\2\67\64\3"+
		"\2\2\2\678\3\2\2\289\3\2\2\29:\7\5\2\2:;\5\6\4\2;<\7\6\2\2<=\5\b\5\2="+
		">\b\3\1\2>?\7\17\2\2?@\7\36\2\2@A\b\3\1\2AB\7\n\2\2BC\5\34\17\2CD\b\3"+
		"\1\2DE\7\r\2\2EF\5\n\6\2FG\b\3\1\2G\5\3\2\2\2HI\7\34\2\2IJ\7\25\2\2JK"+
		"\7\34\2\2KL\7\25\2\2LM\7\34\2\2MN\b\4\1\2N\7\3\2\2\2OP\7\34\2\2PQ\7\7"+
		"\2\2QR\7\34\2\2RS\b\5\1\2S\t\3\2\2\2TU\7\34\2\2UV\7\7\2\2VW\7\34\2\2W"+
		"X\b\6\1\2X\13\3\2\2\2YZ\7\22\2\2Z[\5\16\b\2[\\\b\7\1\2\\c\7\f\2\2]^\5"+
		"\16\b\2^_\b\7\1\2_`\7\f\2\2`b\3\2\2\2a]\3\2\2\2be\3\2\2\2ca\3\2\2\2cd"+
		"\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\b\7\1\2g\r\3\2\2\2hi\b\b\1\2ij\5\20\t\2"+
		"jk\b\b\1\2kq\3\2\2\2lm\b\b\1\2mn\5\22\n\2no\b\b\1\2oq\3\2\2\2ph\3\2\2"+
		"\2pl\3\2\2\2q\17\3\2\2\2rs\7\t\2\2st\7\36\2\2tu\b\t\1\2uv\7\24\2\2vw\b"+
		"\t\1\2wx\5\26\f\2xy\b\t\1\2yz\7\20\2\2z{\b\t\1\2{|\5\24\13\2|}\b\t\1\2"+
		"}\21\3\2\2\2~\177\b\n\1\2\177\u0080\7\13\2\2\u0080\u0081\b\n\1\2\u0081"+
		"\u0082\5\30\r\2\u0082\u0083\b\n\1\2\u0083\u0084\7\20\2\2\u0084\u0085\b"+
		"\n\1\2\u0085\u0086\5\24\13\2\u0086\u0087\b\n\1\2\u0087\23\3\2\2\2\u0088"+
		"\u0089\5\32\16\2\u0089\u0090\b\13\1\2\u008a\u008b\7\23\2\2\u008b\u008c"+
		"\5\32\16\2\u008c\u008d\b\13\1\2\u008d\u008f\3\2\2\2\u008e\u008a\3\2\2"+
		"\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\25"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0097\5\30\r\2\u0094\u0096\5\30\r\2"+
		"\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\27\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\5\36\20\2\u009b"+
		"\u009c\7\23\2\2\u009c\u009d\5 \21\2\u009d\u009e\b\r\1\2\u009e\u00a5\3"+
		"\2\2\2\u009f\u00a0\5\34\17\2\u00a0\u00a1\7\23\2\2\u00a1\u00a2\5 \21\2"+
		"\u00a2\u00a3\b\r\1\2\u00a3\u00a5\3\2\2\2\u00a4\u009a\3\2\2\2\u00a4\u009f"+
		"\3\2\2\2\u00a5\31\3\2\2\2\u00a6\u00a7\7\31\2\2\u00a7\u00a8\b\16\1\2\u00a8"+
		"\33\3\2\2\2\u00a9\u00aa\7\30\2\2\u00aa\u00ab\b\17\1\2\u00ab\35\3\2\2\2"+
		"\u00ac\u00ad\7\27\2\2\u00ad\u00ae\b\20\1\2\u00ae\37\3\2\2\2\u00af\u00b0"+
		"\7\32\2\2\u00b0\u00b1\b\21\1\2\u00b1!\3\2\2\2\t\62\67cp\u0090\u0097\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}