tree grammar FlowUmiTree;

options {

        output = AST;
        ASTLabelType = CommonTree;
        language = Java;
	tokenVocab=FlowUmiCompiler;
	ASTLabelType=CommonTree;
}

algoritmo
	:	(funcion)+;
	
principal
	:	^(INICIO variablesDec sentencias*); 

variablesDec
	:	^(VARIABLES declaracionVar*);

declaracionVar
	:	^(IVAR tipo_dato ID '=' constante)
		|^(IVAR tipo_dato ID index+);

tipo_dato
	:	ENTERO|BOOLEANO|REAL|CADENA|CARACTER;

sentencias
	:	asignacion|si|mientras|para|lectura|escritura|breaks|llamado;

asignacion
	:	^(ASIGNACION INT variable  expresion );
	
	
expresion 
	:	
	'.Y.' a=expresion b=expresion
	|'.O.' a=expresion b=expresion
	|'.menor_que.' a=expresion b=expresion
	|'.mayor_que.' a=expresion b=expresion
	|'.mayor_igual_que.' a=expresion b=expresion
	|'.menor_igual_que.' a=expresion b=expresion
	|'.igual.' a=expresion b=expresion
	|'.diferente.' a=expresion b=expresion{
	|'*' a=expresion b=expresion
	|'/' a=expresion b=expresion
	|'%' a=expresion b=expresion
	|'+' a=expresion b=expresion
	|'-' a=expresion b=expresion
	|'.No.' a=expresion
	|^(AUX consVar)
	|^(AUX llamado)
	|^(AUX '(' a=expresion ')');

constante
	:	INT|STRING|FLOAT|LOGICO;

index	:	INT | variable;

llamado	:	^(AUX INT ID '('parametros')');

parametros
	:	^(AUX (consVar)+);

consVar	:	constante|variable;

variable:	ID|^(AUX ID index (',' index)?);
 
si	:	^(SI INT expresion sentencias* (SINO sentencias*)?);

mientras:	^(MIENTRAS INT expresion sentencias*);

para	:	^(PARA INT exprPara sentencias*);

exprPara:	^(AUX variable expresion expresion variable expresion);

lectura	:	^(LECTURA INT variable);

escritura
	:	^(ESCRITURA INT expresion);

funcion	:	^(FUNCION ID parametrosDec* principal);

parametrosDec
	:	^(AUX tipo_dato ID)
	|^(AUX tipo_dato ID '['']')
	|^(AUX tipo_dato ID '['']' '['']');

breaks	:	^(BREAK INT);
