// Generated from C:\Users\Miguel\Desktop\-MiEI-\-MEI-\Gramáticas na Compreensão de Software\TrabalhoGitHub\GAMu\gramaticaGAMu\grammar\GAMu.g4 by ANTLR 4.4

        import java.util.*;
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;
        import java.sql.ResultSet;
        import java.sql.Statement;
        
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GAMuParser}.
 */
public interface GAMuListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GAMuParser#idProf}.
	 * @param ctx the parse tree
	 */
	void enterIdProf(@NotNull GAMuParser.IdProfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAMuParser#idProf}.
	 * @param ctx the parse tree
	 */
	void exitIdProf(@NotNull GAMuParser.IdProfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAMuParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(@NotNull GAMuParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAMuParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(@NotNull GAMuParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAMuParser#hora}.
	 * @param ctx the parse tree
	 */
	void enterHora(@NotNull GAMuParser.HoraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAMuParser#hora}.
	 * @param ctx the parse tree
	 */
	void exitHora(@NotNull GAMuParser.HoraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAMuParser#atuacoes}.
	 * @param ctx the parse tree
	 */
	void enterAtuacoes(@NotNull GAMuParser.AtuacoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAMuParser#atuacoes}.
	 * @param ctx the parse tree
	 */
	void exitAtuacoes(@NotNull GAMuParser.AtuacoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAMuParser#grupo}.
	 * @param ctx the parse tree
	 */
	void enterGrupo(@NotNull GAMuParser.GrupoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAMuParser#grupo}.
	 * @param ctx the parse tree
	 */
	void exitGrupo(@NotNull GAMuParser.GrupoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAMuParser#idAluno}.
	 * @param ctx the parse tree
	 */
	void enterIdAluno(@NotNull GAMuParser.IdAlunoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAMuParser#idAluno}.
	 * @param ctx the parse tree
	 */
	void exitIdAluno(@NotNull GAMuParser.IdAlunoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAMuParser#solo}.
	 * @param ctx the parse tree
	 */
	void enterSolo(@NotNull GAMuParser.SoloContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAMuParser#solo}.
	 * @param ctx the parse tree
	 */
	void exitSolo(@NotNull GAMuParser.SoloContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAMuParser#musico}.
	 * @param ctx the parse tree
	 */
	void enterMusico(@NotNull GAMuParser.MusicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAMuParser#musico}.
	 * @param ctx the parse tree
	 */
	void exitMusico(@NotNull GAMuParser.MusicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAMuParser#audicao}.
	 * @param ctx the parse tree
	 */
	void enterAudicao(@NotNull GAMuParser.AudicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAMuParser#audicao}.
	 * @param ctx the parse tree
	 */
	void exitAudicao(@NotNull GAMuParser.AudicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAMuParser#idObra}.
	 * @param ctx the parse tree
	 */
	void enterIdObra(@NotNull GAMuParser.IdObraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAMuParser#idObra}.
	 * @param ctx the parse tree
	 */
	void exitIdObra(@NotNull GAMuParser.IdObraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAMuParser#elementos}.
	 * @param ctx the parse tree
	 */
	void enterElementos(@NotNull GAMuParser.ElementosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAMuParser#elementos}.
	 * @param ctx the parse tree
	 */
	void exitElementos(@NotNull GAMuParser.ElementosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAMuParser#metaAud}.
	 * @param ctx the parse tree
	 */
	void enterMetaAud(@NotNull GAMuParser.MetaAudContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAMuParser#metaAud}.
	 * @param ctx the parse tree
	 */
	void exitMetaAud(@NotNull GAMuParser.MetaAudContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAMuParser#obras}.
	 * @param ctx the parse tree
	 */
	void enterObras(@NotNull GAMuParser.ObrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAMuParser#obras}.
	 * @param ctx the parse tree
	 */
	void exitObras(@NotNull GAMuParser.ObrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAMuParser#musicos}.
	 * @param ctx the parse tree
	 */
	void enterMusicos(@NotNull GAMuParser.MusicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAMuParser#musicos}.
	 * @param ctx the parse tree
	 */
	void exitMusicos(@NotNull GAMuParser.MusicosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GAMuParser#atuacao}.
	 * @param ctx the parse tree
	 */
	void enterAtuacao(@NotNull GAMuParser.AtuacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GAMuParser#atuacao}.
	 * @param ctx the parse tree
	 */
	void exitAtuacao(@NotNull GAMuParser.AtuacaoContext ctx);
}