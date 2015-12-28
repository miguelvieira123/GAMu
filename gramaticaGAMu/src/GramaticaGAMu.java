import org.antlr.runtime.ANTLRStringStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author Miguel
 */
public class GramaticaGAMu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ANTLRStringStream in = new ANTLRStringStream("audicao:\n" +
                                                    "	a001 \"Natal\" data \"2015-12-20\"\n" +
                                                    "	atuacoes:\n" +
                                                    "		at01 (0:5:55) ob01 \n" +
                                                    "		musicos:\n" +
                                                    "			alun98 \"clarinete.pdf\",\n" +
                                                    "			prof07 \"piano.pdf\",\n" +
                                                    "			alun77 \"ferrinhos.txt\"\n" +
                                                    "		#\n" +
                                                    "		at02 (0:9:23) ob33 \n" +
                                                    "		musicos:\n" +
                                                    "			alun47 \"guitarra_1.pdf\",\n" +
                                                    "			prof12 \"guitarra_2.pdf\",\n" +
                                                    "			alun11 \"bateria.txt\"\n" +
                                                    "		#");
        GAMuLexer lexer = new GAMuLexer((CharStream) in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GAMuParser parser = new GAMuParser(tokens);
        
        System.out.println(parser.audicao()); 
        
        
    }
    
}
