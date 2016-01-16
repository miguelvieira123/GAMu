
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;


import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

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
        
        GAMuLexer lexer = new GAMuLexer( (CharStream) in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GAMuParser parser = new GAMuParser(tokens);
        
        System.out.println(parser.audicao()); 
        
        
        //-----------------------------
        try {
		String filepath = "audicoes.xml";
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(filepath);
                
                
                
		// Get the root element
		Node audicoes = doc.getFirstChild();
                
                
                Node audicao = doc.getElementsByTagName("titulo_1").item(0);
                System.out.println(">>"+audicao.getNodeName());
                
		// Get the staff element , it may not working if tag has spaces, or
		// whatever weird characters in front...it's better to use
		// getElementsByTagName() to get it directly.
		// Node staff = company.getFirstChild();

		// Get the staff element by tag name directly
		Node staff = doc.getElementsByTagName("staff").item(0);
                
		// update staff attribute
		//NamedNodeMap attr = staff.getAttributes();
		//Node nodeAttr = attr.getNamedItem("id");
		//nodeAttr.setTextContent("2");

		// append a new node to staff
		//Element age = doc.createElement("age");
		//age.appendChild(doc.createTextNode("28"));
		//staff.appendChild(age);

		// loop the staff child node
		//NodeList list = staff.getChildNodes();

//		for (int i = 0; i < list.getLength(); i++) {
//			
//                   Node node = list.item(i);
//
//		   // get the salary element, and update the value
//		   if ("salary".equals(node.getNodeName())) {
//			node.setTextContent("2000000");
//		   }
//
//                   //remove firstname
//		   if ("firstname".equals(node.getNodeName())) {
//			staff.removeChild(node);
//		   }
//
//		}

		// write the content into xml file
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File(filepath));
		transformer.transform(source, result);

		System.out.println("Done");
                
	   } catch (ParserConfigurationException | TransformerException | IOException | SAXException pce) {
		pce.printStackTrace();
	   }
	
        
        
    }
    
}
