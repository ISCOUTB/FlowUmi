package com.flowumi.compiler;

// $ANTLR 3.1.2 C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g 2013-08-13 14:34:48

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class FlowUmiCompilerLexer extends Lexer {
    public static final int EXPONENT=35;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int LOGICO=20;
    public static final int MOD=17;
    public static final int INICIO=4;
    public static final int FIN_VAR=7;
    public static final int ASIGNACION=16;
    public static final int OCTAL_ESC=40;
    public static final int CHAR=21;
    public static final int FLOAT=19;
    public static final int ID=8;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int BREAK=32;
    public static final int FIN=5;
    public static final int SINO=24;
    public static final int PARA=27;
    public static final int LECTURA=29;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int ENTERO=10;
    public static final int ESC_SEQ=41;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int MIENTRAS=25;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int COMMENT=36;
    public static final int FUNCION=31;
    public static final int FIN_PARA=28;
    public static final int T__50=50;
    public static final int AUX=33;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int CADENA=13;
    public static final int T__46=46;
    public static final int CARACTER=14;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int IVAR=34;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int UNICODE_ESC=39;
    public static final int FIN_SI=23;
    public static final int FIN_MIENTRAS=26;
    public static final int HEX_DIGIT=38;
    public static final int INT=9;
    public static final int ESCRITURA=30;
    public static final int REAL=12;
    public static final int WS=37;
    public static final int SI=22;
    public static final int BOOLEANO=11;
    public static final int VARIABLES=6;
    public static final int NINGUNO=15;
    public static final int STRING=18;

    // delegates
    // delegators

    public FlowUmiCompilerLexer() {;} 
    public FlowUmiCompilerLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FlowUmiCompilerLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g"; }

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:3:7: ( '=' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:3:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:4:7: ( '[' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:4:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:5:7: ( ']' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:5:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:6:7: ( '&&' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:6:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:7:7: ( '||' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:7:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:8:7: ( '<' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:8:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:9:7: ( '>' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:9:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:10:7: ( '>=' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:10:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:11:7: ( '<=' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:11:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:12:7: ( '==' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:12:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:13:7: ( '!=' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:13:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:14:7: ( '*' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:14:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:15:7: ( '/' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:15:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:16:7: ( '+' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:16:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:17:7: ( '-' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:17:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:18:7: ( '.NO.' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:18:9: '.NO.'
            {
            match(".NO."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:19:7: ( '(' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:19:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:20:7: ( ')' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:20:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:21:7: ( ',' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:21:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:22:7: ( '):' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:22:9: '):'
            {
            match("):"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:23:7: ( ':' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:23:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:24:7: ( ';' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:24:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:157:5: ( '%' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:157:7: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "ENTERO"
    public final void mENTERO() throws RecognitionException {
        try {
            int _type = ENTERO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:159:8: ( 'ENTERO' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:159:10: 'ENTERO'
            {
            match("ENTERO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENTERO"

    // $ANTLR start "BOOLEANO"
    public final void mBOOLEANO() throws RecognitionException {
        try {
            int _type = BOOLEANO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:161:9: ( 'LOGICO' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:161:11: 'LOGICO'
            {
            match("LOGICO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEANO"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            int _type = REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:163:6: ( 'REAL' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:163:8: 'REAL'
            {
            match("REAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REAL"

    // $ANTLR start "CADENA"
    public final void mCADENA() throws RecognitionException {
        try {
            int _type = CADENA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:165:8: ( 'CADENA' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:165:10: 'CADENA'
            {
            match("CADENA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CADENA"

    // $ANTLR start "CARACTER"
    public final void mCARACTER() throws RecognitionException {
        try {
            int _type = CARACTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:167:9: ( 'CARACTER' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:167:11: 'CARACTER'
            {
            match("CARACTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CARACTER"

    // $ANTLR start "NINGUNO"
    public final void mNINGUNO() throws RecognitionException {
        try {
            int _type = NINGUNO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:169:8: ( 'NINGUNO' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:169:10: 'NINGUNO'
            {
            match("NINGUNO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NINGUNO"

    // $ANTLR start "VARIABLES"
    public final void mVARIABLES() throws RecognitionException {
        try {
            int _type = VARIABLES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:171:10: ( 'VARIABLES' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:171:12: 'VARIABLES'
            {
            match("VARIABLES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARIABLES"

    // $ANTLR start "FIN_VAR"
    public final void mFIN_VAR() throws RecognitionException {
        try {
            int _type = FIN_VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:173:9: ( 'FIN_VAR' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:173:11: 'FIN_VAR'
            {
            match("FIN_VAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIN_VAR"

    // $ANTLR start "AUX"
    public final void mAUX() throws RecognitionException {
        try {
            int _type = AUX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:175:5: ( '.AUX.' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:175:7: '.AUX.'
            {
            match(".AUX."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AUX"

    // $ANTLR start "FUNCION"
    public final void mFUNCION() throws RecognitionException {
        try {
            int _type = FUNCION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:177:9: ( 'FUNCION' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:177:11: 'FUNCION'
            {
            match("FUNCION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCION"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:179:7: ( 'BREAK' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:179:9: 'BREAK'
            {
            match("BREAK"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "ESCRITURA"
    public final void mESCRITURA() throws RecognitionException {
        try {
            int _type = ESCRITURA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:182:2: ( 'ESCRITURA' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:182:4: 'ESCRITURA'
            {
            match("ESCRITURA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ESCRITURA"

    // $ANTLR start "LECTURA"
    public final void mLECTURA() throws RecognitionException {
        try {
            int _type = LECTURA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:184:9: ( 'LECTURA' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:184:11: 'LECTURA'
            {
            match("LECTURA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LECTURA"

    // $ANTLR start "PARA"
    public final void mPARA() throws RecognitionException {
        try {
            int _type = PARA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:186:6: ( 'PARA' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:186:8: 'PARA'
            {
            match("PARA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARA"

    // $ANTLR start "FIN_PARA"
    public final void mFIN_PARA() throws RecognitionException {
        try {
            int _type = FIN_PARA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:188:9: ( 'FIN_PARA' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:188:11: 'FIN_PARA'
            {
            match("FIN_PARA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIN_PARA"

    // $ANTLR start "FIN_MIENTRAS"
    public final void mFIN_MIENTRAS() throws RecognitionException {
        try {
            int _type = FIN_MIENTRAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:191:2: ( 'FIN_MIENTRAS' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:191:4: 'FIN_MIENTRAS'
            {
            match("FIN_MIENTRAS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIN_MIENTRAS"

    // $ANTLR start "MIENTRAS"
    public final void mMIENTRAS() throws RecognitionException {
        try {
            int _type = MIENTRAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:193:9: ( 'MIENTRAS' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:193:11: 'MIENTRAS'
            {
            match("MIENTRAS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MIENTRAS"

    // $ANTLR start "FIN_SI"
    public final void mFIN_SI() throws RecognitionException {
        try {
            int _type = FIN_SI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:195:8: ( 'FIN_SI' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:195:10: 'FIN_SI'
            {
            match("FIN_SI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIN_SI"

    // $ANTLR start "SINO"
    public final void mSINO() throws RecognitionException {
        try {
            int _type = SINO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:197:6: ( 'SINO' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:197:8: 'SINO'
            {
            match("SINO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SINO"

    // $ANTLR start "SI"
    public final void mSI() throws RecognitionException {
        try {
            int _type = SI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:199:4: ( 'SI' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:199:6: 'SI'
            {
            match("SI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SI"

    // $ANTLR start "IVAR"
    public final void mIVAR() throws RecognitionException {
        try {
            int _type = IVAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:201:7: ( 'IVAR' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:201:10: 'IVAR'
            {
            match("IVAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IVAR"

    // $ANTLR start "ASIGNACION"
    public final void mASIGNACION() throws RecognitionException {
        try {
            int _type = ASIGNACION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:204:2: ( 'ASIGNACION' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:204:4: 'ASIGNACION'
            {
            match("ASIGNACION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASIGNACION"

    // $ANTLR start "INICIO"
    public final void mINICIO() throws RecognitionException {
        try {
            int _type = INICIO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:206:8: ( 'INICIO' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:206:10: 'INICIO'
            {
            match("INICIO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INICIO"

    // $ANTLR start "FIN"
    public final void mFIN() throws RecognitionException {
        try {
            int _type = FIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:208:5: ( 'FIN' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:208:7: 'FIN'
            {
            match("FIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIN"

    // $ANTLR start "LOGICO"
    public final void mLOGICO() throws RecognitionException {
        try {
            int _type = LOGICO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:210:8: ( 'verdadero' | 'falso' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='v') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:210:10: 'verdadero'
                    {
                    match("verdadero"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:210:22: 'falso'
                    {
                    match("falso"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOGICO"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:212:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:212:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:212:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:215:5: ( ( '(-)' )? ( ( '0' .. '9' )+ ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:215:7: ( '(-)' )? ( ( '0' .. '9' )+ )
            {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:215:7: ( '(-)' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='(') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:215:7: '(-)'
                    {
                    match("(-)"); 


                    }
                    break;

            }

            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:215:13: ( ( '0' .. '9' )+ )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:215:14: ( '0' .. '9' )+
            {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:215:14: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:215:14: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:219:5: ( ( '(-)' )? ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:219:9: ( '(-)' )? ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:219:9: ( '(-)' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='(') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:219:9: '(-)'
                    {
                    match("(-)"); 


                    }
                    break;

            }

            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:219:15: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt12=3;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:219:16: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:219:16: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:219:17: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    match('.'); 
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:219:32: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:219:33: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:219:44: ( EXPONENT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:219:44: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:220:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:220:13: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:220:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:220:25: ( EXPONENT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='E'||LA10_0=='e') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:220:25: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:221:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:221:9: ( '0' .. '9' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:221:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:224:5: ( '\\'' (~ ( '\\'' | '\\\\' ) ) '\\'' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:224:8: '\\'' (~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:224:13: (~ ( '\\'' | '\\\\' ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:224:15: ~ ( '\\'' | '\\\\' )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:228:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:228:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:228:14: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:228:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:231:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:231:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:239:5: ( '\"' (~ ( '\"' ) | '\\\\\"' )* '\"' )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:239:8: '\"' (~ ( '\"' ) | '\\\\\"' )* '\"'
            {
            match('\"'); 
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:239:12: (~ ( '\"' ) | '\\\\\"' )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\\') ) {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2=='\"') ) {
                        int LA14_4 = input.LA(3);

                        if ( ((LA14_4>='\u0000' && LA14_4<='\uFFFF')) ) {
                            alt14=2;
                        }

                        else {
                            alt14=1;
                        }

                    }
                    else if ( ((LA14_2>='\u0000' && LA14_2<='!')||(LA14_2>='#' && LA14_2<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:239:14: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:239:21: '\\\\\"'
            	    {
            	    match("\\\""); 


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:243:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:243:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:243:22: ( '+' | '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='+'||LA15_0=='-') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:243:33: ( '0' .. '9' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:243:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:246:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:246:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:250:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt17=1;
                    }
                    break;
                case 'u':
                    {
                    alt17=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt17=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:250:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:251:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:252:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:257:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\\') ) {
                int LA18_1 = input.LA(2);

                if ( ((LA18_1>='0' && LA18_1<='3')) ) {
                    int LA18_2 = input.LA(3);

                    if ( ((LA18_2>='0' && LA18_2<='7')) ) {
                        int LA18_5 = input.LA(4);

                        if ( ((LA18_5>='0' && LA18_5<='7')) ) {
                            alt18=1;
                        }
                        else {
                            alt18=2;}
                    }
                    else {
                        alt18=3;}
                }
                else if ( ((LA18_1>='4' && LA18_1<='7')) ) {
                    int LA18_3 = input.LA(3);

                    if ( ((LA18_3>='0' && LA18_3<='7')) ) {
                        alt18=2;
                    }
                    else {
                        alt18=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:257:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:257:14: ( '0' .. '3' )
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:257:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:257:25: ( '0' .. '7' )
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:257:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:257:36: ( '0' .. '7' )
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:257:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:258:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:258:14: ( '0' .. '7' )
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:258:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:258:25: ( '0' .. '7' )
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:258:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:259:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:259:14: ( '0' .. '7' )
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:259:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:264:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:264:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:8: ( T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | MOD | ENTERO | BOOLEANO | REAL | CADENA | CARACTER | NINGUNO | VARIABLES | FIN_VAR | AUX | FUNCION | BREAK | ESCRITURA | LECTURA | PARA | FIN_PARA | FIN_MIENTRAS | MIENTRAS | FIN_SI | SINO | SI | IVAR | ASIGNACION | INICIO | FIN | LOGICO | ID | INT | FLOAT | CHAR | COMMENT | WS | STRING )
        int alt19=55;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:10: T__42
                {
                mT__42(); 

                }
                break;
            case 2 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:16: T__43
                {
                mT__43(); 

                }
                break;
            case 3 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:22: T__44
                {
                mT__44(); 

                }
                break;
            case 4 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:28: T__45
                {
                mT__45(); 

                }
                break;
            case 5 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:34: T__46
                {
                mT__46(); 

                }
                break;
            case 6 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:40: T__47
                {
                mT__47(); 

                }
                break;
            case 7 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:46: T__48
                {
                mT__48(); 

                }
                break;
            case 8 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:52: T__49
                {
                mT__49(); 

                }
                break;
            case 9 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:58: T__50
                {
                mT__50(); 

                }
                break;
            case 10 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:64: T__51
                {
                mT__51(); 

                }
                break;
            case 11 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:70: T__52
                {
                mT__52(); 

                }
                break;
            case 12 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:76: T__53
                {
                mT__53(); 

                }
                break;
            case 13 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:82: T__54
                {
                mT__54(); 

                }
                break;
            case 14 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:88: T__55
                {
                mT__55(); 

                }
                break;
            case 15 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:94: T__56
                {
                mT__56(); 

                }
                break;
            case 16 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:100: T__57
                {
                mT__57(); 

                }
                break;
            case 17 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:106: T__58
                {
                mT__58(); 

                }
                break;
            case 18 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:112: T__59
                {
                mT__59(); 

                }
                break;
            case 19 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:118: T__60
                {
                mT__60(); 

                }
                break;
            case 20 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:124: T__61
                {
                mT__61(); 

                }
                break;
            case 21 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:130: T__62
                {
                mT__62(); 

                }
                break;
            case 22 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:136: T__63
                {
                mT__63(); 

                }
                break;
            case 23 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:142: MOD
                {
                mMOD(); 

                }
                break;
            case 24 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:146: ENTERO
                {
                mENTERO(); 

                }
                break;
            case 25 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:153: BOOLEANO
                {
                mBOOLEANO(); 

                }
                break;
            case 26 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:162: REAL
                {
                mREAL(); 

                }
                break;
            case 27 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:167: CADENA
                {
                mCADENA(); 

                }
                break;
            case 28 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:174: CARACTER
                {
                mCARACTER(); 

                }
                break;
            case 29 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:183: NINGUNO
                {
                mNINGUNO(); 

                }
                break;
            case 30 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:191: VARIABLES
                {
                mVARIABLES(); 

                }
                break;
            case 31 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:201: FIN_VAR
                {
                mFIN_VAR(); 

                }
                break;
            case 32 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:209: AUX
                {
                mAUX(); 

                }
                break;
            case 33 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:213: FUNCION
                {
                mFUNCION(); 

                }
                break;
            case 34 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:221: BREAK
                {
                mBREAK(); 

                }
                break;
            case 35 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:227: ESCRITURA
                {
                mESCRITURA(); 

                }
                break;
            case 36 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:237: LECTURA
                {
                mLECTURA(); 

                }
                break;
            case 37 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:245: PARA
                {
                mPARA(); 

                }
                break;
            case 38 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:250: FIN_PARA
                {
                mFIN_PARA(); 

                }
                break;
            case 39 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:259: FIN_MIENTRAS
                {
                mFIN_MIENTRAS(); 

                }
                break;
            case 40 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:272: MIENTRAS
                {
                mMIENTRAS(); 

                }
                break;
            case 41 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:281: FIN_SI
                {
                mFIN_SI(); 

                }
                break;
            case 42 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:288: SINO
                {
                mSINO(); 

                }
                break;
            case 43 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:293: SI
                {
                mSI(); 

                }
                break;
            case 44 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:296: IVAR
                {
                mIVAR(); 

                }
                break;
            case 45 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:301: ASIGNACION
                {
                mASIGNACION(); 

                }
                break;
            case 46 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:312: INICIO
                {
                mINICIO(); 

                }
                break;
            case 47 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:319: FIN
                {
                mFIN(); 

                }
                break;
            case 48 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:323: LOGICO
                {
                mLOGICO(); 

                }
                break;
            case 49 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:330: ID
                {
                mID(); 

                }
                break;
            case 50 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:333: INT
                {
                mINT(); 

                }
                break;
            case 51 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:337: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 52 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:343: CHAR
                {
                mCHAR(); 

                }
                break;
            case 53 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:348: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 54 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:356: WS
                {
                mWS(); 

                }
                break;
            case 55 :
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:1:359: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA12_eotS =
        "\5\uffff";
    static final String DFA12_eofS =
        "\5\uffff";
    static final String DFA12_minS =
        "\2\56\3\uffff";
    static final String DFA12_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA12_specialS =
        "\5\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "219:15: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )";
        }
    }
    static final String DFA19_eotS =
        "\1\uffff\1\51\4\uffff\1\53\1\55\2\uffff\1\57\3\uffff\1\64\1\66"+
        "\4\uffff\17\43\1\uffff\1\112\22\uffff\15\43\1\133\5\43\2\uffff\11"+
        "\43\1\153\5\43\1\uffff\11\43\1\172\5\43\1\uffff\2\43\1\u0085\1\43"+
        "\1\u0087\1\u0088\10\43\1\uffff\11\43\1\u009a\1\uffff\1\43\2\uffff"+
        "\3\43\1\u009f\1\u00a0\1\43\1\u00a2\1\43\1\u00a4\6\43\1\u00ab\1\43"+
        "\1\uffff\1\43\1\u00ae\2\43\2\uffff\1\43\1\uffff\1\u00b2\1\uffff"+
        "\1\43\1\u00b4\1\43\1\u00b6\2\43\1\uffff\1\u00b9\1\43\1\uffff\3\43"+
        "\1\uffff\1\u00be\1\uffff\1\43\1\uffff\1\u00c0\1\43\1\uffff\1\u00c2"+
        "\2\43\1\u00c5\1\uffff\1\u00c6\1\uffff\1\43\1\uffff\1\43\1\u009f"+
        "\2\uffff\1\43\1\u00ca\1\43\1\uffff\1\u00cc\1\uffff";
    static final String DFA19_eofS =
        "\u00cd\uffff";
    static final String DFA19_minS =
        "\1\11\1\75\4\uffff\2\75\2\uffff\1\52\2\uffff\1\60\1\55\1\72\4\uffff"+
        "\1\116\2\105\1\101\1\111\1\101\1\111\1\122\1\101\2\111\1\116\1\123"+
        "\1\145\1\141\1\uffff\1\56\16\uffff\1\51\3\uffff\1\124\1\103\1\107"+
        "\1\103\1\101\1\104\1\116\1\122\2\116\1\105\1\122\1\105\1\60\1\101"+
        "\2\111\1\162\1\154\1\uffff\1\56\1\105\1\122\1\111\1\124\1\114\1"+
        "\105\1\101\1\107\1\111\1\60\1\103\2\101\1\116\1\117\1\uffff\1\122"+
        "\1\103\1\107\1\144\1\163\1\122\1\111\1\103\1\125\1\60\1\116\1\103"+
        "\1\125\1\101\1\115\1\uffff\1\111\1\113\1\60\1\124\2\60\1\111\1\116"+
        "\1\141\1\157\1\117\1\124\1\117\1\122\1\uffff\1\101\1\124\1\116\1"+
        "\102\2\101\2\111\1\117\1\60\1\uffff\1\122\2\uffff\1\117\1\101\1"+
        "\144\2\60\1\125\1\60\1\101\1\60\1\105\1\117\1\114\2\122\1\105\1"+
        "\60\1\116\1\uffff\1\101\1\60\1\103\1\145\2\uffff\1\122\1\uffff\1"+
        "\60\1\uffff\1\122\1\60\1\105\1\60\1\101\1\116\1\uffff\1\60\1\123"+
        "\1\uffff\1\111\1\162\1\101\1\uffff\1\60\1\uffff\1\123\1\uffff\1"+
        "\60\1\124\1\uffff\1\60\1\117\1\157\1\60\1\uffff\1\60\1\uffff\1\122"+
        "\1\uffff\1\116\1\60\2\uffff\1\101\1\60\1\123\1\uffff\1\60\1\uffff";
    static final String DFA19_maxS =
        "\1\174\1\75\4\uffff\2\75\2\uffff\1\52\2\uffff\1\116\1\55\1\72\4"+
        "\uffff\1\123\1\117\1\105\1\101\1\111\1\101\1\125\1\122\1\101\2\111"+
        "\1\126\1\123\1\145\1\141\1\uffff\1\145\16\uffff\1\51\3\uffff\1\124"+
        "\1\103\1\107\1\103\1\101\1\122\1\116\1\122\2\116\1\105\1\122\1\105"+
        "\1\172\1\101\2\111\1\162\1\154\1\uffff\1\71\1\105\1\122\1\111\1"+
        "\124\1\114\1\105\1\101\1\107\1\111\1\172\1\103\2\101\1\116\1\117"+
        "\1\uffff\1\122\1\103\1\107\1\144\1\163\1\122\1\111\1\103\1\125\1"+
        "\172\1\116\1\103\1\125\1\101\1\126\1\uffff\1\111\1\113\1\172\1\124"+
        "\2\172\1\111\1\116\1\141\1\157\1\117\1\124\1\117\1\122\1\uffff\1"+
        "\101\1\124\1\116\1\102\2\101\2\111\1\117\1\172\1\uffff\1\122\2\uffff"+
        "\1\117\1\101\1\144\2\172\1\125\1\172\1\101\1\172\1\105\1\117\1\114"+
        "\2\122\1\105\1\172\1\116\1\uffff\1\101\1\172\1\103\1\145\2\uffff"+
        "\1\122\1\uffff\1\172\1\uffff\1\122\1\172\1\105\1\172\1\101\1\116"+
        "\1\uffff\1\172\1\123\1\uffff\1\111\1\162\1\101\1\uffff\1\172\1\uffff"+
        "\1\123\1\uffff\1\172\1\124\1\uffff\1\172\1\117\1\157\1\172\1\uffff"+
        "\1\172\1\uffff\1\122\1\uffff\1\116\1\172\2\uffff\1\101\1\172\1\123"+
        "\1\uffff\1\172\1\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\2\uffff\1\13\1\14\1\uffff\1\16\1\17\3"+
        "\uffff\1\23\1\25\1\26\1\27\17\uffff\1\61\1\uffff\1\64\1\66\1\67"+
        "\1\12\1\1\1\11\1\6\1\10\1\7\1\65\1\15\1\20\1\40\1\63\1\uffff\1\21"+
        "\1\24\1\22\23\uffff\1\62\20\uffff\1\53\17\uffff\1\57\16\uffff\1"+
        "\32\12\uffff\1\45\1\uffff\1\52\1\54\21\uffff\1\42\4\uffff\1\60\1"+
        "\30\1\uffff\1\31\1\uffff\1\33\6\uffff\1\51\2\uffff\1\56\3\uffff"+
        "\1\44\1\uffff\1\35\1\uffff\1\37\2\uffff\1\41\4\uffff\1\34\1\uffff"+
        "\1\46\1\uffff\1\50\2\uffff\1\43\1\36\3\uffff\1\55\1\uffff\1\47";
    static final String DFA19_specialS =
        "\u00cd\uffff}>";
    static final String[] DFA19_transitionS = {
            "\2\46\2\uffff\1\46\22\uffff\1\46\1\10\1\47\2\uffff\1\23\1\4"+
            "\1\45\1\16\1\17\1\11\1\13\1\20\1\14\1\15\1\12\12\44\1\21\1\22"+
            "\1\6\1\1\1\7\2\uffff\1\40\1\33\1\27\1\43\1\24\1\32\2\43\1\37"+
            "\2\43\1\25\1\35\1\30\1\43\1\34\1\43\1\26\1\36\2\43\1\31\4\43"+
            "\1\2\1\uffff\1\3\1\uffff\1\43\1\uffff\5\43\1\42\17\43\1\41\4"+
            "\43\1\uffff\1\5",
            "\1\50",
            "",
            "",
            "",
            "",
            "\1\52",
            "\1\54",
            "",
            "",
            "\1\56",
            "",
            "",
            "\12\62\7\uffff\1\61\14\uffff\1\60",
            "\1\63",
            "\1\65",
            "",
            "",
            "",
            "",
            "\1\67\4\uffff\1\70",
            "\1\72\11\uffff\1\71",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77\13\uffff\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\106\7\uffff\1\105",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "\1\62\1\uffff\12\44\13\uffff\1\62\37\uffff\1\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\113",
            "",
            "",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121\15\uffff\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\12\43\7\uffff\15\43\1\132\14\43\4\uffff\1\43\1\uffff\32\43",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "\1\62\1\uffff\12\44",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\12\43\7\uffff\32\43\4\uffff\1\152\1\uffff\32\43",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\u0081\2\uffff\1\u0080\2\uffff\1\u0082\2\uffff\1\177",
            "",
            "\1\u0083",
            "\1\u0084",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0086",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u009b",
            "",
            "",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00a1",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00a3",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00af",
            "\1\u00b0",
            "",
            "",
            "\1\u00b1",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u00b3",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00b5",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u00bf",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00c1",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00c3",
            "\1\u00c4",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u00c7",
            "",
            "\1\u00c8",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\1\u00c9",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00cb",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | MOD | ENTERO | BOOLEANO | REAL | CADENA | CARACTER | NINGUNO | VARIABLES | FIN_VAR | AUX | FUNCION | BREAK | ESCRITURA | LECTURA | PARA | FIN_PARA | FIN_MIENTRAS | MIENTRAS | FIN_SI | SINO | SI | IVAR | ASIGNACION | INICIO | FIN | LOGICO | ID | INT | FLOAT | CHAR | COMMENT | WS | STRING );";
        }
    }
 

}