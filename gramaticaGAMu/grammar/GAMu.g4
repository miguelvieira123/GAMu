/*
 * Grupo 9
 *
 *
 * Linguagem para validar uma Audição
 *
 audicao:
	a001 "Natal" data "2015-12-20"
	atuacoes:
		at01 (0:5:55) ob01 
		musicos:
			alun98 "clarinete.pdf",
			prof07 "piano.pdf",
			alun77 "ferrinhos.txt"
		#
		at02 (0:9:23) ob33 
		musicos:
			alun47 "guitarra_1.pdf",
			prof12 "guitarra_2.pdf",
			alun11 "bateria.txt"
		#
 
 */

grammar GAMu;

options 
{
    language = Java;
}



audicao     :	'audicao:' idAud metaAud 'data' data=STRING atuacoes 
            ;
metaAud     :	tema=STRING  
            ;

atuacoes    :   'atuacoes:' atuacao '#' (atuacao '#')*
            ;

atuacoa     :	idAt duracao idObra maestro? musicos
            ;

duracao     :   '('hora=INT ':' minuto=INT ':' segundo=INT ')'
            ;

maestro     :	 idProf partitura    
            ;
musicos     :   'musicos:' musico (',' musico)*
            ;
musico      :	 ((idAluno | idProf) partitura)
            ;




idObra	:   ID;
idProf 	:   ID;
idAluno	:   ID;
idAt	:   ID;
idAud	:   ID;

partitura:	STRING;


      
/*--------------- Lexer ---------------------------------------*/

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




