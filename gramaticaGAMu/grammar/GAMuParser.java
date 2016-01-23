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
        import javax.xml.transform.OutputKeys;
        
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
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, COMMENT=19, ID_ALUNO=20, ID_PROFESSOR=21, ID_OBRA=22, 
		ID_INSTRUMENTO=23, ID=24, INT=25, WS=26, STRING=27;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'tema:'", "'data:'", "'hora:'", "':'", "'titulo:'", 
		"'grupo:'", "'organizador:'", "'solo:'", "'#'", "'duracao-maxima:'", "'ano-letivo:'", 
		"'local:'", "'obras:'", "'subtitulo:'", "'atuacoes:'", "','", "'elementos:'", 
		"COMMENT", "ID_ALUNO", "ID_PROFESSOR", "ID_OBRA", "ID_INSTRUMENTO", "ID", 
		"INT", "WS", "STRING"
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
	            String DB_URL = "jdbc:mysql://127.0.0.1:3306/gamu??useUnicode=true&characterEncoding=UTF-8";
	            // Database credentials
	            String USER = "root";
	            String PASS = "qweqwe";
	            // Database connection
	            Connection conn = null;
	            Statement stmt = null;
	            
	            // Grammar variables 
	            
	            /** flag!=0, ocorreu erro semantico.*/
	            private int flag = 0;
	            
	            public int getFlag(){
	                return this.flag;
	            }
	            
	        
	public GAMuParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AudicaoContext extends ParserRuleContext {
		public MetaAudContext metaAud;
		public AtuacoesContext atuacoes;
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
		                      //    se.printStackTrace();
		                   }catch(Exception e){
		                      //Handle errors for Class.forName
		                      //e.printStackTrace();
		                   }
		                   //iniciar a construcao do XML
		                   StringBuilder audicao_xml = new StringBuilder();
		                   audicao_xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		                   
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); ((AudicaoContext)_localctx).metaAud = metaAud(audicao_xml);

			                 //titulo = ((AudicaoContext)_localctx).metaAud.titulo_aud;
			                 String anoLetivo = ((AudicaoContext)_localctx).metaAud.ano_letivo;
			                 audicao_xml = ((AudicaoContext)_localctx).metaAud.xmlOut;
			                 if(audicao_xml != null){
			                    audicao_xml.append("</metainfo>\n<atuacoes>\n");
			                 }else{
			                    audicao_xml = new StringBuilder();
			                 }
			                 
			                
			setState(34); ((AudicaoContext)_localctx).atuacoes = atuacoes(audicao_xml, ((AudicaoContext)_localctx).metaAud.hora_inicio, ((AudicaoContext)_localctx).metaAud.tempo_max_aud);

			                   Time audicao = new Time(((AudicaoContext)_localctx).atuacoes.tempo * 1000);
			                   System.out.println("tempo total audicao: "+ audicao.toString());
			                   Time max = new Time(((AudicaoContext)_localctx).metaAud.tempo_max_aud*1000);
			                   System.out.println("duracao-maxima: "+ max.toString());
			                   
			                    if(((AudicaoContext)_localctx).metaAud.tempo_max_aud < ((AudicaoContext)_localctx).atuacoes.tempo){
			                        long dif = ((AudicaoContext)_localctx).atuacoes.tempo - ((AudicaoContext)_localctx).metaAud.tempo_max_aud - 3600;
			                        Time time = new Time(dif * 1000);
			                        System.out.println("tempo total ultrapasssa duracao estimada:<font color=\"red\"> +"+time.toString()+"</font>");
			                    }
			                    audicao_xml = ((AudicaoContext)_localctx).atuacoes.xmlOut;
			                    if(audicao_xml != null){
			                        audicao_xml.append("</atuacoes>\n</audicao>");
			                    }else{
			                        audicao_xml = new StringBuilder();
			                    }
			                        
			                    //--------------XML---------------
			                    //audicao valida?
			                    
			                    if(anoLetivo!=null && flag!=1){
			                    try {
			                        String filepath = "C:\\xampp\\htdocs\\site\\files\\auditions\\"+anoLetivo+".xml";
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
			                        XPathExpression expression = xpath.compile("//audicao[@id="+((AudicaoContext)_localctx).metaAud.titulo_aud+"]");
			                        Node audicao_antiga = (Node) expression.evaluate(doc, XPathConstants.NODE);
			                        if(audicao_antiga != null){
			                            audicao_antiga.getParentNode().removeChild(audicao_antiga);
			                        }

			                        // Adicionar nova audicao
			                        Node imported = doc.importNode(fruit,true);
			                        basket.appendChild(imported);

			                        // write the content into xml file
			                        TransformerFactory transformerFactory = TransformerFactory.newInstance();
			                        Transformer transformer = transformerFactory.newTransformer();
			                        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			                        DOMSource source = new DOMSource(doc);
			                        StreamResult result = new StreamResult(new File(filepath));
			                        transformer.transform(source, result);

			                   } catch (ParserConfigurationException | TransformerException | IOException |XPathExpressionException | SAXException pce) {
			                        //pce.printStackTrace();
			                        System.out.println("erro - nao foi possivel guardar audicao");
			                   }
			                    }else{
			                        System.out.println("Planeamento da Audicao contem erros, alteracoes ignoradas.");
			                    }
			                
			}

			                    try{
			                        if(stmt!=null)
			                            stmt.close();
			                        if(conn!=null)
			                            conn.close();
			                    }catch(SQLException se){
			                      //Handle errors for JDBC
			                      //se.printStackTrace();
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
		public StringBuilder xmlIn;
		public String titulo_aud;
		public String ano_letivo;
		public StringBuilder xmlOut;
		public long hora_inicio;
		public int tempo_max_aud;
		public IdProfContext id_prof;
		public Token a1;
		public Token a2;
		public Token STRING;
		public HoraContext hora;
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
		public MetaAudContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MetaAudContext(ParserRuleContext parent, int invokingState, StringBuilder xmlIn) {
			super(parent, invokingState);
			this.xmlIn = xmlIn;
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

	public final MetaAudContext metaAud(StringBuilder xmlIn) throws RecognitionException {
		MetaAudContext _localctx = new MetaAudContext(_ctx, getState(), xmlIn);
		enterRule(_localctx, 2, RULE_metaAud);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(T__10);
			setState(38); ((MetaAudContext)_localctx).id_prof = idProf();
			setState(39); match(T__6);
			setState(40); ((MetaAudContext)_localctx).a1 = match(INT);
			setState(41); match(T__17);
			setState(42); ((MetaAudContext)_localctx).a2 = match(INT);
			((MetaAudContext)_localctx).ano_letivo =  (((MetaAudContext)_localctx).a1!=null?((MetaAudContext)_localctx).a1.getText():null)+"_"+(((MetaAudContext)_localctx).a2!=null?((MetaAudContext)_localctx).a2.getText():null);
			setState(44); match(T__12);
			setState(45); ((MetaAudContext)_localctx).STRING = match(STRING);
			 
			                                    ((MetaAudContext)_localctx).titulo_aud =  (((MetaAudContext)_localctx).STRING!=null?((MetaAudContext)_localctx).STRING.getText():null);
			                                    _localctx.xmlIn.append("\n<audicao id="+(((MetaAudContext)_localctx).STRING!=null?((MetaAudContext)_localctx).STRING.getText():null)+">");
			                                    _localctx.xmlIn.append("\n<metainfo>");
			                                    try{
			                                            String sql = "SELECT * FROM professor WHERE id='"+((MetaAudContext)_localctx).id_prof.id+"'";
			                                            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
			                                            if(rs.next()){
			                                                _localctx.xmlIn.append("<organizador id=\""+((MetaAudContext)_localctx).id_prof.id+"\">"+rs.getString("nome")+"</organizador>\n");
			                                            }else{
			                                                System.out.print("line "+((MetaAudContext)_localctx).id_prof.linha+" coluna: "+ ((MetaAudContext)_localctx).id_prof.coluna);
			                                                System.out.println("  professor: "+((MetaAudContext)_localctx).id_prof.id+" nao existe");
			                                                flag=1;
			                                            }
			                                            rs.close();
			                                        }catch(SQLException se){
			                                            //se.printStackTrace();
			                                        }
			                                  
			setState(50);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(47); match(T__3);
				setState(48); ((MetaAudContext)_localctx).STRING = match(STRING);
				_localctx.xmlIn.append("<subtitulo>"+(((MetaAudContext)_localctx).STRING!=null?((MetaAudContext)_localctx).STRING.getText():null)+"</subtitulo>\n");
				}
			}

			setState(55);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(52); match(T__16);
				setState(53); ((MetaAudContext)_localctx).STRING = match(STRING);
				_localctx.xmlIn.append("<tema>"+(((MetaAudContext)_localctx).STRING!=null?((MetaAudContext)_localctx).STRING.getText():null)+"</tema>\n");
				}
			}

			setState(57); match(T__15);
			setState(58); data(_localctx.xmlIn);
			setState(59); match(T__14);
			setState(60); ((MetaAudContext)_localctx).hora = hora(_localctx.xmlIn);
			 ((MetaAudContext)_localctx).hora_inicio =  ((MetaAudContext)_localctx).hora.seconds-3600;
			setState(62); match(T__5);
			setState(63); ((MetaAudContext)_localctx).STRING = match(STRING);
			_localctx.xmlIn.append("<local>"+(((MetaAudContext)_localctx).STRING!=null?((MetaAudContext)_localctx).STRING.getText():null)+"</local>\n");
			setState(65); match(T__7);
			setState(66); ((MetaAudContext)_localctx).duracao = duracao(_localctx.xmlIn);

			                                                        ((MetaAudContext)_localctx).tempo_max_aud =  ((MetaAudContext)_localctx).duracao.seconds-3600;
			                                                        ((MetaAudContext)_localctx).xmlOut =  _localctx.xmlIn;
			                                                    
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
		public StringBuilder xmlIn;
		public StringBuilder xmlOut;
		public Token dia;
		public Token mes;
		public Token ano;
		public TerminalNode INT(int i) {
			return getToken(GAMuParser.INT, i);
		}
		public List<TerminalNode> INT() { return getTokens(GAMuParser.INT); }
		public DataContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DataContext(ParserRuleContext parent, int invokingState, StringBuilder xmlIn) {
			super(parent, invokingState);
			this.xmlIn = xmlIn;
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

	public final DataContext data(StringBuilder xmlIn) throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState(), xmlIn);
		enterRule(_localctx, 4, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); ((DataContext)_localctx).dia = match(INT);
			setState(70); match(T__17);
			setState(71); ((DataContext)_localctx).mes = match(INT);
			setState(72); match(T__17);
			setState(73); ((DataContext)_localctx).ano = match(INT);

			                                            _localctx.xmlIn.append("<data>"+(((DataContext)_localctx).dia!=null?Integer.valueOf(((DataContext)_localctx).dia.getText()):0)+"/"+(((DataContext)_localctx).mes!=null?Integer.valueOf(((DataContext)_localctx).mes.getText()):0)+"/"+(((DataContext)_localctx).ano!=null?Integer.valueOf(((DataContext)_localctx).ano.getText()):0)+"</data>\n");
			                                            ((DataContext)_localctx).xmlOut =  _localctx.xmlIn;
			                                        
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
		public StringBuilder xmlIn;
		public int seconds;
		public StringBuilder xmlOut;
		public Token horas;
		public Token minutos;
		public TerminalNode INT(int i) {
			return getToken(GAMuParser.INT, i);
		}
		public List<TerminalNode> INT() { return getTokens(GAMuParser.INT); }
		public HoraContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public HoraContext(ParserRuleContext parent, int invokingState, StringBuilder xmlIn) {
			super(parent, invokingState);
			this.xmlIn = xmlIn;
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

	public final HoraContext hora(StringBuilder xmlIn) throws RecognitionException {
		HoraContext _localctx = new HoraContext(_ctx, getState(), xmlIn);
		enterRule(_localctx, 6, RULE_hora);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); ((HoraContext)_localctx).horas = match(INT);
			setState(77); match(T__13);
			setState(78); ((HoraContext)_localctx).minutos = match(INT);

			                                        ((HoraContext)_localctx).seconds =  ((((HoraContext)_localctx).horas!=null?Integer.valueOf(((HoraContext)_localctx).horas.getText()):0)*60*60 + (((HoraContext)_localctx).minutos!=null?Integer.valueOf(((HoraContext)_localctx).minutos.getText()):0)*60);
			                                        _localctx.xmlIn.append("<hora>"+(((HoraContext)_localctx).horas!=null?Integer.valueOf(((HoraContext)_localctx).horas.getText()):0)+":"+(((HoraContext)_localctx).minutos!=null?Integer.valueOf(((HoraContext)_localctx).minutos.getText()):0)+"</hora>\n");
			                                        ((HoraContext)_localctx).xmlOut =  _localctx.xmlIn;
			                                    
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
		public StringBuilder xmlIn;
		public int seconds;
		public StringBuilder xmlOut;
		public Token horas;
		public Token minutos;
		public TerminalNode INT(int i) {
			return getToken(GAMuParser.INT, i);
		}
		public List<TerminalNode> INT() { return getTokens(GAMuParser.INT); }
		public DuracaoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DuracaoContext(ParserRuleContext parent, int invokingState, StringBuilder xmlIn) {
			super(parent, invokingState);
			this.xmlIn = xmlIn;
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

	public final DuracaoContext duracao(StringBuilder xmlIn) throws RecognitionException {
		DuracaoContext _localctx = new DuracaoContext(_ctx, getState(), xmlIn);
		enterRule(_localctx, 8, RULE_duracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); ((DuracaoContext)_localctx).horas = match(INT);
			setState(82); match(T__13);
			setState(83); ((DuracaoContext)_localctx).minutos = match(INT);

			                                        ((DuracaoContext)_localctx).seconds =  ((((DuracaoContext)_localctx).horas!=null?Integer.valueOf(((DuracaoContext)_localctx).horas.getText()):0)*60*60 + (((DuracaoContext)_localctx).minutos!=null?Integer.valueOf(((DuracaoContext)_localctx).minutos.getText()):0)*60);
			                                        _localctx.xmlIn.append("<duracao>"+(((DuracaoContext)_localctx).horas!=null?Integer.valueOf(((DuracaoContext)_localctx).horas.getText()):0)+":"+(((DuracaoContext)_localctx).minutos!=null?Integer.valueOf(((DuracaoContext)_localctx).minutos.getText()):0)+"</duracao>\n");
			                                        ((DuracaoContext)_localctx).xmlOut =  _localctx.xmlIn;
			                                    
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
		public StringBuilder xmlIn;
		public long hora_inicio;
		public int tempo_max_aud;
		public long tempo;
		public StringBuilder xmlOut;
		public AtuacaoContext atuacao;
		public AtuacaoContext atuacao(int i) {
			return getRuleContext(AtuacaoContext.class,i);
		}
		public List<AtuacaoContext> atuacao() {
			return getRuleContexts(AtuacaoContext.class);
		}
		public AtuacoesContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AtuacoesContext(ParserRuleContext parent, int invokingState, StringBuilder xmlIn, long hora_inicio, int tempo_max_aud) {
			super(parent, invokingState);
			this.xmlIn = xmlIn;
			this.hora_inicio = hora_inicio;
			this.tempo_max_aud = tempo_max_aud;
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

	public final AtuacoesContext atuacoes(StringBuilder xmlIn,long hora_inicio,int tempo_max_aud) throws RecognitionException {
		AtuacoesContext _localctx = new AtuacoesContext(_ctx, getState(), xmlIn, hora_inicio, tempo_max_aud);
		enterRule(_localctx, 10, RULE_atuacoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(T__2);
			setState(87); ((AtuacoesContext)_localctx).atuacao = atuacao((_localctx.tempo-3600), _localctx.xmlIn, _localctx.hora_inicio, _localctx.tempo_max_aud);

			                                                                ((AtuacoesContext)_localctx).tempo =  ((AtuacoesContext)_localctx).atuacao.tempo;
			                                                                ((AtuacoesContext)_localctx).xmlOut =  ((AtuacoesContext)_localctx).atuacao.xmlOut;
			                                                            
			setState(89); match(T__8);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__9) {
				{
				{
				setState(90); ((AtuacoesContext)_localctx).atuacao = atuacao(_localctx.tempo, _localctx.xmlOut, _localctx.hora_inicio, _localctx.tempo_max_aud);

				                                                ((AtuacoesContext)_localctx).tempo =  ((AtuacoesContext)_localctx).atuacao.tempo;
				                                                ((AtuacoesContext)_localctx).xmlOut =  ((AtuacoesContext)_localctx).atuacao.xmlOut;
				                                            
				setState(92); match(T__8);
				}
				}
				setState(98);
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

	public static class AtuacaoContext extends ParserRuleContext {
		public long tempoIn;
		public StringBuilder xmlIn;
		public long hora_inicio;
		public int tempo_max_aud;
		public long tempo;
		public StringBuilder xmlOut;
		public GrupoContext grupo;
		public SoloContext solo;
		public SoloContext solo() {
			return getRuleContext(SoloContext.class,0);
		}
		public GrupoContext grupo() {
			return getRuleContext(GrupoContext.class,0);
		}
		public AtuacaoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AtuacaoContext(ParserRuleContext parent, int invokingState, long tempoIn, StringBuilder xmlIn, long hora_inicio, int tempo_max_aud) {
			super(parent, invokingState);
			this.tempoIn = tempoIn;
			this.xmlIn = xmlIn;
			this.hora_inicio = hora_inicio;
			this.tempo_max_aud = tempo_max_aud;
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

	public final AtuacaoContext atuacao(long tempoIn,StringBuilder xmlIn,long hora_inicio,int tempo_max_aud) throws RecognitionException {
		AtuacaoContext _localctx = new AtuacaoContext(_ctx, getState(), tempoIn, xmlIn, hora_inicio, tempo_max_aud);
		enterRule(_localctx, 12, RULE_atuacao);
		try {
			setState(107);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				_localctx.xmlIn.append("\n<atuacao tipo=\"grupo\">\n");
				setState(100); ((AtuacaoContext)_localctx).grupo = grupo(_localctx.tempoIn, _localctx.xmlIn, _localctx.hora_inicio, _localctx.tempo_max_aud);

				                                            ((AtuacaoContext)_localctx).tempo = ((AtuacaoContext)_localctx).grupo.tempo;
				                                            ((AtuacaoContext)_localctx).xmlOut =  ((AtuacaoContext)_localctx).grupo.xmlOut;
				                                            _localctx.xmlOut.append("</atuacao>");
				                                        
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				_localctx.xmlIn.append("\n<atuacao tipo=\"solo\">");
				setState(104); ((AtuacaoContext)_localctx).solo = solo(_localctx.tempoIn, _localctx.xmlIn, _localctx.hora_inicio, _localctx.tempo_max_aud);

				                                            ((AtuacaoContext)_localctx).tempo = ((AtuacaoContext)_localctx).solo.tempo;
				                                            ((AtuacaoContext)_localctx).xmlOut =  ((AtuacaoContext)_localctx).solo.xmlOut;
				                                            _localctx.xmlOut.append("</atuacao>");
				                                        
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
		public StringBuilder xmlIn;
		public long hora_inicio;
		public int tempo_max_aud;
		public long tempo;
		public StringBuilder xmlOut;
		public Token STRING;
		public MusicosContext musicos;
		public ObrasContext obras;
		public ObrasContext obras() {
			return getRuleContext(ObrasContext.class,0);
		}
		public MusicosContext musicos() {
			return getRuleContext(MusicosContext.class,0);
		}
		public TerminalNode STRING() { return getToken(GAMuParser.STRING, 0); }
		public GrupoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public GrupoContext(ParserRuleContext parent, int invokingState, long tempoIn, StringBuilder xmlIn, long hora_inicio, int tempo_max_aud) {
			super(parent, invokingState);
			this.tempoIn = tempoIn;
			this.xmlIn = xmlIn;
			this.hora_inicio = hora_inicio;
			this.tempo_max_aud = tempo_max_aud;
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

	public final GrupoContext grupo(long tempoIn,StringBuilder xmlIn,long hora_inicio,int tempo_max_aud) throws RecognitionException {
		GrupoContext _localctx = new GrupoContext(_ctx, getState(), tempoIn, xmlIn, hora_inicio, tempo_max_aud);
		enterRule(_localctx, 14, RULE_grupo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(T__11);
			setState(110); ((GrupoContext)_localctx).STRING = match(STRING);

			                                    _localctx.xmlIn.append("\n<nome_grupo>"+(((GrupoContext)_localctx).STRING!=null?((GrupoContext)_localctx).STRING.getText():null)+"</nome_grupo>");
			                                    Time hora_ini = new Time( (_localctx.hora_inicio +_localctx.tempoIn ) * 1000);
			                                    _localctx.xmlIn.append("\n<hora_inicio>"+hora_ini.toString()+"</hora_inicio>");
			                                
			setState(112); match(T__0);

			                                    _localctx.xmlIn.append("\n<musicos>\n");
			                                
			setState(114); ((GrupoContext)_localctx).musicos = musicos(_localctx.xmlIn);

			                                    ((GrupoContext)_localctx).xmlIn =  ((GrupoContext)_localctx).musicos.xmlOut;
			                                    _localctx.xmlIn.append("\n</musicos>\n");
			                                
			setState(116); match(T__4);

			                                _localctx.xmlIn.append("\n<obras>\n");
			                            
			setState(118); ((GrupoContext)_localctx).obras = obras(_localctx.tempoIn, _localctx.xmlIn, _localctx.tempo_max_aud);

			                                ((GrupoContext)_localctx).xmlIn =  ((GrupoContext)_localctx).obras.xmlOut;
			                                _localctx.xmlIn.append("\n</obras>\n");
			                                ((GrupoContext)_localctx).tempo =  ((GrupoContext)_localctx).obras.tempo;
			                                ((GrupoContext)_localctx).xmlOut =  _localctx.xmlIn;
			                            
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
		public StringBuilder xmlIn;
		public long hora_inicio;
		public int tempo_max_aud;
		public long tempo;
		public StringBuilder xmlOut;
		public MusicoContext musico;
		public ObrasContext obras;
		public ObrasContext obras() {
			return getRuleContext(ObrasContext.class,0);
		}
		public MusicoContext musico() {
			return getRuleContext(MusicoContext.class,0);
		}
		public SoloContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SoloContext(ParserRuleContext parent, int invokingState, long tempoIn, StringBuilder xmlIn, long hora_inicio, int tempo_max_aud) {
			super(parent, invokingState);
			this.tempoIn = tempoIn;
			this.xmlIn = xmlIn;
			this.hora_inicio = hora_inicio;
			this.tempo_max_aud = tempo_max_aud;
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

	public final SoloContext solo(long tempoIn,StringBuilder xmlIn,long hora_inicio,int tempo_max_aud) throws RecognitionException {
		SoloContext _localctx = new SoloContext(_ctx, getState(), tempoIn, xmlIn, hora_inicio, tempo_max_aud);
		enterRule(_localctx, 16, RULE_solo);
		try {
			enterOuterAlt(_localctx, 1);
			{

			                    Time hora_ini = new Time( (_localctx.hora_inicio +_localctx.tempoIn) * 1000);
			                    _localctx.xmlIn.append("\n<hora_inicio>"+hora_ini.toString()+"</hora_inicio>");
			                
			setState(122); match(T__9);

			                            _localctx.xmlIn.append("\n<musicos>\n");
			                        
			setState(124); ((SoloContext)_localctx).musico = musico(_localctx.xmlIn);
			   
			                            ((SoloContext)_localctx).xmlIn = ((SoloContext)_localctx).musico.xmlOut; 
			                            _localctx.xmlIn.append("\n</musicos>\n");
			                        
			setState(126); match(T__4);

			                            _localctx.xmlIn.append("\n<obras>\n");
			                        
			setState(128); ((SoloContext)_localctx).obras = obras(_localctx.tempoIn, _localctx.xmlIn, _localctx.tempo_max_aud);

			                            ((SoloContext)_localctx).xmlIn = ((SoloContext)_localctx).obras.xmlOut; 
			                            _localctx.xmlIn.append("\n</obras>\n");
			                            ((SoloContext)_localctx).tempo =  ((SoloContext)_localctx).obras.tempo;
			                            ((SoloContext)_localctx).xmlOut = _localctx.xmlIn; 
			                        
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
		public StringBuilder xmlIn;
		public int tempo_max_aud;
		public long tempo;
		public StringBuilder xmlOut;
		public IdObraContext idObra;
		public List<IdObraContext> idObra() {
			return getRuleContexts(IdObraContext.class);
		}
		public IdObraContext idObra(int i) {
			return getRuleContext(IdObraContext.class,i);
		}
		public ObrasContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ObrasContext(ParserRuleContext parent, int invokingState, long tempoIn, StringBuilder xmlIn, int tempo_max_aud) {
			super(parent, invokingState);
			this.tempoIn = tempoIn;
			this.xmlIn = xmlIn;
			this.tempo_max_aud = tempo_max_aud;
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

	public final ObrasContext obras(long tempoIn,StringBuilder xmlIn,int tempo_max_aud) throws RecognitionException {
		ObrasContext _localctx = new ObrasContext(_ctx, getState(), tempoIn, xmlIn, tempo_max_aud);
		enterRule(_localctx, 18, RULE_obras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); ((ObrasContext)_localctx).idObra = idObra();
			 
			                            try{
			                                String sql = "SELECT * FROM obra WHERE id='"+((ObrasContext)_localctx).idObra.id+"'";
			                                ResultSet rs = (ResultSet) stmt.executeQuery(sql);
			                                if(rs.next()){
			                                    _localctx.tempo += rs.getTime("duracao").toLocalTime().toSecondOfDay();
			                                    _localctx.tempo += _localctx.tempoIn;
			                                    if(_localctx.tempo>_localctx.tempo_max_aud){
			                                        Time time = new Time(_localctx.tempo * 1000);
			                                            System.out.print("line "+((ObrasContext)_localctx).idObra.linha+" - tempo _max ultrapassado");
			                                            System.out.println(" "+((ObrasContext)_localctx).idObra.id+" tem duracao: "+time.toString());
			                                        flag=1;
			                                    }else{
			                                        _localctx.xmlIn.append("\n<obra id=\""+((ObrasContext)_localctx).idObra.id+"\">");
			                                        _localctx.xmlIn.append("<nome>"+rs.getString("nome")+"</nome>");
			                                        _localctx.xmlIn.append("<duracao>"+rs.getString("duracao")+"</duracao>");
			                                        _localctx.xmlIn.append("</obra>");
			                                    }
			                                }else{
			                                    System.out.print("line "+((ObrasContext)_localctx).idObra.linha);
			                                    System.out.println(" obra: "+((ObrasContext)_localctx).idObra.id+" nao existe");
			                                    _localctx.xmlIn.append("<obra></obra>");
			                                    flag=1;
			                                }
			                                rs.close();
			                            }catch(SQLException se){
			                                //se.printStackTrace();
			                            }
			                            ((ObrasContext)_localctx).xmlOut =  _localctx.xmlIn;
			                        
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(133); match(T__1);
				setState(134); ((ObrasContext)_localctx).idObra = idObra();

				                                try{
				                                    String sql = "SELECT * FROM obra WHERE id='"+((ObrasContext)_localctx).idObra.id+"'";
				                                    ResultSet rs = (ResultSet) stmt.executeQuery(sql);
				                                    if(rs.next()){
				                                        _localctx.tempo += rs.getTime("duracao").toLocalTime().toSecondOfDay();
				                                        if(_localctx.tempo>_localctx.tempo_max_aud){
				                                            Time time = new Time(_localctx.tempo * 1000);
				                                            System.out.print("line "+((ObrasContext)_localctx).idObra.linha+" - tempo _max ultrapassado");
				                                            System.out.println(" "+((ObrasContext)_localctx).idObra.id+" tem duracao: "+time.toString());
				                                            flag=1;
				                                        }else{
				                                            _localctx.xmlIn.append("\n<obra id=\""+((ObrasContext)_localctx).idObra.id+"\">");
				                                            _localctx.xmlIn.append("<nome>"+rs.getString("nome")+"</nome>");
				                                            _localctx.xmlIn.append("<duracao>"+rs.getString("duracao")+"</duracao>");
				                                            _localctx.xmlIn.append("</obra>");
				                                        }
				                                    }else{
				                                        System.out.print("line "+((ObrasContext)_localctx).idObra.linha);
				                                        System.out.println(" obra: "+((ObrasContext)_localctx).idObra.id+" nao existe");
				                                        _localctx.xmlIn.append("<obra></obra>");
				                                        flag=1;
				                                    }
				                                    rs.close();
				                                }catch(SQLException se){
				                                    //se.printStackTrace();
				                                }
				                                ((ObrasContext)_localctx).xmlOut =  _localctx.xmlIn;
				                            
				}
				}
				setState(141);
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
		public StringBuilder xmlIn;
		public StringBuilder xmlOut;
		public MusicoContext musico;
		public MusicoContext musico(int i) {
			return getRuleContext(MusicoContext.class,i);
		}
		public List<MusicoContext> musico() {
			return getRuleContexts(MusicoContext.class);
		}
		public MusicosContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MusicosContext(ParserRuleContext parent, int invokingState, StringBuilder xmlIn) {
			super(parent, invokingState);
			this.xmlIn = xmlIn;
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

	public final MusicosContext musicos(StringBuilder xmlIn) throws RecognitionException {
		MusicosContext _localctx = new MusicosContext(_ctx, getState(), xmlIn);
		enterRule(_localctx, 20, RULE_musicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); ((MusicosContext)_localctx).musico = musico(_localctx.xmlIn);
			((MusicosContext)_localctx).xmlOut = ((MusicosContext)_localctx).musico.xmlOut;
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID_ALUNO || _la==ID_PROFESSOR) {
				{
				{
				setState(144); ((MusicosContext)_localctx).musico = musico(_localctx.xmlOut);
				((MusicosContext)_localctx).xmlOut = ((MusicosContext)_localctx).musico.xmlOut;
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
		public StringBuilder xmlIn;
		public StringBuilder xmlOut;
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
		public MusicoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MusicoContext(ParserRuleContext parent, int invokingState, StringBuilder xmlIn) {
			super(parent, invokingState);
			this.xmlIn = xmlIn;
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

	public final MusicoContext musico(StringBuilder xmlIn) throws RecognitionException {
		MusicoContext _localctx = new MusicoContext(_ctx, getState(), xmlIn);
		enterRule(_localctx, 22, RULE_musico);
		try {
			setState(162);
			switch (_input.LA(1)) {
			case ID_ALUNO:
				enterOuterAlt(_localctx, 1);
				{
				setState(152); ((MusicoContext)_localctx).idAluno = idAluno();
				setState(153); match(T__1);
				setState(154); ((MusicoContext)_localctx).idInstrumento = idInstrumento();

				                                            _localctx.xmlIn.append("\n<musico tipo=\"aluno\" id=\""+((MusicoContext)_localctx).idAluno.id+"\">");
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
				                                                            _localctx.xmlIn.append("<nome>"+nome_aluno+"</nome>");
				                                                            _localctx.xmlIn.append("<instrumento id=\""+((MusicoContext)_localctx).idInstrumento.id+"\">"+designacao_instrumento+"</instrumento>");
				                                                        }else{
				                                                            System.out.print("line "+((MusicoContext)_localctx).idAluno.linha);
				                                                            System.out.print(" (aluno: "+((MusicoContext)_localctx).idAluno.id+" - "+ nome_aluno+")" );
				                                                            System.out.println(" nao tem habilitacoes para tocar ("+((MusicoContext)_localctx).idInstrumento.id+" - "+ designacao_instrumento+")");
				                                                            
				                                                            sql = "SELECT * FROM aluno_instrumento INNER JOIN instrumento ON aluno_instrumento.id_instrumento=instrumento.id WHERE aluno_instrumento.id_aluno='"+((MusicoContext)_localctx).idAluno.id+"'";
				                                                            rs = (ResultSet) stmt.executeQuery(sql);
				                                                            System.out.print("O Aluno: "+ ((MusicoContext)_localctx).idAluno.id);
				                                                            System.out.println(" tem habilitacoes em:");
				                                                            while(rs.next()){
				                                                                System.out.println("  - "+rs.getString("id")+" "+rs.getString("designacao"));
				                                                            }
				                                                            flag=1;
				                                                        }
				                                                    }else{
				                                                        System.out.print("line "+((MusicoContext)_localctx).idInstrumento.linha);
				                                                        System.out.println("  instrumento: "+((MusicoContext)_localctx).idInstrumento.id+" nao existe");
				                                                        sql = "SELECT * FROM aluno_instrumento INNER JOIN instrumento ON aluno_instrumento.id_instrumento=instrumento.id WHERE aluno_instrumento.id_aluno='"+((MusicoContext)_localctx).idAluno.id+"'";
				                                                        rs = (ResultSet) stmt.executeQuery(sql);
				                                                        System.out.print("O Aluno: "+ ((MusicoContext)_localctx).idAluno.id);
				                                                        System.out.println(" tem habilitacoes em:");
				                                                        while(rs.next()){
				                                                            System.out.println("  - "+rs.getString("id")+" "+rs.getString("designacao"));
				                                                        }
				                                                        flag=1;
				                                                    }
				                                                }else{
				                                                    System.out.print("line "+((MusicoContext)_localctx).idAluno.linha);
				                                                    System.out.println("  aluno: "+((MusicoContext)_localctx).idAluno.id+" nao existe");
				                                                    flag=1;
				                                                }
				                                                rs.close();
				                                            }catch(SQLException se){
				                                                //se.printStackTrace();
				                                            }
				                                            _localctx.xmlIn.append("</musico>");
				                                            ((MusicoContext)_localctx).xmlOut =  _localctx.xmlIn;
				                                         
				}
				break;
			case ID_PROFESSOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(157); ((MusicoContext)_localctx).idProf = idProf();
				setState(158); match(T__1);
				setState(159); ((MusicoContext)_localctx).idInstrumento = idInstrumento();

				                                            _localctx.xmlIn.append("\n<musico tipo=\"professor\" id=\""+((MusicoContext)_localctx).idProf.id+"\">");
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
				                                                            _localctx.xmlIn.append("<nome>"+nome_prof+"</nome>");
				                                                            _localctx.xmlIn.append("<instrumento id=\""+((MusicoContext)_localctx).idInstrumento.id+"\">"+designacao_instrumento+"</instrumento>");
				                                                        }else{
				                                                            System.out.print("line "+((MusicoContext)_localctx).idProf.linha);
				                                                            System.out.print(" (professor: "+((MusicoContext)_localctx).idProf.id+" - "+ nome_prof+")" );
				                                                            System.out.println(" nao tem habilitacoes para tocar("+((MusicoContext)_localctx).idInstrumento.id+" - "+ designacao_instrumento+")");
				                                                            flag=1;
				                                                        }  
				                                                    }else{
				                                                        System.out.print("line "+((MusicoContext)_localctx).idInstrumento.linha);
				                                                        System.out.println("  instrumento: "+((MusicoContext)_localctx).idInstrumento.id+" nao existe");
				                                                        flag=1;
				                                                    }
				                                                }else{
				                                                    System.out.print("line "+((MusicoContext)_localctx).idProf.linha);
				                                                    System.out.println("  professor: "+((MusicoContext)_localctx).idProf.id+" nao existe");
				                                                    flag=1;
				                                                }
				                                                rs.close();
				                                            }catch(SQLException se){
				                                                //se.printStackTrace();
				                                            }
				                                            _localctx.xmlIn.append("</musico>");
				                                            ((MusicoContext)_localctx).xmlOut =  _localctx.xmlIn;
				                                         
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
		public Token ID_OBRA;
		public TerminalNode ID_OBRA() { return getToken(GAMuParser.ID_OBRA, 0); }
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
			setState(164); ((IdObraContext)_localctx).ID_OBRA = match(ID_OBRA);

			                                                            
			                                                            ((IdObraContext)_localctx).id =  (((IdObraContext)_localctx).ID_OBRA!=null?((IdObraContext)_localctx).ID_OBRA.getText():null);
			                                                            ((IdObraContext)_localctx).linha =  ((IdObraContext)_localctx).ID_OBRA.getLine();
			                                                            ((IdObraContext)_localctx).coluna =  ((IdObraContext)_localctx).ID_OBRA.getCharPositionInLine();
			                                                            
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
		public Token ID_PROFESSOR;
		public TerminalNode ID_PROFESSOR() { return getToken(GAMuParser.ID_PROFESSOR, 0); }
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
			setState(167); ((IdProfContext)_localctx).ID_PROFESSOR = match(ID_PROFESSOR);
			   
			                                                            ((IdProfContext)_localctx).id =  (((IdProfContext)_localctx).ID_PROFESSOR!=null?((IdProfContext)_localctx).ID_PROFESSOR.getText():null);
			                                                            ((IdProfContext)_localctx).linha =  ((IdProfContext)_localctx).ID_PROFESSOR.getLine();
			                                                            ((IdProfContext)_localctx).coluna =  ((IdProfContext)_localctx).ID_PROFESSOR.getCharPositionInLine();
			                                                            
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
		public Token ID_ALUNO;
		public TerminalNode ID_ALUNO() { return getToken(GAMuParser.ID_ALUNO, 0); }
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
			setState(170); ((IdAlunoContext)_localctx).ID_ALUNO = match(ID_ALUNO);
			   
			                                                            ((IdAlunoContext)_localctx).id =  (((IdAlunoContext)_localctx).ID_ALUNO!=null?((IdAlunoContext)_localctx).ID_ALUNO.getText():null);
			                                                            ((IdAlunoContext)_localctx).linha =  ((IdAlunoContext)_localctx).ID_ALUNO.getLine();
			                                                            ((IdAlunoContext)_localctx).coluna =  ((IdAlunoContext)_localctx).ID_ALUNO.getCharPositionInLine();
			                                                            
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
		public Token ID_INSTRUMENTO;
		public TerminalNode ID_INSTRUMENTO() { return getToken(GAMuParser.ID_INSTRUMENTO, 0); }
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
			setState(173); ((IdInstrumentoContext)_localctx).ID_INSTRUMENTO = match(ID_INSTRUMENTO);
			   
			                                                                            ((IdInstrumentoContext)_localctx).id =  (((IdInstrumentoContext)_localctx).ID_INSTRUMENTO!=null?((IdInstrumentoContext)_localctx).ID_INSTRUMENTO.getText():null);
			                                                                            ((IdInstrumentoContext)_localctx).linha =  ((IdInstrumentoContext)_localctx).ID_INSTRUMENTO.getLine();
			                                                                            ((IdInstrumentoContext)_localctx).coluna =  ((IdInstrumentoContext)_localctx).ID_INSTRUMENTO.getCharPositionInLine();
			                                                                            
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u00b3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\65"+
		"\n\3\3\3\3\3\3\3\5\3:\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7a\n\7\f\7\16\7d\13\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\bn\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\7\13\u008c\n\13\f\13\16\13\u008f\13\13\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u0096\n\f\f\f\16\f\u0099\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00a5\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\u00a9\2"+
		"\"\3\2\2\2\4\'\3\2\2\2\6G\3\2\2\2\bN\3\2\2\2\nS\3\2\2\2\fX\3\2\2\2\16"+
		"m\3\2\2\2\20o\3\2\2\2\22{\3\2\2\2\24\u0085\3\2\2\2\26\u0090\3\2\2\2\30"+
		"\u00a4\3\2\2\2\32\u00a6\3\2\2\2\34\u00a9\3\2\2\2\36\u00ac\3\2\2\2 \u00af"+
		"\3\2\2\2\"#\5\4\3\2#$\b\2\1\2$%\5\f\7\2%&\b\2\1\2&\3\3\2\2\2\'(\7\n\2"+
		"\2()\5\34\17\2)*\7\16\2\2*+\7\33\2\2+,\7\3\2\2,-\7\33\2\2-.\b\3\1\2./"+
		"\7\b\2\2/\60\7\35\2\2\60\64\b\3\1\2\61\62\7\21\2\2\62\63\7\35\2\2\63\65"+
		"\b\3\1\2\64\61\3\2\2\2\64\65\3\2\2\2\659\3\2\2\2\66\67\7\4\2\2\678\7\35"+
		"\2\28:\b\3\1\29\66\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\5\2\2<=\5\6\4\2=>\7"+
		"\6\2\2>?\5\b\5\2?@\b\3\1\2@A\7\17\2\2AB\7\35\2\2BC\b\3\1\2CD\7\r\2\2D"+
		"E\5\n\6\2EF\b\3\1\2F\5\3\2\2\2GH\7\33\2\2HI\7\3\2\2IJ\7\33\2\2JK\7\3\2"+
		"\2KL\7\33\2\2LM\b\4\1\2M\7\3\2\2\2NO\7\33\2\2OP\7\7\2\2PQ\7\33\2\2QR\b"+
		"\5\1\2R\t\3\2\2\2ST\7\33\2\2TU\7\7\2\2UV\7\33\2\2VW\b\6\1\2W\13\3\2\2"+
		"\2XY\7\22\2\2YZ\5\16\b\2Z[\b\7\1\2[b\7\f\2\2\\]\5\16\b\2]^\b\7\1\2^_\7"+
		"\f\2\2_a\3\2\2\2`\\\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\r\3\2\2\2d"+
		"b\3\2\2\2ef\b\b\1\2fg\5\20\t\2gh\b\b\1\2hn\3\2\2\2ij\b\b\1\2jk\5\22\n"+
		"\2kl\b\b\1\2ln\3\2\2\2me\3\2\2\2mi\3\2\2\2n\17\3\2\2\2op\7\t\2\2pq\7\35"+
		"\2\2qr\b\t\1\2rs\7\24\2\2st\b\t\1\2tu\5\26\f\2uv\b\t\1\2vw\7\20\2\2wx"+
		"\b\t\1\2xy\5\24\13\2yz\b\t\1\2z\21\3\2\2\2{|\b\n\1\2|}\7\13\2\2}~\b\n"+
		"\1\2~\177\5\30\r\2\177\u0080\b\n\1\2\u0080\u0081\7\20\2\2\u0081\u0082"+
		"\b\n\1\2\u0082\u0083\5\24\13\2\u0083\u0084\b\n\1\2\u0084\23\3\2\2\2\u0085"+
		"\u0086\5\32\16\2\u0086\u008d\b\13\1\2\u0087\u0088\7\23\2\2\u0088\u0089"+
		"\5\32\16\2\u0089\u008a\b\13\1\2\u008a\u008c\3\2\2\2\u008b\u0087\3\2\2"+
		"\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\25"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\5\30\r\2\u0091\u0097\b\f\1\2"+
		"\u0092\u0093\5\30\r\2\u0093\u0094\b\f\1\2\u0094\u0096\3\2\2\2\u0095\u0092"+
		"\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\27\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\5\36\20\2\u009b\u009c\7\23"+
		"\2\2\u009c\u009d\5 \21\2\u009d\u009e\b\r\1\2\u009e\u00a5\3\2\2\2\u009f"+
		"\u00a0\5\34\17\2\u00a0\u00a1\7\23\2\2\u00a1\u00a2\5 \21\2\u00a2\u00a3"+
		"\b\r\1\2\u00a3\u00a5\3\2\2\2\u00a4\u009a\3\2\2\2\u00a4\u009f\3\2\2\2\u00a5"+
		"\31\3\2\2\2\u00a6\u00a7\7\30\2\2\u00a7\u00a8\b\16\1\2\u00a8\33\3\2\2\2"+
		"\u00a9\u00aa\7\27\2\2\u00aa\u00ab\b\17\1\2\u00ab\35\3\2\2\2\u00ac\u00ad"+
		"\7\26\2\2\u00ad\u00ae\b\20\1\2\u00ae\37\3\2\2\2\u00af\u00b0\7\31\2\2\u00b0"+
		"\u00b1\b\21\1\2\u00b1!\3\2\2\2\t\649bm\u008d\u0097\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}