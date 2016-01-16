


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

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

/**
 *
 * @author Miguel
 */
public class GramaticaGAMu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws XPathExpressionException {
        
        
        
        //System.out.println("versao ANTLR: "+ RuntimeMetaData.getRuntimeVersion());
        
        ANTLRInputStream in = new ANTLRInputStream( " ano-letivo: 2015/2016\n" +
                                                    " titulo: \"pascoa2 o regresso\"\n" +
                                                    " subtitulo: \"subtitulo\" \n" +
                                                    " tema: \"o migutUUUUU\" \n" +
                                                    " data: 20-12-2015\n" +
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
        
        PrintStream orig_err = System.err;
        System.setErr(System.out);
        // Executar gramatica
        System.out.println(parser.audicao()); 
        System.setErr(orig_err);
        
        
        
        
    }
    
}
