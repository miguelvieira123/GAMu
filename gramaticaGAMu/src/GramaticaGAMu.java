


import java.io.File;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.PrintStream;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Miguel
 */
public class GramaticaGAMu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //System.out.println("versao ANTLR: "+ RuntimeMetaData.getRuntimeVersion());
        
        ANTLRInputStream in = new ANTLRInputStream( " organizador: P1\n" +
                                                    " ano-letivo: 2015/2016\n" +
                                                    " titulo: \"YYYYYY\"\n" +
                                                    " subtitulo: \"subtitulo\" \n" +
                                                    " tema: \"o migutUUUUU\" \n" +
                                                    " data: 20/12/2015\n" +
                                                    " hora: 15:30\n" +
                                                    " local: \"local da audicao\"\n" +
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
        
        
        File source = new File("C:\\xampp\\htdocs\\site\\files\\auditions");
        File dest = new File("C:\\xampp\\htdocs\\site\\files\\backup");
        
        
        try { //fazer copia de segurança
            FileUtils.copyDirectory( source, dest );
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintStream orig_err = System.err;
        System.setErr(System.out);
        // Executar gramatica
        System.out.println(parser.audicao()); 
        System.setErr(orig_err);
        
       
        
        if(parser.getNumberOfSyntaxErrors()>0){
            try { //RollBack
                FileUtils.copyDirectory( dest, source );
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
     
        
    }
    
}
