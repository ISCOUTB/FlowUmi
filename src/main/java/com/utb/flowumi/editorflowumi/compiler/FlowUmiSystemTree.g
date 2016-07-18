tree grammar FlowUmiSystemTree;

options {

        output = AST;
        ASTLabelType = CommonTree;
        language = Java;
	tokenVocab=FlowUmiCompiler;
}
@header{
package com.flowumi.compiler;

import java.util.HashMap;
}
@members{

private static final org.apache.log4j.Logger LOGGER =
            org.apache.log4j.Logger.getLogger(FlowUmiCompilerParser.class);
            
Compilador compilador = new Compilador();
long counter = 0;
HashMap<String, String> tablaSimbolos;

public Compilador getCompilador(){
	return compilador;
}

}
algoritmo
	@after{
	compilador.close();
	}:	funcion+;
	
funcion	:	^(FUNCION ID tipo_dato {compilador.write(0, $ID.text, $tipo_dato.tipoDato);
tablaSimbolos = new HashMap<String, String>();} parametrosDec* {compilador.write(1);} principal {compilador.write(2);});
	
parametrosDec
	:	^(AUX tipo_dato ID{compilador.write(3, $ID.text, $tipo_dato.tipoDato);
	tablaSimbolos.put($ID.text, $tipo_dato.tipoDato);})
	|^(AUX tipo_dato ID '['']'{compilador.write(4, $ID.text, $tipo_dato.tipoDato);
		tablaSimbolos.put($ID.text, $tipo_dato.tipoDato);})
	|^(AUX tipo_dato ID '['']''['']'{compilador.write(5, $ID.text, $tipo_dato.tipoDato);
		tablaSimbolos.put($ID.text, $tipo_dato.tipoDato);});
	
principal
	:	^(INICIO variablesDec sentencias*); 

variablesDec
	:	^(VARIABLES declaracionVar*);

declaracionVar
	:	^(IVAR tipo_dato ID '=' constante{compilador.write(6, $ID.text, $tipo_dato.tipoDato, $constante.valor);
			tablaSimbolos.put($ID.text, $tipo_dato.tipoDato);})
		|^(IVAR tipo_dato ID a=INT{compilador.write(7, $ID.text, $tipo_dato.tipoDato, $a.text);
				tablaSimbolos.put($ID.text, $tipo_dato.tipoDato);})
		|^(IVAR tipo_dato ID a=INT b=INT{compilador.write(8, $ID.text, $tipo_dato.tipoDato, $a.text, $b.text);
				tablaSimbolos.put($ID.text, $tipo_dato.tipoDato);});

tipo_dato returns[String tipoDato]
	:	ENTERO{$tipoDato = "long";}
	|BOOLEANO{$tipoDato = "boolean";}
	|REAL{$tipoDato = "double";}
	|CADENA{$tipoDato = "Stirng";}
	|CARACTER{$tipoDato = "char";}
	|NINGUNO{$tipoDato = "void";};

sentencias
	:	asignacion|si|mientras|para|lectura|escritura|breaks|llamado;

asignacion
	:	^(ASIGNACION INT variable  expresion {compilador.write(9, $variable.text, $expresion.text);});
	
expresion returns[String text]
	@after{LOGGER.debug($text);}:	^(AUX a=expry {
		$text = $a.text;
	}('&&' b=expry{
		$text += " && "+$b.text;
	})*);
	
expry 	returns[String text]
	@after{LOGGER.debug($text);}:	^(AUX a=exprmenor {
		$text = $a.text;
	}('||' b=exprmenor{
		$text += " || "+$b.text;
	})*);
	
exprmenor returns[String text]
	@after{LOGGER.debug($text);}
	:	 ^(AUX a=exprmayor {
		$text = $a.text;
	}('<' b=exprmayor{
		$text += " < "+$b.text;
	})*);
exprmayor returns[String text]
	@after{LOGGER.debug($text);}
	:	^(AUX a=exprmayorigual {
		$text = $a.text;
	}('>' b=exprmayorigual{
		$text += " > "+$b.text;
	})*);
exprmayorigual returns[String text]
	@after{LOGGER.debug($text);}
	:	^(AUX a=exprmenorigual {
		$text = $a.text;
	}('>=' b=exprmenorigual{
		$text += " >= "+$b.text;
	})*);
exprmenorigual returns[String text]
	@after{LOGGER.debug($text);}
	:	^(AUX a=exprigual {
		$text = $a.text;
	}('<=' b=exprigual{
		$text += " <= "+$b.text;
	})*);
exprigual returns[String text]
	@after{LOGGER.debug($text);}
	:	^(AUX a=exprdif {
		$text = $a.text;
	}('==' b=exprdif{
		$text += " == "+$b.text;
	})*);
	
exprdif	returns[String text]
	@after{LOGGER.debug($text);}:	^(AUX a=exprMult {
		$text = $a.text;
	}('!=' b=exprMult{
		$text += " != "+$b.text;
	})*);

exprMult returns[String text]
	@after{LOGGER.debug($text);}
	:	 ^(AUX a=exprdiv {
		$text = $a.text;
	}('*' b=exprdiv{
		$text += " * "+$b.text;
	})*);
	
exprdiv	returns[String text]
	@after{LOGGER.debug($text);}:	^(AUX a=exprmod {
		$text = $a.text;
	}('/' b=exprmod{
		$text += " / "+$b.text;
	})*);

exprmod	returns[String text]
	@after{LOGGER.debug($text);}:	^(AUX a=exprSum {
		$text = $a.text;
	}(MOD b=exprSum{
		$text += " "+$MOD.text+" "+$b.text;
	})*);
	
exprSum returns[String text]
	@after{LOGGER.debug($text);}
	:	^(AUX a=exprres {
		$text = $a.text;
	}('+' b=exprres{
		$text += " + "+$b.text;
	})*);
	
exprres	returns[String text]
	@after{LOGGER.debug($text);}:	^(AUX a=negacion {
		$text = $a.text;
	}('-' b=negacion{
		$text += " - "+$b.text;
	})*);

negacion returns[String text]
	@after{LOGGER.debug($text);}:	a=atom{
		$text = $a.text;
	} | ^('.NO.' a=atom{
		$text = "!" + $a.text;
	});

atom	returns[String text]
	@after{LOGGER.debug($text);}:	^(AUX consVar{$text = $consVar.text;})|^(AUX llamado{$text = $llamado.text;})|^(AUX '('a=expresion')' {$text = "("+$a.text+")";});

constante returns[String valor]
@after{LOGGER.debug($valor);}
	:	INT{$valor = $INT.text;}
	|STRING{$valor = $STRING.text;}
	|FLOAT{$valor = $FLOAT.text;}
	|LOGICO{if($LOGICO.text.equals("falso")){
	$valor = "false";
	} else {
		$valor = "true";
	}}
	|CHAR{$valor = $CHAR.text;};

index	returns[String text]:	INT{$text = $INT.text;}| variable{$text = $variable.text;};

llamado	returns[String text]:	^(AUX INT ID '('parametros')'{$text = $ID.text+"("+$parametros.text+")";});

parametros returns[String text]
	:	^(AUX {$text = "";} (consVar{$text += $consVar.text;})+);
	
consVar	returns[String text]
@after{LOGGER.debug($text);}:	constante{$text = $constante.valor;}|variable{$text = $variable.text;};

variable returns[String text, String tipo]
@after{LOGGER.debug($text);}:	ID{$text = $ID.text;
		$tipo = tablaSimbolos.get($ID.text);}
		|^(AUX ID a=index {$text = $ID.text+"["+$a.text+"]";} (','b=index{$text += "["+$b.text+"]";
				$tipo = tablaSimbolos.get($ID.text);})?);
 
si	:	^(SI INT expresion {compilador.write(10, "if", $expresion.text);} sentencias* {compilador.write(2);} sino?);

sino 	:	^(SINO INT{compilador.write(11);} sentencias* {compilador.write(2);});

mientras:	^(MIENTRAS INT expresion {compilador.write(10, "while",$expresion.text);} sentencias* {compilador.write(2);});

para	:	^(PARA INT exprPara {compilador.write(10, "for",$exprPara.text);} sentencias* {compilador.write(2);});

exprPara returns[String text]:	^(AUX a=variable b=expresion c=expresion d=variable e=expresion{$text = $a.text + " = " + $b.text + " ; " + $c.text  + " ; " + $d.text + " = " + $e.text;});

lectura	:	^(LECTURA INT variable{compilador.write(13, counter+"", $variable.text, $variable.tipo);counter++;});

escritura
	:	^(ESCRITURA INT expresion{compilador.write(14, $expresion.text);});

breaks	:	^(BREAK INT{compilador.write(12);});