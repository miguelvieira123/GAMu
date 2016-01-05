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
            solo: a1510 
            obras: O22,O23
            #
 
 */

grammar GAMu;
/*
options 
{
    language = Java;
}
*/
@header{
        import java.util.*;
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;
        import java.sql.ResultSet;
        import java.sql.Statement;
        }
@members{
            // JDBC driver name and database URL
            String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
            String DB_URL = "jdbc:mysql://127.0.0.1:3306/gamu";
            // Database credentials
            String USER = "usrPRI";
            String PASS = "popo";
            
        }
audicao     @init{
                   Connection conn = null;
                   Statement stmt = null;
                   try{
                      //STEP 2: Register JDBC driver
                      Class.forName("com.mysql.jdbc.Driver");

                      //STEP 3: Open a connection
                      System.out.println("Connecting to database...");
                      conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);

                      //STEP 4: Execute a query
                      System.out.println("Creating statement...");
                      stmt = (Statement) conn.createStatement();
                      String sql;
                      sql = "SELECT id, designacao FROM instrumento";
                      ResultSet rs = (ResultSet) stmt.executeQuery(sql);

                      //STEP 5: Extract data from result set
                      while(rs.next()){
                         //Retrieve by column name
                         String id  = rs.getString("id");
                         String design = rs.getString("designacao");

                         //Display values
                         System.out.print("ID: " + id);
                         System.out.println(", First: " + design);
                      }
                      //STEP 6: Clean-up environment
                      rs.close();
                      stmt.close();
                      conn.close();
                   }catch(SQLException se){
                      //Handle errors for JDBC
                      se.printStackTrace();
                   }catch(Exception e){
                      //Handle errors for Class.forName
                      e.printStackTrace();
                   }finally{
                      //finally block used to close resources
                      try{
                         if(stmt!=null)
                            stmt.close();
                      }catch(SQLException se2){
                      }// nothing we can do
                      try{
                         if(conn!=null)
                            conn.close();
                      }catch(SQLException se){
                         se.printStackTrace();
                      }//end finally try
                   }//end try
                   System.out.println("Goodbye!");
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
                'duracao-maxima:' hora
            ;

data        :   INT'-'INT'-'INT 
            ;

hora        :   INT':'INT
            ;

atuacoes    :   'atuacoes:' atuacao '#' (atuacao '#')*
            ;

atuacao     :   (grupo|solo) 
            ;

grupo       :   'grupo:' STRING 'elementos:' elementos 'obras:' obras
            ;
solo        :   'solo:' musico 'obras:' obras
            ;
obras       :   idObra (','idObra)*
            ;
elementos   :   musicos
            ;
musicos     :   musico (',' musico)*
            ;
musico      :   idAluno {System.out.println("aluno: "+ $idAluno.id);} 
            |   idProf  {System.out.println("professor: "+ $idProf.id);}
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




