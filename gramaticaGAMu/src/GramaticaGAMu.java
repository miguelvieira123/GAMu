
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuntimeMetaData;

/**
 *
 * @author Miguel
 */
public class GramaticaGAMu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("versao ANTLR: "+ RuntimeMetaData.getRuntimeVersion());
        
        
        ANTLRInputStream in = new ANTLRInputStream( "titulo: \"titulo\"\n" +
                                                    "        subtitulo: \"subtitulo\" \n" +
                                                    "        tema: \"tema da audicao\" \n" +
                                                    "        data: 5-1-2016 \n" +
                                                    "        hora: 15:30\n" +
                                                    "        local: \"local da audicao\"\n" +
                                                    "        organizador: P13\n" +
                                                    "        duracao-maxima: 02:00\n" +
                                                    "\n" +
                                                    "        atuacoes:\n" +
                                                    "            grupo: \"nome da banda\" \n" +
                                                    "            elementos: A1510,P11,A20021\n" +
                                                    "            obras: O1,O2,O3,O4,O32\n" +
                                                    "            #\n" +
                                                    "            solo: A1510 \n" +
                                                    "            obras: O22,O23\n" +
                                                    "            #");
        
        
        
        StringBuilder frase = new StringBuilder();
        for( String frag : args ){
            frase.append(" " + frag );
        }
        System.out.println("frase: "+frase);
        
        
        ANTLRInputStream in2 = new ANTLRInputStream( frase.toString() );
        
        GAMuLexer lexer = new GAMuLexer( (CharStream) in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GAMuParser parser = new GAMuParser(tokens);
        
        System.out.println(parser.audicao()); 
        
        
//       Time ttt = new Time((long) 55.66);
//       ttt.toLocalTime().toSecondOfDay();
//       Calendar cal =Calendar.getInstance();
//       cal.
        
    }
    
}
