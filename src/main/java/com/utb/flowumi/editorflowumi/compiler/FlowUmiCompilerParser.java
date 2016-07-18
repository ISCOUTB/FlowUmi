// $ANTLR 3.1.2 C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g 2013-08-13 14:34:48

package com.flowumi.compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class FlowUmiCompilerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INICIO", "FIN", "VARIABLES", "FIN_VAR", "ID", "INT", "ENTERO", "BOOLEANO", "REAL", "CADENA", "CARACTER", "NINGUNO", "ASIGNACION", "MOD", "STRING", "FLOAT", "LOGICO", "CHAR", "SI", "FIN_SI", "SINO", "MIENTRAS", "FIN_MIENTRAS", "PARA", "FIN_PARA", "LECTURA", "ESCRITURA", "FUNCION", "BREAK", "AUX", "IVAR", "EXPONENT", "COMMENT", "WS", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "ESC_SEQ", "'='", "'['", "']'", "'&&'", "'||'", "'<'", "'>'", "'>='", "'<='", "'=='", "'!='", "'*'", "'/'", "'+'", "'-'", "'.NO.'", "'('", "')'", "','", "'):'", "':'", "';'"
    };
    public static final int EXPONENT=35;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int LOGICO=20;
    public static final int INICIO=4;
    public static final int MOD=17;
    public static final int FIN_VAR=7;
    public static final int OCTAL_ESC=40;
    public static final int ASIGNACION=16;
    public static final int CHAR=21;
    public static final int FLOAT=19;
    public static final int T__61=61;
    public static final int ID=8;
    public static final int EOF=-1;
    public static final int T__60=60;
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
    public static final int T__47=47;
    public static final int CARACTER=14;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int IVAR=34;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int UNICODE_ESC=39;
    public static final int FIN_MIENTRAS=26;
    public static final int FIN_SI=23;
    public static final int HEX_DIGIT=38;
    public static final int INT=9;
    public static final int ESCRITURA=30;
    public static final int REAL=12;
    public static final int WS=37;
    public static final int SI=22;
    public static final int VARIABLES=6;
    public static final int BOOLEANO=11;
    public static final int NINGUNO=15;
    public static final int STRING=18;

    // delegates
    // delegators


        public FlowUmiCompilerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FlowUmiCompilerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return FlowUmiCompilerParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g"; }


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


    public static class algoritmo_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "algoritmo"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:62:1: algoritmo : ( funcion )+ ;
    public final FlowUmiCompilerParser.algoritmo_return algoritmo() throws RecognitionException {
        FlowUmiCompilerParser.algoritmo_return retval = new FlowUmiCompilerParser.algoritmo_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        FlowUmiCompilerParser.funcion_return funcion1 = null;



        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:63:2: ( ( funcion )+ )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:63:4: ( funcion )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:63:4: ( funcion )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNCION) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:63:5: funcion
            	    {
            	    pushFollow(FOLLOW_funcion_in_algoritmo55);
            	    funcion1=funcion();

            	    state._fsp--;

            	    adaptor.addChild(root_0, funcion1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "algoritmo"

    public static class principal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "principal"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:65:1: principal : variablesDec INICIO ( sentencias )* FIN -> ^( INICIO variablesDec ( sentencias )* ) ;
    public final FlowUmiCompilerParser.principal_return principal() throws RecognitionException {
        FlowUmiCompilerParser.principal_return retval = new FlowUmiCompilerParser.principal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INICIO3=null;
        Token FIN5=null;
        FlowUmiCompilerParser.variablesDec_return variablesDec2 = null;

        FlowUmiCompilerParser.sentencias_return sentencias4 = null;


        CommonTree INICIO3_tree=null;
        CommonTree FIN5_tree=null;
        RewriteRuleTokenStream stream_INICIO=new RewriteRuleTokenStream(adaptor,"token INICIO");
        RewriteRuleTokenStream stream_FIN=new RewriteRuleTokenStream(adaptor,"token FIN");
        RewriteRuleSubtreeStream stream_sentencias=new RewriteRuleSubtreeStream(adaptor,"rule sentencias");
        RewriteRuleSubtreeStream stream_variablesDec=new RewriteRuleSubtreeStream(adaptor,"rule variablesDec");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:66:2: ( variablesDec INICIO ( sentencias )* FIN -> ^( INICIO variablesDec ( sentencias )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:66:4: variablesDec INICIO ( sentencias )* FIN
            {
            pushFollow(FOLLOW_variablesDec_in_principal67);
            variablesDec2=variablesDec();

            state._fsp--;

            stream_variablesDec.add(variablesDec2.getTree());
            INICIO3=(Token)match(input,INICIO,FOLLOW_INICIO_in_principal69);  
            stream_INICIO.add(INICIO3);

            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:66:24: ( sentencias )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==INT||LA2_0==ASIGNACION||LA2_0==SI||LA2_0==MIENTRAS||LA2_0==PARA||(LA2_0>=LECTURA && LA2_0<=ESCRITURA)||LA2_0==BREAK) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:66:24: sentencias
            	    {
            	    pushFollow(FOLLOW_sentencias_in_principal71);
            	    sentencias4=sentencias();

            	    state._fsp--;

            	    stream_sentencias.add(sentencias4.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            FIN5=(Token)match(input,FIN,FOLLOW_FIN_in_principal74);  
            stream_FIN.add(FIN5);



            // AST REWRITE
            // elements: INICIO, sentencias, variablesDec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 66:40: -> ^( INICIO variablesDec ( sentencias )* )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:66:42: ^( INICIO variablesDec ( sentencias )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_INICIO.nextNode(), root_1);

                adaptor.addChild(root_1, stream_variablesDec.nextTree());
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:66:64: ( sentencias )*
                while ( stream_sentencias.hasNext() ) {
                    adaptor.addChild(root_1, stream_sentencias.nextTree());

                }
                stream_sentencias.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "principal"

    public static class variablesDec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variablesDec"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:68:1: variablesDec : VARIABLES ( declaracionVar )* FIN_VAR -> ^( VARIABLES ( declaracionVar )* ) ;
    public final FlowUmiCompilerParser.variablesDec_return variablesDec() throws RecognitionException {
        FlowUmiCompilerParser.variablesDec_return retval = new FlowUmiCompilerParser.variablesDec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VARIABLES6=null;
        Token FIN_VAR8=null;
        FlowUmiCompilerParser.declaracionVar_return declaracionVar7 = null;


        CommonTree VARIABLES6_tree=null;
        CommonTree FIN_VAR8_tree=null;
        RewriteRuleTokenStream stream_FIN_VAR=new RewriteRuleTokenStream(adaptor,"token FIN_VAR");
        RewriteRuleTokenStream stream_VARIABLES=new RewriteRuleTokenStream(adaptor,"token VARIABLES");
        RewriteRuleSubtreeStream stream_declaracionVar=new RewriteRuleSubtreeStream(adaptor,"rule declaracionVar");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:69:2: ( VARIABLES ( declaracionVar )* FIN_VAR -> ^( VARIABLES ( declaracionVar )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:69:4: VARIABLES ( declaracionVar )* FIN_VAR
            {
            VARIABLES6=(Token)match(input,VARIABLES,FOLLOW_VARIABLES_in_variablesDec94);  
            stream_VARIABLES.add(VARIABLES6);

            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:69:14: ( declaracionVar )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=ENTERO && LA3_0<=NINGUNO)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:69:14: declaracionVar
            	    {
            	    pushFollow(FOLLOW_declaracionVar_in_variablesDec96);
            	    declaracionVar7=declaracionVar();

            	    state._fsp--;

            	    stream_declaracionVar.add(declaracionVar7.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            FIN_VAR8=(Token)match(input,FIN_VAR,FOLLOW_FIN_VAR_in_variablesDec99);  
            stream_FIN_VAR.add(FIN_VAR8);



            // AST REWRITE
            // elements: declaracionVar, VARIABLES
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 69:38: -> ^( VARIABLES ( declaracionVar )* )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:69:40: ^( VARIABLES ( declaracionVar )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_VARIABLES.nextNode(), root_1);

                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:69:52: ( declaracionVar )*
                while ( stream_declaracionVar.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaracionVar.nextTree());

                }
                stream_declaracionVar.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variablesDec"

    public static class declaracionVar_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaracionVar"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:71:1: declaracionVar : ( tipo_dato ID '=' constante -> ^( IVAR tipo_dato ID '=' constante ) | tipo_dato ID '[' INT ']' -> ^( IVAR tipo_dato ID INT ) | tipo_dato ID '[' INT ']' '[' INT ']' -> ^( IVAR tipo_dato ID INT INT ) );
    public final FlowUmiCompilerParser.declaracionVar_return declaracionVar() throws RecognitionException {
        FlowUmiCompilerParser.declaracionVar_return retval = new FlowUmiCompilerParser.declaracionVar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID10=null;
        Token char_literal11=null;
        Token ID14=null;
        Token char_literal15=null;
        Token INT16=null;
        Token char_literal17=null;
        Token ID19=null;
        Token char_literal20=null;
        Token INT21=null;
        Token char_literal22=null;
        Token char_literal23=null;
        Token INT24=null;
        Token char_literal25=null;
        FlowUmiCompilerParser.tipo_dato_return tipo_dato9 = null;

        FlowUmiCompilerParser.constante_return constante12 = null;

        FlowUmiCompilerParser.tipo_dato_return tipo_dato13 = null;

        FlowUmiCompilerParser.tipo_dato_return tipo_dato18 = null;


        CommonTree ID10_tree=null;
        CommonTree char_literal11_tree=null;
        CommonTree ID14_tree=null;
        CommonTree char_literal15_tree=null;
        CommonTree INT16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree ID19_tree=null;
        CommonTree char_literal20_tree=null;
        CommonTree INT21_tree=null;
        CommonTree char_literal22_tree=null;
        CommonTree char_literal23_tree=null;
        CommonTree INT24_tree=null;
        CommonTree char_literal25_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_constante=new RewriteRuleSubtreeStream(adaptor,"rule constante");
        RewriteRuleSubtreeStream stream_tipo_dato=new RewriteRuleSubtreeStream(adaptor,"rule tipo_dato");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:72:2: ( tipo_dato ID '=' constante -> ^( IVAR tipo_dato ID '=' constante ) | tipo_dato ID '[' INT ']' -> ^( IVAR tipo_dato ID INT ) | tipo_dato ID '[' INT ']' '[' INT ']' -> ^( IVAR tipo_dato ID INT INT ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:72:4: tipo_dato ID '=' constante
                    {
                    pushFollow(FOLLOW_tipo_dato_in_declaracionVar116);
                    tipo_dato9=tipo_dato();

                    state._fsp--;

                    stream_tipo_dato.add(tipo_dato9.getTree());
                    ID10=(Token)match(input,ID,FOLLOW_ID_in_declaracionVar118);  
                    stream_ID.add(ID10);

                    char_literal11=(Token)match(input,42,FOLLOW_42_in_declaracionVar120);  
                    stream_42.add(char_literal11);

                    pushFollow(FOLLOW_constante_in_declaracionVar122);
                    constante12=constante();

                    state._fsp--;

                    stream_constante.add(constante12.getTree());


                    // AST REWRITE
                    // elements: 42, ID, constante, tipo_dato
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 72:30: -> ^( IVAR tipo_dato ID '=' constante )
                    {
                        // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:72:32: ^( IVAR tipo_dato ID '=' constante )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IVAR, "IVAR"), root_1);

                        adaptor.addChild(root_1, stream_tipo_dato.nextTree());
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_42.nextNode());
                        adaptor.addChild(root_1, stream_constante.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:73:4: tipo_dato ID '[' INT ']'
                    {
                    pushFollow(FOLLOW_tipo_dato_in_declaracionVar139);
                    tipo_dato13=tipo_dato();

                    state._fsp--;

                    stream_tipo_dato.add(tipo_dato13.getTree());
                    ID14=(Token)match(input,ID,FOLLOW_ID_in_declaracionVar141);  
                    stream_ID.add(ID14);

                    char_literal15=(Token)match(input,43,FOLLOW_43_in_declaracionVar143);  
                    stream_43.add(char_literal15);

                    INT16=(Token)match(input,INT,FOLLOW_INT_in_declaracionVar144);  
                    stream_INT.add(INT16);

                    char_literal17=(Token)match(input,44,FOLLOW_44_in_declaracionVar145);  
                    stream_44.add(char_literal17);



                    // AST REWRITE
                    // elements: INT, ID, tipo_dato
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 73:26: -> ^( IVAR tipo_dato ID INT )
                    {
                        // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:73:28: ^( IVAR tipo_dato ID INT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IVAR, "IVAR"), root_1);

                        adaptor.addChild(root_1, stream_tipo_dato.nextTree());
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:74:4: tipo_dato ID '[' INT ']' '[' INT ']'
                    {
                    pushFollow(FOLLOW_tipo_dato_in_declaracionVar160);
                    tipo_dato18=tipo_dato();

                    state._fsp--;

                    stream_tipo_dato.add(tipo_dato18.getTree());
                    ID19=(Token)match(input,ID,FOLLOW_ID_in_declaracionVar162);  
                    stream_ID.add(ID19);

                    char_literal20=(Token)match(input,43,FOLLOW_43_in_declaracionVar164);  
                    stream_43.add(char_literal20);

                    INT21=(Token)match(input,INT,FOLLOW_INT_in_declaracionVar165);  
                    stream_INT.add(INT21);

                    char_literal22=(Token)match(input,44,FOLLOW_44_in_declaracionVar166);  
                    stream_44.add(char_literal22);

                    char_literal23=(Token)match(input,43,FOLLOW_43_in_declaracionVar167);  
                    stream_43.add(char_literal23);

                    INT24=(Token)match(input,INT,FOLLOW_INT_in_declaracionVar168);  
                    stream_INT.add(INT24);

                    char_literal25=(Token)match(input,44,FOLLOW_44_in_declaracionVar169);  
                    stream_44.add(char_literal25);



                    // AST REWRITE
                    // elements: INT, ID, tipo_dato, INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 74:35: -> ^( IVAR tipo_dato ID INT INT )
                    {
                        // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:74:37: ^( IVAR tipo_dato ID INT INT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IVAR, "IVAR"), root_1);

                        adaptor.addChild(root_1, stream_tipo_dato.nextTree());
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_INT.nextNode());
                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaracionVar"

    public static class tipo_dato_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tipo_dato"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:76:1: tipo_dato : ( ENTERO -> ENTERO | BOOLEANO -> BOOLEANO | REAL -> REAL | CADENA -> CADENA | CARACTER -> CARACTER | NINGUNO -> NINGUNO );
    public final FlowUmiCompilerParser.tipo_dato_return tipo_dato() throws RecognitionException {
        FlowUmiCompilerParser.tipo_dato_return retval = new FlowUmiCompilerParser.tipo_dato_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ENTERO26=null;
        Token BOOLEANO27=null;
        Token REAL28=null;
        Token CADENA29=null;
        Token CARACTER30=null;
        Token NINGUNO31=null;

        CommonTree ENTERO26_tree=null;
        CommonTree BOOLEANO27_tree=null;
        CommonTree REAL28_tree=null;
        CommonTree CADENA29_tree=null;
        CommonTree CARACTER30_tree=null;
        CommonTree NINGUNO31_tree=null;
        RewriteRuleTokenStream stream_CADENA=new RewriteRuleTokenStream(adaptor,"token CADENA");
        RewriteRuleTokenStream stream_REAL=new RewriteRuleTokenStream(adaptor,"token REAL");
        RewriteRuleTokenStream stream_ENTERO=new RewriteRuleTokenStream(adaptor,"token ENTERO");
        RewriteRuleTokenStream stream_CARACTER=new RewriteRuleTokenStream(adaptor,"token CARACTER");
        RewriteRuleTokenStream stream_NINGUNO=new RewriteRuleTokenStream(adaptor,"token NINGUNO");
        RewriteRuleTokenStream stream_BOOLEANO=new RewriteRuleTokenStream(adaptor,"token BOOLEANO");

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:77:2: ( ENTERO -> ENTERO | BOOLEANO -> BOOLEANO | REAL -> REAL | CADENA -> CADENA | CARACTER -> CARACTER | NINGUNO -> NINGUNO )
            int alt5=6;
            switch ( input.LA(1) ) {
            case ENTERO:
                {
                alt5=1;
                }
                break;
            case BOOLEANO:
                {
                alt5=2;
                }
                break;
            case REAL:
                {
                alt5=3;
                }
                break;
            case CADENA:
                {
                alt5=4;
                }
                break;
            case CARACTER:
                {
                alt5=5;
                }
                break;
            case NINGUNO:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:77:4: ENTERO
                    {
                    ENTERO26=(Token)match(input,ENTERO,FOLLOW_ENTERO_in_tipo_dato190);  
                    stream_ENTERO.add(ENTERO26);



                    // AST REWRITE
                    // elements: ENTERO
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 77:10: -> ENTERO
                    {
                        adaptor.addChild(root_0, stream_ENTERO.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:77:19: BOOLEANO
                    {
                    BOOLEANO27=(Token)match(input,BOOLEANO,FOLLOW_BOOLEANO_in_tipo_dato194);  
                    stream_BOOLEANO.add(BOOLEANO27);



                    // AST REWRITE
                    // elements: BOOLEANO
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 77:27: -> BOOLEANO
                    {
                        adaptor.addChild(root_0, stream_BOOLEANO.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:77:38: REAL
                    {
                    REAL28=(Token)match(input,REAL,FOLLOW_REAL_in_tipo_dato198);  
                    stream_REAL.add(REAL28);



                    // AST REWRITE
                    // elements: REAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 77:42: -> REAL
                    {
                        adaptor.addChild(root_0, stream_REAL.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:77:49: CADENA
                    {
                    CADENA29=(Token)match(input,CADENA,FOLLOW_CADENA_in_tipo_dato202);  
                    stream_CADENA.add(CADENA29);



                    // AST REWRITE
                    // elements: CADENA
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 77:55: -> CADENA
                    {
                        adaptor.addChild(root_0, stream_CADENA.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:77:64: CARACTER
                    {
                    CARACTER30=(Token)match(input,CARACTER,FOLLOW_CARACTER_in_tipo_dato206);  
                    stream_CARACTER.add(CARACTER30);



                    // AST REWRITE
                    // elements: CARACTER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 77:72: -> CARACTER
                    {
                        adaptor.addChild(root_0, stream_CARACTER.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:77:83: NINGUNO
                    {
                    NINGUNO31=(Token)match(input,NINGUNO,FOLLOW_NINGUNO_in_tipo_dato210);  
                    stream_NINGUNO.add(NINGUNO31);



                    // AST REWRITE
                    // elements: NINGUNO
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 77:90: -> NINGUNO
                    {
                        adaptor.addChild(root_0, stream_NINGUNO.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tipo_dato"

    public static class sentencias_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sentencias"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:79:1: sentencias : ( asignacion | si | mientras | para | lectura | escritura | breaks | llamado );
    public final FlowUmiCompilerParser.sentencias_return sentencias() throws RecognitionException {
        FlowUmiCompilerParser.sentencias_return retval = new FlowUmiCompilerParser.sentencias_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        FlowUmiCompilerParser.asignacion_return asignacion32 = null;

        FlowUmiCompilerParser.si_return si33 = null;

        FlowUmiCompilerParser.mientras_return mientras34 = null;

        FlowUmiCompilerParser.para_return para35 = null;

        FlowUmiCompilerParser.lectura_return lectura36 = null;

        FlowUmiCompilerParser.escritura_return escritura37 = null;

        FlowUmiCompilerParser.breaks_return breaks38 = null;

        FlowUmiCompilerParser.llamado_return llamado39 = null;



        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:80:2: ( asignacion | si | mientras | para | lectura | escritura | breaks | llamado )
            int alt6=8;
            switch ( input.LA(1) ) {
            case ASIGNACION:
                {
                alt6=1;
                }
                break;
            case SI:
                {
                alt6=2;
                }
                break;
            case MIENTRAS:
                {
                alt6=3;
                }
                break;
            case PARA:
                {
                alt6=4;
                }
                break;
            case LECTURA:
                {
                alt6=5;
                }
                break;
            case ESCRITURA:
                {
                alt6=6;
                }
                break;
            case BREAK:
                {
                alt6=7;
                }
                break;
            case INT:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:80:4: asignacion
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_asignacion_in_sentencias221);
                    asignacion32=asignacion();

                    state._fsp--;

                    adaptor.addChild(root_0, asignacion32.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:80:15: si
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_si_in_sentencias223);
                    si33=si();

                    state._fsp--;

                    adaptor.addChild(root_0, si33.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:80:18: mientras
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_mientras_in_sentencias225);
                    mientras34=mientras();

                    state._fsp--;

                    adaptor.addChild(root_0, mientras34.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:80:27: para
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_para_in_sentencias227);
                    para35=para();

                    state._fsp--;

                    adaptor.addChild(root_0, para35.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:80:32: lectura
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lectura_in_sentencias229);
                    lectura36=lectura();

                    state._fsp--;

                    adaptor.addChild(root_0, lectura36.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:80:40: escritura
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_escritura_in_sentencias231);
                    escritura37=escritura();

                    state._fsp--;

                    adaptor.addChild(root_0, escritura37.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:80:50: breaks
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_breaks_in_sentencias233);
                    breaks38=breaks();

                    state._fsp--;

                    adaptor.addChild(root_0, breaks38.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:80:57: llamado
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_llamado_in_sentencias235);
                    llamado39=llamado();

                    state._fsp--;

                    adaptor.addChild(root_0, llamado39.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sentencias"

    public static class asignacion_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "asignacion"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:82:1: asignacion : ASIGNACION INT variable '=' expresion -> ^( ASIGNACION INT variable expresion ) ;
    public final FlowUmiCompilerParser.asignacion_return asignacion() throws RecognitionException {
        FlowUmiCompilerParser.asignacion_return retval = new FlowUmiCompilerParser.asignacion_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASIGNACION40=null;
        Token INT41=null;
        Token char_literal43=null;
        FlowUmiCompilerParser.variable_return variable42 = null;

        FlowUmiCompilerParser.expresion_return expresion44 = null;


        CommonTree ASIGNACION40_tree=null;
        CommonTree INT41_tree=null;
        CommonTree char_literal43_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_ASIGNACION=new RewriteRuleTokenStream(adaptor,"token ASIGNACION");
        RewriteRuleSubtreeStream stream_expresion=new RewriteRuleSubtreeStream(adaptor,"rule expresion");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:83:2: ( ASIGNACION INT variable '=' expresion -> ^( ASIGNACION INT variable expresion ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:83:4: ASIGNACION INT variable '=' expresion
            {
            ASIGNACION40=(Token)match(input,ASIGNACION,FOLLOW_ASIGNACION_in_asignacion244);  
            stream_ASIGNACION.add(ASIGNACION40);

            INT41=(Token)match(input,INT,FOLLOW_INT_in_asignacion246);  
            stream_INT.add(INT41);

            pushFollow(FOLLOW_variable_in_asignacion248);
            variable42=variable();

            state._fsp--;

            stream_variable.add(variable42.getTree());
            char_literal43=(Token)match(input,42,FOLLOW_42_in_asignacion250);  
            stream_42.add(char_literal43);

            pushFollow(FOLLOW_expresion_in_asignacion252);
            expresion44=expresion();

            state._fsp--;

            stream_expresion.add(expresion44.getTree());


            // AST REWRITE
            // elements: INT, expresion, ASIGNACION, variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 83:42: -> ^( ASIGNACION INT variable expresion )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:83:44: ^( ASIGNACION INT variable expresion )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ASIGNACION.nextNode(), root_1);

                adaptor.addChild(root_1, stream_INT.nextNode());
                adaptor.addChild(root_1, stream_variable.nextTree());
                adaptor.addChild(root_1, stream_expresion.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "asignacion"

    public static class expresion_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expresion"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:85:1: expresion : ( expry ( ( '&&' ) expry )* ) -> ^( AUX expry ( '&&' expry )* ) ;
    public final FlowUmiCompilerParser.expresion_return expresion() throws RecognitionException {
        FlowUmiCompilerParser.expresion_return retval = new FlowUmiCompilerParser.expresion_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal46=null;
        FlowUmiCompilerParser.expry_return expry45 = null;

        FlowUmiCompilerParser.expry_return expry47 = null;


        CommonTree string_literal46_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleSubtreeStream stream_expry=new RewriteRuleSubtreeStream(adaptor,"rule expry");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:86:2: ( ( expry ( ( '&&' ) expry )* ) -> ^( AUX expry ( '&&' expry )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:86:4: ( expry ( ( '&&' ) expry )* )
            {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:86:4: ( expry ( ( '&&' ) expry )* )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:86:5: expry ( ( '&&' ) expry )*
            {
            pushFollow(FOLLOW_expry_in_expresion276);
            expry45=expry();

            state._fsp--;

            stream_expry.add(expry45.getTree());
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:86:11: ( ( '&&' ) expry )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==45) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:86:12: ( '&&' ) expry
            	    {
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:86:12: ( '&&' )
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:86:13: '&&'
            	    {
            	    string_literal46=(Token)match(input,45,FOLLOW_45_in_expresion280);  
            	    stream_45.add(string_literal46);


            	    }

            	    pushFollow(FOLLOW_expry_in_expresion283);
            	    expry47=expry();

            	    state._fsp--;

            	    stream_expry.add(expry47.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: expry, 45, expry
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 86:27: -> ^( AUX expry ( '&&' expry )* )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:86:29: ^( AUX expry ( '&&' expry )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AUX, "AUX"), root_1);

                adaptor.addChild(root_1, stream_expry.nextTree());
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:86:41: ( '&&' expry )*
                while ( stream_45.hasNext()||stream_expry.hasNext() ) {
                    adaptor.addChild(root_1, stream_45.nextNode());
                    adaptor.addChild(root_1, stream_expry.nextTree());

                }
                stream_45.reset();
                stream_expry.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expresion"

    public static class expry_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expry"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:88:1: expry : exprmenor ( ( '||' ) exprmenor )* -> ^( AUX exprmenor ( '||' exprmenor )* ) ;
    public final FlowUmiCompilerParser.expry_return expry() throws RecognitionException {
        FlowUmiCompilerParser.expry_return retval = new FlowUmiCompilerParser.expry_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal49=null;
        FlowUmiCompilerParser.exprmenor_return exprmenor48 = null;

        FlowUmiCompilerParser.exprmenor_return exprmenor50 = null;


        CommonTree string_literal49_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleSubtreeStream stream_exprmenor=new RewriteRuleSubtreeStream(adaptor,"rule exprmenor");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:88:8: ( exprmenor ( ( '||' ) exprmenor )* -> ^( AUX exprmenor ( '||' exprmenor )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:88:10: exprmenor ( ( '||' ) exprmenor )*
            {
            pushFollow(FOLLOW_exprmenor_in_expry309);
            exprmenor48=exprmenor();

            state._fsp--;

            stream_exprmenor.add(exprmenor48.getTree());
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:88:20: ( ( '||' ) exprmenor )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==46) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:88:21: ( '||' ) exprmenor
            	    {
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:88:21: ( '||' )
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:88:22: '||'
            	    {
            	    string_literal49=(Token)match(input,46,FOLLOW_46_in_expry313);  
            	    stream_46.add(string_literal49);


            	    }

            	    pushFollow(FOLLOW_exprmenor_in_expry316);
            	    exprmenor50=exprmenor();

            	    state._fsp--;

            	    stream_exprmenor.add(exprmenor50.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);



            // AST REWRITE
            // elements: exprmenor, 46, exprmenor
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 88:39: -> ^( AUX exprmenor ( '||' exprmenor )* )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:88:41: ^( AUX exprmenor ( '||' exprmenor )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AUX, "AUX"), root_1);

                adaptor.addChild(root_1, stream_exprmenor.nextTree());
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:88:57: ( '||' exprmenor )*
                while ( stream_exprmenor.hasNext()||stream_46.hasNext() ) {
                    adaptor.addChild(root_1, stream_46.nextNode());
                    adaptor.addChild(root_1, stream_exprmenor.nextTree());

                }
                stream_exprmenor.reset();
                stream_46.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expry"

    public static class exprmenor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprmenor"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:90:1: exprmenor : exprmayor ( '<' exprmayor )* -> ^( AUX exprmayor ( '<' exprmayor )* ) ;
    public final FlowUmiCompilerParser.exprmenor_return exprmenor() throws RecognitionException {
        FlowUmiCompilerParser.exprmenor_return retval = new FlowUmiCompilerParser.exprmenor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal52=null;
        FlowUmiCompilerParser.exprmayor_return exprmayor51 = null;

        FlowUmiCompilerParser.exprmayor_return exprmayor53 = null;


        CommonTree char_literal52_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleSubtreeStream stream_exprmayor=new RewriteRuleSubtreeStream(adaptor,"rule exprmayor");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:91:2: ( exprmayor ( '<' exprmayor )* -> ^( AUX exprmayor ( '<' exprmayor )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:91:5: exprmayor ( '<' exprmayor )*
            {
            pushFollow(FOLLOW_exprmayor_in_exprmenor342);
            exprmayor51=exprmayor();

            state._fsp--;

            stream_exprmayor.add(exprmayor51.getTree());
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:91:15: ( '<' exprmayor )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==47) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:91:16: '<' exprmayor
            	    {
            	    char_literal52=(Token)match(input,47,FOLLOW_47_in_exprmenor345);  
            	    stream_47.add(char_literal52);

            	    pushFollow(FOLLOW_exprmayor_in_exprmenor347);
            	    exprmayor53=exprmayor();

            	    state._fsp--;

            	    stream_exprmayor.add(exprmayor53.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);



            // AST REWRITE
            // elements: 47, exprmayor, exprmayor
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 91:31: -> ^( AUX exprmayor ( '<' exprmayor )* )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:91:33: ^( AUX exprmayor ( '<' exprmayor )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AUX, "AUX"), root_1);

                adaptor.addChild(root_1, stream_exprmayor.nextTree());
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:91:49: ( '<' exprmayor )*
                while ( stream_47.hasNext()||stream_exprmayor.hasNext() ) {
                    adaptor.addChild(root_1, stream_47.nextNode());
                    adaptor.addChild(root_1, stream_exprmayor.nextTree());

                }
                stream_47.reset();
                stream_exprmayor.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprmenor"

    public static class exprmayor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprmayor"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:92:1: exprmayor : exprmayorigual ( '>' exprmayorigual )* -> ^( AUX exprmayorigual ( '>' exprmayorigual )* ) ;
    public final FlowUmiCompilerParser.exprmayor_return exprmayor() throws RecognitionException {
        FlowUmiCompilerParser.exprmayor_return retval = new FlowUmiCompilerParser.exprmayor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal55=null;
        FlowUmiCompilerParser.exprmayorigual_return exprmayorigual54 = null;

        FlowUmiCompilerParser.exprmayorigual_return exprmayorigual56 = null;


        CommonTree char_literal55_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleSubtreeStream stream_exprmayorigual=new RewriteRuleSubtreeStream(adaptor,"rule exprmayorigual");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:93:2: ( exprmayorigual ( '>' exprmayorigual )* -> ^( AUX exprmayorigual ( '>' exprmayorigual )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:93:4: exprmayorigual ( '>' exprmayorigual )*
            {
            pushFollow(FOLLOW_exprmayorigual_in_exprmayor371);
            exprmayorigual54=exprmayorigual();

            state._fsp--;

            stream_exprmayorigual.add(exprmayorigual54.getTree());
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:93:19: ( '>' exprmayorigual )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==48) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:93:20: '>' exprmayorigual
            	    {
            	    char_literal55=(Token)match(input,48,FOLLOW_48_in_exprmayor374);  
            	    stream_48.add(char_literal55);

            	    pushFollow(FOLLOW_exprmayorigual_in_exprmayor376);
            	    exprmayorigual56=exprmayorigual();

            	    state._fsp--;

            	    stream_exprmayorigual.add(exprmayorigual56.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);



            // AST REWRITE
            // elements: exprmayorigual, 48, exprmayorigual
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 93:40: -> ^( AUX exprmayorigual ( '>' exprmayorigual )* )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:93:42: ^( AUX exprmayorigual ( '>' exprmayorigual )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AUX, "AUX"), root_1);

                adaptor.addChild(root_1, stream_exprmayorigual.nextTree());
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:93:63: ( '>' exprmayorigual )*
                while ( stream_exprmayorigual.hasNext()||stream_48.hasNext() ) {
                    adaptor.addChild(root_1, stream_48.nextNode());
                    adaptor.addChild(root_1, stream_exprmayorigual.nextTree());

                }
                stream_exprmayorigual.reset();
                stream_48.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprmayor"

    public static class exprmayorigual_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprmayorigual"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:94:1: exprmayorigual : exprmenorigual ( '>=' exprmenorigual )* -> ^( AUX exprmenorigual ( '>=' exprmenorigual )* ) ;
    public final FlowUmiCompilerParser.exprmayorigual_return exprmayorigual() throws RecognitionException {
        FlowUmiCompilerParser.exprmayorigual_return retval = new FlowUmiCompilerParser.exprmayorigual_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal58=null;
        FlowUmiCompilerParser.exprmenorigual_return exprmenorigual57 = null;

        FlowUmiCompilerParser.exprmenorigual_return exprmenorigual59 = null;


        CommonTree string_literal58_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleSubtreeStream stream_exprmenorigual=new RewriteRuleSubtreeStream(adaptor,"rule exprmenorigual");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:95:2: ( exprmenorigual ( '>=' exprmenorigual )* -> ^( AUX exprmenorigual ( '>=' exprmenorigual )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:95:4: exprmenorigual ( '>=' exprmenorigual )*
            {
            pushFollow(FOLLOW_exprmenorigual_in_exprmayorigual400);
            exprmenorigual57=exprmenorigual();

            state._fsp--;

            stream_exprmenorigual.add(exprmenorigual57.getTree());
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:95:19: ( '>=' exprmenorigual )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==49) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:95:20: '>=' exprmenorigual
            	    {
            	    string_literal58=(Token)match(input,49,FOLLOW_49_in_exprmayorigual403);  
            	    stream_49.add(string_literal58);

            	    pushFollow(FOLLOW_exprmenorigual_in_exprmayorigual405);
            	    exprmenorigual59=exprmenorigual();

            	    state._fsp--;

            	    stream_exprmenorigual.add(exprmenorigual59.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);



            // AST REWRITE
            // elements: exprmenorigual, 49, exprmenorigual
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 95:41: -> ^( AUX exprmenorigual ( '>=' exprmenorigual )* )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:95:43: ^( AUX exprmenorigual ( '>=' exprmenorigual )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AUX, "AUX"), root_1);

                adaptor.addChild(root_1, stream_exprmenorigual.nextTree());
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:95:64: ( '>=' exprmenorigual )*
                while ( stream_49.hasNext()||stream_exprmenorigual.hasNext() ) {
                    adaptor.addChild(root_1, stream_49.nextNode());
                    adaptor.addChild(root_1, stream_exprmenorigual.nextTree());

                }
                stream_49.reset();
                stream_exprmenorigual.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprmayorigual"

    public static class exprmenorigual_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprmenorigual"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:96:1: exprmenorigual : exprigual ( '<=' exprigual )* -> ^( AUX exprigual ( '<=' exprigual )* ) ;
    public final FlowUmiCompilerParser.exprmenorigual_return exprmenorigual() throws RecognitionException {
        FlowUmiCompilerParser.exprmenorigual_return retval = new FlowUmiCompilerParser.exprmenorigual_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal61=null;
        FlowUmiCompilerParser.exprigual_return exprigual60 = null;

        FlowUmiCompilerParser.exprigual_return exprigual62 = null;


        CommonTree string_literal61_tree=null;
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_exprigual=new RewriteRuleSubtreeStream(adaptor,"rule exprigual");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:97:2: ( exprigual ( '<=' exprigual )* -> ^( AUX exprigual ( '<=' exprigual )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:97:4: exprigual ( '<=' exprigual )*
            {
            pushFollow(FOLLOW_exprigual_in_exprmenorigual429);
            exprigual60=exprigual();

            state._fsp--;

            stream_exprigual.add(exprigual60.getTree());
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:97:14: ( '<=' exprigual )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==50) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:97:15: '<=' exprigual
            	    {
            	    string_literal61=(Token)match(input,50,FOLLOW_50_in_exprmenorigual432);  
            	    stream_50.add(string_literal61);

            	    pushFollow(FOLLOW_exprigual_in_exprmenorigual434);
            	    exprigual62=exprigual();

            	    state._fsp--;

            	    stream_exprigual.add(exprigual62.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);



            // AST REWRITE
            // elements: exprigual, 50, exprigual
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 97:31: -> ^( AUX exprigual ( '<=' exprigual )* )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:97:33: ^( AUX exprigual ( '<=' exprigual )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AUX, "AUX"), root_1);

                adaptor.addChild(root_1, stream_exprigual.nextTree());
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:97:49: ( '<=' exprigual )*
                while ( stream_50.hasNext()||stream_exprigual.hasNext() ) {
                    adaptor.addChild(root_1, stream_50.nextNode());
                    adaptor.addChild(root_1, stream_exprigual.nextTree());

                }
                stream_50.reset();
                stream_exprigual.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprmenorigual"

    public static class exprigual_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprigual"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:98:1: exprigual : exprdif ( '==' exprdif )* -> ^( AUX exprdif ( '==' exprdif )* ) ;
    public final FlowUmiCompilerParser.exprigual_return exprigual() throws RecognitionException {
        FlowUmiCompilerParser.exprigual_return retval = new FlowUmiCompilerParser.exprigual_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal64=null;
        FlowUmiCompilerParser.exprdif_return exprdif63 = null;

        FlowUmiCompilerParser.exprdif_return exprdif65 = null;


        CommonTree string_literal64_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_exprdif=new RewriteRuleSubtreeStream(adaptor,"rule exprdif");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:99:2: ( exprdif ( '==' exprdif )* -> ^( AUX exprdif ( '==' exprdif )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:99:4: exprdif ( '==' exprdif )*
            {
            pushFollow(FOLLOW_exprdif_in_exprigual457);
            exprdif63=exprdif();

            state._fsp--;

            stream_exprdif.add(exprdif63.getTree());
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:99:12: ( '==' exprdif )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==51) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:99:13: '==' exprdif
            	    {
            	    string_literal64=(Token)match(input,51,FOLLOW_51_in_exprigual460);  
            	    stream_51.add(string_literal64);

            	    pushFollow(FOLLOW_exprdif_in_exprigual462);
            	    exprdif65=exprdif();

            	    state._fsp--;

            	    stream_exprdif.add(exprdif65.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);



            // AST REWRITE
            // elements: 51, exprdif, exprdif
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 99:27: -> ^( AUX exprdif ( '==' exprdif )* )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:99:29: ^( AUX exprdif ( '==' exprdif )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AUX, "AUX"), root_1);

                adaptor.addChild(root_1, stream_exprdif.nextTree());
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:99:43: ( '==' exprdif )*
                while ( stream_51.hasNext()||stream_exprdif.hasNext() ) {
                    adaptor.addChild(root_1, stream_51.nextNode());
                    adaptor.addChild(root_1, stream_exprdif.nextTree());

                }
                stream_51.reset();
                stream_exprdif.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprigual"

    public static class exprdif_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprdif"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:101:1: exprdif : exprMult ( '!=' exprMult )* -> ^( AUX exprMult ( '!=' exprMult )* ) ;
    public final FlowUmiCompilerParser.exprdif_return exprdif() throws RecognitionException {
        FlowUmiCompilerParser.exprdif_return retval = new FlowUmiCompilerParser.exprdif_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal67=null;
        FlowUmiCompilerParser.exprMult_return exprMult66 = null;

        FlowUmiCompilerParser.exprMult_return exprMult68 = null;


        CommonTree string_literal67_tree=null;
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_exprMult=new RewriteRuleSubtreeStream(adaptor,"rule exprMult");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:101:9: ( exprMult ( '!=' exprMult )* -> ^( AUX exprMult ( '!=' exprMult )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:101:11: exprMult ( '!=' exprMult )*
            {
            pushFollow(FOLLOW_exprMult_in_exprdif486);
            exprMult66=exprMult();

            state._fsp--;

            stream_exprMult.add(exprMult66.getTree());
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:101:20: ( '!=' exprMult )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==52) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:101:21: '!=' exprMult
            	    {
            	    string_literal67=(Token)match(input,52,FOLLOW_52_in_exprdif489);  
            	    stream_52.add(string_literal67);

            	    pushFollow(FOLLOW_exprMult_in_exprdif491);
            	    exprMult68=exprMult();

            	    state._fsp--;

            	    stream_exprMult.add(exprMult68.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);



            // AST REWRITE
            // elements: 52, exprMult, exprMult
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 101:36: -> ^( AUX exprMult ( '!=' exprMult )* )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:101:38: ^( AUX exprMult ( '!=' exprMult )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AUX, "AUX"), root_1);

                adaptor.addChild(root_1, stream_exprMult.nextTree());
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:101:53: ( '!=' exprMult )*
                while ( stream_52.hasNext()||stream_exprMult.hasNext() ) {
                    adaptor.addChild(root_1, stream_52.nextNode());
                    adaptor.addChild(root_1, stream_exprMult.nextTree());

                }
                stream_52.reset();
                stream_exprMult.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprdif"

    public static class exprMult_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprMult"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:103:1: exprMult : exprdiv ( '*' exprdiv )* -> ^( AUX exprdiv ( '*' exprdiv )* ) ;
    public final FlowUmiCompilerParser.exprMult_return exprMult() throws RecognitionException {
        FlowUmiCompilerParser.exprMult_return retval = new FlowUmiCompilerParser.exprMult_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal70=null;
        FlowUmiCompilerParser.exprdiv_return exprdiv69 = null;

        FlowUmiCompilerParser.exprdiv_return exprdiv71 = null;


        CommonTree char_literal70_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_exprdiv=new RewriteRuleSubtreeStream(adaptor,"rule exprdiv");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:104:2: ( exprdiv ( '*' exprdiv )* -> ^( AUX exprdiv ( '*' exprdiv )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:104:5: exprdiv ( '*' exprdiv )*
            {
            pushFollow(FOLLOW_exprdiv_in_exprMult516);
            exprdiv69=exprdiv();

            state._fsp--;

            stream_exprdiv.add(exprdiv69.getTree());
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:104:13: ( '*' exprdiv )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==53) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:104:14: '*' exprdiv
            	    {
            	    char_literal70=(Token)match(input,53,FOLLOW_53_in_exprMult519);  
            	    stream_53.add(char_literal70);

            	    pushFollow(FOLLOW_exprdiv_in_exprMult521);
            	    exprdiv71=exprdiv();

            	    state._fsp--;

            	    stream_exprdiv.add(exprdiv71.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);



            // AST REWRITE
            // elements: exprdiv, 53, exprdiv
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 104:27: -> ^( AUX exprdiv ( '*' exprdiv )* )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:104:29: ^( AUX exprdiv ( '*' exprdiv )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AUX, "AUX"), root_1);

                adaptor.addChild(root_1, stream_exprdiv.nextTree());
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:104:43: ( '*' exprdiv )*
                while ( stream_53.hasNext()||stream_exprdiv.hasNext() ) {
                    adaptor.addChild(root_1, stream_53.nextNode());
                    adaptor.addChild(root_1, stream_exprdiv.nextTree());

                }
                stream_53.reset();
                stream_exprdiv.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprMult"

    public static class exprdiv_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprdiv"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:106:1: exprdiv : exprmod ( '/' exprmod )* -> ^( AUX exprmod ( '/' exprmod )* ) ;
    public final FlowUmiCompilerParser.exprdiv_return exprdiv() throws RecognitionException {
        FlowUmiCompilerParser.exprdiv_return retval = new FlowUmiCompilerParser.exprdiv_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal73=null;
        FlowUmiCompilerParser.exprmod_return exprmod72 = null;

        FlowUmiCompilerParser.exprmod_return exprmod74 = null;


        CommonTree char_literal73_tree=null;
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_exprmod=new RewriteRuleSubtreeStream(adaptor,"rule exprmod");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:106:9: ( exprmod ( '/' exprmod )* -> ^( AUX exprmod ( '/' exprmod )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:106:11: exprmod ( '/' exprmod )*
            {
            pushFollow(FOLLOW_exprmod_in_exprdiv545);
            exprmod72=exprmod();

            state._fsp--;

            stream_exprmod.add(exprmod72.getTree());
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:106:19: ( '/' exprmod )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==54) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:106:20: '/' exprmod
            	    {
            	    char_literal73=(Token)match(input,54,FOLLOW_54_in_exprdiv548);  
            	    stream_54.add(char_literal73);

            	    pushFollow(FOLLOW_exprmod_in_exprdiv550);
            	    exprmod74=exprmod();

            	    state._fsp--;

            	    stream_exprmod.add(exprmod74.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);



            // AST REWRITE
            // elements: exprmod, exprmod, 54
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 106:33: -> ^( AUX exprmod ( '/' exprmod )* )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:106:35: ^( AUX exprmod ( '/' exprmod )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AUX, "AUX"), root_1);

                adaptor.addChild(root_1, stream_exprmod.nextTree());
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:106:49: ( '/' exprmod )*
                while ( stream_exprmod.hasNext()||stream_54.hasNext() ) {
                    adaptor.addChild(root_1, stream_54.nextNode());
                    adaptor.addChild(root_1, stream_exprmod.nextTree());

                }
                stream_exprmod.reset();
                stream_54.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprdiv"

    public static class exprmod_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprmod"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:108:1: exprmod : exprSum ( MOD exprSum )* -> ^( AUX exprSum ( MOD exprSum )* ) ;
    public final FlowUmiCompilerParser.exprmod_return exprmod() throws RecognitionException {
        FlowUmiCompilerParser.exprmod_return retval = new FlowUmiCompilerParser.exprmod_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MOD76=null;
        FlowUmiCompilerParser.exprSum_return exprSum75 = null;

        FlowUmiCompilerParser.exprSum_return exprSum77 = null;


        CommonTree MOD76_tree=null;
        RewriteRuleTokenStream stream_MOD=new RewriteRuleTokenStream(adaptor,"token MOD");
        RewriteRuleSubtreeStream stream_exprSum=new RewriteRuleSubtreeStream(adaptor,"rule exprSum");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:108:9: ( exprSum ( MOD exprSum )* -> ^( AUX exprSum ( MOD exprSum )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:108:11: exprSum ( MOD exprSum )*
            {
            pushFollow(FOLLOW_exprSum_in_exprmod573);
            exprSum75=exprSum();

            state._fsp--;

            stream_exprSum.add(exprSum75.getTree());
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:108:19: ( MOD exprSum )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==MOD) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:108:20: MOD exprSum
            	    {
            	    MOD76=(Token)match(input,MOD,FOLLOW_MOD_in_exprmod576);  
            	    stream_MOD.add(MOD76);

            	    pushFollow(FOLLOW_exprSum_in_exprmod578);
            	    exprSum77=exprSum();

            	    state._fsp--;

            	    stream_exprSum.add(exprSum77.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);



            // AST REWRITE
            // elements: MOD, exprSum, exprSum
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 108:33: -> ^( AUX exprSum ( MOD exprSum )* )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:108:35: ^( AUX exprSum ( MOD exprSum )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AUX, "AUX"), root_1);

                adaptor.addChild(root_1, stream_exprSum.nextTree());
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:108:49: ( MOD exprSum )*
                while ( stream_MOD.hasNext()||stream_exprSum.hasNext() ) {
                    adaptor.addChild(root_1, stream_MOD.nextNode());
                    adaptor.addChild(root_1, stream_exprSum.nextTree());

                }
                stream_MOD.reset();
                stream_exprSum.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprmod"

    public static class exprSum_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprSum"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:110:1: exprSum : exprres ( '+' exprres )* -> ^( AUX exprres ( '+' exprres )* ) ;
    public final FlowUmiCompilerParser.exprSum_return exprSum() throws RecognitionException {
        FlowUmiCompilerParser.exprSum_return retval = new FlowUmiCompilerParser.exprSum_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal79=null;
        FlowUmiCompilerParser.exprres_return exprres78 = null;

        FlowUmiCompilerParser.exprres_return exprres80 = null;


        CommonTree char_literal79_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_exprres=new RewriteRuleSubtreeStream(adaptor,"rule exprres");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:111:2: ( exprres ( '+' exprres )* -> ^( AUX exprres ( '+' exprres )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:111:4: exprres ( '+' exprres )*
            {
            pushFollow(FOLLOW_exprres_in_exprSum603);
            exprres78=exprres();

            state._fsp--;

            stream_exprres.add(exprres78.getTree());
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:111:12: ( '+' exprres )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==55) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:111:13: '+' exprres
            	    {
            	    char_literal79=(Token)match(input,55,FOLLOW_55_in_exprSum606);  
            	    stream_55.add(char_literal79);

            	    pushFollow(FOLLOW_exprres_in_exprSum608);
            	    exprres80=exprres();

            	    state._fsp--;

            	    stream_exprres.add(exprres80.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);



            // AST REWRITE
            // elements: 55, exprres, exprres
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 111:26: -> ^( AUX exprres ( '+' exprres )* )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:111:28: ^( AUX exprres ( '+' exprres )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AUX, "AUX"), root_1);

                adaptor.addChild(root_1, stream_exprres.nextTree());
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:111:42: ( '+' exprres )*
                while ( stream_55.hasNext()||stream_exprres.hasNext() ) {
                    adaptor.addChild(root_1, stream_55.nextNode());
                    adaptor.addChild(root_1, stream_exprres.nextTree());

                }
                stream_55.reset();
                stream_exprres.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprSum"

    public static class exprres_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprres"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:113:1: exprres : negacion ( '-' negacion )* -> ^( AUX negacion ( '-' negacion )* ) ;
    public final FlowUmiCompilerParser.exprres_return exprres() throws RecognitionException {
        FlowUmiCompilerParser.exprres_return retval = new FlowUmiCompilerParser.exprres_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal82=null;
        FlowUmiCompilerParser.negacion_return negacion81 = null;

        FlowUmiCompilerParser.negacion_return negacion83 = null;


        CommonTree char_literal82_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleSubtreeStream stream_negacion=new RewriteRuleSubtreeStream(adaptor,"rule negacion");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:113:9: ( negacion ( '-' negacion )* -> ^( AUX negacion ( '-' negacion )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:113:11: negacion ( '-' negacion )*
            {
            pushFollow(FOLLOW_negacion_in_exprres632);
            negacion81=negacion();

            state._fsp--;

            stream_negacion.add(negacion81.getTree());
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:113:20: ( '-' negacion )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==56) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:113:21: '-' negacion
            	    {
            	    char_literal82=(Token)match(input,56,FOLLOW_56_in_exprres635);  
            	    stream_56.add(char_literal82);

            	    pushFollow(FOLLOW_negacion_in_exprres637);
            	    negacion83=negacion();

            	    state._fsp--;

            	    stream_negacion.add(negacion83.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);



            // AST REWRITE
            // elements: negacion, 56, negacion
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 113:35: -> ^( AUX negacion ( '-' negacion )* )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:113:37: ^( AUX negacion ( '-' negacion )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AUX, "AUX"), root_1);

                adaptor.addChild(root_1, stream_negacion.nextTree());
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:113:52: ( '-' negacion )*
                while ( stream_56.hasNext()||stream_negacion.hasNext() ) {
                    adaptor.addChild(root_1, stream_56.nextNode());
                    adaptor.addChild(root_1, stream_negacion.nextTree());

                }
                stream_56.reset();
                stream_negacion.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprres"

    public static class negacion_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negacion"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:115:1: negacion : ( atom | ( '.NO.' atom ) -> ^( '.NO.' atom ) );
    public final FlowUmiCompilerParser.negacion_return negacion() throws RecognitionException {
        FlowUmiCompilerParser.negacion_return retval = new FlowUmiCompilerParser.negacion_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal85=null;
        FlowUmiCompilerParser.atom_return atom84 = null;

        FlowUmiCompilerParser.atom_return atom86 = null;


        CommonTree string_literal85_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:115:9: ( atom | ( '.NO.' atom ) -> ^( '.NO.' atom ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=ID && LA20_0<=INT)||(LA20_0>=STRING && LA20_0<=CHAR)||LA20_0==58) ) {
                alt20=1;
            }
            else if ( (LA20_0==57) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:115:11: atom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_negacion659);
                    atom84=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom84.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:115:18: ( '.NO.' atom )
                    {
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:115:18: ( '.NO.' atom )
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:115:19: '.NO.' atom
                    {
                    string_literal85=(Token)match(input,57,FOLLOW_57_in_negacion664);  
                    stream_57.add(string_literal85);

                    pushFollow(FOLLOW_atom_in_negacion666);
                    atom86=atom();

                    state._fsp--;

                    stream_atom.add(atom86.getTree());

                    }



                    // AST REWRITE
                    // elements: atom, 57
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 115:31: -> ^( '.NO.' atom )
                    {
                        // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:115:33: ^( '.NO.' atom )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_57.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "negacion"

    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:117:1: atom : ( consVar -> ^( AUX consVar ) | llamado -> ^( AUX llamado ) | '(' expresion ')' -> ^( AUX '(' expresion ')' ) );
    public final FlowUmiCompilerParser.atom_return atom() throws RecognitionException {
        FlowUmiCompilerParser.atom_return retval = new FlowUmiCompilerParser.atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal89=null;
        Token char_literal91=null;
        FlowUmiCompilerParser.consVar_return consVar87 = null;

        FlowUmiCompilerParser.llamado_return llamado88 = null;

        FlowUmiCompilerParser.expresion_return expresion90 = null;


        CommonTree char_literal89_tree=null;
        CommonTree char_literal91_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleSubtreeStream stream_consVar=new RewriteRuleSubtreeStream(adaptor,"rule consVar");
        RewriteRuleSubtreeStream stream_expresion=new RewriteRuleSubtreeStream(adaptor,"rule expresion");
        RewriteRuleSubtreeStream stream_llamado=new RewriteRuleSubtreeStream(adaptor,"rule llamado");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:117:6: ( consVar -> ^( AUX consVar ) | llamado -> ^( AUX llamado ) | '(' expresion ')' -> ^( AUX '(' expresion ')' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==ID) ) {
                    alt21=2;
                }
                else if ( (LA21_1==FIN||LA21_1==INT||(LA21_1>=ASIGNACION && LA21_1<=MOD)||(LA21_1>=SI && LA21_1<=ESCRITURA)||LA21_1==BREAK||(LA21_1>=45 && LA21_1<=56)||LA21_1==59||LA21_1==61||LA21_1==63) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
                }
                break;
            case ID:
            case STRING:
            case FLOAT:
            case LOGICO:
            case CHAR:
                {
                alt21=1;
                }
                break;
            case 58:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:117:8: consVar
                    {
                    pushFollow(FOLLOW_consVar_in_atom681);
                    consVar87=consVar();

                    state._fsp--;

                    stream_consVar.add(consVar87.getTree());


                    // AST REWRITE
                    // elements: consVar
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 117:15: -> ^( AUX consVar )
                    {
                        // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:117:17: ^( AUX consVar )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AUX, "AUX"), root_1);

                        adaptor.addChild(root_1, stream_consVar.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:117:33: llamado
                    {
                    pushFollow(FOLLOW_llamado_in_atom690);
                    llamado88=llamado();

                    state._fsp--;

                    stream_llamado.add(llamado88.getTree());


                    // AST REWRITE
                    // elements: llamado
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 117:40: -> ^( AUX llamado )
                    {
                        // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:117:42: ^( AUX llamado )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AUX, "AUX"), root_1);

                        adaptor.addChild(root_1, stream_llamado.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:117:58: '(' expresion ')'
                    {
                    char_literal89=(Token)match(input,58,FOLLOW_58_in_atom699);  
                    stream_58.add(char_literal89);

                    pushFollow(FOLLOW_expresion_in_atom701);
                    expresion90=expresion();

                    state._fsp--;

                    stream_expresion.add(expresion90.getTree());
                    char_literal91=(Token)match(input,59,FOLLOW_59_in_atom703);  
                    stream_59.add(char_literal91);



                    // AST REWRITE
                    // elements: expresion, 59, 58
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 117:75: -> ^( AUX '(' expresion ')' )
                    {
                        // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:117:77: ^( AUX '(' expresion ')' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AUX, "AUX"), root_1);

                        adaptor.addChild(root_1, stream_58.nextNode());
                        adaptor.addChild(root_1, stream_expresion.nextTree());
                        adaptor.addChild(root_1, stream_59.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class constante_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constante"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:119:1: constante : ( INT -> INT | STRING -> STRING | FLOAT -> FLOAT | LOGICO -> LOGICO | CHAR -> CHAR );
    public final FlowUmiCompilerParser.constante_return constante() throws RecognitionException {
        FlowUmiCompilerParser.constante_return retval = new FlowUmiCompilerParser.constante_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INT92=null;
        Token STRING93=null;
        Token FLOAT94=null;
        Token LOGICO95=null;
        Token CHAR96=null;

        CommonTree INT92_tree=null;
        CommonTree STRING93_tree=null;
        CommonTree FLOAT94_tree=null;
        CommonTree LOGICO95_tree=null;
        CommonTree CHAR96_tree=null;
        RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_LOGICO=new RewriteRuleTokenStream(adaptor,"token LOGICO");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:120:2: ( INT -> INT | STRING -> STRING | FLOAT -> FLOAT | LOGICO -> LOGICO | CHAR -> CHAR )
            int alt22=5;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt22=1;
                }
                break;
            case STRING:
                {
                alt22=2;
                }
                break;
            case FLOAT:
                {
                alt22=3;
                }
                break;
            case LOGICO:
                {
                alt22=4;
                }
                break;
            case CHAR:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:120:4: INT
                    {
                    INT92=(Token)match(input,INT,FOLLOW_INT_in_constante720);  
                    stream_INT.add(INT92);



                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 120:7: -> INT
                    {
                        adaptor.addChild(root_0, stream_INT.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:120:13: STRING
                    {
                    STRING93=(Token)match(input,STRING,FOLLOW_STRING_in_constante724);  
                    stream_STRING.add(STRING93);



                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 120:19: -> STRING
                    {
                        adaptor.addChild(root_0, stream_STRING.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:120:28: FLOAT
                    {
                    FLOAT94=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constante728);  
                    stream_FLOAT.add(FLOAT94);



                    // AST REWRITE
                    // elements: FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 120:33: -> FLOAT
                    {
                        adaptor.addChild(root_0, stream_FLOAT.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:120:41: LOGICO
                    {
                    LOGICO95=(Token)match(input,LOGICO,FOLLOW_LOGICO_in_constante732);  
                    stream_LOGICO.add(LOGICO95);



                    // AST REWRITE
                    // elements: LOGICO
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 120:47: -> LOGICO
                    {
                        adaptor.addChild(root_0, stream_LOGICO.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:120:56: CHAR
                    {
                    CHAR96=(Token)match(input,CHAR,FOLLOW_CHAR_in_constante736);  
                    stream_CHAR.add(CHAR96);



                    // AST REWRITE
                    // elements: CHAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 120:60: -> CHAR
                    {
                        adaptor.addChild(root_0, stream_CHAR.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constante"

    public static class index_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "index"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:122:1: index : ( INT -> INT | variable );
    public final FlowUmiCompilerParser.index_return index() throws RecognitionException {
        FlowUmiCompilerParser.index_return retval = new FlowUmiCompilerParser.index_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INT97=null;
        FlowUmiCompilerParser.variable_return variable98 = null;


        CommonTree INT97_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:122:7: ( INT -> INT | variable )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==INT) ) {
                alt23=1;
            }
            else if ( (LA23_0==ID) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:122:9: INT
                    {
                    INT97=(Token)match(input,INT,FOLLOW_INT_in_index746);  
                    stream_INT.add(INT97);



                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 122:12: -> INT
                    {
                        adaptor.addChild(root_0, stream_INT.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:122:20: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_index752);
                    variable98=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable98.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "index"

    public static class llamado_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "llamado"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:124:1: llamado : INT ID '(' ( parametros )* ')' -> ^( AUX INT ID '(' parametros ')' ) ;
    public final FlowUmiCompilerParser.llamado_return llamado() throws RecognitionException {
        FlowUmiCompilerParser.llamado_return retval = new FlowUmiCompilerParser.llamado_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INT99=null;
        Token ID100=null;
        Token char_literal101=null;
        Token char_literal103=null;
        FlowUmiCompilerParser.parametros_return parametros102 = null;


        CommonTree INT99_tree=null;
        CommonTree ID100_tree=null;
        CommonTree char_literal101_tree=null;
        CommonTree char_literal103_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_parametros=new RewriteRuleSubtreeStream(adaptor,"rule parametros");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:124:9: ( INT ID '(' ( parametros )* ')' -> ^( AUX INT ID '(' parametros ')' ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:124:11: INT ID '(' ( parametros )* ')'
            {
            INT99=(Token)match(input,INT,FOLLOW_INT_in_llamado760);  
            stream_INT.add(INT99);

            ID100=(Token)match(input,ID,FOLLOW_ID_in_llamado762);  
            stream_ID.add(ID100);

            char_literal101=(Token)match(input,58,FOLLOW_58_in_llamado765);  
            stream_58.add(char_literal101);

            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:124:22: ( parametros )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=ID && LA24_0<=INT)||(LA24_0>=STRING && LA24_0<=CHAR)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:124:22: parametros
            	    {
            	    pushFollow(FOLLOW_parametros_in_llamado766);
            	    parametros102=parametros();

            	    state._fsp--;

            	    stream_parametros.add(parametros102.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            char_literal103=(Token)match(input,59,FOLLOW_59_in_llamado768);  
            stream_59.add(char_literal103);



            // AST REWRITE
            // elements: parametros, INT, 59, ID, 58
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 124:36: -> ^( AUX INT ID '(' parametros ')' )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:124:38: ^( AUX INT ID '(' parametros ')' )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AUX, "AUX"), root_1);

                adaptor.addChild(root_1, stream_INT.nextNode());
                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_58.nextNode());
                adaptor.addChild(root_1, stream_parametros.nextTree());
                adaptor.addChild(root_1, stream_59.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "llamado"

    public static class parametros_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parametros"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:126:1: parametros : ( consVar ) ( ',' ( consVar ) )* -> ^( AUX ( consVar )+ ) ;
    public final FlowUmiCompilerParser.parametros_return parametros() throws RecognitionException {
        FlowUmiCompilerParser.parametros_return retval = new FlowUmiCompilerParser.parametros_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal105=null;
        FlowUmiCompilerParser.consVar_return consVar104 = null;

        FlowUmiCompilerParser.consVar_return consVar106 = null;


        CommonTree char_literal105_tree=null;
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_consVar=new RewriteRuleSubtreeStream(adaptor,"rule consVar");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:127:2: ( ( consVar ) ( ',' ( consVar ) )* -> ^( AUX ( consVar )+ ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:127:4: ( consVar ) ( ',' ( consVar ) )*
            {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:127:4: ( consVar )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:127:5: consVar
            {
            pushFollow(FOLLOW_consVar_in_parametros790);
            consVar104=consVar();

            state._fsp--;

            stream_consVar.add(consVar104.getTree());

            }

            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:127:14: ( ',' ( consVar ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==60) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:127:15: ',' ( consVar )
            	    {
            	    char_literal105=(Token)match(input,60,FOLLOW_60_in_parametros794);  
            	    stream_60.add(char_literal105);

            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:127:19: ( consVar )
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:127:20: consVar
            	    {
            	    pushFollow(FOLLOW_consVar_in_parametros797);
            	    consVar106=consVar();

            	    state._fsp--;

            	    stream_consVar.add(consVar106.getTree());

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);



            // AST REWRITE
            // elements: consVar
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 127:30: -> ^( AUX ( consVar )+ )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:127:32: ^( AUX ( consVar )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AUX, "AUX"), root_1);

                if ( !(stream_consVar.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_consVar.hasNext() ) {
                    adaptor.addChild(root_1, stream_consVar.nextTree());

                }
                stream_consVar.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parametros"

    public static class consVar_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "consVar"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:129:1: consVar : ( constante | variable );
    public final FlowUmiCompilerParser.consVar_return consVar() throws RecognitionException {
        FlowUmiCompilerParser.consVar_return retval = new FlowUmiCompilerParser.consVar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        FlowUmiCompilerParser.constante_return constante107 = null;

        FlowUmiCompilerParser.variable_return variable108 = null;



        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:129:9: ( constante | variable )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==INT||(LA26_0>=STRING && LA26_0<=CHAR)) ) {
                alt26=1;
            }
            else if ( (LA26_0==ID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:129:11: constante
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_constante_in_consVar817);
                    constante107=constante();

                    state._fsp--;

                    adaptor.addChild(root_0, constante107.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:129:21: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_consVar819);
                    variable108=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable108.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "consVar"

    public static class variable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:131:1: variable : ( ID -> ID | ID '[' index ( ',' index )? ']' -> ^( AUX ID index ( ',' index )? ) );
    public final FlowUmiCompilerParser.variable_return variable() throws RecognitionException {
        FlowUmiCompilerParser.variable_return retval = new FlowUmiCompilerParser.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID109=null;
        Token ID110=null;
        Token char_literal111=null;
        Token char_literal113=null;
        Token char_literal115=null;
        FlowUmiCompilerParser.index_return index112 = null;

        FlowUmiCompilerParser.index_return index114 = null;


        CommonTree ID109_tree=null;
        CommonTree ID110_tree=null;
        CommonTree char_literal111_tree=null;
        CommonTree char_literal113_tree=null;
        CommonTree char_literal115_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_index=new RewriteRuleSubtreeStream(adaptor,"rule index");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:131:9: ( ID -> ID | ID '[' index ( ',' index )? ']' -> ^( AUX ID index ( ',' index )? ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==43) ) {
                    alt28=2;
                }
                else if ( (LA28_1==FIN||(LA28_1>=ID && LA28_1<=INT)||(LA28_1>=ASIGNACION && LA28_1<=ESCRITURA)||LA28_1==BREAK||LA28_1==42||(LA28_1>=44 && LA28_1<=56)||(LA28_1>=59 && LA28_1<=61)||LA28_1==63) ) {
                    alt28=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:131:11: ID
                    {
                    ID109=(Token)match(input,ID,FOLLOW_ID_in_variable826);  
                    stream_ID.add(ID109);



                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 131:13: -> ID
                    {
                        adaptor.addChild(root_0, stream_ID.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:131:18: ID '[' index ( ',' index )? ']'
                    {
                    ID110=(Token)match(input,ID,FOLLOW_ID_in_variable830);  
                    stream_ID.add(ID110);

                    char_literal111=(Token)match(input,43,FOLLOW_43_in_variable831);  
                    stream_43.add(char_literal111);

                    pushFollow(FOLLOW_index_in_variable832);
                    index112=index();

                    state._fsp--;

                    stream_index.add(index112.getTree());
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:131:29: ( ',' index )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==60) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:131:30: ',' index
                            {
                            char_literal113=(Token)match(input,60,FOLLOW_60_in_variable835);  
                            stream_60.add(char_literal113);

                            pushFollow(FOLLOW_index_in_variable837);
                            index114=index();

                            state._fsp--;

                            stream_index.add(index114.getTree());

                            }
                            break;

                    }

                    char_literal115=(Token)match(input,44,FOLLOW_44_in_variable840);  
                    stream_44.add(char_literal115);



                    // AST REWRITE
                    // elements: index, ID, index, 60
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 131:44: -> ^( AUX ID index ( ',' index )? )
                    {
                        // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:131:46: ^( AUX ID index ( ',' index )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AUX, "AUX"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_index.nextTree());
                        // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:131:61: ( ',' index )?
                        if ( stream_index.hasNext()||stream_60.hasNext() ) {
                            adaptor.addChild(root_1, stream_60.nextNode());
                            adaptor.addChild(root_1, stream_index.nextTree());

                        }
                        stream_index.reset();
                        stream_60.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    public static class si_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "si"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:133:1: si : SI INT '(' expresion '):' ( sentencias )* ( sino )? FIN_SI -> ^( SI INT expresion ( sentencias )* ( sino )? ) ;
    public final FlowUmiCompilerParser.si_return si() throws RecognitionException {
        FlowUmiCompilerParser.si_return retval = new FlowUmiCompilerParser.si_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SI116=null;
        Token INT117=null;
        Token char_literal118=null;
        Token string_literal120=null;
        Token FIN_SI123=null;
        FlowUmiCompilerParser.expresion_return expresion119 = null;

        FlowUmiCompilerParser.sentencias_return sentencias121 = null;

        FlowUmiCompilerParser.sino_return sino122 = null;


        CommonTree SI116_tree=null;
        CommonTree INT117_tree=null;
        CommonTree char_literal118_tree=null;
        CommonTree string_literal120_tree=null;
        CommonTree FIN_SI123_tree=null;
        RewriteRuleTokenStream stream_FIN_SI=new RewriteRuleTokenStream(adaptor,"token FIN_SI");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_SI=new RewriteRuleTokenStream(adaptor,"token SI");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_sentencias=new RewriteRuleSubtreeStream(adaptor,"rule sentencias");
        RewriteRuleSubtreeStream stream_expresion=new RewriteRuleSubtreeStream(adaptor,"rule expresion");
        RewriteRuleSubtreeStream stream_sino=new RewriteRuleSubtreeStream(adaptor,"rule sino");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:133:4: ( SI INT '(' expresion '):' ( sentencias )* ( sino )? FIN_SI -> ^( SI INT expresion ( sentencias )* ( sino )? ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:133:6: SI INT '(' expresion '):' ( sentencias )* ( sino )? FIN_SI
            {
            SI116=(Token)match(input,SI,FOLLOW_SI_in_si864);  
            stream_SI.add(SI116);

            INT117=(Token)match(input,INT,FOLLOW_INT_in_si866);  
            stream_INT.add(INT117);

            char_literal118=(Token)match(input,58,FOLLOW_58_in_si868);  
            stream_58.add(char_literal118);

            pushFollow(FOLLOW_expresion_in_si870);
            expresion119=expresion();

            state._fsp--;

            stream_expresion.add(expresion119.getTree());
            string_literal120=(Token)match(input,61,FOLLOW_61_in_si872);  
            stream_61.add(string_literal120);

            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:133:32: ( sentencias )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==INT||LA29_0==ASIGNACION||LA29_0==SI||LA29_0==MIENTRAS||LA29_0==PARA||(LA29_0>=LECTURA && LA29_0<=ESCRITURA)||LA29_0==BREAK) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:133:32: sentencias
            	    {
            	    pushFollow(FOLLOW_sentencias_in_si874);
            	    sentencias121=sentencias();

            	    state._fsp--;

            	    stream_sentencias.add(sentencias121.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:133:44: ( sino )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==SINO) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:133:44: sino
                    {
                    pushFollow(FOLLOW_sino_in_si877);
                    sino122=sino();

                    state._fsp--;

                    stream_sino.add(sino122.getTree());

                    }
                    break;

            }

            FIN_SI123=(Token)match(input,FIN_SI,FOLLOW_FIN_SI_in_si880);  
            stream_FIN_SI.add(FIN_SI123);



            // AST REWRITE
            // elements: INT, SI, sino, expresion, sentencias
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 133:57: -> ^( SI INT expresion ( sentencias )* ( sino )? )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:133:59: ^( SI INT expresion ( sentencias )* ( sino )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_SI.nextNode(), root_1);

                adaptor.addChild(root_1, stream_INT.nextNode());
                adaptor.addChild(root_1, stream_expresion.nextTree());
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:133:78: ( sentencias )*
                while ( stream_sentencias.hasNext() ) {
                    adaptor.addChild(root_1, stream_sentencias.nextTree());

                }
                stream_sentencias.reset();
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:133:90: ( sino )?
                if ( stream_sino.hasNext() ) {
                    adaptor.addChild(root_1, stream_sino.nextTree());

                }
                stream_sino.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "si"

    public static class sino_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sino"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:135:1: sino : SINO INT ':' ( sentencias )* -> ^( SINO ( sentencias )* ) ;
    public final FlowUmiCompilerParser.sino_return sino() throws RecognitionException {
        FlowUmiCompilerParser.sino_return retval = new FlowUmiCompilerParser.sino_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SINO124=null;
        Token INT125=null;
        Token char_literal126=null;
        FlowUmiCompilerParser.sentencias_return sentencias127 = null;


        CommonTree SINO124_tree=null;
        CommonTree INT125_tree=null;
        CommonTree char_literal126_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_SINO=new RewriteRuleTokenStream(adaptor,"token SINO");
        RewriteRuleSubtreeStream stream_sentencias=new RewriteRuleSubtreeStream(adaptor,"rule sentencias");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:135:7: ( SINO INT ':' ( sentencias )* -> ^( SINO ( sentencias )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:135:9: SINO INT ':' ( sentencias )*
            {
            SINO124=(Token)match(input,SINO,FOLLOW_SINO_in_sino904);  
            stream_SINO.add(SINO124);

            INT125=(Token)match(input,INT,FOLLOW_INT_in_sino906);  
            stream_INT.add(INT125);

            char_literal126=(Token)match(input,62,FOLLOW_62_in_sino908);  
            stream_62.add(char_literal126);

            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:135:22: ( sentencias )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==INT||LA31_0==ASIGNACION||LA31_0==SI||LA31_0==MIENTRAS||LA31_0==PARA||(LA31_0>=LECTURA && LA31_0<=ESCRITURA)||LA31_0==BREAK) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:135:22: sentencias
            	    {
            	    pushFollow(FOLLOW_sentencias_in_sino910);
            	    sentencias127=sentencias();

            	    state._fsp--;

            	    stream_sentencias.add(sentencias127.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);



            // AST REWRITE
            // elements: SINO, sentencias
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 135:33: -> ^( SINO ( sentencias )* )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:135:35: ^( SINO ( sentencias )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_SINO.nextNode(), root_1);

                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:135:42: ( sentencias )*
                while ( stream_sentencias.hasNext() ) {
                    adaptor.addChild(root_1, stream_sentencias.nextTree());

                }
                stream_sentencias.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sino"

    public static class mientras_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mientras"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:137:1: mientras : MIENTRAS INT '(' expresion '):' ( sentencias )* FIN_MIENTRAS -> ^( MIENTRAS INT expresion ( sentencias )* ) ;
    public final FlowUmiCompilerParser.mientras_return mientras() throws RecognitionException {
        FlowUmiCompilerParser.mientras_return retval = new FlowUmiCompilerParser.mientras_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MIENTRAS128=null;
        Token INT129=null;
        Token char_literal130=null;
        Token string_literal132=null;
        Token FIN_MIENTRAS134=null;
        FlowUmiCompilerParser.expresion_return expresion131 = null;

        FlowUmiCompilerParser.sentencias_return sentencias133 = null;


        CommonTree MIENTRAS128_tree=null;
        CommonTree INT129_tree=null;
        CommonTree char_literal130_tree=null;
        CommonTree string_literal132_tree=null;
        CommonTree FIN_MIENTRAS134_tree=null;
        RewriteRuleTokenStream stream_FIN_MIENTRAS=new RewriteRuleTokenStream(adaptor,"token FIN_MIENTRAS");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_MIENTRAS=new RewriteRuleTokenStream(adaptor,"token MIENTRAS");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_sentencias=new RewriteRuleSubtreeStream(adaptor,"rule sentencias");
        RewriteRuleSubtreeStream stream_expresion=new RewriteRuleSubtreeStream(adaptor,"rule expresion");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:137:9: ( MIENTRAS INT '(' expresion '):' ( sentencias )* FIN_MIENTRAS -> ^( MIENTRAS INT expresion ( sentencias )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:137:11: MIENTRAS INT '(' expresion '):' ( sentencias )* FIN_MIENTRAS
            {
            MIENTRAS128=(Token)match(input,MIENTRAS,FOLLOW_MIENTRAS_in_mientras925);  
            stream_MIENTRAS.add(MIENTRAS128);

            INT129=(Token)match(input,INT,FOLLOW_INT_in_mientras927);  
            stream_INT.add(INT129);

            char_literal130=(Token)match(input,58,FOLLOW_58_in_mientras929);  
            stream_58.add(char_literal130);

            pushFollow(FOLLOW_expresion_in_mientras931);
            expresion131=expresion();

            state._fsp--;

            stream_expresion.add(expresion131.getTree());
            string_literal132=(Token)match(input,61,FOLLOW_61_in_mientras933);  
            stream_61.add(string_literal132);

            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:137:43: ( sentencias )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==INT||LA32_0==ASIGNACION||LA32_0==SI||LA32_0==MIENTRAS||LA32_0==PARA||(LA32_0>=LECTURA && LA32_0<=ESCRITURA)||LA32_0==BREAK) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:137:43: sentencias
            	    {
            	    pushFollow(FOLLOW_sentencias_in_mientras935);
            	    sentencias133=sentencias();

            	    state._fsp--;

            	    stream_sentencias.add(sentencias133.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            FIN_MIENTRAS134=(Token)match(input,FIN_MIENTRAS,FOLLOW_FIN_MIENTRAS_in_mientras938);  
            stream_FIN_MIENTRAS.add(FIN_MIENTRAS134);



            // AST REWRITE
            // elements: expresion, MIENTRAS, INT, sentencias
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 137:68: -> ^( MIENTRAS INT expresion ( sentencias )* )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:137:70: ^( MIENTRAS INT expresion ( sentencias )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_MIENTRAS.nextNode(), root_1);

                adaptor.addChild(root_1, stream_INT.nextNode());
                adaptor.addChild(root_1, stream_expresion.nextTree());
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:137:95: ( sentencias )*
                while ( stream_sentencias.hasNext() ) {
                    adaptor.addChild(root_1, stream_sentencias.nextTree());

                }
                stream_sentencias.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mientras"

    public static class para_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "para"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:139:1: para : PARA INT '(' exprPara '):' ( sentencias )* FIN_PARA -> ^( PARA INT exprPara ( sentencias )* ) ;
    public final FlowUmiCompilerParser.para_return para() throws RecognitionException {
        FlowUmiCompilerParser.para_return retval = new FlowUmiCompilerParser.para_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PARA135=null;
        Token INT136=null;
        Token char_literal137=null;
        Token string_literal139=null;
        Token FIN_PARA141=null;
        FlowUmiCompilerParser.exprPara_return exprPara138 = null;

        FlowUmiCompilerParser.sentencias_return sentencias140 = null;


        CommonTree PARA135_tree=null;
        CommonTree INT136_tree=null;
        CommonTree char_literal137_tree=null;
        CommonTree string_literal139_tree=null;
        CommonTree FIN_PARA141_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_FIN_PARA=new RewriteRuleTokenStream(adaptor,"token FIN_PARA");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_PARA=new RewriteRuleTokenStream(adaptor,"token PARA");
        RewriteRuleSubtreeStream stream_sentencias=new RewriteRuleSubtreeStream(adaptor,"rule sentencias");
        RewriteRuleSubtreeStream stream_exprPara=new RewriteRuleSubtreeStream(adaptor,"rule exprPara");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:139:6: ( PARA INT '(' exprPara '):' ( sentencias )* FIN_PARA -> ^( PARA INT exprPara ( sentencias )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:139:8: PARA INT '(' exprPara '):' ( sentencias )* FIN_PARA
            {
            PARA135=(Token)match(input,PARA,FOLLOW_PARA_in_para958);  
            stream_PARA.add(PARA135);

            INT136=(Token)match(input,INT,FOLLOW_INT_in_para960);  
            stream_INT.add(INT136);

            char_literal137=(Token)match(input,58,FOLLOW_58_in_para962);  
            stream_58.add(char_literal137);

            pushFollow(FOLLOW_exprPara_in_para964);
            exprPara138=exprPara();

            state._fsp--;

            stream_exprPara.add(exprPara138.getTree());
            string_literal139=(Token)match(input,61,FOLLOW_61_in_para966);  
            stream_61.add(string_literal139);

            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:139:35: ( sentencias )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==INT||LA33_0==ASIGNACION||LA33_0==SI||LA33_0==MIENTRAS||LA33_0==PARA||(LA33_0>=LECTURA && LA33_0<=ESCRITURA)||LA33_0==BREAK) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:139:35: sentencias
            	    {
            	    pushFollow(FOLLOW_sentencias_in_para968);
            	    sentencias140=sentencias();

            	    state._fsp--;

            	    stream_sentencias.add(sentencias140.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            FIN_PARA141=(Token)match(input,FIN_PARA,FOLLOW_FIN_PARA_in_para971);  
            stream_FIN_PARA.add(FIN_PARA141);



            // AST REWRITE
            // elements: exprPara, sentencias, PARA, INT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 139:56: -> ^( PARA INT exprPara ( sentencias )* )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:139:58: ^( PARA INT exprPara ( sentencias )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_PARA.nextNode(), root_1);

                adaptor.addChild(root_1, stream_INT.nextNode());
                adaptor.addChild(root_1, stream_exprPara.nextTree());
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:139:78: ( sentencias )*
                while ( stream_sentencias.hasNext() ) {
                    adaptor.addChild(root_1, stream_sentencias.nextTree());

                }
                stream_sentencias.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "para"

    public static class exprPara_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprPara"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:141:1: exprPara : variable '=' expresion ';' expresion ';' variable '=' expresion -> ^( AUX variable expresion expresion variable expresion ) ;
    public final FlowUmiCompilerParser.exprPara_return exprPara() throws RecognitionException {
        FlowUmiCompilerParser.exprPara_return retval = new FlowUmiCompilerParser.exprPara_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal143=null;
        Token char_literal145=null;
        Token char_literal147=null;
        Token char_literal149=null;
        FlowUmiCompilerParser.variable_return variable142 = null;

        FlowUmiCompilerParser.expresion_return expresion144 = null;

        FlowUmiCompilerParser.expresion_return expresion146 = null;

        FlowUmiCompilerParser.variable_return variable148 = null;

        FlowUmiCompilerParser.expresion_return expresion150 = null;


        CommonTree char_literal143_tree=null;
        CommonTree char_literal145_tree=null;
        CommonTree char_literal147_tree=null;
        CommonTree char_literal149_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_expresion=new RewriteRuleSubtreeStream(adaptor,"rule expresion");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:141:9: ( variable '=' expresion ';' expresion ';' variable '=' expresion -> ^( AUX variable expresion expresion variable expresion ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:141:11: variable '=' expresion ';' expresion ';' variable '=' expresion
            {
            pushFollow(FOLLOW_variable_in_exprPara990);
            variable142=variable();

            state._fsp--;

            stream_variable.add(variable142.getTree());
            char_literal143=(Token)match(input,42,FOLLOW_42_in_exprPara992);  
            stream_42.add(char_literal143);

            pushFollow(FOLLOW_expresion_in_exprPara994);
            expresion144=expresion();

            state._fsp--;

            stream_expresion.add(expresion144.getTree());
            char_literal145=(Token)match(input,63,FOLLOW_63_in_exprPara996);  
            stream_63.add(char_literal145);

            pushFollow(FOLLOW_expresion_in_exprPara998);
            expresion146=expresion();

            state._fsp--;

            stream_expresion.add(expresion146.getTree());
            char_literal147=(Token)match(input,63,FOLLOW_63_in_exprPara1000);  
            stream_63.add(char_literal147);

            pushFollow(FOLLOW_variable_in_exprPara1002);
            variable148=variable();

            state._fsp--;

            stream_variable.add(variable148.getTree());
            char_literal149=(Token)match(input,42,FOLLOW_42_in_exprPara1004);  
            stream_42.add(char_literal149);

            pushFollow(FOLLOW_expresion_in_exprPara1006);
            expresion150=expresion();

            state._fsp--;

            stream_expresion.add(expresion150.getTree());


            // AST REWRITE
            // elements: expresion, variable, variable, expresion, expresion
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 141:75: -> ^( AUX variable expresion expresion variable expresion )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:141:77: ^( AUX variable expresion expresion variable expresion )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AUX, "AUX"), root_1);

                adaptor.addChild(root_1, stream_variable.nextTree());
                adaptor.addChild(root_1, stream_expresion.nextTree());
                adaptor.addChild(root_1, stream_expresion.nextTree());
                adaptor.addChild(root_1, stream_variable.nextTree());
                adaptor.addChild(root_1, stream_expresion.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprPara"

    public static class lectura_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lectura"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:143:1: lectura : LECTURA INT '(' variable ')' -> ^( LECTURA INT variable ) ;
    public final FlowUmiCompilerParser.lectura_return lectura() throws RecognitionException {
        FlowUmiCompilerParser.lectura_return retval = new FlowUmiCompilerParser.lectura_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LECTURA151=null;
        Token INT152=null;
        Token char_literal153=null;
        Token char_literal155=null;
        FlowUmiCompilerParser.variable_return variable154 = null;


        CommonTree LECTURA151_tree=null;
        CommonTree INT152_tree=null;
        CommonTree char_literal153_tree=null;
        CommonTree char_literal155_tree=null;
        RewriteRuleTokenStream stream_LECTURA=new RewriteRuleTokenStream(adaptor,"token LECTURA");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:143:9: ( LECTURA INT '(' variable ')' -> ^( LECTURA INT variable ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:143:11: LECTURA INT '(' variable ')'
            {
            LECTURA151=(Token)match(input,LECTURA,FOLLOW_LECTURA_in_lectura1029);  
            stream_LECTURA.add(LECTURA151);

            INT152=(Token)match(input,INT,FOLLOW_INT_in_lectura1031);  
            stream_INT.add(INT152);

            char_literal153=(Token)match(input,58,FOLLOW_58_in_lectura1033);  
            stream_58.add(char_literal153);

            pushFollow(FOLLOW_variable_in_lectura1034);
            variable154=variable();

            state._fsp--;

            stream_variable.add(variable154.getTree());
            char_literal155=(Token)match(input,59,FOLLOW_59_in_lectura1035);  
            stream_59.add(char_literal155);



            // AST REWRITE
            // elements: INT, variable, LECTURA
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 143:37: -> ^( LECTURA INT variable )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:143:39: ^( LECTURA INT variable )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_LECTURA.nextNode(), root_1);

                adaptor.addChild(root_1, stream_INT.nextNode());
                adaptor.addChild(root_1, stream_variable.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lectura"

    public static class escritura_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "escritura"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:145:1: escritura : ESCRITURA INT '(' expresion ')' -> ^( ESCRITURA INT expresion ) ;
    public final FlowUmiCompilerParser.escritura_return escritura() throws RecognitionException {
        FlowUmiCompilerParser.escritura_return retval = new FlowUmiCompilerParser.escritura_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ESCRITURA156=null;
        Token INT157=null;
        Token char_literal158=null;
        Token char_literal160=null;
        FlowUmiCompilerParser.expresion_return expresion159 = null;


        CommonTree ESCRITURA156_tree=null;
        CommonTree INT157_tree=null;
        CommonTree char_literal158_tree=null;
        CommonTree char_literal160_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_ESCRITURA=new RewriteRuleTokenStream(adaptor,"token ESCRITURA");
        RewriteRuleSubtreeStream stream_expresion=new RewriteRuleSubtreeStream(adaptor,"rule expresion");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:146:2: ( ESCRITURA INT '(' expresion ')' -> ^( ESCRITURA INT expresion ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:146:4: ESCRITURA INT '(' expresion ')'
            {
            ESCRITURA156=(Token)match(input,ESCRITURA,FOLLOW_ESCRITURA_in_escritura1052);  
            stream_ESCRITURA.add(ESCRITURA156);

            INT157=(Token)match(input,INT,FOLLOW_INT_in_escritura1054);  
            stream_INT.add(INT157);

            char_literal158=(Token)match(input,58,FOLLOW_58_in_escritura1056);  
            stream_58.add(char_literal158);

            pushFollow(FOLLOW_expresion_in_escritura1057);
            expresion159=expresion();

            state._fsp--;

            stream_expresion.add(expresion159.getTree());
            char_literal160=(Token)match(input,59,FOLLOW_59_in_escritura1058);  
            stream_59.add(char_literal160);



            // AST REWRITE
            // elements: expresion, INT, ESCRITURA
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 146:33: -> ^( ESCRITURA INT expresion )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:146:35: ^( ESCRITURA INT expresion )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ESCRITURA.nextNode(), root_1);

                adaptor.addChild(root_1, stream_INT.nextNode());
                adaptor.addChild(root_1, stream_expresion.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "escritura"

    public static class funcion_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcion"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:148:1: funcion : FUNCION tipo_dato ID '(' ( parametrosDec )* ')' principal -> ^( FUNCION ID tipo_dato ( parametrosDec )* principal ) ;
    public final FlowUmiCompilerParser.funcion_return funcion() throws RecognitionException {
        FlowUmiCompilerParser.funcion_return retval = new FlowUmiCompilerParser.funcion_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FUNCION161=null;
        Token ID163=null;
        Token char_literal164=null;
        Token char_literal166=null;
        FlowUmiCompilerParser.tipo_dato_return tipo_dato162 = null;

        FlowUmiCompilerParser.parametrosDec_return parametrosDec165 = null;

        FlowUmiCompilerParser.principal_return principal167 = null;


        CommonTree FUNCION161_tree=null;
        CommonTree ID163_tree=null;
        CommonTree char_literal164_tree=null;
        CommonTree char_literal166_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_FUNCION=new RewriteRuleTokenStream(adaptor,"token FUNCION");
        RewriteRuleSubtreeStream stream_principal=new RewriteRuleSubtreeStream(adaptor,"rule principal");
        RewriteRuleSubtreeStream stream_tipo_dato=new RewriteRuleSubtreeStream(adaptor,"rule tipo_dato");
        RewriteRuleSubtreeStream stream_parametrosDec=new RewriteRuleSubtreeStream(adaptor,"rule parametrosDec");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:148:9: ( FUNCION tipo_dato ID '(' ( parametrosDec )* ')' principal -> ^( FUNCION ID tipo_dato ( parametrosDec )* principal ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:148:11: FUNCION tipo_dato ID '(' ( parametrosDec )* ')' principal
            {
            FUNCION161=(Token)match(input,FUNCION,FOLLOW_FUNCION_in_funcion1074);  
            stream_FUNCION.add(FUNCION161);

            pushFollow(FOLLOW_tipo_dato_in_funcion1076);
            tipo_dato162=tipo_dato();

            state._fsp--;

            stream_tipo_dato.add(tipo_dato162.getTree());
            ID163=(Token)match(input,ID,FOLLOW_ID_in_funcion1078);  
            stream_ID.add(ID163);

            char_literal164=(Token)match(input,58,FOLLOW_58_in_funcion1081);  
            stream_58.add(char_literal164);

            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:148:37: ( parametrosDec )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=ENTERO && LA34_0<=NINGUNO)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:148:37: parametrosDec
            	    {
            	    pushFollow(FOLLOW_parametrosDec_in_funcion1083);
            	    parametrosDec165=parametrosDec();

            	    state._fsp--;

            	    stream_parametrosDec.add(parametrosDec165.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            char_literal166=(Token)match(input,59,FOLLOW_59_in_funcion1086);  
            stream_59.add(char_literal166);

            pushFollow(FOLLOW_principal_in_funcion1088);
            principal167=principal();

            state._fsp--;

            stream_principal.add(principal167.getTree());


            // AST REWRITE
            // elements: principal, FUNCION, ID, tipo_dato, parametrosDec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 148:65: -> ^( FUNCION ID tipo_dato ( parametrosDec )* principal )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:148:67: ^( FUNCION ID tipo_dato ( parametrosDec )* principal )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_FUNCION.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_tipo_dato.nextTree());
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:148:90: ( parametrosDec )*
                while ( stream_parametrosDec.hasNext() ) {
                    adaptor.addChild(root_1, stream_parametrosDec.nextTree());

                }
                stream_parametrosDec.reset();
                adaptor.addChild(root_1, stream_principal.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "funcion"

    public static class parametrosDec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parametrosDec"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:150:1: parametrosDec : ( tipo_dato ID -> ^( AUX tipo_dato ID ) | tipo_dato ID '[' ']' -> ^( AUX tipo_dato ID '[' ']' ) | tipo_dato ID '[' ']' '[' ']' -> ^( AUX tipo_dato ID '[' ']' '[' ']' ) );
    public final FlowUmiCompilerParser.parametrosDec_return parametrosDec() throws RecognitionException {
        FlowUmiCompilerParser.parametrosDec_return retval = new FlowUmiCompilerParser.parametrosDec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID169=null;
        Token ID171=null;
        Token char_literal172=null;
        Token char_literal173=null;
        Token ID175=null;
        Token char_literal176=null;
        Token char_literal177=null;
        Token char_literal178=null;
        Token char_literal179=null;
        FlowUmiCompilerParser.tipo_dato_return tipo_dato168 = null;

        FlowUmiCompilerParser.tipo_dato_return tipo_dato170 = null;

        FlowUmiCompilerParser.tipo_dato_return tipo_dato174 = null;


        CommonTree ID169_tree=null;
        CommonTree ID171_tree=null;
        CommonTree char_literal172_tree=null;
        CommonTree char_literal173_tree=null;
        CommonTree ID175_tree=null;
        CommonTree char_literal176_tree=null;
        CommonTree char_literal177_tree=null;
        CommonTree char_literal178_tree=null;
        CommonTree char_literal179_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_tipo_dato=new RewriteRuleSubtreeStream(adaptor,"rule tipo_dato");
        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:151:2: ( tipo_dato ID -> ^( AUX tipo_dato ID ) | tipo_dato ID '[' ']' -> ^( AUX tipo_dato ID '[' ']' ) | tipo_dato ID '[' ']' '[' ']' -> ^( AUX tipo_dato ID '[' ']' '[' ']' ) )
            int alt35=3;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:151:4: tipo_dato ID
                    {
                    pushFollow(FOLLOW_tipo_dato_in_parametrosDec1110);
                    tipo_dato168=tipo_dato();

                    state._fsp--;

                    stream_tipo_dato.add(tipo_dato168.getTree());
                    ID169=(Token)match(input,ID,FOLLOW_ID_in_parametrosDec1112);  
                    stream_ID.add(ID169);



                    // AST REWRITE
                    // elements: tipo_dato, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 151:16: -> ^( AUX tipo_dato ID )
                    {
                        // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:151:18: ^( AUX tipo_dato ID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AUX, "AUX"), root_1);

                        adaptor.addChild(root_1, stream_tipo_dato.nextTree());
                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:152:3: tipo_dato ID '[' ']'
                    {
                    pushFollow(FOLLOW_tipo_dato_in_parametrosDec1124);
                    tipo_dato170=tipo_dato();

                    state._fsp--;

                    stream_tipo_dato.add(tipo_dato170.getTree());
                    ID171=(Token)match(input,ID,FOLLOW_ID_in_parametrosDec1126);  
                    stream_ID.add(ID171);

                    char_literal172=(Token)match(input,43,FOLLOW_43_in_parametrosDec1128);  
                    stream_43.add(char_literal172);

                    char_literal173=(Token)match(input,44,FOLLOW_44_in_parametrosDec1129);  
                    stream_44.add(char_literal173);



                    // AST REWRITE
                    // elements: 44, ID, 43, tipo_dato
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 152:22: -> ^( AUX tipo_dato ID '[' ']' )
                    {
                        // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:152:24: ^( AUX tipo_dato ID '[' ']' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AUX, "AUX"), root_1);

                        adaptor.addChild(root_1, stream_tipo_dato.nextTree());
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_43.nextNode());
                        adaptor.addChild(root_1, stream_44.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:153:3: tipo_dato ID '[' ']' '[' ']'
                    {
                    pushFollow(FOLLOW_tipo_dato_in_parametrosDec1144);
                    tipo_dato174=tipo_dato();

                    state._fsp--;

                    stream_tipo_dato.add(tipo_dato174.getTree());
                    ID175=(Token)match(input,ID,FOLLOW_ID_in_parametrosDec1146);  
                    stream_ID.add(ID175);

                    char_literal176=(Token)match(input,43,FOLLOW_43_in_parametrosDec1148);  
                    stream_43.add(char_literal176);

                    char_literal177=(Token)match(input,44,FOLLOW_44_in_parametrosDec1149);  
                    stream_44.add(char_literal177);

                    char_literal178=(Token)match(input,43,FOLLOW_43_in_parametrosDec1150);  
                    stream_43.add(char_literal178);

                    char_literal179=(Token)match(input,44,FOLLOW_44_in_parametrosDec1151);  
                    stream_44.add(char_literal179);



                    // AST REWRITE
                    // elements: 43, tipo_dato, 44, 43, 44, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 153:28: -> ^( AUX tipo_dato ID '[' ']' '[' ']' )
                    {
                        // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:153:30: ^( AUX tipo_dato ID '[' ']' '[' ']' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AUX, "AUX"), root_1);

                        adaptor.addChild(root_1, stream_tipo_dato.nextTree());
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_43.nextNode());
                        adaptor.addChild(root_1, stream_44.nextNode());
                        adaptor.addChild(root_1, stream_43.nextNode());
                        adaptor.addChild(root_1, stream_44.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parametrosDec"

    public static class breaks_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "breaks"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:155:1: breaks : BREAK INT -> ^( BREAK INT ) ;
    public final FlowUmiCompilerParser.breaks_return breaks() throws RecognitionException {
        FlowUmiCompilerParser.breaks_return retval = new FlowUmiCompilerParser.breaks_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BREAK180=null;
        Token INT181=null;

        CommonTree BREAK180_tree=null;
        CommonTree INT181_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:155:8: ( BREAK INT -> ^( BREAK INT ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:155:10: BREAK INT
            {
            BREAK180=(Token)match(input,BREAK,FOLLOW_BREAK_in_breaks1172);  
            stream_BREAK.add(BREAK180);

            INT181=(Token)match(input,INT,FOLLOW_INT_in_breaks1174);  
            stream_INT.add(INT181);



            // AST REWRITE
            // elements: BREAK, INT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 155:19: -> ^( BREAK INT )
            {
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiCompiler.g:155:21: ^( BREAK INT )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_BREAK.nextNode(), root_1);

                adaptor.addChild(root_1, stream_INT.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "breaks"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String DFA4_eotS =
        "\16\uffff";
    static final String DFA4_eofS =
        "\16\uffff";
    static final String DFA4_minS =
        "\1\12\6\10\1\52\1\11\1\uffff\1\54\1\7\2\uffff";
    static final String DFA4_maxS =
        "\1\17\6\10\1\53\1\11\1\uffff\1\54\1\53\2\uffff";
    static final String DFA4_acceptS =
        "\11\uffff\1\1\2\uffff\1\3\1\2";
    static final String DFA4_specialS =
        "\16\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\11\1\10",
            "\1\12",
            "",
            "\1\13",
            "\1\15\2\uffff\6\15\33\uffff\1\14",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "71:1: declaracionVar : ( tipo_dato ID '=' constante -> ^( IVAR tipo_dato ID '=' constante ) | tipo_dato ID '[' INT ']' -> ^( IVAR tipo_dato ID INT ) | tipo_dato ID '[' INT ']' '[' INT ']' -> ^( IVAR tipo_dato ID INT INT ) );";
        }
    }
    static final String DFA35_eotS =
        "\15\uffff";
    static final String DFA35_eofS =
        "\15\uffff";
    static final String DFA35_minS =
        "\1\12\6\10\1\12\1\54\1\uffff\1\12\2\uffff";
    static final String DFA35_maxS =
        "\1\17\6\10\1\73\1\54\1\uffff\1\73\2\uffff";
    static final String DFA35_acceptS =
        "\11\uffff\1\1\1\uffff\1\3\1\2";
    static final String DFA35_specialS =
        "\15\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\7",
            "\6\11\33\uffff\1\10\17\uffff\1\11",
            "\1\12",
            "",
            "\6\14\33\uffff\1\13\17\uffff\1\14",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "150:1: parametrosDec : ( tipo_dato ID -> ^( AUX tipo_dato ID ) | tipo_dato ID '[' ']' -> ^( AUX tipo_dato ID '[' ']' ) | tipo_dato ID '[' ']' '[' ']' -> ^( AUX tipo_dato ID '[' ']' '[' ']' ) );";
        }
    }
 

    public static final BitSet FOLLOW_funcion_in_algoritmo55 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_variablesDec_in_principal67 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INICIO_in_principal69 = new BitSet(new long[]{0x000000016A410220L});
    public static final BitSet FOLLOW_sentencias_in_principal71 = new BitSet(new long[]{0x000000016A410220L});
    public static final BitSet FOLLOW_FIN_in_principal74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLES_in_variablesDec94 = new BitSet(new long[]{0x000000000000FC80L});
    public static final BitSet FOLLOW_declaracionVar_in_variablesDec96 = new BitSet(new long[]{0x000000000000FC80L});
    public static final BitSet FOLLOW_FIN_VAR_in_variablesDec99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipo_dato_in_declaracionVar116 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_declaracionVar118 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_declaracionVar120 = new BitSet(new long[]{0x00000000003C0200L});
    public static final BitSet FOLLOW_constante_in_declaracionVar122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipo_dato_in_declaracionVar139 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_declaracionVar141 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_declaracionVar143 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INT_in_declaracionVar144 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_declaracionVar145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipo_dato_in_declaracionVar160 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_declaracionVar162 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_declaracionVar164 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INT_in_declaracionVar165 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_declaracionVar166 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_declaracionVar167 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INT_in_declaracionVar168 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_declaracionVar169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENTERO_in_tipo_dato190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANO_in_tipo_dato194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_tipo_dato198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CADENA_in_tipo_dato202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CARACTER_in_tipo_dato206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINGUNO_in_tipo_dato210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_in_sentencias221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_si_in_sentencias223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mientras_in_sentencias225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_para_in_sentencias227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lectura_in_sentencias229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_escritura_in_sentencias231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breaks_in_sentencias233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_llamado_in_sentencias235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASIGNACION_in_asignacion244 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INT_in_asignacion246 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_variable_in_asignacion248 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_asignacion250 = new BitSet(new long[]{0x060000016A7D0300L});
    public static final BitSet FOLLOW_expresion_in_asignacion252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expry_in_expresion276 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_expresion280 = new BitSet(new long[]{0x060000016A7D0300L});
    public static final BitSet FOLLOW_expry_in_expresion283 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_exprmenor_in_expry309 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_expry313 = new BitSet(new long[]{0x060000016A7D0300L});
    public static final BitSet FOLLOW_exprmenor_in_expry316 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_exprmayor_in_exprmenor342 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_exprmenor345 = new BitSet(new long[]{0x060000016A7D0300L});
    public static final BitSet FOLLOW_exprmayor_in_exprmenor347 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_exprmayorigual_in_exprmayor371 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_exprmayor374 = new BitSet(new long[]{0x060000016A7D0300L});
    public static final BitSet FOLLOW_exprmayorigual_in_exprmayor376 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_exprmenorigual_in_exprmayorigual400 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_exprmayorigual403 = new BitSet(new long[]{0x060000016A7D0300L});
    public static final BitSet FOLLOW_exprmenorigual_in_exprmayorigual405 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_exprigual_in_exprmenorigual429 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_exprmenorigual432 = new BitSet(new long[]{0x060000016A7D0300L});
    public static final BitSet FOLLOW_exprigual_in_exprmenorigual434 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_exprdif_in_exprigual457 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_exprigual460 = new BitSet(new long[]{0x060000016A7D0300L});
    public static final BitSet FOLLOW_exprdif_in_exprigual462 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_exprMult_in_exprdif486 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_exprdif489 = new BitSet(new long[]{0x060000016A7D0300L});
    public static final BitSet FOLLOW_exprMult_in_exprdif491 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_exprdiv_in_exprMult516 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_exprMult519 = new BitSet(new long[]{0x060000016A7D0300L});
    public static final BitSet FOLLOW_exprdiv_in_exprMult521 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_exprmod_in_exprdiv545 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_exprdiv548 = new BitSet(new long[]{0x060000016A7D0300L});
    public static final BitSet FOLLOW_exprmod_in_exprdiv550 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_exprSum_in_exprmod573 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_MOD_in_exprmod576 = new BitSet(new long[]{0x060000016A7D0300L});
    public static final BitSet FOLLOW_exprSum_in_exprmod578 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_exprres_in_exprSum603 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_exprSum606 = new BitSet(new long[]{0x060000016A7D0300L});
    public static final BitSet FOLLOW_exprres_in_exprSum608 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_negacion_in_exprres632 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_exprres635 = new BitSet(new long[]{0x060000016A7D0300L});
    public static final BitSet FOLLOW_negacion_in_exprres637 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_atom_in_negacion659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_negacion664 = new BitSet(new long[]{0x040000016A7D0300L});
    public static final BitSet FOLLOW_atom_in_negacion666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_consVar_in_atom681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_llamado_in_atom690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_atom699 = new BitSet(new long[]{0x060000016A7D0300L});
    public static final BitSet FOLLOW_expresion_in_atom701 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_atom703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_constante720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_constante724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constante728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOGICO_in_constante732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_constante736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_index746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_index752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_llamado760 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_llamado762 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_llamado765 = new BitSet(new long[]{0x08000000003C0300L});
    public static final BitSet FOLLOW_parametros_in_llamado766 = new BitSet(new long[]{0x08000000003C0300L});
    public static final BitSet FOLLOW_59_in_llamado768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_consVar_in_parametros790 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_parametros794 = new BitSet(new long[]{0x00000000003C0300L});
    public static final BitSet FOLLOW_consVar_in_parametros797 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_constante_in_consVar817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_consVar819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable830 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_variable831 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_index_in_variable832 = new BitSet(new long[]{0x1000100000000000L});
    public static final BitSet FOLLOW_60_in_variable835 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_index_in_variable837 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_variable840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SI_in_si864 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INT_in_si866 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_si868 = new BitSet(new long[]{0x060000016A7D0300L});
    public static final BitSet FOLLOW_expresion_in_si870 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_si872 = new BitSet(new long[]{0x000000016BC10200L});
    public static final BitSet FOLLOW_sentencias_in_si874 = new BitSet(new long[]{0x000000016BC10200L});
    public static final BitSet FOLLOW_sino_in_si877 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_FIN_SI_in_si880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINO_in_sino904 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INT_in_sino906 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_sino908 = new BitSet(new long[]{0x000000016A410202L});
    public static final BitSet FOLLOW_sentencias_in_sino910 = new BitSet(new long[]{0x000000016A410202L});
    public static final BitSet FOLLOW_MIENTRAS_in_mientras925 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INT_in_mientras927 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_mientras929 = new BitSet(new long[]{0x060000016A7D0300L});
    public static final BitSet FOLLOW_expresion_in_mientras931 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_mientras933 = new BitSet(new long[]{0x000000016E410200L});
    public static final BitSet FOLLOW_sentencias_in_mientras935 = new BitSet(new long[]{0x000000016E410200L});
    public static final BitSet FOLLOW_FIN_MIENTRAS_in_mientras938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARA_in_para958 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INT_in_para960 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_para962 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_exprPara_in_para964 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_para966 = new BitSet(new long[]{0x000000017A410200L});
    public static final BitSet FOLLOW_sentencias_in_para968 = new BitSet(new long[]{0x000000017A410200L});
    public static final BitSet FOLLOW_FIN_PARA_in_para971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_exprPara990 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_exprPara992 = new BitSet(new long[]{0x060000016A7D0300L});
    public static final BitSet FOLLOW_expresion_in_exprPara994 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_exprPara996 = new BitSet(new long[]{0x060000016A7D0300L});
    public static final BitSet FOLLOW_expresion_in_exprPara998 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_exprPara1000 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_variable_in_exprPara1002 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_exprPara1004 = new BitSet(new long[]{0x060000016A7D0300L});
    public static final BitSet FOLLOW_expresion_in_exprPara1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LECTURA_in_lectura1029 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INT_in_lectura1031 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_lectura1033 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_variable_in_lectura1034 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_lectura1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ESCRITURA_in_escritura1052 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INT_in_escritura1054 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_escritura1056 = new BitSet(new long[]{0x060000016A7D0300L});
    public static final BitSet FOLLOW_expresion_in_escritura1057 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_escritura1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCION_in_funcion1074 = new BitSet(new long[]{0x000000000000FC00L});
    public static final BitSet FOLLOW_tipo_dato_in_funcion1076 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_funcion1078 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_funcion1081 = new BitSet(new long[]{0x080000000000FC00L});
    public static final BitSet FOLLOW_parametrosDec_in_funcion1083 = new BitSet(new long[]{0x080000000000FC00L});
    public static final BitSet FOLLOW_59_in_funcion1086 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_principal_in_funcion1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipo_dato_in_parametrosDec1110 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_parametrosDec1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipo_dato_in_parametrosDec1124 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_parametrosDec1126 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_parametrosDec1128 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_parametrosDec1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipo_dato_in_parametrosDec1144 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_parametrosDec1146 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_parametrosDec1148 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_parametrosDec1149 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_parametrosDec1150 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_parametrosDec1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breaks1172 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INT_in_breaks1174 = new BitSet(new long[]{0x0000000000000002L});

}