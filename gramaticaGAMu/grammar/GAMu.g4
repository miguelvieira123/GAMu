/*
    ** * Linguagem para programação de uma Audição * **
 *
 *      ---- Grupo 9 --------------------------------
 *        a62819   - Luís Miguel Fernandes Vieira
 *        pg30469  - Oleskii Gylytskyy
 *      ---------------------------------------------
 *
 */

grammar GAMu;

@header{
        import java.util.*;
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;
        import java.sql.ResultSet;
        import java.sql.Statement;
        import java.sql.Time;
        import java.time.Instant;
        import java.io.PrintWriter;
        import java.io.FileNotFoundException;
        import java.util.logging.Level;
        import java.util.logging.Logger;
        
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

        }
@members{
            // JDBC driver name and database URL
            String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
            String DB_URL = "jdbc:mysql://127.0.0.1:3306/gamu";
            // Database credentials
            String USER = "usrPRI";
            String PASS = "popo";
            // Database connection
            Connection conn = null;
            Statement stmt = null;
            
            // Grammar variables 
            long hora_de_inicio = 0;
            long total_audition_time = 0;
            int max_audition_time = 0;
            StringBuilder audicao_xml = new StringBuilder();
            String titulo;
            String anoLetivo;
            
        }
audicao     @init{
                   try{
                      //STEP 2: Register JDBC driver
                      Class.forName("com.mysql.jdbc.Driver");
                      //STEP 3: Open a connection
                      conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
                      //STEP 4: Execute a query
                      stmt = (Statement) conn.createStatement();
                      
                   }catch(SQLException se){
                      //Handle errors for JDBC
                      se.printStackTrace();
                   }catch(Exception e){
                      //Handle errors for Class.forName
                      e.printStackTrace();
                   }
                   //iniciar a construcao do XML
                   audicao_xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
                   }
            @after{ 
                   Time audicao = new Time(total_audition_time * 1000);
                   System.out.println("tempo total audicao: "+ audicao.toString());
                   Time max = new Time(max_audition_time*1000);
                   System.out.println("duracao-maxima: "+ max.toString());
                   
                    if(max_audition_time < total_audition_time){
                        long dif = total_audition_time - max_audition_time - 3600;
                        Time time = new Time(dif * 1000);
                        System.out.println("tempo total ultrapasssa duracao estimada:<font color=\"red\"> +"+time.toString()+"</font>");
                    }
                    try{
                        if(stmt!=null)
                            stmt.close();
                        if(conn!=null)
                            conn.close();
                    }catch(SQLException se){
                      //Handle errors for JDBC
                      se.printStackTrace();
                    }
                    
                    
                    //--------------XML---------------
                    //audicao valida?
                    try {
                        String filepath = "audition/"+anoLetivo +".xml";
                        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
                        Document doc = docBuilder.parse(filepath);

                        String xml = audicao_xml.toString();
                        Document audi_xml = docBuilder.parse( new InputSource(new ByteArrayInputStream(xml.getBytes("utf-8")))); 

                        Element basket = (Element) doc.getFirstChild();
                        Element fruit = (Element) audi_xml.getFirstChild();

                        // remover Nodo antigo
                        XPathFactory xpf = XPathFactory.newInstance();
                        XPath xpath = xpf.newXPath();
                        XPathExpression expression = xpath.compile("//audicao[@id="+titulo+"]");
                        Node audicao_antiga = (Node) expression.evaluate(doc, XPathConstants.NODE);
                        if(audicao_antiga != null){
                            audicao_antiga.getParentNode().removeChild(audicao_antiga);
                        }

                        // Adicionar novo novo
                        Node imported = doc.importNode(fruit,true);
                        basket.appendChild(imported);

                        // write the content into xml file
                        TransformerFactory transformerFactory = TransformerFactory.newInstance();
                        Transformer transformer = transformerFactory.newTransformer();
                        DOMSource source = new DOMSource(doc);
                        StreamResult result = new StreamResult(new File(filepath));
                        transformer.transform(source, result);


                   } catch (ParserConfigurationException | TransformerException | IOException |XPathExpressionException | SAXException pce) {
                        pce.printStackTrace();
                   }
                    
                  }
            :	metaAud 
                {audicao_xml.append("</metainfo><atuacoes>");} atuacoes 
                {audicao_xml.append("</atuacoes></audicao>");}
            ;

metaAud     :	'ano-letivo:' a1=INT'/'a2=INT {anoLetivo = $a1.text+"_"+$a2.text;}
                'titulo:' STRING  {
                                    titulo = $STRING.text;
                                    audicao_xml.append("<audicao id="+$STRING.text+">");
                                    audicao_xml.append("<metainfo>");
                                  }
                ('subtitulo:' STRING{audicao_xml.append("<subtitulo>"+$STRING.text+"</subtitulo>");})? 
                ('tema:' STRING{audicao_xml.append("<tema>"+$STRING.text+"</tema>");})?
                'data:' data 
                'hora:' hora { hora_de_inicio = $hora.seconds-3600;}
                'local:' STRING {audicao_xml.append("<local>"+$STRING.text+"</local>");}
                'organizador:' idProf {
                                         try{
                                                String sql = "SELECT * FROM professor WHERE id='"+$idProf.id+"'";
                                                ResultSet rs = (ResultSet) stmt.executeQuery(sql);
                                                if(rs.next()){
                                                    audicao_xml.append("<organizador id=\""+$idProf.id+"\">"+rs.getString("nome")+"</organizador>");
                                                }else{
                                                    System.out.print("line "+$idProf.linha+" coluna: "+ $idProf.coluna);
                                                    System.out.println("  professor: "+$idProf.id+" nao existe");
                                                }
                                                rs.close();
                                            }catch(SQLException se){
                                                se.printStackTrace();
                                            }
                                      }
                'duracao-maxima:' duracao {
                                            max_audition_time = $duracao.seconds-3600;
                                          }
            ;

data        :   dia=INT'-'mes=INT'-'ano=INT {audicao_xml.append("<data>"+$dia.int+"/"+$mes.int+"/"+$ano.int+"</data>");}
            ;

hora        returns[int seconds]:   
                horas=INT':'minutos=INT {
                                            $seconds = ($horas.int*60*60 + $minutos.int*60);
                                            audicao_xml.append("<hora>"+$horas.int+":"+$minutos.int+"</hora>");
                                        }
            ;
duracao        returns[int seconds]:   
                horas=INT':'minutos=INT {
                                            $seconds = ($horas.int*60*60 + $minutos.int*60);
                                            audicao_xml.append("<duracao>"+$horas.int+":"+$minutos.int+"</duracao>");
                                        }
            ;
atuacoes    returns[long tempo]
            :   'atuacoes:' atuacao[$tempo-3600]{$tempo = $atuacao.tempo;} '#' 
                (atuacao[$tempo]{$tempo = $atuacao.tempo;} '#')* {total_audition_time = $tempo;}
            ;

atuacao     [long tempoIn]
            returns[long tempo]
            :   {audicao_xml.append("<atuacao tipo=\"grupo\">");}
                grupo[$tempoIn] {
                                    $tempo=$grupo.tempo;
                                    audicao_xml.append("</atuacao>");
                                }
            |   {audicao_xml.append("<atuacao tipo=\"solo\">");}
                solo[$tempoIn]  {
                                    $tempo=$solo.tempo;
                                    audicao_xml.append("</atuacao>");
                                }
            ;

grupo       [long tempoIn]
            returns[long tempo]
            :   'grupo:' STRING {
                                    audicao_xml.append("<nome_grupo>"+$STRING.text+"</nome_grupo>");
                                    Time hora_ini = new Time( (hora_de_inicio +$tempoIn ) * 1000);
                                    audicao_xml.append("<hora_inicio>"+hora_ini.toString()+"</hora_inicio>");
                                }
                'elementos:'    {audicao_xml.append("<musicos>");} 
                                    musicos 
                                {audicao_xml.append("</musicos>");} 
                'obras:'    {audicao_xml.append("<obras>");}  
                                obras[$tempoIn]
                            {audicao_xml.append("</obras>");$tempo = $obras.tempo;}
            ;
solo        [long tempoIn]
            returns[long tempo]
            :   {
                    Time hora_ini = new Time( (hora_de_inicio +$tempoIn) * 1000);
                    audicao_xml.append("<hora_inicio>"+hora_ini.toString()+"</hora_inicio>");
                }
                'solo:' {audicao_xml.append("<musicos>");} 
                            musico  
                        {audicao_xml.append("</musicos>");}
                'obras:'{audicao_xml.append("<obras>");} 
                            obras[$tempoIn]
                        {audicao_xml.append("</obras>");$tempo = $obras.tempo;}
            ;
obras       [long tempoIn]
            returns[long tempo] 
            :   idObra { 
                            try{
                                String sql = "SELECT * FROM obra WHERE id='"+$idObra.id+"'";
                                ResultSet rs = (ResultSet) stmt.executeQuery(sql);
                                if(rs.next()){
                                    $tempo += rs.getTime("duracao").toLocalTime().toSecondOfDay();
                                    $tempo += $tempoIn;
                                    if($tempo>max_audition_time){
                                        System.out.println(" obra: "+$idObra.id+" tempo _max ultrapassado");
                                    }else{
                                        audicao_xml.append("<obra id=\""+$idObra.id+"\">");
                                        audicao_xml.append("<nome>"+rs.getString("nome")+"</nome>");
                                        audicao_xml.append("<duracao>"+rs.getString("duracao")+"</duracao>");
                                        audicao_xml.append("</obra>");
                                    }
                                }else{
                                    System.out.print("line "+$idObra.linha);
                                    System.out.println(" obra: "+$idObra.id+" nao existe");
                                }
                                rs.close();
                            }catch(SQLException se){
                                se.printStackTrace();
                            }
                        }
                (','idObra  {
                                try{
                                    String sql = "SELECT * FROM obra WHERE id='"+$idObra.id+"'";
                                    ResultSet rs = (ResultSet) stmt.executeQuery(sql);
                                    if(rs.next()){
                                        $tempo += rs.getTime("duracao").toLocalTime().toSecondOfDay();
                                        if($tempo>max_audition_time){
                                            System.out.println(" obra: "+$idObra.id+" tempo _max ultrapassado");
                                        }else{
                                            audicao_xml.append("<obra id=\""+$idObra.id+"\">");
                                            audicao_xml.append("<nome>"+rs.getString("nome")+"</nome>");
                                            audicao_xml.append("<duracao>"+rs.getString("duracao")+"</duracao>");
                                            audicao_xml.append("</obra>");
                                        }
                                    }else{
                                        System.out.print("line "+$idObra.linha);
                                        System.out.println(" obra: "+$idObra.id+" nao existe");
                                    }
                                    rs.close();
                                }catch(SQLException se){
                                    se.printStackTrace();
                                }
                            }
                )* 
            ;

musicos     :   musico (musico)*
            ;
musico      :    idAluno ',' idInstrumento {
                                            audicao_xml.append("<musico tipo=\"aluno\" id=\""+$idAluno.id+"\">");
                                            try{
                                                String sql = "SELECT * FROM aluno WHERE id='"+$idAluno.id+"'";
                                                ResultSet rs = (ResultSet) stmt.executeQuery(sql);
                                                if(rs.next()){
                                                    String nome_aluno = rs.getString("nome");
                                                    sql = "SELECT * FROM instrumento WHERE id='"+$idInstrumento.id+"'";
                                                    rs = (ResultSet) stmt.executeQuery(sql);
                                                    if(rs.next()){
                                                        //aluno sabe tocar instrumento?
                                                        String designacao_instrumento = rs.getString("designacao");
                                                        sql = "SELECT * FROM aluno_instrumento WHERE id_aluno='"+$idAluno.id+"' AND id_instrumento='"+$idInstrumento.id+"'";
                                                        rs = (ResultSet) stmt.executeQuery(sql);
                                                        if(rs.next()){
                                                            //OK
                                                            audicao_xml.append("<nome>"+nome_aluno+"</nome>");
                                                            audicao_xml.append("<instrumento id=\""+$idInstrumento.id+"\">"+designacao_instrumento+"</instrumento>");
                                                        }else{
                                                            System.out.print("line "+$idAluno.linha);
                                                            System.out.print(" (aluno: "+$idAluno.id+" - "+ nome_aluno+")" );
                                                            System.out.println(" nao tem habilitacoes para ("+$idInstrumento.id+" - "+ designacao_instrumento+")");
                                                        }
                                                        //posso guardar as informações do instrumento
                                                    }else{
                                                        System.out.print("line "+$idInstrumento.linha);
                                                        System.out.println("  instrumento: "+$idInstrumento.id+" nao existe");   
                                                    }
                                                    //posso guardar as informações do aluno
                                                    //guardar info do aluno
                                                }else{
                                                    System.out.print("line "+$idAluno.linha);
                                                    System.out.println("  aluno: "+$idAluno.id+" nao existe");   
                                                }
                                                rs.close();
                                            }catch(SQLException se){
                                                se.printStackTrace();
                                            }
                                            audicao_xml.append("</musico>");
                                         } 
            |   idProf ',' idInstrumento {
                                            audicao_xml.append("<musico tipo=\"professor\" id=\""+$idProf.id+"\">");
                                            try{
                                                String sql = "SELECT * FROM professor WHERE id='"+$idProf.id+"'";
                                                ResultSet rs = (ResultSet) stmt.executeQuery(sql);
                                                if(rs.next()){
                                                    String nome_prof = rs.getString("nome");
                                                    sql = "SELECT * FROM instrumento WHERE id='"+$idInstrumento.id+"'";
                                                    rs = (ResultSet) stmt.executeQuery(sql);
                                                    if(rs.next()){
                                                        //professor sabe tocar instrumento?
                                                        String designacao_instrumento = rs.getString("designacao");
                                                        sql = "SELECT * FROM professor INNER JOIN professor_habilitacao ON professor.id=professor_habilitacao.id_professor INNER JOIN habilitacao ON professor_habilitacao.id_habilitacao=habilitacao.id WHERE professor.id = '"+$idProf.id+"'AND id_instrumento='"+$idInstrumento.id+"'";                  
                                                        rs = (ResultSet) stmt.executeQuery(sql);
                                                        if(rs.next()){
                                                            //OK
                                                            audicao_xml.append("<nome>"+nome_prof+"</nome>");
                                                            audicao_xml.append("<instrumento id=\""+$idInstrumento.id+"\">"+designacao_instrumento+"</instrumento>");
                                                        }else{
                                                            System.out.print("line "+$idProf.linha);
                                                            System.out.print(" (professor: "+$idProf.id+" - "+ nome_prof+")" );
                                                            System.out.println(" nao tem habilitacoes para ("+$idInstrumento.id+" - "+ designacao_instrumento+")");
                                                        }
                                                        //posso guardar as informações do instrumento
                                                    }else{
                                                        System.out.print("line "+$idInstrumento.linha);
                                                        System.out.println("  instrumento: "+$idInstrumento.id+" nao existe");   
                                                    }
                                                    //posso guardar as informações do aluno
                                                    //guardar info do aluno
                                                }else{
                                                    System.out.print("line "+$idProf.linha);
                                                    System.out.println("  professor: "+$idProf.id+" nao existe");   
                                                }
                                                rs.close();
                                            }catch(SQLException se){
                                                se.printStackTrace();
                                            }
                                            audicao_xml.append("</musico>");
                                         }
            ;




idObra	returns[String id, int linha, int coluna]:   IDO{   $id = $IDO.text;
                                                            $linha = $IDO.getLine();
                                                            $coluna = $IDO.getCharPositionInLine();
                                                        };
idProf 	returns[String id, int linha, int coluna]:   IDP{   $id = $IDP.text;
                                                            $linha = $IDP.getLine();
                                                            $coluna = $IDP.getCharPositionInLine();
                                                        };
idAluno	returns[String id, int linha, int coluna]:   IDA{   $id = $IDA.text;
                                                            $linha = $IDA.getLine();
                                                            $coluna = $IDA.getCharPositionInLine();
                                                        };
idInstrumento	returns[String id, int linha, int coluna]:   IDI{   $id = $IDI.text;
                                                                    $linha = $IDI.getLine();
                                                                    $coluna = $IDI.getCharPositionInLine();
                                                                };

      
/*--------------- Lexer ---------------------------------------*/


COMMENT
    :   ( '//' ~[\r\n]* '\r'? '\n'
        | '/*' .*? '*/'
        | '\\n'
        ) -> skip
    ;



IDA  :	('a'|'A') ('0'..'9')*
     ;
IDP  :	('p'|'P') ('0'..'9')*
     ;
IDO  :	('o'|'O') ('0'..'9')*
     ;
IDI  :	('i'|'I') ('0'..'9')*
     ;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'-')*
    ;

INT :	'0'..'9'+('.'('0'..'9')+)?
    ;

WS  :   [ \t\r\n]  -> skip
    ;
    
STRING
    :  '"' ( ESC_SEQ | ~('"') )* '"'
    ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;
 
fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') 
    ;




