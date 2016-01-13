// Generated from C:\Users\Miguel\Desktop\-MiEI-\-MEI-\Gramáticas na Compreensão de Software\TrabalhoGitHub\GAMu\gramaticaGAMu\grammar\GAMu.g4 by ANTLR 4.4

        import java.util.*;
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;
        import java.sql.ResultSet;
        import java.sql.Statement;
        import java.sql.Time;
        import java.time.Instant;
        
        
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
		T__16=1, T__15=2, T__14=3, T__13=4, T__12=5, T__11=6, T__10=7, T__9=8, 
		T__8=9, T__7=10, T__6=11, T__5=12, T__4=13, T__3=14, T__2=15, T__1=16, 
		T__0=17, COMMENT=18, IDA=19, IDP=20, IDO=21, ID=22, INT=23, WS=24, STRING=25;
	public static final String[] tokenNames = {
		"<INVALID>", "'tema:'", "'data:'", "'hora:'", "':'", "'titulo:'", "'grupo:'", 
		"'organizador:'", "'solo:'", "'#'", "'duracao-maxima:'", "'local:'", "'obras:'", 
		"'subtitulo:'", "'atuacoes:'", "','", "'elementos:'", "'-'", "COMMENT", 
		"IDA", "IDP", "IDO", "ID", "INT", "WS", "STRING"
	};
	public static final int
		RULE_audicao = 0, RULE_metaAud = 1, RULE_data = 2, RULE_hora = 3, RULE_atuacoes = 4, 
		RULE_atuacao = 5, RULE_grupo = 6, RULE_solo = 7, RULE_obras = 8, RULE_elementos = 9, 
		RULE_musicos = 10, RULE_musico = 11, RULE_idObra = 12, RULE_idProf = 13, 
		RULE_idAluno = 14;
	public static final String[] ruleNames = {
		"audicao", "metaAud", "data", "hora", "atuacoes", "atuacao", "grupo", 
		"solo", "obras", "elementos", "musicos", "musico", "idObra", "idProf", 
		"idAluno"
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
	            static final long ONE_MINUTE_IN_MILLIS=60000;
	            long total_audition_time = 0;
	            int max_audition_time = 0;
	            StringBuilder audicao_xml = new StringBuilder();
	            
	        
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
		                      System.out.println("Connecting to database...");
		                      conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
		                      //STEP 4: Execute a query
		                      System.out.println("Creating statement...");
		                      stmt = (Statement) conn.createStatement();
		                      
		                   }catch(SQLException se){
		                      //Handle errors for JDBC
		                      se.printStackTrace();
		                   }catch(Exception e){
		                      //Handle errors for Class.forName
		                      e.printStackTrace();
		                   }
		                   
		                   
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); metaAud();
			setState(31); atuacoes();
			}
			 //imprimir JSON: {linhas_erros:[1,4,3,2]}
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
		public HoraContext hora;
		public IdProfContext idProf;
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public HoraContext hora(int i) {
			return getRuleContext(HoraContext.class,i);
		}
		public TerminalNode STRING(int i) {
			return getToken(GAMuParser.STRING, i);
		}
		public List<TerminalNode> STRING() { return getTokens(GAMuParser.STRING); }
		public IdProfContext idProf() {
			return getRuleContext(IdProfContext.class,0);
		}
		public List<HoraContext> hora() {
			return getRuleContexts(HoraContext.class);
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
			setState(33); match(T__12);
			setState(34); match(STRING);
			setState(37);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(35); match(T__4);
				setState(36); match(STRING);
				}
			}

			setState(41);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(39); match(T__16);
				setState(40); match(STRING);
				}
			}

			setState(43); match(T__15);
			setState(44); data();
			setState(45); match(T__14);
			setState(46); ((MetaAudContext)_localctx).hora = hora();
			setState(47); match(T__6);
			setState(48); match(STRING);
			setState(49); match(T__10);
			setState(50); ((MetaAudContext)_localctx).idProf = idProf();

			                                         try{
			                                                String sql = "SELECT COUNT(1) AS existe FROM professor WHERE id='"+((MetaAudContext)_localctx).idProf.id+"'";
			                                                ResultSet rs = (ResultSet) stmt.executeQuery(sql);
			                                                if(rs.next()){
			                                                    if(rs.getInt("existe") != 1){
			                                                        System.out.print("line "+((MetaAudContext)_localctx).idProf.linha+" coluna: "+ ((MetaAudContext)_localctx).idProf.coluna);
			                                                        System.out.println("  professor: "+((MetaAudContext)_localctx).idProf.id+" nao existe");
			                                                    }
			                                                }
			                                                rs.close();
			                                            }catch(SQLException se){
			                                                se.printStackTrace();
			                                            }
			                                      
			setState(52); match(T__7);
			setState(53); ((MetaAudContext)_localctx).hora = hora();
			max_audition_time = ((MetaAudContext)_localctx).hora.seconds-3600;
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
			setState(56); match(INT);
			setState(57); match(T__0);
			setState(58); match(INT);
			setState(59); match(T__0);
			setState(60); match(INT);
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
			setState(62); ((HoraContext)_localctx).horas = match(INT);
			setState(63); match(T__13);
			setState(64); ((HoraContext)_localctx).minutos = match(INT);
			((HoraContext)_localctx).seconds =  ((((HoraContext)_localctx).horas!=null?Integer.valueOf(((HoraContext)_localctx).horas.getText()):0)*60*60 + (((HoraContext)_localctx).minutos!=null?Integer.valueOf(((HoraContext)_localctx).minutos.getText()):0)*60);
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
		enterRule(_localctx, 8, RULE_atuacoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(T__3);
			setState(68); ((AtuacoesContext)_localctx).atuacao = atuacao(_localctx.tempo-3600);

			                                            ((AtuacoesContext)_localctx).tempo =  ((AtuacoesContext)_localctx).atuacao.tempo;
			                                        
			setState(70); match(T__8);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__9) {
				{
				{
				setState(71); ((AtuacoesContext)_localctx).atuacao = atuacao(_localctx.tempo);

				                                        ((AtuacoesContext)_localctx).tempo =  ((AtuacoesContext)_localctx).atuacao.tempo;
				                                    
				setState(73); match(T__8);
				}
				}
				setState(79);
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
		enterRule(_localctx, 10, RULE_atuacao);
		try {
			setState(88);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); ((AtuacaoContext)_localctx).grupo = grupo(_localctx.tempoIn);
				((AtuacaoContext)_localctx).tempo = ((AtuacaoContext)_localctx).grupo.tempo;
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(85); ((AtuacaoContext)_localctx).solo = solo(_localctx.tempoIn);
				((AtuacaoContext)_localctx).tempo = ((AtuacaoContext)_localctx).solo.tempo;
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
		public ObrasContext obras;
		public ElementosContext elementos() {
			return getRuleContext(ElementosContext.class,0);
		}
		public ObrasContext obras() {
			return getRuleContext(ObrasContext.class,0);
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
		enterRule(_localctx, 12, RULE_grupo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(T__11);
			setState(91); match(STRING);
			setState(92); match(T__1);
			setState(93); elementos();
			setState(94); match(T__5);
			setState(95); ((GrupoContext)_localctx).obras = obras(_localctx.tempoIn);
			((GrupoContext)_localctx).tempo =  ((GrupoContext)_localctx).obras.tempo;
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
		enterRule(_localctx, 14, RULE_solo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(T__9);
			setState(99); musico();
			setState(100); match(T__5);
			setState(101); ((SoloContext)_localctx).obras = obras(_localctx.tempoIn);
			((SoloContext)_localctx).tempo =  ((SoloContext)_localctx).obras.tempo;
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
		enterRule(_localctx, 16, RULE_obras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); ((ObrasContext)_localctx).idObra = idObra();
			 
			                            try{
			                                String sql = "SELECT COUNT(1) AS existe FROM obra WHERE id='"+((ObrasContext)_localctx).idObra.id+"'";
			                                ResultSet rs = (ResultSet) stmt.executeQuery(sql);
			                                    if(rs.next()){
			                                        if(rs.getInt("existe") == 1){
			                                            sql = "SELECT  duracao FROM obra WHERE id='"+((ObrasContext)_localctx).idObra.id+"';";
			                                            rs = (ResultSet) stmt.executeQuery(sql);
			                                            if(rs.next()){
			                                                _localctx.tempo += rs.getTime("duracao").toLocalTime().toSecondOfDay();
			                                                _localctx.tempo += _localctx.tempoIn;
			                                                if(_localctx.tempo>max_audition_time){
			                                                    System.out.println("obra: "+((ObrasContext)_localctx).idObra.id+" tempo _max ultrapassado");
			                                                }
			                                            }
			                                        }else{
			                                            System.out.println("obra: "+((ObrasContext)_localctx).idObra.id+" nao existe");
			                                        }
			                                        rs.close();
			                                    }
			                            }catch(SQLException se){
			                                se.printStackTrace();
			                            }
			                        
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(106); match(T__2);
				setState(107); ((ObrasContext)_localctx).idObra = idObra();

				                                try{
				                                    String sql = "SELECT COUNT(1) AS existe FROM obra WHERE id='"+((ObrasContext)_localctx).idObra.id+"'";
				                                    ResultSet rs = (ResultSet) stmt.executeQuery(sql);
				                                    if(rs.next()){
				                                        if(rs.getInt("existe") == 1){
				                                            sql = "SELECT  duracao FROM obra WHERE id='"+((ObrasContext)_localctx).idObra.id+"'";
				                                            rs = (ResultSet) stmt.executeQuery(sql);
				                                            if(rs.next()){
				                                                _localctx.tempo += rs.getTime("duracao").toLocalTime().toSecondOfDay();
				                                                if(_localctx.tempo>max_audition_time){
				                                                    System.out.println("obra: "+((ObrasContext)_localctx).idObra.id+" tempo _max ultrapassado");
				                                                }
				                                            }
				                                        }else{
				                                            System.out.println("obra: "+((ObrasContext)_localctx).idObra.id+" nao existe");
				                                        }
				                                        rs.close();
				                                    }      
				                                }catch(SQLException se){
				                                    se.printStackTrace();
				                                }
				                            
				}
				}
				setState(114);
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

	public static class ElementosContext extends ParserRuleContext {
		public MusicosContext musicos() {
			return getRuleContext(MusicosContext.class,0);
		}
		public ElementosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).enterElementos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).exitElementos(this);
		}
	}

	public final ElementosContext elementos() throws RecognitionException {
		ElementosContext _localctx = new ElementosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elementos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); musicos();
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
			setState(117); musico();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(118); match(T__2);
				setState(119); musico();
				}
				}
				setState(124);
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
		public IdProfContext idProf;
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
			setState(131);
			switch (_input.LA(1)) {
			case IDA:
				enterOuterAlt(_localctx, 1);
				{
				setState(125); ((MusicoContext)_localctx).idAluno = idAluno();

				                            try{
				                                String sql = "SELECT COUNT(1) AS existe FROM aluno WHERE id='"+((MusicoContext)_localctx).idAluno.id+"'";
				                                ResultSet rs = (ResultSet) stmt.executeQuery(sql);
				                                if(rs.next()){
				                                    if(rs.getInt("existe") != 1){
				                                        System.out.print("line "+((MusicoContext)_localctx).idAluno.linha);
				                                        System.out.println("  aluno: "+((MusicoContext)_localctx).idAluno.id+" nao existe");
				                                    }
				                                }
				                                rs.close();
				                            }catch(SQLException se){
				                                se.printStackTrace();
				                            }
				                         
				}
				break;
			case IDP:
				enterOuterAlt(_localctx, 2);
				{
				setState(128); ((MusicoContext)_localctx).idProf = idProf();

				                         try{
				                                String sql = "SELECT COUNT(1) AS existe FROM professor WHERE id='"+((MusicoContext)_localctx).idProf.id+"'";
				                                ResultSet rs = (ResultSet) stmt.executeQuery(sql);
				                                if(rs.next()){
				                                    if(rs.getInt("existe") != 1){
				                                        System.out.print("line "+((MusicoContext)_localctx).idProf.linha);
				                                        System.out.println("  professor: "+((MusicoContext)_localctx).idProf.id+" nao existe");
				                                    }
				                                }
				                                rs.close();
				                            }catch(SQLException se){
				                                se.printStackTrace();
				                            }
				                         
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
			setState(133); ((IdObraContext)_localctx).IDO = match(IDO);
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
			setState(136); ((IdProfContext)_localctx).IDP = match(IDP);
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
			setState(139); ((IdAlunoContext)_localctx).IDA = match(IDA);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33\u0091\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\5\3(\n\3\3\3\3\3\5\3,\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6N\n\6\f\6\16\6Q\13\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7[\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\nq\n\n\f\n\16\nt\13\n\3\13\3\13\3\f\3"+
		"\f\3\f\7\f{\n\f\f\f\16\f~\13\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0086\n\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36\2\2\u0088\2 \3\2\2\2\4#\3\2\2\2\6:\3\2\2\2\b"+
		"@\3\2\2\2\nE\3\2\2\2\fZ\3\2\2\2\16\\\3\2\2\2\20d\3\2\2\2\22j\3\2\2\2\24"+
		"u\3\2\2\2\26w\3\2\2\2\30\u0085\3\2\2\2\32\u0087\3\2\2\2\34\u008a\3\2\2"+
		"\2\36\u008d\3\2\2\2 !\5\4\3\2!\"\5\n\6\2\"\3\3\2\2\2#$\7\7\2\2$\'\7\33"+
		"\2\2%&\7\17\2\2&(\7\33\2\2\'%\3\2\2\2\'(\3\2\2\2(+\3\2\2\2)*\7\3\2\2*"+
		",\7\33\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\7\4\2\2./\5\6\4\2/\60\7\5\2"+
		"\2\60\61\5\b\5\2\61\62\7\r\2\2\62\63\7\33\2\2\63\64\7\t\2\2\64\65\5\34"+
		"\17\2\65\66\b\3\1\2\66\67\7\f\2\2\678\5\b\5\289\b\3\1\29\5\3\2\2\2:;\7"+
		"\31\2\2;<\7\23\2\2<=\7\31\2\2=>\7\23\2\2>?\7\31\2\2?\7\3\2\2\2@A\7\31"+
		"\2\2AB\7\6\2\2BC\7\31\2\2CD\b\5\1\2D\t\3\2\2\2EF\7\20\2\2FG\5\f\7\2GH"+
		"\b\6\1\2HO\7\13\2\2IJ\5\f\7\2JK\b\6\1\2KL\7\13\2\2LN\3\2\2\2MI\3\2\2\2"+
		"NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\b\6\1\2S\13\3\2\2"+
		"\2TU\5\16\b\2UV\b\7\1\2V[\3\2\2\2WX\5\20\t\2XY\b\7\1\2Y[\3\2\2\2ZT\3\2"+
		"\2\2ZW\3\2\2\2[\r\3\2\2\2\\]\7\b\2\2]^\7\33\2\2^_\7\22\2\2_`\5\24\13\2"+
		"`a\7\16\2\2ab\5\22\n\2bc\b\b\1\2c\17\3\2\2\2de\7\n\2\2ef\5\30\r\2fg\7"+
		"\16\2\2gh\5\22\n\2hi\b\t\1\2i\21\3\2\2\2jk\5\32\16\2kr\b\n\1\2lm\7\21"+
		"\2\2mn\5\32\16\2no\b\n\1\2oq\3\2\2\2pl\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3"+
		"\2\2\2s\23\3\2\2\2tr\3\2\2\2uv\5\26\f\2v\25\3\2\2\2w|\5\30\r\2xy\7\21"+
		"\2\2y{\5\30\r\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\27\3\2\2\2~|"+
		"\3\2\2\2\177\u0080\5\36\20\2\u0080\u0081\b\r\1\2\u0081\u0086\3\2\2\2\u0082"+
		"\u0083\5\34\17\2\u0083\u0084\b\r\1\2\u0084\u0086\3\2\2\2\u0085\177\3\2"+
		"\2\2\u0085\u0082\3\2\2\2\u0086\31\3\2\2\2\u0087\u0088\7\27\2\2\u0088\u0089"+
		"\b\16\1\2\u0089\33\3\2\2\2\u008a\u008b\7\26\2\2\u008b\u008c\b\17\1\2\u008c"+
		"\35\3\2\2\2\u008d\u008e\7\25\2\2\u008e\u008f\b\20\1\2\u008f\37\3\2\2\2"+
		"\t\'+OZr|\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}