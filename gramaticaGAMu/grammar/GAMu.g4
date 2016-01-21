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
            String DB_URL = "jdbc:mysql://127.0.0.1:3306/gamu??useUnicode=true&characterEncoding=UTF-8";
            // Database credentials
            String USER = "root";
            String PASS = "qweqwe";
            // Database connection
            Connection conn = null;
            Statement stmt = null;
            
            // Grammar variables 
            private int max_audition_time = 0;
            private String titulo;
            private String anoLetivo=null;
            /** flag!=0, ocorreu erro semantico.*/
            private int flag = 0;
            
            public int getFlag(){
                return this.flag;
            }
            
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
                   StringBuilder audicao_xml = new StringBuilder();
                   audicao_xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
                   }
            @after{
                    try{
                        if(stmt!=null)
                            stmt.close();
                        if(conn!=null)
                            conn.close();
                    }catch(SQLException se){
                      //Handle errors for JDBC
                      se.printStackTrace();
                    }
                    
                    
                    
                  }
            :	metaAud [audicao_xml]
                {
                 titulo = $metaAud.titulo_aud;
                 anoLetivo = $metaAud.ano_letivo;
                 audicao_xml = $metaAud.xmlOut;
                 if(audicao_xml != null){
                    audicao_xml.append("</metainfo><atuacoes>");
                 }else{
                    audicao_xml = new StringBuilder();
                 }
                 
                } 
                atuacoes [audicao_xml, $metaAud.hora_inicio]
                {
                   Time audicao = new Time($atuacoes.tempo * 1000);
                   System.out.println("tempo total audicao: "+ audicao.toString());
                   Time max = new Time(max_audition_time*1000);
                   System.out.println("duracao-maxima: "+ max.toString());
                   
                    if(max_audition_time < $atuacoes.tempo){
                        long dif = $atuacoes.tempo - max_audition_time - 3600;
                        Time time = new Time(dif * 1000);
                        System.out.println("tempo total ultrapasssa duracao estimada:<font color=\"red\"> +"+time.toString()+"</font>");
                    }
                    audicao_xml = $atuacoes.xmlOut;
                    if(audicao_xml != null){
                        audicao_xml.append("</atuacoes></audicao>");
                    }else{
                        audicao_xml = new StringBuilder();
                    }
                        
                    //--------------XML---------------
                    //audicao valida?
                    
                    if(anoLetivo!=null && flag!=1){
                    try {
                        String filepath = "C:\\xampp\\htdocs\\site\\files\\auditions\\"+anoLetivo+".xml";
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

                        // Adicionar nova audicao
                        Node imported = doc.importNode(fruit,true);
                        basket.appendChild(imported);

                        // write the content into xml file
                        TransformerFactory transformerFactory = TransformerFactory.newInstance();
                        Transformer transformer = transformerFactory.newTransformer();
                        DOMSource source = new DOMSource(doc);
                        StreamResult result = new StreamResult(new File(filepath));
                        transformer.transform(source, result);

                   } catch (ParserConfigurationException | TransformerException | IOException |XPathExpressionException | SAXException pce) {
                        //pce.printStackTrace();
                        System.out.println("erro - nao foi possivel guardar audicao");
                   }
                    }else{
                        System.out.println("Planeamento da Audicao contem erros, alteracoes ignoradas.");
                    }
                }
            ;

metaAud     [StringBuilder xmlIn]
            returns[String titulo_aud, String ano_letivo, StringBuilder xmlOut, long hora_inicio]
            :	'organizador:' id_prof=idProf 
                'ano-letivo:' a1=INT'/'a2=INT {$ano_letivo = $a1.text+"_"+$a2.text;}
                'titulo:' STRING  { 
                                    $titulo_aud = $STRING.text;
                                    $xmlIn.append("<audicao id="+$STRING.text+">");
                                    $xmlIn.append("<metainfo>");
                                    try{
                                            String sql = "SELECT * FROM professor WHERE id='"+$id_prof.id+"'";
                                            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
                                            if(rs.next()){
                                                $xmlIn.append("<organizador id=\""+$id_prof.id+"\">"+rs.getString("nome")+"</organizador>");
                                            }else{
                                                System.out.print("line "+$id_prof.linha+" coluna: "+ $id_prof.coluna);
                                                System.out.println("  professor: "+$id_prof.id+" nao existe");
                                                flag=1;
                                            }
                                            rs.close();
                                        }catch(SQLException se){
                                            se.printStackTrace();
                                        }
                                  }
                ('subtitulo:' STRING{$xmlIn.append("<subtitulo>"+$STRING.text+"</subtitulo>");})? 
                ('tema:' STRING{$xmlIn.append("<tema>"+$STRING.text+"</tema>");})?
                'data:' data[$xmlIn] 
                'hora:' hora[$xmlIn] { $hora_inicio = $hora.seconds-3600;}
                'local:' STRING {$xmlIn.append("<local>"+$STRING.text+"</local>");}
                'duracao-maxima:' duracao[$xmlIn]   {
                                                        max_audition_time = $duracao.seconds-3600;
                                                        $xmlOut = $xmlIn;
                                                    }
            ;

data        [StringBuilder xmlIn]
            returns[StringBuilder xmlOut]:   
            dia=INT'/'mes=INT'/'ano=INT {
                                            $xmlIn.append("<data>"+$dia.int+"/"+$mes.int+"/"+$ano.int+"</data>");
                                            $xmlOut = $xmlIn;
                                        }
            ;

hora        [StringBuilder xmlIn]
            returns[int seconds, StringBuilder xmlOut]:   
            horas=INT':'minutos=INT {
                                        $seconds = ($horas.int*60*60 + $minutos.int*60);
                                        $xmlIn.append("<hora>"+$horas.int+":"+$minutos.int+"</hora>");
                                        $xmlOut = $xmlIn;
                                    }
            ;
duracao     [StringBuilder xmlIn]
            returns[int seconds, StringBuilder xmlOut]:   
            horas=INT':'minutos=INT {
                                        $seconds = ($horas.int*60*60 + $minutos.int*60);
                                        $xmlIn.append("<duracao>"+$horas.int+":"+$minutos.int+"</duracao>");
                                        $xmlOut = $xmlIn;
                                    }
            ;

atuacoes    [StringBuilder xmlIn, long hora_inicio]
            returns[long tempo, StringBuilder xmlOut]
            :   'atuacoes:' atuacao[($tempo-3600), $xmlIn, $hora_inicio]  {
                                                                $tempo = $atuacao.tempo;
                                                                $xmlOut = $atuacao.xmlOut;
                                                            } '#' 
                (atuacao[$tempo, $xmlOut, $hora_inicio]   {
                                                $tempo = $atuacao.tempo;
                                                $xmlOut = $atuacao.xmlOut;
                                            } '#')* 
            ;

atuacao     [long tempoIn, StringBuilder xmlIn, long hora_inicio]
            returns[long tempo, StringBuilder xmlOut]
            :   {$xmlIn.append("<atuacao tipo=\"grupo\">");}
                grupo[$tempoIn, $xmlIn, $hora_inicio] {
                                            $tempo=$grupo.tempo;
                                            $xmlOut = $grupo.xmlOut;
                                            $xmlOut.append("</atuacao>");
                                        }
            |   {$xmlIn.append("<atuacao tipo=\"solo\">");}
                solo[$tempoIn, $xmlIn, $hora_inicio]  {
                                            $tempo=$solo.tempo;
                                            $xmlOut = $solo.xmlOut;
                                            $xmlOut.append("</atuacao>");
                                        }
            ;

grupo       [long tempoIn, StringBuilder xmlIn, long hora_inicio]
            returns[long tempo, StringBuilder xmlOut]
            :   'grupo:' STRING {
                                    $xmlIn.append("<nome_grupo>"+$STRING.text+"</nome_grupo>");
                                    Time hora_ini = new Time( ($hora_inicio +$tempoIn ) * 1000);
                                    $xmlIn.append("<hora_inicio>"+hora_ini.toString()+"</hora_inicio>");
                                }
                'elementos:'    {
                                    $xmlIn.append("<musicos>");
                                } 
                                    musicos[$xmlIn]
                                {
                                    $xmlIn = $musicos.xmlOut;
                                    $xmlIn.append("</musicos>");
                                } 
                'obras:'    {
                                $xmlIn.append("<obras>");
                            }  
                                obras[$tempoIn, $xmlIn]
                            {
                                $xmlIn = $obras.xmlOut;
                                $xmlIn.append("</obras>");
                                $tempo = $obras.tempo;
                                $xmlOut = $xmlIn;
                            }
            ;
solo        [long tempoIn, StringBuilder xmlIn, long hora_inicio]
            returns[long tempo, StringBuilder xmlOut]
            :   {
                    Time hora_ini = new Time( ($hora_inicio +$tempoIn) * 1000);
                    $xmlIn.append("<hora_inicio>"+hora_ini.toString()+"</hora_inicio>");
                }
                'solo:' {
                            $xmlIn.append("<musicos>");
                        } 
                            musico[$xmlIn]
                        {   
                            $xmlIn=$musico.xmlOut; 
                            $xmlIn.append("</musicos>");
                        }
                'obras:'{
                            $xmlIn.append("<obras>");
                        } 
                            obras[$tempoIn, $xmlIn]
                        {
                            $xmlIn=$obras.xmlOut; 
                            $xmlIn.append("</obras>");
                            $tempo = $obras.tempo;
                            $xmlOut=$xmlIn; 
                        }
            ;
obras       [long tempoIn, StringBuilder xmlIn]
            returns[long tempo, StringBuilder xmlOut] 
            :   idObra { 
                            try{
                                String sql = "SELECT * FROM obra WHERE id='"+$idObra.id+"'";
                                ResultSet rs = (ResultSet) stmt.executeQuery(sql);
                                if(rs.next()){
                                    $tempo += rs.getTime("duracao").toLocalTime().toSecondOfDay();
                                    $tempo += $tempoIn;
                                    if($tempo>max_audition_time){
                                        Time time = new Time($tempo * 1000);
                                            System.out.print("line "+$idObra.linha+" - tempo _max ultrapassado");
                                            System.out.println(" "+$idObra.id+" tem duracao: "+time.toString());
                                        flag=1;
                                    }else{
                                        $xmlIn.append("<obra id=\""+$idObra.id+"\">");
                                        $xmlIn.append("<nome>"+rs.getString("nome")+"</nome>");
                                        $xmlIn.append("<duracao>"+rs.getString("duracao")+"</duracao>");
                                        $xmlIn.append("</obra>");
                                    }
                                }else{
                                    System.out.print("line "+$idObra.linha);
                                    System.out.println(" obra: "+$idObra.id+" nao existe");
                                    $xmlIn.append("<obra></obra>");
                                    flag=1;
                                }
                                rs.close();
                            }catch(SQLException se){
                                se.printStackTrace();
                            }
                            $xmlOut = $xmlIn;
                        }
                (','idObra  {
                                try{
                                    String sql = "SELECT * FROM obra WHERE id='"+$idObra.id+"'";
                                    ResultSet rs = (ResultSet) stmt.executeQuery(sql);
                                    if(rs.next()){
                                        $tempo += rs.getTime("duracao").toLocalTime().toSecondOfDay();
                                        if($tempo>max_audition_time){
                                            Time time = new Time($tempo * 1000);
                                            System.out.print("line "+$idObra.linha+" - tempo _max ultrapassado");
                                            System.out.println(" "+$idObra.id+" tem duracao: "+time.toString());
                                            flag=1;
                                        }else{
                                            $xmlIn.append("<obra id=\""+$idObra.id+"\">");
                                            $xmlIn.append("<nome>"+rs.getString("nome")+"</nome>");
                                            $xmlIn.append("<duracao>"+rs.getString("duracao")+"</duracao>");
                                            $xmlIn.append("</obra>");
                                        }
                                    }else{
                                        System.out.print("line "+$idObra.linha);
                                        System.out.println(" obra: "+$idObra.id+" nao existe");
                                        $xmlIn.append("<obra></obra>");
                                        flag=1;
                                    }
                                    rs.close();
                                }catch(SQLException se){
                                    se.printStackTrace();
                                }
                                $xmlOut = $xmlIn;
                            }
                )* 
            ;

musicos     [StringBuilder xmlIn]
            returns[StringBuilder xmlOut]
            :   musico[$xmlIn] {$xmlOut=$musico.xmlOut;}
                (musico[$xmlOut]{$xmlOut=$musico.xmlOut;})*
            ;

musico      [StringBuilder xmlIn]
            returns[StringBuilder xmlOut]
            :    idAluno ',' idInstrumento {
                                            $xmlIn.append("<musico tipo=\"aluno\" id=\""+$idAluno.id+"\">");
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
                                                            $xmlIn.append("<nome>"+nome_aluno+"</nome>");
                                                            $xmlIn.append("<instrumento id=\""+$idInstrumento.id+"\">"+designacao_instrumento+"</instrumento>");
                                                        }else{
                                                            System.out.print("line "+$idAluno.linha);
                                                            System.out.print(" (aluno: "+$idAluno.id+" - "+ nome_aluno+")" );
                                                            System.out.println(" nao tem habilitacoes para tocar ("+$idInstrumento.id+" - "+ designacao_instrumento+")");
                                                            
                                                            sql = "SELECT * FROM aluno_instrumento INNER JOIN instrumento ON aluno_instrumento.id_instrumento=instrumento.id WHERE aluno_instrumento.id_aluno='"+$idAluno.id+"'";
                                                            rs = (ResultSet) stmt.executeQuery(sql);
                                                            System.out.print("O Aluno: "+ $idAluno.id);
                                                            System.out.println(" tem habilitacoes em:");
                                                            while(rs.next()){
                                                                System.out.println("  - "+rs.getString("id")+" "+rs.getString("designacao"));
                                                            }
                                                            
                                                            flag=1;
                                                        }
                                                        
                                                    }else{
                                                        System.out.print("line "+$idInstrumento.linha);
                                                        System.out.println("  instrumento: "+$idInstrumento.id+" nao existe");
                                                        flag=1;
                                                    }
                                                }else{
                                                    System.out.print("line "+$idAluno.linha);
                                                    System.out.println("  aluno: "+$idAluno.id+" nao existe");
                                                    flag=1;
                                                }
                                                rs.close();
                                            }catch(SQLException se){
                                                se.printStackTrace();
                                            }
                                            $xmlIn.append("</musico>");
                                            $xmlOut = $xmlIn;
                                         } 
            |   idProf ',' idInstrumento {
                                            $xmlIn.append("<musico tipo=\"professor\" id=\""+$idProf.id+"\">");
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
                                                            $xmlIn.append("<nome>"+nome_prof+"</nome>");
                                                            $xmlIn.append("<instrumento id=\""+$idInstrumento.id+"\">"+designacao_instrumento+"</instrumento>");
                                                        }else{
                                                            System.out.print("line "+$idProf.linha);
                                                            System.out.print(" (professor: "+$idProf.id+" - "+ nome_prof+")" );
                                                            System.out.println(" nao tem habilitacoes para tocar("+$idInstrumento.id+" - "+ designacao_instrumento+")");
                                                            flag=1;
                                                        }  
                                                    }else{
                                                        System.out.print("line "+$idInstrumento.linha);
                                                        System.out.println("  instrumento: "+$idInstrumento.id+" nao existe");
                                                        flag=1;
                                                    }
                                                }else{
                                                    System.out.print("line "+$idProf.linha);
                                                    System.out.println("  professor: "+$idProf.id+" nao existe");
                                                    flag=1;
                                                }
                                                rs.close();
                                            }catch(SQLException se){
                                                se.printStackTrace();
                                            }
                                            $xmlIn.append("</musico>");
                                            $xmlOut = $xmlIn;
                                         }
            ;




idObra	returns[String id, int linha, int coluna]:   ID_OBRA{   
                                                            $id = $ID_OBRA.text;
                                                            $linha = $ID_OBRA.getLine();
                                                            $coluna = $ID_OBRA.getCharPositionInLine();
                                                            };
idProf 	returns[String id, int linha, int coluna]:   ID_PROFESSOR{   
                                                            $id = $ID_PROFESSOR.text;
                                                            $linha = $ID_PROFESSOR.getLine();
                                                            $coluna = $ID_PROFESSOR.getCharPositionInLine();
                                                            };
idAluno	returns[String id, int linha, int coluna]:   ID_ALUNO{   
                                                            $id = $ID_ALUNO.text;
                                                            $linha = $ID_ALUNO.getLine();
                                                            $coluna = $ID_ALUNO.getCharPositionInLine();
                                                            };
idInstrumento	returns[String id, int linha, int coluna]:   ID_INSTRUMENTO{   
                                                                            $id = $ID_INSTRUMENTO.text;
                                                                            $linha = $ID_INSTRUMENTO.getLine();
                                                                            $coluna = $ID_INSTRUMENTO.getCharPositionInLine();
                                                                            };

      
/*--------------- Lexer ---------------------------------------*/


COMMENT
    :   ( '//' ~[\r\n]* '\r'? '\n'
        | '/*' .*? '*/'
        | '\\n'
        ) -> skip
    ;



ID_ALUNO  :	('A')('0'..'9')*
     ;
ID_PROFESSOR  :	('P')('0'..'9')*
     ;
ID_OBRA  :	('O')('0'..'9')*
     ;
ID_INSTRUMENTO  :	('I')('0'..'9')*
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




