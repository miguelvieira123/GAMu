
import org.antlr.v4.runtime.ANTLRInputStream;
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
        
        System.setErr(System.out);
        //System.out.println("versao ANTLR: "+ RuntimeMetaData.getRuntimeVersion());
        
        ANTLRInputStream in = new ANTLRInputStream( " titulo: \"titulo\"\n" +
                                                    " subtitulo: \"subtitulo\" \n" +
                                                    " tema: \"tema da audicao\" \n" +
                                                    " data: 5-1-2016 \n" +
                                                    " hora: 15:30\n" +
                                                    " local: \"local da audicao\"\n" +
                                                    " organizador: P13\n" +
                                                    " duracao-maxima: 13:00\n" +
                                                    " atuacoes:\n" +
                                                    "     grupo: \"nome da banda\" \n" +
                                                    "     elementos: A1510,I6\n" +
                                                    "                P11,I15\n" +//line 12
                                                    "                A20021,I7\n" +
                                                    "     obras: O1,\n" +
                                                    "            O2,\n" +
                                                    "            O3,\n" +
                                                    "            O4,\n" +
                                                    "            O32\n" +
                                                    "     #\n" +
                                                    "     solo: A1510,I6 \n" +
                                                    "     obras: O22,\n" +
                                                    "            O23\n" +
                                                    "     #  ");
        
        
        
        StringBuilder frase = new StringBuilder();
        for( String frag : args ){
            frase.append(" " + frag );
            if(frag.contains("\\n")){
                frase.append(System.getProperty("line.separator"));
            }
        }
        String temp = frase.toString();
        
        ANTLRInputStream in2 = new ANTLRInputStream( temp );
        
        GAMuLexer lexer = new GAMuLexer( (CharStream) in2);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GAMuParser parser = new GAMuParser(tokens);
        
        System.out.println(parser.audicao()); 
        
        
        //-----------------------------
       
        
        
        
        
        
        
    }
    
}
