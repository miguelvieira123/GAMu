// Generated from C:\Users\Miguel\Desktop\-MiEI-\-MEI-\Gramáticas na Compreensão de Software\TrabalhoGitHub\GAMu\gramaticaGAMu\grammar\GAMu.g4 by ANTLR 4.4
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
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		ID=10, INT=11, WS=12, STRING=13;
	public static final String[] tokenNames = {
		"<INVALID>", "'#'", "'data'", "'audicao:'", "'('", "')'", "':'", "'atuacoes:'", 
		"','", "'musicos:'", "ID", "INT", "WS", "STRING"
	};
	public static final int
		RULE_audicao = 0, RULE_metaAud = 1, RULE_atuacoes = 2, RULE_atuacao = 3, 
		RULE_duracao = 4, RULE_maestro = 5, RULE_musicos = 6, RULE_musico = 7, 
		RULE_idObra = 8, RULE_idProf = 9, RULE_idAluno = 10, RULE_idAt = 11, RULE_idAud = 12, 
		RULE_partitura = 13;
	public static final String[] ruleNames = {
		"audicao", "metaAud", "atuacoes", "atuacao", "duracao", "maestro", "musicos", 
		"musico", "idObra", "idProf", "idAluno", "idAt", "idAud", "partitura"
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

	public GAMuParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AudicaoContext extends ParserRuleContext {
		public Token data;
		public AtuacoesContext atuacoes() {
			return getRuleContext(AtuacoesContext.class,0);
		}
		public IdAudContext idAud() {
			return getRuleContext(IdAudContext.class,0);
		}
		public MetaAudContext metaAud() {
			return getRuleContext(MetaAudContext.class,0);
		}
		public TerminalNode STRING() { return getToken(GAMuParser.STRING, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); match(T__6);
			setState(29); idAud();
			setState(30); metaAud();
			setState(31); match(T__7);
			setState(32); ((AudicaoContext)_localctx).data = match(STRING);
			setState(33); atuacoes();
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
		public Token tema;
		public TerminalNode STRING() { return getToken(GAMuParser.STRING, 0); }
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
			setState(35); ((MetaAudContext)_localctx).tema = match(STRING);
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
		enterRule(_localctx, 4, RULE_atuacoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(T__2);
			setState(38); atuacao();
			setState(39); match(T__8);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(40); atuacao();
				setState(41); match(T__8);
				}
				}
				setState(47);
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
		public IdObraContext idObra() {
			return getRuleContext(IdObraContext.class,0);
		}
		public MusicosContext musicos() {
			return getRuleContext(MusicosContext.class,0);
		}
		public IdAtContext idAt() {
			return getRuleContext(IdAtContext.class,0);
		}
		public DuracaoContext duracao() {
			return getRuleContext(DuracaoContext.class,0);
		}
		public MaestroContext maestro() {
			return getRuleContext(MaestroContext.class,0);
		}
		public AtuacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final AtuacaoContext atuacao() throws RecognitionException {
		AtuacaoContext _localctx = new AtuacaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atuacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); idAt();
			setState(49); duracao();
			setState(50); idObra();
			setState(52);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(51); maestro();
				}
			}

			setState(54); musicos();
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
		public Token hora;
		public Token minuto;
		public Token segundo;
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
			setState(56); match(T__5);
			setState(57); ((DuracaoContext)_localctx).hora = match(INT);
			setState(58); match(T__3);
			setState(59); ((DuracaoContext)_localctx).minuto = match(INT);
			setState(60); match(T__3);
			setState(61); ((DuracaoContext)_localctx).segundo = match(INT);
			setState(62); match(T__4);
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

	public static class MaestroContext extends ParserRuleContext {
		public IdProfContext idProf() {
			return getRuleContext(IdProfContext.class,0);
		}
		public PartituraContext partitura() {
			return getRuleContext(PartituraContext.class,0);
		}
		public MaestroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maestro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).enterMaestro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).exitMaestro(this);
		}
	}

	public final MaestroContext maestro() throws RecognitionException {
		MaestroContext _localctx = new MaestroContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_maestro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); idProf();
			setState(65); partitura();
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
		enterRule(_localctx, 12, RULE_musicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(T__0);
			setState(68); musico();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(69); match(T__1);
				setState(70); musico();
				}
				}
				setState(75);
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
		public IdProfContext idProf() {
			return getRuleContext(IdProfContext.class,0);
		}
		public IdAlunoContext idAluno() {
			return getRuleContext(IdAlunoContext.class,0);
		}
		public PartituraContext partitura() {
			return getRuleContext(PartituraContext.class,0);
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
		enterRule(_localctx, 14, RULE_musico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(76); idAluno();
				}
				break;
			case 2:
				{
				setState(77); idProf();
				}
				break;
			}
			setState(80); partitura();
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

	public static class IdObraContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GAMuParser.ID, 0); }
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
		enterRule(_localctx, 16, RULE_idObra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(ID);
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
		public TerminalNode ID() { return getToken(GAMuParser.ID, 0); }
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
		enterRule(_localctx, 18, RULE_idProf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(ID);
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
		public TerminalNode ID() { return getToken(GAMuParser.ID, 0); }
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
		enterRule(_localctx, 20, RULE_idAluno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(ID);
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

	public static class IdAtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GAMuParser.ID, 0); }
		public IdAtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idAt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).enterIdAt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).exitIdAt(this);
		}
	}

	public final IdAtContext idAt() throws RecognitionException {
		IdAtContext _localctx = new IdAtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_idAt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(ID);
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

	public static class IdAudContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GAMuParser.ID, 0); }
		public IdAudContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idAud; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).enterIdAud(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).exitIdAud(this);
		}
	}

	public final IdAudContext idAud() throws RecognitionException {
		IdAudContext _localctx = new IdAudContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_idAud);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(ID);
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

	public static class PartituraContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GAMuParser.STRING, 0); }
		public PartituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).enterPartitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GAMuListener ) ((GAMuListener)listener).exitPartitura(this);
		}
	}

	public final PartituraContext partitura() throws RecognitionException {
		PartituraContext _localctx = new PartituraContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_partitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(STRING);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17a\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\7\4.\n\4\f\4\16\4\61\13\4\3\5\3\5\3\5\3\5\5\5"+
		"\67\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\7\bJ\n\b\f\b\16\bM\13\b\3\t\3\t\5\tQ\n\t\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\2\2V\2\36\3\2\2\2\4%\3\2\2\2\6\'\3\2\2\2\b\62\3\2\2"+
		"\2\n:\3\2\2\2\fB\3\2\2\2\16E\3\2\2\2\20P\3\2\2\2\22T\3\2\2\2\24V\3\2\2"+
		"\2\26X\3\2\2\2\30Z\3\2\2\2\32\\\3\2\2\2\34^\3\2\2\2\36\37\7\5\2\2\37 "+
		"\5\32\16\2 !\5\4\3\2!\"\7\4\2\2\"#\7\17\2\2#$\5\6\4\2$\3\3\2\2\2%&\7\17"+
		"\2\2&\5\3\2\2\2\'(\7\t\2\2()\5\b\5\2)/\7\3\2\2*+\5\b\5\2+,\7\3\2\2,.\3"+
		"\2\2\2-*\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\7\3\2\2\2\61/\3"+
		"\2\2\2\62\63\5\30\r\2\63\64\5\n\6\2\64\66\5\22\n\2\65\67\5\f\7\2\66\65"+
		"\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\5\16\b\29\t\3\2\2\2:;\7\6\2\2;<\7"+
		"\r\2\2<=\7\b\2\2=>\7\r\2\2>?\7\b\2\2?@\7\r\2\2@A\7\7\2\2A\13\3\2\2\2B"+
		"C\5\24\13\2CD\5\34\17\2D\r\3\2\2\2EF\7\13\2\2FK\5\20\t\2GH\7\n\2\2HJ\5"+
		"\20\t\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\17\3\2\2\2MK\3\2\2\2"+
		"NQ\5\26\f\2OQ\5\24\13\2PN\3\2\2\2PO\3\2\2\2QR\3\2\2\2RS\5\34\17\2S\21"+
		"\3\2\2\2TU\7\f\2\2U\23\3\2\2\2VW\7\f\2\2W\25\3\2\2\2XY\7\f\2\2Y\27\3\2"+
		"\2\2Z[\7\f\2\2[\31\3\2\2\2\\]\7\f\2\2]\33\3\2\2\2^_\7\17\2\2_\35\3\2\2"+
		"\2\6/\66KP";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}