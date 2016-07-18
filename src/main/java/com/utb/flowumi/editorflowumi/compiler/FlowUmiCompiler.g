grammar FlowUmiCompiler;

options{ 
        output = AST;
        ASTLabelType = CommonTree;
}
@header{
package com.flowumi.compiler;
}
@members{
ArrayList<String> errores=new ArrayList<String>();
private String error= new String("");

public String getErrorMessage(RecognitionException e,String[] tokenNames)
{
String msg = null;
if ( e instanceof NoViableAltException ) {
NoViableAltException nvae = (NoViableAltException)e;
msg = "no hay alternativa viable";
}
else {
if ( e instanceof MismatchedTokenException ) {
MismatchedTokenException nvae = (MismatchedTokenException) e;
msg = "falta o sobra una palabra";
}
else {
if ( e instanceof MismatchedTreeNodeException ) {
MismatchedTreeNodeException nvae = (MismatchedTreeNodeException) e;
msg = "falta una nodo";
}
else {
msg = super.getErrorMessage(e, tokenNames);
}
}
}
return msg;
}
public String getTokenErrorDisplay(Token t) {
		return t.toString();
	}

public void reportError( RecognitionException e ){
    		reportError(getErrorMessage(e, tokenNames), e.line);
    	}

public void reportError(String msg, int line)
    	{
    		error = error+ msg+": linea del error: "+line+"\n";
    	}
public String imprimir()
	{
		return (error);
			
	}
public boolean error(){
if(error.length()>1)
return true;
else
return false;
}
}
algoritmo
	:	(funcion)+;
	
principal
	:	variablesDec INICIO sentencias* FIN ->^(INICIO variablesDec sentencias*); 

variablesDec
	:	VARIABLES declaracionVar* FIN_VAR ->^(VARIABLES declaracionVar*);

declaracionVar
	:	tipo_dato ID '=' constante->^(IVAR tipo_dato ID '=' constante)
		|tipo_dato ID '['INT']'->^(IVAR tipo_dato ID INT)
		|tipo_dato ID '['INT']''['INT']'->^(IVAR tipo_dato ID INT INT);

tipo_dato
	:	ENTERO->ENTERO|BOOLEANO->BOOLEANO|REAL->REAL|CADENA->CADENA|CARACTER->CARACTER|NINGUNO->NINGUNO;

sentencias
	:	asignacion|si|mientras|para|lectura|escritura|breaks|llamado;

asignacion
	:	ASIGNACION INT variable '=' expresion ->^(ASIGNACION INT variable  expresion );
	
expresion
	:	(expry (('&&') expry)*)->^(AUX expry ('&&' expry)*);
	
expry 	:	exprmenor (('||') exprmenor)*->^(AUX exprmenor ('||' exprmenor)*);
	
exprmenor
	:	 exprmayor ('<' exprmayor)*->^(AUX exprmayor ('<' exprmayor)*);
exprmayor 
	:	exprmayorigual ('>' exprmayorigual)*->^(AUX exprmayorigual ('>' exprmayorigual)*);
exprmayorigual 
	:	exprmenorigual ('>=' exprmenorigual)*->^(AUX exprmenorigual ('>=' exprmenorigual)*);
exprmenorigual 
	:	exprigual ('<=' exprigual)*->^(AUX exprigual ('<=' exprigual)*);
exprigual
	:	exprdif ('==' exprdif)*->^(AUX exprdif ('==' exprdif)*);
	
exprdif	:	exprMult ('!=' exprMult)*->^(AUX exprMult ('!=' exprMult)*);

exprMult
	:	 exprdiv ('*' exprdiv)*->^(AUX exprdiv ('*' exprdiv)*);
	
exprdiv	:	exprmod ('/' exprmod)*->^(AUX exprmod ('/' exprmod)*);

exprmod	:	exprSum (MOD exprSum)*->^(AUX exprSum (MOD exprSum)*);
	
exprSum
	:	exprres ('+' exprres)*->^(AUX exprres ('+' exprres)*);
	
exprres	:	negacion ('-' negacion)*->^(AUX negacion ('-' negacion)*);

negacion:	atom | ('.NO.' atom)->^('.NO.' atom);

atom	:	consVar->^(AUX consVar)| llamado->^(AUX llamado)| '(' expresion ')'->^(AUX '('expresion')');

constante
	:	INT->INT|STRING->STRING|FLOAT->FLOAT|LOGICO->LOGICO|CHAR->CHAR;

index	:	INT->INT | variable;

llamado	:	INT ID  '('parametros*')'->^(AUX INT ID '('parametros')');

parametros
	:	(consVar) (',' (consVar))*->^(AUX (consVar)+);

consVar	:	constante|variable;

variable:	ID->ID|ID'['index (',' index)?']'->^(AUX ID index (',' index)?);
 
si	:	SI INT '(' expresion '):' sentencias* sino? FIN_SI ->^(SI INT expresion sentencias* sino?);

sino 	:	SINO INT ':' sentencias*->^(SINO sentencias*);

mientras:	MIENTRAS INT '(' expresion '):' sentencias* FIN_MIENTRAS ->^(MIENTRAS INT expresion sentencias*);

para	:	PARA INT '(' exprPara '):' sentencias* FIN_PARA ->^(PARA INT exprPara sentencias*);

exprPara:	variable '=' expresion ';' expresion ';' variable '=' expresion ->^(AUX variable expresion expresion variable expresion);

lectura	:	LECTURA INT '('variable')'->^(LECTURA INT variable);

escritura
	:	ESCRITURA INT '('expresion')'->^(ESCRITURA INT expresion);

funcion	:	FUNCION tipo_dato ID  '(' parametrosDec* ')' principal->^(FUNCION ID tipo_dato parametrosDec* principal);

parametrosDec
	:	tipo_dato ID->^(AUX tipo_dato ID)
	|tipo_dato ID '['']'->^(AUX tipo_dato ID '['']')
	|tipo_dato ID '['']''['']'->^(AUX tipo_dato ID '['']''['']');

breaks	:	BREAK INT->^(BREAK INT);

MOD	:	'%';

ENTERO	:	'ENTERO';

BOOLEANO:	'LOGICO';

REAL	:	'REAL';

CADENA	:	'CADENA';

CARACTER:	'CARACTER';

NINGUNO:	'NINGUNO';

VARIABLES:	'VARIABLES';

FIN_VAR	:	'FIN_VAR';

AUX	:	'.AUX.';

FUNCION	:	'FUNCION';

BREAK	:	'BREAK';

ESCRITURA
	:	'ESCRITURA';

LECTURA	:	'LECTURA';

PARA	:	'PARA';

FIN_PARA:	'FIN_PARA';

FIN_MIENTRAS
	:	'FIN_MIENTRAS';

MIENTRAS:	'MIENTRAS';

FIN_SI	:	'FIN_SI';

SINO	:	'SINO';

SI	:	'SI';

IVAR 	:	 'IVAR';

ASIGNACION
	:	'ASIGNACION';

INICIO	:	'INICIO';

FIN	:	'FIN';

LOGICO	:	'verdadero'|'falso';

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'(-)'?('0'..'9'+)
    ;

FLOAT
    :   '(-)'?(('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT)
    ;

CHAR:  '\'' ( ~('\''|'\\') ) '\''
    ;

COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ~('"')|'\\"' )* '"'
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

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
