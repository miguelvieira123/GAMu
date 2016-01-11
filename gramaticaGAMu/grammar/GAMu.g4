/*
    ** * Linguagem para programação de uma Audição * **
 *
 *      ---- Grupo 9 --------------------------------
 *        a62819   - Luís Miguel Fernandes Vieira
 *        pg30469  - Oleskii Gylytskyy
 *      ---------------------------------------------
 *
     EXEMPLO:

        titulo: "titulo"
        subtitulo: "subtitulo" 
        tema: "tema da audicao" 
        data: 5-1-2016 
        hora: 15:30
        local: "local da audicao"
        organizador: P13
        duracao-maxima: 02:00

        atuacoes:
            grupo: "nome da banda" 
            elementos: A1510,P11,A20021
            obras: O1,O2,O3,O4,O32
            #
            solo: A1510 
            obras: O22,O23
            #
 
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
            
            // grammar variables 
            static final long ONE_MINUTE_IN_MILLIS=60000;
            long total_audition_time = (long)0.0;
            float max_audition_time = (float)0.0;
            
        }
audicao     @init{
                   try{
                      //STEP 2: Register JDBC driver
                      Class.forName("com.mysql.jdbc.Driver");
                      //STEP 3: Open a connection
                      System.out.println("Connecting to database...");
                      conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
                      //STEP 4: Execute a query
                      System.out.println("Creating statement...");
                      stmt = (Statement) conn.createStatement();
                      
                   }catch(SQLException se){
                      //Handle errors for JDBC
                      se.printStackTrace();
                   }catch(Exception e){
                      //Handle errors for Class.forName
                      e.printStackTrace();
                   }
                   
                   }
            @after{
                   Time aaa = new Time(total_audition_time * 1000);
                   System.out.println("tempo total audicao: "+ aaa.toString());
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
            :	metaAud atuacoes 
            ;

metaAud     :	'titulo:' STRING 
                'subtitulo:' STRING 
                'tema:' STRING 
                'data:' data 
                'hora:' hora 
                'local:' STRING 
                'organizador:' idProf
                'duracao-maxima:' hora {max_audition_time = $hora.mili_seconds;}
            ;

data        :   INT'-'INT'-'INT 
            ;

hora        returns[float mili_seconds]:   
                horas=INT':'minutos=INT {$mili_seconds = ($horas.int*60*60000+$minutos.int*60000);}
            ;

atuacoes    returns[long tempo]
            :   'atuacoes:' atuacao[$tempo] {
                                                $tempo+=$atuacao.tempo;
                                                Time aaa = new Time($tempo*1000);
                                                System.out.println("tempo total atuacoes: "+ aaa.toString());
                                            } '#' 
                (atuacao[$tempo]    {
                                        $tempo+=$atuacao.tempo;
                                        aaa.setTime($tempo*1000);
                                        System.out.println("tempo total atuacoes: "+ aaa.toString());
                                    } '#')* {total_audition_time = $tempo;}
            ;

atuacao     [long tempoIn]
            returns[long tempo]
            :   grupo[$tempoIn]{$tempo=$grupo.tempo;}
            |   solo[$tempoIn] {$tempo=$solo.tempo;}
            ;

grupo       [long tempoIn]
            returns[long tempo]
            :   'grupo:' STRING 'elementos:' elementos 'obras:' obras[$tempoIn]{$tempo = $obras.tempo;}
            ;
solo        [long tempoIn]
            returns[long tempo]
            :   'solo:' musico 'obras:' obras[$tempoIn]{$tempo = $obras.tempo;}
            ;
obras       [long tempoIn]
            returns[long tempo] // falta verificar a existencia da obra 
            :   idObra {
                            System.out.println("obra: "+ $idObra.id);
                            try{
                                String sql = "SELECT  duracao FROM obra WHERE id='"+$idObra.id+"'";
                                ResultSet rs = (ResultSet) stmt.executeQuery(sql);
                                if(rs.next()){
                                    
                                    System.out.print(" duracao: " + rs.getTime("duracao"));
                                    $tempo += (int)rs.getTime("duracao").toLocalTime().toSecondOfDay();
                                    //$tempo += $tempoIn;
                                    Time aaa = new Time($tempo*1000);
                                    System.out.println(" \t tempo total: "+ aaa.toString());
                                }
                                rs.close();
                            }catch(SQLException se){
                                se.printStackTrace();
                            }
                        }
                (','idObra  {
                                System.out.println("obra: "+ $idObra.id);
                                try{
                                    String sql = "SELECT  duracao FROM obra WHERE id='"+$idObra.id+"'";
                                    ResultSet rs = (ResultSet) stmt.executeQuery(sql);
                                    if(rs.next()){
                                        
                                        System.out.print(" duracao: " + rs.getTime("duracao"));
                                        $tempo += (int)rs.getTime("duracao").toLocalTime().toSecondOfDay();
                                        Time aaa = new Time($tempo*1000);
                                        System.out.println(" \t tempo total: "+ aaa.toString());
                                    }
                                    rs.close();
                                }catch(SQLException se){
                                    se.printStackTrace();
                                }
                            }
                )* 
            ;
elementos   :   musicos
            ;
musicos     :   musico (',' musico)*
            ;
musico      :   idAluno {
                            try{
                                //System.out.println("aluno: "+ $idAluno.id);
                                String sql = "SELECT COUNT(1) AS existe FROM aluno WHERE id='"+$idAluno.id+"'";
                                ResultSet rs = (ResultSet) stmt.executeQuery(sql);
                                if(rs.next()){
                                    //System.out.println(" existe?: " + rs.getInt("existe"));
                                    if(rs.getInt("existe") != 1){
                                        System.out.println("<font color=\"red\">aluno: "+$idAluno.id+" nao existe</font>");
                                    }
                                }
                                rs.close();
                            }catch(SQLException se){
                                se.printStackTrace();
                            }
                         } 
            |   idProf  {
                         try{
                                //System.out.println("professor: "+ $idProf.id);
                                String sql = "SELECT COUNT(1) AS existe FROM professor WHERE id='"+$idProf.id+"'";
                                ResultSet rs = (ResultSet) stmt.executeQuery(sql);
                                if(rs.next()){
                                    if(rs.getInt("existe") != 1){
                                        System.out.println("<font color=\"red\">professor: "+$idProf.id+" nao existe</font>");
                                    }
                                }
                                rs.close();
                            }catch(SQLException se){
                                se.printStackTrace();
                            }
                         }
            ;




idObra	returns[String id]:   IDO{$id = $IDO.text;};
idProf 	returns[String id]:   IDP{$id = $IDP.text;};
idAluno	returns[String id]:   IDA{$id = $IDA.text;};


      
/*--------------- Lexer ---------------------------------------*/

IDA  :	('a'|'A') ('0'..'9')*
     ;
IDP  :	('p'|'P') ('0'..'9')*
     ;
IDO  :	('o'|'O') ('0'..'9')*
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




