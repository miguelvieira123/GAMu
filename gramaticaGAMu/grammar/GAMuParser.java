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
		T__0=17, IDA=18, IDP=19, IDO=20, ID=21, INT=22, WS=23, STRING=24;
	public static final String[] tokenNames = {
		"<INVALID>", "'tema:'", "'data:'", "'hora:'", "':'", "'titulo:'", "'grupo:'", 
		"'organizador:'", "'solo:'", "'#'", "'duracao-maxima:'", "'local:'", "'obras:'", 
		"'subtitulo:'", "'atuacoes:'", "','", "'elementos:'", "'-'", "IDA", "IDP", 
		"IDO", "ID", "INT", "WS", "STRING"
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
	            
	            // grammar variables 
	            static final long ONE_MINUTE_IN_MILLIS=60000;
	            long total_audition_time = (long)0.0;
	            float max_audition_time = (float)0.0;
	            
	        
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

			                   Time aaa = new Time(total_audition_time * 1000);
			                   System.out.println("tempo total audicao: "+ aaa.toString());
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); match(T__12);
			setState(34); match(STRING);
			setState(35); match(T__4);
			setState(36); match(STRING);
			setState(37); match(T__16);
			setState(38); match(STRING);
			setState(39); match(T__15);
			setState(40); data();
			setState(41); match(T__14);
			setState(42); ((MetaAudContext)_localctx).hora = hora();
			setState(43); match(T__6);
			setState(44); match(STRING);
			setState(45); match(T__10);
			setState(46); idProf();
			setState(47); match(T__7);
			setState(48); ((MetaAudContext)_localctx).hora = hora();
			max_audition_time = ((MetaAudContext)_localctx).hora.mili_seconds;
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
			setState(51); match(INT);
			setState(52); match(T__0);
			setState(53); match(INT);
			setState(54); match(T__0);
			setState(55); match(INT);
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
		public float mili_seconds;
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
			setState(57); ((HoraContext)_localctx).horas = match(INT);
			setState(58); match(T__13);
			setState(59); ((HoraContext)_localctx).minutos = match(INT);
			((HoraContext)_localctx).mili_seconds =  ((((HoraContext)_localctx).horas!=null?Integer.valueOf(((HoraContext)_localctx).horas.getText()):0)*60*60000+(((HoraContext)_localctx).minutos!=null?Integer.valueOf(((HoraContext)_localctx).minutos.getText()):0)*60000);
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
			setState(62); match(T__3);
			setState(63); ((AtuacoesContext)_localctx).atuacao = atuacao(_localctx.tempo);

			                                                _localctx.tempo+=((AtuacoesContext)_localctx).atuacao.tempo;
			                                                Time aaa = new Time(_localctx.tempo*1000);
			                                                System.out.println("tempo total atuacoes: "+ aaa.toString());
			                                            
			setState(65); match(T__8);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__9) {
				{
				{
				setState(66); ((AtuacoesContext)_localctx).atuacao = atuacao(_localctx.tempo);

				                                        _localctx.tempo+=((AtuacoesContext)_localctx).atuacao.tempo;
				                                        aaa.setTime(_localctx.tempo*1000);
				                                        System.out.println("tempo total atuacoes: "+ aaa.toString());
				                                    
				setState(68); match(T__8);
				}
				}
				setState(74);
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
			setState(83);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(77); ((AtuacaoContext)_localctx).grupo = grupo(_localctx.tempoIn);
				((AtuacaoContext)_localctx).tempo = ((AtuacaoContext)_localctx).grupo.tempo;
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(80); ((AtuacaoContext)_localctx).solo = solo(_localctx.tempoIn);
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
			setState(85); match(T__11);
			setState(86); match(STRING);
			setState(87); match(T__1);
			setState(88); elementos();
			setState(89); match(T__5);
			setState(90); ((GrupoContext)_localctx).obras = obras(_localctx.tempoIn);
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
			setState(93); match(T__9);
			setState(94); musico();
			setState(95); match(T__5);
			setState(96); ((SoloContext)_localctx).obras = obras(_localctx.tempoIn);
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
			setState(99); ((ObrasContext)_localctx).idObra = idObra();

			                            System.out.println("obra: "+ ((ObrasContext)_localctx).idObra.id);
			                            try{
			                                String sql = "SELECT  duracao FROM obra WHERE id='"+((ObrasContext)_localctx).idObra.id+"'";
			                                ResultSet rs = (ResultSet) stmt.executeQuery(sql);
			                                if(rs.next()){
			                                    
			                                    System.out.print(" duracao: " + rs.getTime("duracao"));
			                                    _localctx.tempo += (int)rs.getTime("duracao").toLocalTime().toSecondOfDay();
			                                    //_localctx.tempo += _localctx.tempoIn;
			                                    Time aaa = new Time(_localctx.tempo*1000);
			                                    System.out.println(" \t tempo total: "+ aaa.toString());
			                                }
			                                rs.close();
			                            }catch(SQLException se){
			                                se.printStackTrace();
			                            }
			                        
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(101); match(T__2);
				setState(102); ((ObrasContext)_localctx).idObra = idObra();

				                                System.out.println("obra: "+ ((ObrasContext)_localctx).idObra.id);
				                                try{
				                                    String sql = "SELECT  duracao FROM obra WHERE id='"+((ObrasContext)_localctx).idObra.id+"'";
				                                    ResultSet rs = (ResultSet) stmt.executeQuery(sql);
				                                    if(rs.next()){
				                                        
				                                        System.out.print(" duracao: " + rs.getTime("duracao"));
				                                        _localctx.tempo += (int)rs.getTime("duracao").toLocalTime().toSecondOfDay();
				                                        Time aaa = new Time(_localctx.tempo*1000);
				                                        System.out.println(" \t tempo total: "+ aaa.toString());
				                                    }
				                                    rs.close();
				                                }catch(SQLException se){
				                                    se.printStackTrace();
				                                }
				                            
				}
				}
				setState(109);
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
			setState(110); musicos();
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
			setState(112); musico();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(113); match(T__2);
				setState(114); musico();
				}
				}
				setState(119);
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
			setState(126);
			switch (_input.LA(1)) {
			case IDA:
				enterOuterAlt(_localctx, 1);
				{
				setState(120); ((MusicoContext)_localctx).idAluno = idAluno();

				                            try{
				                                //System.out.println("aluno: "+ ((MusicoContext)_localctx).idAluno.id);
				                                String sql = "SELECT COUNT(1) AS existe FROM aluno WHERE id='"+((MusicoContext)_localctx).idAluno.id+"'";
				                                ResultSet rs = (ResultSet) stmt.executeQuery(sql);
				                                if(rs.next()){
				                                    //System.out.println(" existe?: " + rs.getInt("existe"));
				                                    if(rs.getInt("existe") != 1){
				                                        System.out.println("<font color=\"red\">aluno: "+((MusicoContext)_localctx).idAluno.id+" nao existe</font>");
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
				setState(123); ((MusicoContext)_localctx).idProf = idProf();

				                         try{
				                                //System.out.println("professor: "+ ((MusicoContext)_localctx).idProf.id);
				                                String sql = "SELECT COUNT(1) AS existe FROM professor WHERE id='"+((MusicoContext)_localctx).idProf.id+"'";
				                                ResultSet rs = (ResultSet) stmt.executeQuery(sql);
				                                if(rs.next()){
				                                    if(rs.getInt("existe") != 1){
				                                        System.out.println("<font color=\"red\">professor: "+((MusicoContext)_localctx).idProf.id+" nao existe</font>");
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
			setState(128); ((IdObraContext)_localctx).IDO = match(IDO);
			((IdObraContext)_localctx).id =  (((IdObraContext)_localctx).IDO!=null?((IdObraContext)_localctx).IDO.getText():null);
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
			setState(131); ((IdProfContext)_localctx).IDP = match(IDP);
			((IdProfContext)_localctx).id =  (((IdProfContext)_localctx).IDP!=null?((IdProfContext)_localctx).IDP.getText():null);
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
			setState(134); ((IdAlunoContext)_localctx).IDA = match(IDA);
			((IdAlunoContext)_localctx).id =  (((IdAlunoContext)_localctx).IDA!=null?((IdAlunoContext)_localctx).IDA.getText():null);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u008c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\7\6I\n\6\f\6\16\6L\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7V\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\7\nl\n\n\f\n\16\no\13\n\3\13\3\13\3\f\3\f\3\f\7\fv\n\f\f\f\16"+
		"\fy\13\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0081\n\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		"\2\2\u0081\2 \3\2\2\2\4#\3\2\2\2\6\65\3\2\2\2\b;\3\2\2\2\n@\3\2\2\2\f"+
		"U\3\2\2\2\16W\3\2\2\2\20_\3\2\2\2\22e\3\2\2\2\24p\3\2\2\2\26r\3\2\2\2"+
		"\30\u0080\3\2\2\2\32\u0082\3\2\2\2\34\u0085\3\2\2\2\36\u0088\3\2\2\2 "+
		"!\5\4\3\2!\"\5\n\6\2\"\3\3\2\2\2#$\7\7\2\2$%\7\32\2\2%&\7\17\2\2&\'\7"+
		"\32\2\2\'(\7\3\2\2()\7\32\2\2)*\7\4\2\2*+\5\6\4\2+,\7\5\2\2,-\5\b\5\2"+
		"-.\7\r\2\2./\7\32\2\2/\60\7\t\2\2\60\61\5\34\17\2\61\62\7\f\2\2\62\63"+
		"\5\b\5\2\63\64\b\3\1\2\64\5\3\2\2\2\65\66\7\30\2\2\66\67\7\23\2\2\678"+
		"\7\30\2\289\7\23\2\29:\7\30\2\2:\7\3\2\2\2;<\7\30\2\2<=\7\6\2\2=>\7\30"+
		"\2\2>?\b\5\1\2?\t\3\2\2\2@A\7\20\2\2AB\5\f\7\2BC\b\6\1\2CJ\7\13\2\2DE"+
		"\5\f\7\2EF\b\6\1\2FG\7\13\2\2GI\3\2\2\2HD\3\2\2\2IL\3\2\2\2JH\3\2\2\2"+
		"JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\b\6\1\2N\13\3\2\2\2OP\5\16\b\2PQ\b\7"+
		"\1\2QV\3\2\2\2RS\5\20\t\2ST\b\7\1\2TV\3\2\2\2UO\3\2\2\2UR\3\2\2\2V\r\3"+
		"\2\2\2WX\7\b\2\2XY\7\32\2\2YZ\7\22\2\2Z[\5\24\13\2[\\\7\16\2\2\\]\5\22"+
		"\n\2]^\b\b\1\2^\17\3\2\2\2_`\7\n\2\2`a\5\30\r\2ab\7\16\2\2bc\5\22\n\2"+
		"cd\b\t\1\2d\21\3\2\2\2ef\5\32\16\2fm\b\n\1\2gh\7\21\2\2hi\5\32\16\2ij"+
		"\b\n\1\2jl\3\2\2\2kg\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\23\3\2\2\2"+
		"om\3\2\2\2pq\5\26\f\2q\25\3\2\2\2rw\5\30\r\2st\7\21\2\2tv\5\30\r\2us\3"+
		"\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\27\3\2\2\2yw\3\2\2\2z{\5\36\20\2"+
		"{|\b\r\1\2|\u0081\3\2\2\2}~\5\34\17\2~\177\b\r\1\2\177\u0081\3\2\2\2\u0080"+
		"z\3\2\2\2\u0080}\3\2\2\2\u0081\31\3\2\2\2\u0082\u0083\7\26\2\2\u0083\u0084"+
		"\b\16\1\2\u0084\33\3\2\2\2\u0085\u0086\7\25\2\2\u0086\u0087\b\17\1\2\u0087"+
		"\35\3\2\2\2\u0088\u0089\7\24\2\2\u0089\u008a\b\20\1\2\u008a\37\3\2\2\2"+
		"\7JUmw\u0080";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}