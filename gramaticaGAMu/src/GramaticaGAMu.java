


import java.io.File;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.PrintStream;
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
        
        ANTLRInputStream in = new ANTLRInputStream( " organizador: P2\n" +
                                                    " ano-letivo: 2015/2016\n" +
                                                    " titulo: \"Teste2\"\n" +
                                                    " subtitulo: \"subtitulo2\" \n" +
                                                    " tema: \"o tema2\" \n" +
                                                    " data: 20/12/2015\n" +
                                                    " hora: 13:30\n" +
                                                    " local: \"local da audicao\"\n" +
                                                    " duracao-maxima: 13:00\n" +
                                                    " atuacoes:\n" +
                                                    "     grupo: \"nome da banda\" \n" +
                                                    "     elementos: A1510,I9\n" +
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
        }
        
        String temp = frase.toString();
        temp = temp.replace("\\n", System.getProperty("line.separator"));
        
        ANTLRInputStream in2 = new ANTLRInputStream( temp );
        
        GAMuLexer lexer = new GAMuLexer( (CharStream) in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GAMuParser parser = new GAMuParser(tokens);
        
        
        File source = new File("C:\\xampp\\htdocs\\site\\files\\auditions");
        File dest = new File("C:\\xampp\\htdocs\\site\\files\\backup");
        
        
        try { //fazer copia de segurança
            FileUtils.copyDirectory( source, dest );
        } catch (IOException e) {
            //e.printStackTrace();
        }
        try{
            PrintStream orig_err = System.err;
            System.setErr(System.out);
            parser.audicao();
            System.setErr(orig_err);
        }catch(NullPointerException e){
            //e.printStackTrace();
        }
       
        
        if(parser.getNumberOfSyntaxErrors()>0){
            try { //RollBack
                FileUtils.copyDirectory( dest, source );
                System.out.println("Existem erros de <font color=\"red\">Sintax!</font> Audicao nao foi inserida");
            } catch (IOException e) {
                //e.printStackTrace();
            }
        }else{
            if(parser.getFlag()==0){
                System.out.println("<font color=\"green\">Audicao inserida com sucesso!</font>");
            }
            
        }
        
        
         
        
        
        
    }
    
}
