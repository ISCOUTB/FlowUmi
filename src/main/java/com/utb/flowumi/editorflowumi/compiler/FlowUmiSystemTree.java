package com.utb.flowumi.editorflowumi.compiler;

// $ANTLR 3.1.2 C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g 2013-08-13 14:35:39


import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


public class FlowUmiSystemTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INICIO", "FIN", "VARIABLES", "FIN_VAR", "ID", "INT", "ENTERO", "BOOLEANO", "REAL", "CADENA", "CARACTER", "NINGUNO", "ASIGNACION", "MOD", "STRING", "FLOAT", "LOGICO", "CHAR", "SI", "FIN_SI", "SINO", "MIENTRAS", "FIN_MIENTRAS", "PARA", "FIN_PARA", "LECTURA", "ESCRITURA", "FUNCION", "BREAK", "AUX", "IVAR", "EXPONENT", "COMMENT", "WS", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "ESC_SEQ", "'='", "'['", "']'", "'&&'", "'||'", "'<'", "'>'", "'>='", "'<='", "'=='", "'!='", "'*'", "'/'", "'+'", "'-'", "'.NO.'", "'('", "')'", "','", "'):'", "':'", "';'"
    };
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


        public FlowUmiSystemTree(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public FlowUmiSystemTree(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return FlowUmiSystemTree.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g"; }



                
    Compilador compilador = new Compilador();
    long counter = 0;
    HashMap<String, String> tablaSimbolos;

    public Compilador getCompilador(){
    	return compilador;
    }



    public static class algoritmo_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "algoritmo"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:29:1: algoritmo : ( funcion )+ ;
    public final FlowUmiSystemTree.algoritmo_return algoritmo() throws RecognitionException {
        FlowUmiSystemTree.algoritmo_return retval = new FlowUmiSystemTree.algoritmo_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        FlowUmiSystemTree.funcion_return funcion1 = null;



        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:32:3: ( ( funcion )+ )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:32:5: ( funcion )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:32:5: ( funcion )+
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
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:32:5: funcion
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_funcion_in_algoritmo80);
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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            	compilador.close();
            	
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "algoritmo"

    public static class funcion_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcion"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:34:1: funcion : ^( FUNCION ID tipo_dato ( parametrosDec )* principal ) ;
    public final FlowUmiSystemTree.funcion_return funcion() throws RecognitionException {
        FlowUmiSystemTree.funcion_return retval = new FlowUmiSystemTree.funcion_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FUNCION2=null;
        CommonTree ID3=null;
        FlowUmiSystemTree.tipo_dato_return tipo_dato4 = null;

        FlowUmiSystemTree.parametrosDec_return parametrosDec5 = null;

        FlowUmiSystemTree.principal_return principal6 = null;


        CommonTree FUNCION2_tree=null;
        CommonTree ID3_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:34:9: ( ^( FUNCION ID tipo_dato ( parametrosDec )* principal ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:34:11: ^( FUNCION ID tipo_dato ( parametrosDec )* principal )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            FUNCION2=(CommonTree)match(input,FUNCION,FOLLOW_FUNCION_in_funcion91); 
            FUNCION2_tree = (CommonTree)adaptor.dupNode(FUNCION2);

            root_1 = (CommonTree)adaptor.becomeRoot(FUNCION2_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_funcion93); 
            ID3_tree = (CommonTree)adaptor.dupNode(ID3);

            adaptor.addChild(root_1, ID3_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_tipo_dato_in_funcion95);
            tipo_dato4=tipo_dato();

            state._fsp--;

            adaptor.addChild(root_1, tipo_dato4.getTree());
            compilador.write(0, (ID3!=null?ID3.getText():null), (tipo_dato4!=null?tipo_dato4.tipoDato:null));
            tablaSimbolos = new HashMap<String, String>();
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:35:49: ( parametrosDec )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==AUX) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:35:49: parametrosDec
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_parametrosDec_in_funcion99);
            	    parametrosDec5=parametrosDec();

            	    state._fsp--;

            	    adaptor.addChild(root_1, parametrosDec5.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            compilador.write(1);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_principal_in_funcion104);
            principal6=principal();

            state._fsp--;

            adaptor.addChild(root_1, principal6.getTree());
            compilador.write(2);

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "funcion"

    public static class parametrosDec_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parametrosDec"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:37:1: parametrosDec : ( ^( AUX tipo_dato ID ) | ^( AUX tipo_dato ID '[' ']' ) | ^( AUX tipo_dato ID '[' ']' '[' ']' ) );
    public final FlowUmiSystemTree.parametrosDec_return parametrosDec() throws RecognitionException {
        FlowUmiSystemTree.parametrosDec_return retval = new FlowUmiSystemTree.parametrosDec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AUX7=null;
        CommonTree ID9=null;
        CommonTree AUX10=null;
        CommonTree ID12=null;
        CommonTree char_literal13=null;
        CommonTree char_literal14=null;
        CommonTree AUX15=null;
        CommonTree ID17=null;
        CommonTree char_literal18=null;
        CommonTree char_literal19=null;
        CommonTree char_literal20=null;
        CommonTree char_literal21=null;
        FlowUmiSystemTree.tipo_dato_return tipo_dato8 = null;

        FlowUmiSystemTree.tipo_dato_return tipo_dato11 = null;

        FlowUmiSystemTree.tipo_dato_return tipo_dato16 = null;


        CommonTree AUX7_tree=null;
        CommonTree ID9_tree=null;
        CommonTree AUX10_tree=null;
        CommonTree ID12_tree=null;
        CommonTree char_literal13_tree=null;
        CommonTree char_literal14_tree=null;
        CommonTree AUX15_tree=null;
        CommonTree ID17_tree=null;
        CommonTree char_literal18_tree=null;
        CommonTree char_literal19_tree=null;
        CommonTree char_literal20_tree=null;
        CommonTree char_literal21_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:38:2: ( ^( AUX tipo_dato ID ) | ^( AUX tipo_dato ID '[' ']' ) | ^( AUX tipo_dato ID '[' ']' '[' ']' ) )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:38:4: ^( AUX tipo_dato ID )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    AUX7=(CommonTree)match(input,AUX,FOLLOW_AUX_in_parametrosDec118); 
                    AUX7_tree = (CommonTree)adaptor.dupNode(AUX7);

                    root_1 = (CommonTree)adaptor.becomeRoot(AUX7_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_tipo_dato_in_parametrosDec120);
                    tipo_dato8=tipo_dato();

                    state._fsp--;

                    adaptor.addChild(root_1, tipo_dato8.getTree());
                    _last = (CommonTree)input.LT(1);
                    ID9=(CommonTree)match(input,ID,FOLLOW_ID_in_parametrosDec122); 
                    ID9_tree = (CommonTree)adaptor.dupNode(ID9);

                    adaptor.addChild(root_1, ID9_tree);

                    compilador.write(3, (ID9!=null?ID9.getText():null), (tipo_dato8!=null?tipo_dato8.tipoDato:null));
                    	tablaSimbolos.put((ID9!=null?ID9.getText():null), (tipo_dato8!=null?tipo_dato8.tipoDato:null));

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:40:3: ^( AUX tipo_dato ID '[' ']' )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    AUX10=(CommonTree)match(input,AUX,FOLLOW_AUX_in_parametrosDec129); 
                    AUX10_tree = (CommonTree)adaptor.dupNode(AUX10);

                    root_1 = (CommonTree)adaptor.becomeRoot(AUX10_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_tipo_dato_in_parametrosDec131);
                    tipo_dato11=tipo_dato();

                    state._fsp--;

                    adaptor.addChild(root_1, tipo_dato11.getTree());
                    _last = (CommonTree)input.LT(1);
                    ID12=(CommonTree)match(input,ID,FOLLOW_ID_in_parametrosDec133); 
                    ID12_tree = (CommonTree)adaptor.dupNode(ID12);

                    adaptor.addChild(root_1, ID12_tree);

                    _last = (CommonTree)input.LT(1);
                    char_literal13=(CommonTree)match(input,43,FOLLOW_43_in_parametrosDec135); 
                    char_literal13_tree = (CommonTree)adaptor.dupNode(char_literal13);

                    adaptor.addChild(root_1, char_literal13_tree);

                    _last = (CommonTree)input.LT(1);
                    char_literal14=(CommonTree)match(input,44,FOLLOW_44_in_parametrosDec136); 
                    char_literal14_tree = (CommonTree)adaptor.dupNode(char_literal14);

                    adaptor.addChild(root_1, char_literal14_tree);

                    compilador.write(4, (ID12!=null?ID12.getText():null), (tipo_dato11!=null?tipo_dato11.tipoDato:null));
                    		tablaSimbolos.put((ID12!=null?ID12.getText():null), (tipo_dato11!=null?tipo_dato11.tipoDato:null));

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:42:3: ^( AUX tipo_dato ID '[' ']' '[' ']' )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    AUX15=(CommonTree)match(input,AUX,FOLLOW_AUX_in_parametrosDec143); 
                    AUX15_tree = (CommonTree)adaptor.dupNode(AUX15);

                    root_1 = (CommonTree)adaptor.becomeRoot(AUX15_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_tipo_dato_in_parametrosDec145);
                    tipo_dato16=tipo_dato();

                    state._fsp--;

                    adaptor.addChild(root_1, tipo_dato16.getTree());
                    _last = (CommonTree)input.LT(1);
                    ID17=(CommonTree)match(input,ID,FOLLOW_ID_in_parametrosDec147); 
                    ID17_tree = (CommonTree)adaptor.dupNode(ID17);

                    adaptor.addChild(root_1, ID17_tree);

                    _last = (CommonTree)input.LT(1);
                    char_literal18=(CommonTree)match(input,43,FOLLOW_43_in_parametrosDec149); 
                    char_literal18_tree = (CommonTree)adaptor.dupNode(char_literal18);

                    adaptor.addChild(root_1, char_literal18_tree);

                    _last = (CommonTree)input.LT(1);
                    char_literal19=(CommonTree)match(input,44,FOLLOW_44_in_parametrosDec150); 
                    char_literal19_tree = (CommonTree)adaptor.dupNode(char_literal19);

                    adaptor.addChild(root_1, char_literal19_tree);

                    _last = (CommonTree)input.LT(1);
                    char_literal20=(CommonTree)match(input,43,FOLLOW_43_in_parametrosDec151); 
                    char_literal20_tree = (CommonTree)adaptor.dupNode(char_literal20);

                    adaptor.addChild(root_1, char_literal20_tree);

                    _last = (CommonTree)input.LT(1);
                    char_literal21=(CommonTree)match(input,44,FOLLOW_44_in_parametrosDec152); 
                    char_literal21_tree = (CommonTree)adaptor.dupNode(char_literal21);

                    adaptor.addChild(root_1, char_literal21_tree);

                    compilador.write(5, (ID17!=null?ID17.getText():null), (tipo_dato16!=null?tipo_dato16.tipoDato:null));
                    		tablaSimbolos.put((ID17!=null?ID17.getText():null), (tipo_dato16!=null?tipo_dato16.tipoDato:null));

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parametrosDec"

    public static class principal_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "principal"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:45:1: principal : ^( INICIO variablesDec ( sentencias )* ) ;
    public final FlowUmiSystemTree.principal_return principal() throws RecognitionException {
        FlowUmiSystemTree.principal_return retval = new FlowUmiSystemTree.principal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INICIO22=null;
        FlowUmiSystemTree.variablesDec_return variablesDec23 = null;

        FlowUmiSystemTree.sentencias_return sentencias24 = null;


        CommonTree INICIO22_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:46:2: ( ^( INICIO variablesDec ( sentencias )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:46:4: ^( INICIO variablesDec ( sentencias )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            INICIO22=(CommonTree)match(input,INICIO,FOLLOW_INICIO_in_principal165); 
            INICIO22_tree = (CommonTree)adaptor.dupNode(INICIO22);

            root_1 = (CommonTree)adaptor.becomeRoot(INICIO22_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variablesDec_in_principal167);
            variablesDec23=variablesDec();

            state._fsp--;

            adaptor.addChild(root_1, variablesDec23.getTree());
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:46:26: ( sentencias )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ASIGNACION||LA4_0==SI||LA4_0==MIENTRAS||LA4_0==PARA||(LA4_0>=LECTURA && LA4_0<=ESCRITURA)||(LA4_0>=BREAK && LA4_0<=AUX)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:46:26: sentencias
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_sentencias_in_principal169);
            	    sentencias24=sentencias();

            	    state._fsp--;

            	    adaptor.addChild(root_1, sentencias24.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "principal"

    public static class variablesDec_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variablesDec"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:48:1: variablesDec : ^( VARIABLES ( declaracionVar )* ) ;
    public final FlowUmiSystemTree.variablesDec_return variablesDec() throws RecognitionException {
        FlowUmiSystemTree.variablesDec_return retval = new FlowUmiSystemTree.variablesDec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VARIABLES25=null;
        FlowUmiSystemTree.declaracionVar_return declaracionVar26 = null;


        CommonTree VARIABLES25_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:49:2: ( ^( VARIABLES ( declaracionVar )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:49:4: ^( VARIABLES ( declaracionVar )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            VARIABLES25=(CommonTree)match(input,VARIABLES,FOLLOW_VARIABLES_in_variablesDec182); 
            VARIABLES25_tree = (CommonTree)adaptor.dupNode(VARIABLES25);

            root_1 = (CommonTree)adaptor.becomeRoot(VARIABLES25_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:49:16: ( declaracionVar )*
                loop5:
                do {
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==IVAR) ) {
                        alt5=1;
                    }


                    switch (alt5) {
                	case 1 :
                	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:49:16: declaracionVar
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_declaracionVar_in_variablesDec184);
                	    declaracionVar26=declaracionVar();

                	    state._fsp--;

                	    adaptor.addChild(root_1, declaracionVar26.getTree());

                	    }
                	    break;

                	default :
                	    break loop5;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variablesDec"

    public static class declaracionVar_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaracionVar"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:51:1: declaracionVar : ( ^( IVAR tipo_dato ID '=' constante ) | ^( IVAR tipo_dato ID a= INT ) | ^( IVAR tipo_dato ID a= INT b= INT ) );
    public final FlowUmiSystemTree.declaracionVar_return declaracionVar() throws RecognitionException {
        FlowUmiSystemTree.declaracionVar_return retval = new FlowUmiSystemTree.declaracionVar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree a=null;
        CommonTree b=null;
        CommonTree IVAR27=null;
        CommonTree ID29=null;
        CommonTree char_literal30=null;
        CommonTree IVAR32=null;
        CommonTree ID34=null;
        CommonTree IVAR35=null;
        CommonTree ID37=null;
        FlowUmiSystemTree.tipo_dato_return tipo_dato28 = null;

        FlowUmiSystemTree.constante_return constante31 = null;

        FlowUmiSystemTree.tipo_dato_return tipo_dato33 = null;

        FlowUmiSystemTree.tipo_dato_return tipo_dato36 = null;


        CommonTree a_tree=null;
        CommonTree b_tree=null;
        CommonTree IVAR27_tree=null;
        CommonTree ID29_tree=null;
        CommonTree char_literal30_tree=null;
        CommonTree IVAR32_tree=null;
        CommonTree ID34_tree=null;
        CommonTree IVAR35_tree=null;
        CommonTree ID37_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:52:2: ( ^( IVAR tipo_dato ID '=' constante ) | ^( IVAR tipo_dato ID a= INT ) | ^( IVAR tipo_dato ID a= INT b= INT ) )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:52:4: ^( IVAR tipo_dato ID '=' constante )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    IVAR27=(CommonTree)match(input,IVAR,FOLLOW_IVAR_in_declaracionVar196); 
                    IVAR27_tree = (CommonTree)adaptor.dupNode(IVAR27);

                    root_1 = (CommonTree)adaptor.becomeRoot(IVAR27_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_tipo_dato_in_declaracionVar198);
                    tipo_dato28=tipo_dato();

                    state._fsp--;

                    adaptor.addChild(root_1, tipo_dato28.getTree());
                    _last = (CommonTree)input.LT(1);
                    ID29=(CommonTree)match(input,ID,FOLLOW_ID_in_declaracionVar200); 
                    ID29_tree = (CommonTree)adaptor.dupNode(ID29);

                    adaptor.addChild(root_1, ID29_tree);

                    _last = (CommonTree)input.LT(1);
                    char_literal30=(CommonTree)match(input,42,FOLLOW_42_in_declaracionVar202); 
                    char_literal30_tree = (CommonTree)adaptor.dupNode(char_literal30);

                    adaptor.addChild(root_1, char_literal30_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_constante_in_declaracionVar204);
                    constante31=constante();

                    state._fsp--;

                    adaptor.addChild(root_1, constante31.getTree());
                    compilador.write(6, (ID29!=null?ID29.getText():null), (tipo_dato28!=null?tipo_dato28.tipoDato:null), (constante31!=null?constante31.valor:null));
                    			tablaSimbolos.put((ID29!=null?ID29.getText():null), (tipo_dato28!=null?tipo_dato28.tipoDato:null));

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:54:4: ^( IVAR tipo_dato ID a= INT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    IVAR32=(CommonTree)match(input,IVAR,FOLLOW_IVAR_in_declaracionVar212); 
                    IVAR32_tree = (CommonTree)adaptor.dupNode(IVAR32);

                    root_1 = (CommonTree)adaptor.becomeRoot(IVAR32_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_tipo_dato_in_declaracionVar214);
                    tipo_dato33=tipo_dato();

                    state._fsp--;

                    adaptor.addChild(root_1, tipo_dato33.getTree());
                    _last = (CommonTree)input.LT(1);
                    ID34=(CommonTree)match(input,ID,FOLLOW_ID_in_declaracionVar216); 
                    ID34_tree = (CommonTree)adaptor.dupNode(ID34);

                    adaptor.addChild(root_1, ID34_tree);

                    _last = (CommonTree)input.LT(1);
                    a=(CommonTree)match(input,INT,FOLLOW_INT_in_declaracionVar220); 
                    a_tree = (CommonTree)adaptor.dupNode(a);

                    adaptor.addChild(root_1, a_tree);

                    compilador.write(7, (ID34!=null?ID34.getText():null), (tipo_dato33!=null?tipo_dato33.tipoDato:null), (a!=null?a.getText():null));
                    				tablaSimbolos.put((ID34!=null?ID34.getText():null), (tipo_dato33!=null?tipo_dato33.tipoDato:null));

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:56:4: ^( IVAR tipo_dato ID a= INT b= INT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    IVAR35=(CommonTree)match(input,IVAR,FOLLOW_IVAR_in_declaracionVar228); 
                    IVAR35_tree = (CommonTree)adaptor.dupNode(IVAR35);

                    root_1 = (CommonTree)adaptor.becomeRoot(IVAR35_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_tipo_dato_in_declaracionVar230);
                    tipo_dato36=tipo_dato();

                    state._fsp--;

                    adaptor.addChild(root_1, tipo_dato36.getTree());
                    _last = (CommonTree)input.LT(1);
                    ID37=(CommonTree)match(input,ID,FOLLOW_ID_in_declaracionVar232); 
                    ID37_tree = (CommonTree)adaptor.dupNode(ID37);

                    adaptor.addChild(root_1, ID37_tree);

                    _last = (CommonTree)input.LT(1);
                    a=(CommonTree)match(input,INT,FOLLOW_INT_in_declaracionVar236); 
                    a_tree = (CommonTree)adaptor.dupNode(a);

                    adaptor.addChild(root_1, a_tree);

                    _last = (CommonTree)input.LT(1);
                    b=(CommonTree)match(input,INT,FOLLOW_INT_in_declaracionVar240); 
                    b_tree = (CommonTree)adaptor.dupNode(b);

                    adaptor.addChild(root_1, b_tree);

                    compilador.write(8, (ID37!=null?ID37.getText():null), (tipo_dato36!=null?tipo_dato36.tipoDato:null), (a!=null?a.getText():null), (b!=null?b.getText():null));
                    				tablaSimbolos.put((ID37!=null?ID37.getText():null), (tipo_dato36!=null?tipo_dato36.tipoDato:null));

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaracionVar"

    public static class tipo_dato_return extends TreeRuleReturnScope {
        public String tipoDato;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tipo_dato"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:59:1: tipo_dato returns [String tipoDato] : ( ENTERO | BOOLEANO | REAL | CADENA | CARACTER | NINGUNO );
    public final FlowUmiSystemTree.tipo_dato_return tipo_dato() throws RecognitionException {
        FlowUmiSystemTree.tipo_dato_return retval = new FlowUmiSystemTree.tipo_dato_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ENTERO38=null;
        CommonTree BOOLEANO39=null;
        CommonTree REAL40=null;
        CommonTree CADENA41=null;
        CommonTree CARACTER42=null;
        CommonTree NINGUNO43=null;

        CommonTree ENTERO38_tree=null;
        CommonTree BOOLEANO39_tree=null;
        CommonTree REAL40_tree=null;
        CommonTree CADENA41_tree=null;
        CommonTree CARACTER42_tree=null;
        CommonTree NINGUNO43_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:60:2: ( ENTERO | BOOLEANO | REAL | CADENA | CARACTER | NINGUNO )
            int alt7=6;
            switch ( input.LA(1) ) {
            case ENTERO:
                {
                alt7=1;
                }
                break;
            case BOOLEANO:
                {
                alt7=2;
                }
                break;
            case REAL:
                {
                alt7=3;
                }
                break;
            case CADENA:
                {
                alt7=4;
                }
                break;
            case CARACTER:
                {
                alt7=5;
                }
                break;
            case NINGUNO:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:60:4: ENTERO
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    ENTERO38=(CommonTree)match(input,ENTERO,FOLLOW_ENTERO_in_tipo_dato254); 
                    ENTERO38_tree = (CommonTree)adaptor.dupNode(ENTERO38);

                    adaptor.addChild(root_0, ENTERO38_tree);

                    retval.tipoDato = "long";

                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:61:3: BOOLEANO
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    BOOLEANO39=(CommonTree)match(input,BOOLEANO,FOLLOW_BOOLEANO_in_tipo_dato259); 
                    BOOLEANO39_tree = (CommonTree)adaptor.dupNode(BOOLEANO39);

                    adaptor.addChild(root_0, BOOLEANO39_tree);

                    retval.tipoDato = "boolean";

                    }
                    break;
                case 3 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:62:3: REAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    REAL40=(CommonTree)match(input,REAL,FOLLOW_REAL_in_tipo_dato264); 
                    REAL40_tree = (CommonTree)adaptor.dupNode(REAL40);

                    adaptor.addChild(root_0, REAL40_tree);

                    retval.tipoDato = "double";

                    }
                    break;
                case 4 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:63:3: CADENA
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    CADENA41=(CommonTree)match(input,CADENA,FOLLOW_CADENA_in_tipo_dato269); 
                    CADENA41_tree = (CommonTree)adaptor.dupNode(CADENA41);

                    adaptor.addChild(root_0, CADENA41_tree);

                    retval.tipoDato = "Stirng";

                    }
                    break;
                case 5 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:64:3: CARACTER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    CARACTER42=(CommonTree)match(input,CARACTER,FOLLOW_CARACTER_in_tipo_dato274); 
                    CARACTER42_tree = (CommonTree)adaptor.dupNode(CARACTER42);

                    adaptor.addChild(root_0, CARACTER42_tree);

                    retval.tipoDato = "char";

                    }
                    break;
                case 6 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:65:3: NINGUNO
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    NINGUNO43=(CommonTree)match(input,NINGUNO,FOLLOW_NINGUNO_in_tipo_dato279); 
                    NINGUNO43_tree = (CommonTree)adaptor.dupNode(NINGUNO43);

                    adaptor.addChild(root_0, NINGUNO43_tree);

                    retval.tipoDato = "void";

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tipo_dato"

    public static class sentencias_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sentencias"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:67:1: sentencias : ( asignacion | si | mientras | para | lectura | escritura | breaks | llamado );
    public final FlowUmiSystemTree.sentencias_return sentencias() throws RecognitionException {
        FlowUmiSystemTree.sentencias_return retval = new FlowUmiSystemTree.sentencias_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        FlowUmiSystemTree.asignacion_return asignacion44 = null;

        FlowUmiSystemTree.si_return si45 = null;

        FlowUmiSystemTree.mientras_return mientras46 = null;

        FlowUmiSystemTree.para_return para47 = null;

        FlowUmiSystemTree.lectura_return lectura48 = null;

        FlowUmiSystemTree.escritura_return escritura49 = null;

        FlowUmiSystemTree.breaks_return breaks50 = null;

        FlowUmiSystemTree.llamado_return llamado51 = null;



        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:68:2: ( asignacion | si | mientras | para | lectura | escritura | breaks | llamado )
            int alt8=8;
            switch ( input.LA(1) ) {
            case ASIGNACION:
                {
                alt8=1;
                }
                break;
            case SI:
                {
                alt8=2;
                }
                break;
            case MIENTRAS:
                {
                alt8=3;
                }
                break;
            case PARA:
                {
                alt8=4;
                }
                break;
            case LECTURA:
                {
                alt8=5;
                }
                break;
            case ESCRITURA:
                {
                alt8=6;
                }
                break;
            case BREAK:
                {
                alt8=7;
                }
                break;
            case AUX:
                {
                alt8=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:68:4: asignacion
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_asignacion_in_sentencias289);
                    asignacion44=asignacion();

                    state._fsp--;

                    adaptor.addChild(root_0, asignacion44.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:68:15: si
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_si_in_sentencias291);
                    si45=si();

                    state._fsp--;

                    adaptor.addChild(root_0, si45.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:68:18: mientras
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_mientras_in_sentencias293);
                    mientras46=mientras();

                    state._fsp--;

                    adaptor.addChild(root_0, mientras46.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:68:27: para
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_para_in_sentencias295);
                    para47=para();

                    state._fsp--;

                    adaptor.addChild(root_0, para47.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:68:32: lectura
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_lectura_in_sentencias297);
                    lectura48=lectura();

                    state._fsp--;

                    adaptor.addChild(root_0, lectura48.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:68:40: escritura
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_escritura_in_sentencias299);
                    escritura49=escritura();

                    state._fsp--;

                    adaptor.addChild(root_0, escritura49.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:68:50: breaks
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_breaks_in_sentencias301);
                    breaks50=breaks();

                    state._fsp--;

                    adaptor.addChild(root_0, breaks50.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:68:57: llamado
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_llamado_in_sentencias303);
                    llamado51=llamado();

                    state._fsp--;

                    adaptor.addChild(root_0, llamado51.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sentencias"

    public static class asignacion_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "asignacion"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:70:1: asignacion : ^( ASIGNACION INT variable expresion ) ;
    public final FlowUmiSystemTree.asignacion_return asignacion() throws RecognitionException {
        FlowUmiSystemTree.asignacion_return retval = new FlowUmiSystemTree.asignacion_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASIGNACION52=null;
        CommonTree INT53=null;
        FlowUmiSystemTree.variable_return variable54 = null;

        FlowUmiSystemTree.expresion_return expresion55 = null;


        CommonTree ASIGNACION52_tree=null;
        CommonTree INT53_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:71:2: ( ^( ASIGNACION INT variable expresion ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:71:4: ^( ASIGNACION INT variable expresion )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ASIGNACION52=(CommonTree)match(input,ASIGNACION,FOLLOW_ASIGNACION_in_asignacion313); 
            ASIGNACION52_tree = (CommonTree)adaptor.dupNode(ASIGNACION52);

            root_1 = (CommonTree)adaptor.becomeRoot(ASIGNACION52_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            INT53=(CommonTree)match(input,INT,FOLLOW_INT_in_asignacion315); 
            INT53_tree = (CommonTree)adaptor.dupNode(INT53);

            adaptor.addChild(root_1, INT53_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variable_in_asignacion317);
            variable54=variable();

            state._fsp--;

            adaptor.addChild(root_1, variable54.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expresion_in_asignacion320);
            expresion55=expresion();

            state._fsp--;

            adaptor.addChild(root_1, expresion55.getTree());
            compilador.write(9, (variable54!=null?variable54.text:null), (expresion55!=null?expresion55.text:null));

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "asignacion"

    public static class expresion_return extends TreeRuleReturnScope {
        public String text;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expresion"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:73:1: expresion returns [String text] : ^( AUX a= expry ( '&&' b= expry )* ) ;
    public final FlowUmiSystemTree.expresion_return expresion() throws RecognitionException {
        FlowUmiSystemTree.expresion_return retval = new FlowUmiSystemTree.expresion_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AUX56=null;
        CommonTree string_literal57=null;
        FlowUmiSystemTree.expry_return a = null;

        FlowUmiSystemTree.expry_return b = null;


        CommonTree AUX56_tree=null;
        CommonTree string_literal57_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:74:30: ( ^( AUX a= expry ( '&&' b= expry )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:74:32: ^( AUX a= expry ( '&&' b= expry )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            AUX56=(CommonTree)match(input,AUX,FOLLOW_AUX_in_expresion340); 
            AUX56_tree = (CommonTree)adaptor.dupNode(AUX56);

            root_1 = (CommonTree)adaptor.becomeRoot(AUX56_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expry_in_expresion344);
            a=expry();

            state._fsp--;

            adaptor.addChild(root_1, a.getTree());

            		retval.text = (a!=null?a.text:null);
            	
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:76:3: ( '&&' b= expry )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==45) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:76:4: '&&' b= expry
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    string_literal57=(CommonTree)match(input,45,FOLLOW_45_in_expresion348); 
            	    string_literal57_tree = (CommonTree)adaptor.dupNode(string_literal57);

            	    adaptor.addChild(root_1, string_literal57_tree);

            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expry_in_expresion352);
            	    b=expry();

            	    state._fsp--;

            	    adaptor.addChild(root_1, b.getTree());

            	    		retval.text += " && "+(b!=null?b.text:null);
            	    	

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expresion"

    public static class expry_return extends TreeRuleReturnScope {
        public String text;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expry"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:80:1: expry returns [String text] : ^( AUX a= exprmenor ( '||' b= exprmenor )* ) ;
    public final FlowUmiSystemTree.expry_return expry() throws RecognitionException {
        FlowUmiSystemTree.expry_return retval = new FlowUmiSystemTree.expry_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AUX58=null;
        CommonTree string_literal59=null;
        FlowUmiSystemTree.exprmenor_return a = null;

        FlowUmiSystemTree.exprmenor_return b = null;


        CommonTree AUX58_tree=null;
        CommonTree string_literal59_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:81:30: ( ^( AUX a= exprmenor ( '||' b= exprmenor )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:81:32: ^( AUX a= exprmenor ( '||' b= exprmenor )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            AUX58=(CommonTree)match(input,AUX,FOLLOW_AUX_in_expry374); 
            AUX58_tree = (CommonTree)adaptor.dupNode(AUX58);

            root_1 = (CommonTree)adaptor.becomeRoot(AUX58_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exprmenor_in_expry378);
            a=exprmenor();

            state._fsp--;

            adaptor.addChild(root_1, a.getTree());

            		retval.text = (a!=null?a.text:null);
            	
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:83:3: ( '||' b= exprmenor )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==46) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:83:4: '||' b= exprmenor
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    string_literal59=(CommonTree)match(input,46,FOLLOW_46_in_expry382); 
            	    string_literal59_tree = (CommonTree)adaptor.dupNode(string_literal59);

            	    adaptor.addChild(root_1, string_literal59_tree);

            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_exprmenor_in_expry386);
            	    b=exprmenor();

            	    state._fsp--;

            	    adaptor.addChild(root_1, b.getTree());

            	    		retval.text += " || "+(b!=null?b.text:null);
            	    	

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expry"

    public static class exprmenor_return extends TreeRuleReturnScope {
        public String text;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprmenor"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:87:1: exprmenor returns [String text] : ^( AUX a= exprmayor ( '<' b= exprmayor )* ) ;
    public final FlowUmiSystemTree.exprmenor_return exprmenor() throws RecognitionException {
        FlowUmiSystemTree.exprmenor_return retval = new FlowUmiSystemTree.exprmenor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AUX60=null;
        CommonTree char_literal61=null;
        FlowUmiSystemTree.exprmayor_return a = null;

        FlowUmiSystemTree.exprmayor_return b = null;


        CommonTree AUX60_tree=null;
        CommonTree char_literal61_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:89:2: ( ^( AUX a= exprmayor ( '<' b= exprmayor )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:89:5: ^( AUX a= exprmayor ( '<' b= exprmayor )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            AUX60=(CommonTree)match(input,AUX,FOLLOW_AUX_in_exprmenor410); 
            AUX60_tree = (CommonTree)adaptor.dupNode(AUX60);

            root_1 = (CommonTree)adaptor.becomeRoot(AUX60_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exprmayor_in_exprmenor414);
            a=exprmayor();

            state._fsp--;

            adaptor.addChild(root_1, a.getTree());

            		retval.text = (a!=null?a.text:null);
            	
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:91:3: ( '<' b= exprmayor )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==47) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:91:4: '<' b= exprmayor
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    char_literal61=(CommonTree)match(input,47,FOLLOW_47_in_exprmenor418); 
            	    char_literal61_tree = (CommonTree)adaptor.dupNode(char_literal61);

            	    adaptor.addChild(root_1, char_literal61_tree);

            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_exprmayor_in_exprmenor422);
            	    b=exprmayor();

            	    state._fsp--;

            	    adaptor.addChild(root_1, b.getTree());

            	    		retval.text += " < "+(b!=null?b.text:null);
            	    	

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprmenor"

    public static class exprmayor_return extends TreeRuleReturnScope {
        public String text;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprmayor"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:94:1: exprmayor returns [String text] : ^( AUX a= exprmayorigual ( '>' b= exprmayorigual )* ) ;
    public final FlowUmiSystemTree.exprmayor_return exprmayor() throws RecognitionException {
        FlowUmiSystemTree.exprmayor_return retval = new FlowUmiSystemTree.exprmayor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AUX62=null;
        CommonTree char_literal63=null;
        FlowUmiSystemTree.exprmayorigual_return a = null;

        FlowUmiSystemTree.exprmayorigual_return b = null;


        CommonTree AUX62_tree=null;
        CommonTree char_literal63_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:96:2: ( ^( AUX a= exprmayorigual ( '>' b= exprmayorigual )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:96:4: ^( AUX a= exprmayorigual ( '>' b= exprmayorigual )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            AUX62=(CommonTree)match(input,AUX,FOLLOW_AUX_in_exprmayor443); 
            AUX62_tree = (CommonTree)adaptor.dupNode(AUX62);

            root_1 = (CommonTree)adaptor.becomeRoot(AUX62_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exprmayorigual_in_exprmayor447);
            a=exprmayorigual();

            state._fsp--;

            adaptor.addChild(root_1, a.getTree());

            		retval.text = (a!=null?a.text:null);
            	
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:98:3: ( '>' b= exprmayorigual )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==48) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:98:4: '>' b= exprmayorigual
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    char_literal63=(CommonTree)match(input,48,FOLLOW_48_in_exprmayor451); 
            	    char_literal63_tree = (CommonTree)adaptor.dupNode(char_literal63);

            	    adaptor.addChild(root_1, char_literal63_tree);

            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_exprmayorigual_in_exprmayor455);
            	    b=exprmayorigual();

            	    state._fsp--;

            	    adaptor.addChild(root_1, b.getTree());

            	    		retval.text += " > "+(b!=null?b.text:null);
            	    	

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprmayor"

    public static class exprmayorigual_return extends TreeRuleReturnScope {
        public String text;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprmayorigual"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:101:1: exprmayorigual returns [String text] : ^( AUX a= exprmenorigual ( '>=' b= exprmenorigual )* ) ;
    public final FlowUmiSystemTree.exprmayorigual_return exprmayorigual() throws RecognitionException {
        FlowUmiSystemTree.exprmayorigual_return retval = new FlowUmiSystemTree.exprmayorigual_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AUX64=null;
        CommonTree string_literal65=null;
        FlowUmiSystemTree.exprmenorigual_return a = null;

        FlowUmiSystemTree.exprmenorigual_return b = null;


        CommonTree AUX64_tree=null;
        CommonTree string_literal65_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:103:2: ( ^( AUX a= exprmenorigual ( '>=' b= exprmenorigual )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:103:4: ^( AUX a= exprmenorigual ( '>=' b= exprmenorigual )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            AUX64=(CommonTree)match(input,AUX,FOLLOW_AUX_in_exprmayorigual476); 
            AUX64_tree = (CommonTree)adaptor.dupNode(AUX64);

            root_1 = (CommonTree)adaptor.becomeRoot(AUX64_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exprmenorigual_in_exprmayorigual480);
            a=exprmenorigual();

            state._fsp--;

            adaptor.addChild(root_1, a.getTree());

            		retval.text = (a!=null?a.text:null);
            	
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:105:3: ( '>=' b= exprmenorigual )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==49) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:105:4: '>=' b= exprmenorigual
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    string_literal65=(CommonTree)match(input,49,FOLLOW_49_in_exprmayorigual484); 
            	    string_literal65_tree = (CommonTree)adaptor.dupNode(string_literal65);

            	    adaptor.addChild(root_1, string_literal65_tree);

            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_exprmenorigual_in_exprmayorigual488);
            	    b=exprmenorigual();

            	    state._fsp--;

            	    adaptor.addChild(root_1, b.getTree());

            	    		retval.text += " >= "+(b!=null?b.text:null);
            	    	

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprmayorigual"

    public static class exprmenorigual_return extends TreeRuleReturnScope {
        public String text;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprmenorigual"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:108:1: exprmenorigual returns [String text] : ^( AUX a= exprigual ( '<=' b= exprigual )* ) ;
    public final FlowUmiSystemTree.exprmenorigual_return exprmenorigual() throws RecognitionException {
        FlowUmiSystemTree.exprmenorigual_return retval = new FlowUmiSystemTree.exprmenorigual_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AUX66=null;
        CommonTree string_literal67=null;
        FlowUmiSystemTree.exprigual_return a = null;

        FlowUmiSystemTree.exprigual_return b = null;


        CommonTree AUX66_tree=null;
        CommonTree string_literal67_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:110:2: ( ^( AUX a= exprigual ( '<=' b= exprigual )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:110:4: ^( AUX a= exprigual ( '<=' b= exprigual )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            AUX66=(CommonTree)match(input,AUX,FOLLOW_AUX_in_exprmenorigual509); 
            AUX66_tree = (CommonTree)adaptor.dupNode(AUX66);

            root_1 = (CommonTree)adaptor.becomeRoot(AUX66_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exprigual_in_exprmenorigual513);
            a=exprigual();

            state._fsp--;

            adaptor.addChild(root_1, a.getTree());

            		retval.text = (a!=null?a.text:null);
            	
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:112:3: ( '<=' b= exprigual )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==50) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:112:4: '<=' b= exprigual
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    string_literal67=(CommonTree)match(input,50,FOLLOW_50_in_exprmenorigual517); 
            	    string_literal67_tree = (CommonTree)adaptor.dupNode(string_literal67);

            	    adaptor.addChild(root_1, string_literal67_tree);

            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_exprigual_in_exprmenorigual521);
            	    b=exprigual();

            	    state._fsp--;

            	    adaptor.addChild(root_1, b.getTree());

            	    		retval.text += " <= "+(b!=null?b.text:null);
            	    	

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprmenorigual"

    public static class exprigual_return extends TreeRuleReturnScope {
        public String text;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprigual"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:115:1: exprigual returns [String text] : ^( AUX a= exprdif ( '==' b= exprdif )* ) ;
    public final FlowUmiSystemTree.exprigual_return exprigual() throws RecognitionException {
        FlowUmiSystemTree.exprigual_return retval = new FlowUmiSystemTree.exprigual_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AUX68=null;
        CommonTree string_literal69=null;
        FlowUmiSystemTree.exprdif_return a = null;

        FlowUmiSystemTree.exprdif_return b = null;


        CommonTree AUX68_tree=null;
        CommonTree string_literal69_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:117:2: ( ^( AUX a= exprdif ( '==' b= exprdif )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:117:4: ^( AUX a= exprdif ( '==' b= exprdif )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            AUX68=(CommonTree)match(input,AUX,FOLLOW_AUX_in_exprigual542); 
            AUX68_tree = (CommonTree)adaptor.dupNode(AUX68);

            root_1 = (CommonTree)adaptor.becomeRoot(AUX68_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exprdif_in_exprigual546);
            a=exprdif();

            state._fsp--;

            adaptor.addChild(root_1, a.getTree());

            		retval.text = (a!=null?a.text:null);
            	
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:119:3: ( '==' b= exprdif )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==51) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:119:4: '==' b= exprdif
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    string_literal69=(CommonTree)match(input,51,FOLLOW_51_in_exprigual550); 
            	    string_literal69_tree = (CommonTree)adaptor.dupNode(string_literal69);

            	    adaptor.addChild(root_1, string_literal69_tree);

            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_exprdif_in_exprigual554);
            	    b=exprdif();

            	    state._fsp--;

            	    adaptor.addChild(root_1, b.getTree());

            	    		retval.text += " == "+(b!=null?b.text:null);
            	    	

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprigual"

    public static class exprdif_return extends TreeRuleReturnScope {
        public String text;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprdif"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:123:1: exprdif returns [String text] : ^( AUX a= exprMult ( '!=' b= exprMult )* ) ;
    public final FlowUmiSystemTree.exprdif_return exprdif() throws RecognitionException {
        FlowUmiSystemTree.exprdif_return retval = new FlowUmiSystemTree.exprdif_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AUX70=null;
        CommonTree string_literal71=null;
        FlowUmiSystemTree.exprMult_return a = null;

        FlowUmiSystemTree.exprMult_return b = null;


        CommonTree AUX70_tree=null;
        CommonTree string_literal71_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:124:30: ( ^( AUX a= exprMult ( '!=' b= exprMult )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:124:32: ^( AUX a= exprMult ( '!=' b= exprMult )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            AUX70=(CommonTree)match(input,AUX,FOLLOW_AUX_in_exprdif575); 
            AUX70_tree = (CommonTree)adaptor.dupNode(AUX70);

            root_1 = (CommonTree)adaptor.becomeRoot(AUX70_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exprMult_in_exprdif579);
            a=exprMult();

            state._fsp--;

            adaptor.addChild(root_1, a.getTree());

            		retval.text = (a!=null?a.text:null);
            	
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:126:3: ( '!=' b= exprMult )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==52) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:126:4: '!=' b= exprMult
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    string_literal71=(CommonTree)match(input,52,FOLLOW_52_in_exprdif583); 
            	    string_literal71_tree = (CommonTree)adaptor.dupNode(string_literal71);

            	    adaptor.addChild(root_1, string_literal71_tree);

            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_exprMult_in_exprdif587);
            	    b=exprMult();

            	    state._fsp--;

            	    adaptor.addChild(root_1, b.getTree());

            	    		retval.text += " != "+(b!=null?b.text:null);
            	    	

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprdif"

    public static class exprMult_return extends TreeRuleReturnScope {
        public String text;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprMult"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:130:1: exprMult returns [String text] : ^( AUX a= exprdiv ( '*' b= exprdiv )* ) ;
    public final FlowUmiSystemTree.exprMult_return exprMult() throws RecognitionException {
        FlowUmiSystemTree.exprMult_return retval = new FlowUmiSystemTree.exprMult_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AUX72=null;
        CommonTree char_literal73=null;
        FlowUmiSystemTree.exprdiv_return a = null;

        FlowUmiSystemTree.exprdiv_return b = null;


        CommonTree AUX72_tree=null;
        CommonTree char_literal73_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:132:2: ( ^( AUX a= exprdiv ( '*' b= exprdiv )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:132:5: ^( AUX a= exprdiv ( '*' b= exprdiv )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            AUX72=(CommonTree)match(input,AUX,FOLLOW_AUX_in_exprMult610); 
            AUX72_tree = (CommonTree)adaptor.dupNode(AUX72);

            root_1 = (CommonTree)adaptor.becomeRoot(AUX72_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exprdiv_in_exprMult614);
            a=exprdiv();

            state._fsp--;

            adaptor.addChild(root_1, a.getTree());

            		retval.text = (a!=null?a.text:null);
            	
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:134:3: ( '*' b= exprdiv )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==53) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:134:4: '*' b= exprdiv
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    char_literal73=(CommonTree)match(input,53,FOLLOW_53_in_exprMult618); 
            	    char_literal73_tree = (CommonTree)adaptor.dupNode(char_literal73);

            	    adaptor.addChild(root_1, char_literal73_tree);

            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_exprdiv_in_exprMult622);
            	    b=exprdiv();

            	    state._fsp--;

            	    adaptor.addChild(root_1, b.getTree());

            	    		retval.text += " * "+(b!=null?b.text:null);
            	    	

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprMult"

    public static class exprdiv_return extends TreeRuleReturnScope {
        public String text;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprdiv"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:138:1: exprdiv returns [String text] : ^( AUX a= exprmod ( '/' b= exprmod )* ) ;
    public final FlowUmiSystemTree.exprdiv_return exprdiv() throws RecognitionException {
        FlowUmiSystemTree.exprdiv_return retval = new FlowUmiSystemTree.exprdiv_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AUX74=null;
        CommonTree char_literal75=null;
        FlowUmiSystemTree.exprmod_return a = null;

        FlowUmiSystemTree.exprmod_return b = null;


        CommonTree AUX74_tree=null;
        CommonTree char_literal75_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:139:30: ( ^( AUX a= exprmod ( '/' b= exprmod )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:139:32: ^( AUX a= exprmod ( '/' b= exprmod )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            AUX74=(CommonTree)match(input,AUX,FOLLOW_AUX_in_exprdiv643); 
            AUX74_tree = (CommonTree)adaptor.dupNode(AUX74);

            root_1 = (CommonTree)adaptor.becomeRoot(AUX74_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exprmod_in_exprdiv647);
            a=exprmod();

            state._fsp--;

            adaptor.addChild(root_1, a.getTree());

            		retval.text = (a!=null?a.text:null);
            	
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:141:3: ( '/' b= exprmod )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==54) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:141:4: '/' b= exprmod
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    char_literal75=(CommonTree)match(input,54,FOLLOW_54_in_exprdiv651); 
            	    char_literal75_tree = (CommonTree)adaptor.dupNode(char_literal75);

            	    adaptor.addChild(root_1, char_literal75_tree);

            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_exprmod_in_exprdiv655);
            	    b=exprmod();

            	    state._fsp--;

            	    adaptor.addChild(root_1, b.getTree());

            	    		retval.text += " / "+(b!=null?b.text:null);
            	    	

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprdiv"

    public static class exprmod_return extends TreeRuleReturnScope {
        public String text;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprmod"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:145:1: exprmod returns [String text] : ^( AUX a= exprSum ( MOD b= exprSum )* ) ;
    public final FlowUmiSystemTree.exprmod_return exprmod() throws RecognitionException {
        FlowUmiSystemTree.exprmod_return retval = new FlowUmiSystemTree.exprmod_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AUX76=null;
        CommonTree MOD77=null;
        FlowUmiSystemTree.exprSum_return a = null;

        FlowUmiSystemTree.exprSum_return b = null;


        CommonTree AUX76_tree=null;
        CommonTree MOD77_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:146:30: ( ^( AUX a= exprSum ( MOD b= exprSum )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:146:32: ^( AUX a= exprSum ( MOD b= exprSum )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            AUX76=(CommonTree)match(input,AUX,FOLLOW_AUX_in_exprmod675); 
            AUX76_tree = (CommonTree)adaptor.dupNode(AUX76);

            root_1 = (CommonTree)adaptor.becomeRoot(AUX76_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exprSum_in_exprmod679);
            a=exprSum();

            state._fsp--;

            adaptor.addChild(root_1, a.getTree());

            		retval.text = (a!=null?a.text:null);
            	
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:148:3: ( MOD b= exprSum )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==MOD) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:148:4: MOD b= exprSum
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    MOD77=(CommonTree)match(input,MOD,FOLLOW_MOD_in_exprmod683); 
            	    MOD77_tree = (CommonTree)adaptor.dupNode(MOD77);

            	    adaptor.addChild(root_1, MOD77_tree);

            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_exprSum_in_exprmod687);
            	    b=exprSum();

            	    state._fsp--;

            	    adaptor.addChild(root_1, b.getTree());

            	    		retval.text += " "+(MOD77!=null?MOD77.getText():null)+" "+(b!=null?b.text:null);
            	    	

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprmod"

    public static class exprSum_return extends TreeRuleReturnScope {
        public String text;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprSum"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:152:1: exprSum returns [String text] : ^( AUX a= exprres ( '+' b= exprres )* ) ;
    public final FlowUmiSystemTree.exprSum_return exprSum() throws RecognitionException {
        FlowUmiSystemTree.exprSum_return retval = new FlowUmiSystemTree.exprSum_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AUX78=null;
        CommonTree char_literal79=null;
        FlowUmiSystemTree.exprres_return a = null;

        FlowUmiSystemTree.exprres_return b = null;


        CommonTree AUX78_tree=null;
        CommonTree char_literal79_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:154:2: ( ^( AUX a= exprres ( '+' b= exprres )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:154:4: ^( AUX a= exprres ( '+' b= exprres )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            AUX78=(CommonTree)match(input,AUX,FOLLOW_AUX_in_exprSum710); 
            AUX78_tree = (CommonTree)adaptor.dupNode(AUX78);

            root_1 = (CommonTree)adaptor.becomeRoot(AUX78_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exprres_in_exprSum714);
            a=exprres();

            state._fsp--;

            adaptor.addChild(root_1, a.getTree());

            		retval.text = (a!=null?a.text:null);
            	
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:156:3: ( '+' b= exprres )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==55) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:156:4: '+' b= exprres
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    char_literal79=(CommonTree)match(input,55,FOLLOW_55_in_exprSum718); 
            	    char_literal79_tree = (CommonTree)adaptor.dupNode(char_literal79);

            	    adaptor.addChild(root_1, char_literal79_tree);

            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_exprres_in_exprSum722);
            	    b=exprres();

            	    state._fsp--;

            	    adaptor.addChild(root_1, b.getTree());

            	    		retval.text += " + "+(b!=null?b.text:null);
            	    	

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprSum"

    public static class exprres_return extends TreeRuleReturnScope {
        public String text;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprres"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:160:1: exprres returns [String text] : ^( AUX a= negacion ( '-' b= negacion )* ) ;
    public final FlowUmiSystemTree.exprres_return exprres() throws RecognitionException {
        FlowUmiSystemTree.exprres_return retval = new FlowUmiSystemTree.exprres_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AUX80=null;
        CommonTree char_literal81=null;
        FlowUmiSystemTree.negacion_return a = null;

        FlowUmiSystemTree.negacion_return b = null;


        CommonTree AUX80_tree=null;
        CommonTree char_literal81_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:161:30: ( ^( AUX a= negacion ( '-' b= negacion )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:161:32: ^( AUX a= negacion ( '-' b= negacion )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            AUX80=(CommonTree)match(input,AUX,FOLLOW_AUX_in_exprres743); 
            AUX80_tree = (CommonTree)adaptor.dupNode(AUX80);

            root_1 = (CommonTree)adaptor.becomeRoot(AUX80_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_negacion_in_exprres747);
            a=negacion();

            state._fsp--;

            adaptor.addChild(root_1, a.getTree());

            		retval.text = (a!=null?a.text:null);
            	
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:163:3: ( '-' b= negacion )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==56) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:163:4: '-' b= negacion
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    char_literal81=(CommonTree)match(input,56,FOLLOW_56_in_exprres751); 
            	    char_literal81_tree = (CommonTree)adaptor.dupNode(char_literal81);

            	    adaptor.addChild(root_1, char_literal81_tree);

            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_negacion_in_exprres755);
            	    b=negacion();

            	    state._fsp--;

            	    adaptor.addChild(root_1, b.getTree());

            	    		retval.text += " - "+(b!=null?b.text:null);
            	    	

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprres"

    public static class negacion_return extends TreeRuleReturnScope {
        public String text;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negacion"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:167:1: negacion returns [String text] : (a= atom | ^( '.NO.' a= atom ) );
    public final FlowUmiSystemTree.negacion_return negacion() throws RecognitionException {
        FlowUmiSystemTree.negacion_return retval = new FlowUmiSystemTree.negacion_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree string_literal82=null;
        FlowUmiSystemTree.atom_return a = null;


        CommonTree string_literal82_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:168:30: (a= atom | ^( '.NO.' a= atom ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==AUX) ) {
                alt22=1;
            }
            else if ( (LA22_0==57) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:168:32: a= atom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_atom_in_negacion776);
                    a=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, a.getTree());

                    		retval.text = (a!=null?a.text:null);
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:170:6: ^( '.NO.' a= atom )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    string_literal82=(CommonTree)match(input,57,FOLLOW_57_in_negacion782); 
                    string_literal82_tree = (CommonTree)adaptor.dupNode(string_literal82);

                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal82_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_atom_in_negacion786);
                    a=atom();

                    state._fsp--;

                    adaptor.addChild(root_1, a.getTree());

                    		retval.text = "!" + (a!=null?a.text:null);
                    	

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "negacion"

    public static class atom_return extends TreeRuleReturnScope {
        public String text;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:174:1: atom returns [String text] : ( ^( AUX consVar ) | ^( AUX llamado ) | ^( AUX '(' a= expresion ')' ) );
    public final FlowUmiSystemTree.atom_return atom() throws RecognitionException {
        FlowUmiSystemTree.atom_return retval = new FlowUmiSystemTree.atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AUX83=null;
        CommonTree AUX85=null;
        CommonTree AUX87=null;
        CommonTree char_literal88=null;
        CommonTree char_literal89=null;
        FlowUmiSystemTree.expresion_return a = null;

        FlowUmiSystemTree.consVar_return consVar84 = null;

        FlowUmiSystemTree.llamado_return llamado86 = null;


        CommonTree AUX83_tree=null;
        CommonTree AUX85_tree=null;
        CommonTree AUX87_tree=null;
        CommonTree char_literal88_tree=null;
        CommonTree char_literal89_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:175:30: ( ^( AUX consVar ) | ^( AUX llamado ) | ^( AUX '(' a= expresion ')' ) )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==AUX) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case 58:
                        {
                        alt23=3;
                        }
                        break;
                    case AUX:
                        {
                        int LA23_4 = input.LA(4);

                        if ( (LA23_4==DOWN) ) {
                            int LA23_6 = input.LA(5);

                            if ( (LA23_6==INT) ) {
                                alt23=2;
                            }
                            else if ( (LA23_6==ID) ) {
                                alt23=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 23, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case ID:
                    case INT:
                    case STRING:
                    case FLOAT:
                    case LOGICO:
                    case CHAR:
                        {
                        alt23=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:175:32: ^( AUX consVar )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    AUX83=(CommonTree)match(input,AUX,FOLLOW_AUX_in_atom804); 
                    AUX83_tree = (CommonTree)adaptor.dupNode(AUX83);

                    root_1 = (CommonTree)adaptor.becomeRoot(AUX83_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_consVar_in_atom806);
                    consVar84=consVar();

                    state._fsp--;

                    adaptor.addChild(root_1, consVar84.getTree());
                    retval.text = (consVar84!=null?consVar84.text:null);

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:175:71: ^( AUX llamado )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    AUX85=(CommonTree)match(input,AUX,FOLLOW_AUX_in_atom811); 
                    AUX85_tree = (CommonTree)adaptor.dupNode(AUX85);

                    root_1 = (CommonTree)adaptor.becomeRoot(AUX85_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_llamado_in_atom813);
                    llamado86=llamado();

                    state._fsp--;

                    adaptor.addChild(root_1, llamado86.getTree());
                    retval.text = (llamado86!=null?llamado86.text:null);

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:175:110: ^( AUX '(' a= expresion ')' )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    AUX87=(CommonTree)match(input,AUX,FOLLOW_AUX_in_atom818); 
                    AUX87_tree = (CommonTree)adaptor.dupNode(AUX87);

                    root_1 = (CommonTree)adaptor.becomeRoot(AUX87_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    char_literal88=(CommonTree)match(input,58,FOLLOW_58_in_atom820); 
                    char_literal88_tree = (CommonTree)adaptor.dupNode(char_literal88);

                    adaptor.addChild(root_1, char_literal88_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expresion_in_atom823);
                    a=expresion();

                    state._fsp--;

                    adaptor.addChild(root_1, a.getTree());
                    _last = (CommonTree)input.LT(1);
                    char_literal89=(CommonTree)match(input,59,FOLLOW_59_in_atom824); 
                    char_literal89_tree = (CommonTree)adaptor.dupNode(char_literal89);

                    adaptor.addChild(root_1, char_literal89_tree);

                    retval.text = "("+(a!=null?a.text:null)+")";

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class constante_return extends TreeRuleReturnScope {
        public String valor;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constante"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:177:1: constante returns [String valor] : ( INT | STRING | FLOAT | LOGICO | CHAR );
    public final FlowUmiSystemTree.constante_return constante() throws RecognitionException {
        FlowUmiSystemTree.constante_return retval = new FlowUmiSystemTree.constante_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INT90=null;
        CommonTree STRING91=null;
        CommonTree FLOAT92=null;
        CommonTree LOGICO93=null;
        CommonTree CHAR94=null;

        CommonTree INT90_tree=null;
        CommonTree STRING91_tree=null;
        CommonTree FLOAT92_tree=null;
        CommonTree LOGICO93_tree=null;
        CommonTree CHAR94_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:179:2: ( INT | STRING | FLOAT | LOGICO | CHAR )
            int alt24=5;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt24=1;
                }
                break;
            case STRING:
                {
                alt24=2;
                }
                break;
            case FLOAT:
                {
                alt24=3;
                }
                break;
            case LOGICO:
                {
                alt24=4;
                }
                break;
            case CHAR:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:179:4: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    INT90=(CommonTree)match(input,INT,FOLLOW_INT_in_constante843); 
                    INT90_tree = (CommonTree)adaptor.dupNode(INT90);

                    adaptor.addChild(root_0, INT90_tree);

                    retval.valor = (INT90!=null?INT90.getText():null);

                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:180:3: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    STRING91=(CommonTree)match(input,STRING,FOLLOW_STRING_in_constante848); 
                    STRING91_tree = (CommonTree)adaptor.dupNode(STRING91);

                    adaptor.addChild(root_0, STRING91_tree);

                    retval.valor = (STRING91!=null?STRING91.getText():null);

                    }
                    break;
                case 3 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:181:3: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    FLOAT92=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_constante853); 
                    FLOAT92_tree = (CommonTree)adaptor.dupNode(FLOAT92);

                    adaptor.addChild(root_0, FLOAT92_tree);

                    retval.valor = (FLOAT92!=null?FLOAT92.getText():null);

                    }
                    break;
                case 4 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:182:3: LOGICO
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    LOGICO93=(CommonTree)match(input,LOGICO,FOLLOW_LOGICO_in_constante858); 
                    LOGICO93_tree = (CommonTree)adaptor.dupNode(LOGICO93);

                    adaptor.addChild(root_0, LOGICO93_tree);

                    if((LOGICO93!=null?LOGICO93.getText():null).equals("falso")){
                    	retval.valor = "false";
                    	} else {
                    		retval.valor = "true";
                    	}

                    }
                    break;
                case 5 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:187:3: CHAR
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    CHAR94=(CommonTree)match(input,CHAR,FOLLOW_CHAR_in_constante863); 
                    CHAR94_tree = (CommonTree)adaptor.dupNode(CHAR94);

                    adaptor.addChild(root_0, CHAR94_tree);

                    retval.valor = (CHAR94!=null?CHAR94.getText():null);

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constante"

    public static class index_return extends TreeRuleReturnScope {
        public String text;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "index"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:189:1: index returns [String text] : ( INT | variable );
    public final FlowUmiSystemTree.index_return index() throws RecognitionException {
        FlowUmiSystemTree.index_return retval = new FlowUmiSystemTree.index_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INT95=null;
        FlowUmiSystemTree.variable_return variable96 = null;


        CommonTree INT95_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:189:27: ( INT | variable )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==INT) ) {
                alt25=1;
            }
            else if ( (LA25_0==ID||LA25_0==AUX) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:189:29: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    INT95=(CommonTree)match(input,INT,FOLLOW_INT_in_index874); 
                    INT95_tree = (CommonTree)adaptor.dupNode(INT95);

                    adaptor.addChild(root_0, INT95_tree);

                    retval.text = (INT95!=null?INT95.getText():null);

                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:189:54: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_index878);
                    variable96=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable96.getTree());
                    retval.text = (variable96!=null?variable96.text:null);

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "index"

    public static class llamado_return extends TreeRuleReturnScope {
        public String text;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "llamado"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:191:1: llamado returns [String text] : ^( AUX INT ID '(' parametros ')' ) ;
    public final FlowUmiSystemTree.llamado_return llamado() throws RecognitionException {
        FlowUmiSystemTree.llamado_return retval = new FlowUmiSystemTree.llamado_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AUX97=null;
        CommonTree INT98=null;
        CommonTree ID99=null;
        CommonTree char_literal100=null;
        CommonTree char_literal102=null;
        FlowUmiSystemTree.parametros_return parametros101 = null;


        CommonTree AUX97_tree=null;
        CommonTree INT98_tree=null;
        CommonTree ID99_tree=null;
        CommonTree char_literal100_tree=null;
        CommonTree char_literal102_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:191:29: ( ^( AUX INT ID '(' parametros ')' ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:191:31: ^( AUX INT ID '(' parametros ')' )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            AUX97=(CommonTree)match(input,AUX,FOLLOW_AUX_in_llamado890); 
            AUX97_tree = (CommonTree)adaptor.dupNode(AUX97);

            root_1 = (CommonTree)adaptor.becomeRoot(AUX97_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            INT98=(CommonTree)match(input,INT,FOLLOW_INT_in_llamado892); 
            INT98_tree = (CommonTree)adaptor.dupNode(INT98);

            adaptor.addChild(root_1, INT98_tree);

            _last = (CommonTree)input.LT(1);
            ID99=(CommonTree)match(input,ID,FOLLOW_ID_in_llamado894); 
            ID99_tree = (CommonTree)adaptor.dupNode(ID99);

            adaptor.addChild(root_1, ID99_tree);

            _last = (CommonTree)input.LT(1);
            char_literal100=(CommonTree)match(input,58,FOLLOW_58_in_llamado896); 
            char_literal100_tree = (CommonTree)adaptor.dupNode(char_literal100);

            adaptor.addChild(root_1, char_literal100_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_parametros_in_llamado897);
            parametros101=parametros();

            state._fsp--;

            adaptor.addChild(root_1, parametros101.getTree());
            _last = (CommonTree)input.LT(1);
            char_literal102=(CommonTree)match(input,59,FOLLOW_59_in_llamado898); 
            char_literal102_tree = (CommonTree)adaptor.dupNode(char_literal102);

            adaptor.addChild(root_1, char_literal102_tree);

            retval.text = (ID99!=null?ID99.getText():null)+"("+(parametros101!=null?parametros101.text:null)+")";

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "llamado"

    public static class parametros_return extends TreeRuleReturnScope {
        public String text;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parametros"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:193:1: parametros returns [String text] : ^( AUX ( consVar )+ ) ;
    public final FlowUmiSystemTree.parametros_return parametros() throws RecognitionException {
        FlowUmiSystemTree.parametros_return retval = new FlowUmiSystemTree.parametros_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AUX103=null;
        FlowUmiSystemTree.consVar_return consVar104 = null;


        CommonTree AUX103_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:194:2: ( ^( AUX ( consVar )+ ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:194:4: ^( AUX ( consVar )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            AUX103=(CommonTree)match(input,AUX,FOLLOW_AUX_in_parametros913); 
            AUX103_tree = (CommonTree)adaptor.dupNode(AUX103);

            root_1 = (CommonTree)adaptor.becomeRoot(AUX103_tree, root_1);


            retval.text = "";

            match(input, Token.DOWN, null); 
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:194:24: ( consVar )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=ID && LA26_0<=INT)||(LA26_0>=STRING && LA26_0<=CHAR)||LA26_0==AUX) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:194:25: consVar
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_consVar_in_parametros918);
            	    consVar104=consVar();

            	    state._fsp--;

            	    adaptor.addChild(root_1, consVar104.getTree());
            	    retval.text += (consVar104!=null?consVar104.text:null);

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parametros"

    public static class consVar_return extends TreeRuleReturnScope {
        public String text;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "consVar"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:196:1: consVar returns [String text] : ( constante | variable );
    public final FlowUmiSystemTree.consVar_return consVar() throws RecognitionException {
        FlowUmiSystemTree.consVar_return retval = new FlowUmiSystemTree.consVar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        FlowUmiSystemTree.constante_return constante105 = null;

        FlowUmiSystemTree.variable_return variable106 = null;



        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:197:29: ( constante | variable )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==INT||(LA27_0>=STRING && LA27_0<=CHAR)) ) {
                alt27=1;
            }
            else if ( (LA27_0==ID||LA27_0==AUX) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:197:31: constante
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_constante_in_consVar937);
                    constante105=constante();

                    state._fsp--;

                    adaptor.addChild(root_0, constante105.getTree());
                    retval.text = (constante105!=null?constante105.valor:null);

                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:197:68: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_consVar940);
                    variable106=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable106.getTree());
                    retval.text = (variable106!=null?variable106.text:null);

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "consVar"

    public static class variable_return extends TreeRuleReturnScope {
        public String text;
        public String tipo;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:199:1: variable returns [String text, String tipo] : ( ID | ^( AUX ID a= index ( ',' b= index )? ) );
    public final FlowUmiSystemTree.variable_return variable() throws RecognitionException {
        FlowUmiSystemTree.variable_return retval = new FlowUmiSystemTree.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ID107=null;
        CommonTree AUX108=null;
        CommonTree ID109=null;
        CommonTree char_literal110=null;
        FlowUmiSystemTree.index_return a = null;

        FlowUmiSystemTree.index_return b = null;


        CommonTree ID107_tree=null;
        CommonTree AUX108_tree=null;
        CommonTree ID109_tree=null;
        CommonTree char_literal110_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:200:29: ( ID | ^( AUX ID a= index ( ',' b= index )? ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ID) ) {
                alt29=1;
            }
            else if ( (LA29_0==AUX) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:200:31: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    ID107=(CommonTree)match(input,ID,FOLLOW_ID_in_variable955); 
                    ID107_tree = (CommonTree)adaptor.dupNode(ID107);

                    adaptor.addChild(root_0, ID107_tree);

                    retval.text = (ID107!=null?ID107.getText():null);
                    		retval.tipo = tablaSimbolos.get((ID107!=null?ID107.getText():null));

                    }
                    break;
                case 2 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:202:4: ^( AUX ID a= index ( ',' b= index )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    AUX108=(CommonTree)match(input,AUX,FOLLOW_AUX_in_variable962); 
                    AUX108_tree = (CommonTree)adaptor.dupNode(AUX108);

                    root_1 = (CommonTree)adaptor.becomeRoot(AUX108_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ID109=(CommonTree)match(input,ID,FOLLOW_ID_in_variable964); 
                    ID109_tree = (CommonTree)adaptor.dupNode(ID109);

                    adaptor.addChild(root_1, ID109_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_index_in_variable968);
                    a=index();

                    state._fsp--;

                    adaptor.addChild(root_1, a.getTree());
                    retval.text = (ID109!=null?ID109.getText():null)+"["+(a!=null?a.text:null)+"]";
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:202:57: ( ',' b= index )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==60) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:202:58: ',' b= index
                            {
                            _last = (CommonTree)input.LT(1);
                            char_literal110=(CommonTree)match(input,60,FOLLOW_60_in_variable973); 
                            char_literal110_tree = (CommonTree)adaptor.dupNode(char_literal110);

                            adaptor.addChild(root_1, char_literal110_tree);

                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_index_in_variable976);
                            b=index();

                            state._fsp--;

                            adaptor.addChild(root_1, b.getTree());
                            retval.text += "["+(b!=null?b.text:null)+"]";
                            				retval.tipo = tablaSimbolos.get((ID109!=null?ID109.getText():null));

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    public static class si_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "si"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:205:1: si : ^( SI INT expresion ( sentencias )* ( sino )? ) ;
    public final FlowUmiSystemTree.si_return si() throws RecognitionException {
        FlowUmiSystemTree.si_return retval = new FlowUmiSystemTree.si_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SI111=null;
        CommonTree INT112=null;
        FlowUmiSystemTree.expresion_return expresion113 = null;

        FlowUmiSystemTree.sentencias_return sentencias114 = null;

        FlowUmiSystemTree.sino_return sino115 = null;


        CommonTree SI111_tree=null;
        CommonTree INT112_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:205:4: ( ^( SI INT expresion ( sentencias )* ( sino )? ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:205:6: ^( SI INT expresion ( sentencias )* ( sino )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            SI111=(CommonTree)match(input,SI,FOLLOW_SI_in_si990); 
            SI111_tree = (CommonTree)adaptor.dupNode(SI111);

            root_1 = (CommonTree)adaptor.becomeRoot(SI111_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            INT112=(CommonTree)match(input,INT,FOLLOW_INT_in_si992); 
            INT112_tree = (CommonTree)adaptor.dupNode(INT112);

            adaptor.addChild(root_1, INT112_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expresion_in_si994);
            expresion113=expresion();

            state._fsp--;

            adaptor.addChild(root_1, expresion113.getTree());
            compilador.write(10, "if", (expresion113!=null?expresion113.text:null));
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:205:72: ( sentencias )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==ASIGNACION||LA30_0==SI||LA30_0==MIENTRAS||LA30_0==PARA||(LA30_0>=LECTURA && LA30_0<=ESCRITURA)||(LA30_0>=BREAK && LA30_0<=AUX)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:205:72: sentencias
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_sentencias_in_si998);
            	    sentencias114=sentencias();

            	    state._fsp--;

            	    adaptor.addChild(root_1, sentencias114.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            compilador.write(2);
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:205:107: ( sino )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==SINO) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:205:107: sino
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_sino_in_si1003);
                    sino115=sino();

                    state._fsp--;

                    adaptor.addChild(root_1, sino115.getTree());

                    }
                    break;

            }


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "si"

    public static class sino_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sino"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:207:1: sino : ^( SINO INT ( sentencias )* ) ;
    public final FlowUmiSystemTree.sino_return sino() throws RecognitionException {
        FlowUmiSystemTree.sino_return retval = new FlowUmiSystemTree.sino_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SINO116=null;
        CommonTree INT117=null;
        FlowUmiSystemTree.sentencias_return sentencias118 = null;


        CommonTree SINO116_tree=null;
        CommonTree INT117_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:207:7: ( ^( SINO INT ( sentencias )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:207:9: ^( SINO INT ( sentencias )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            SINO116=(CommonTree)match(input,SINO,FOLLOW_SINO_in_sino1015); 
            SINO116_tree = (CommonTree)adaptor.dupNode(SINO116);

            root_1 = (CommonTree)adaptor.becomeRoot(SINO116_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            INT117=(CommonTree)match(input,INT,FOLLOW_INT_in_sino1017); 
            INT117_tree = (CommonTree)adaptor.dupNode(INT117);

            adaptor.addChild(root_1, INT117_tree);

            compilador.write(11);
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:207:43: ( sentencias )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==ASIGNACION||LA32_0==SI||LA32_0==MIENTRAS||LA32_0==PARA||(LA32_0>=LECTURA && LA32_0<=ESCRITURA)||(LA32_0>=BREAK && LA32_0<=AUX)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:207:43: sentencias
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_sentencias_in_sino1020);
            	    sentencias118=sentencias();

            	    state._fsp--;

            	    adaptor.addChild(root_1, sentencias118.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            compilador.write(2);

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sino"

    public static class mientras_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mientras"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:209:1: mientras : ^( MIENTRAS INT expresion ( sentencias )* ) ;
    public final FlowUmiSystemTree.mientras_return mientras() throws RecognitionException {
        FlowUmiSystemTree.mientras_return retval = new FlowUmiSystemTree.mientras_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree MIENTRAS119=null;
        CommonTree INT120=null;
        FlowUmiSystemTree.expresion_return expresion121 = null;

        FlowUmiSystemTree.sentencias_return sentencias122 = null;


        CommonTree MIENTRAS119_tree=null;
        CommonTree INT120_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:209:9: ( ^( MIENTRAS INT expresion ( sentencias )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:209:11: ^( MIENTRAS INT expresion ( sentencias )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            MIENTRAS119=(CommonTree)match(input,MIENTRAS,FOLLOW_MIENTRAS_in_mientras1032); 
            MIENTRAS119_tree = (CommonTree)adaptor.dupNode(MIENTRAS119);

            root_1 = (CommonTree)adaptor.becomeRoot(MIENTRAS119_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            INT120=(CommonTree)match(input,INT,FOLLOW_INT_in_mientras1034); 
            INT120_tree = (CommonTree)adaptor.dupNode(INT120);

            adaptor.addChild(root_1, INT120_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expresion_in_mientras1036);
            expresion121=expresion();

            state._fsp--;

            adaptor.addChild(root_1, expresion121.getTree());
            compilador.write(10, "while",(expresion121!=null?expresion121.text:null));
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:209:85: ( sentencias )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==ASIGNACION||LA33_0==SI||LA33_0==MIENTRAS||LA33_0==PARA||(LA33_0>=LECTURA && LA33_0<=ESCRITURA)||(LA33_0>=BREAK && LA33_0<=AUX)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:209:85: sentencias
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_sentencias_in_mientras1040);
            	    sentencias122=sentencias();

            	    state._fsp--;

            	    adaptor.addChild(root_1, sentencias122.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            compilador.write(2);

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mientras"

    public static class para_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "para"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:211:1: para : ^( PARA INT exprPara ( sentencias )* ) ;
    public final FlowUmiSystemTree.para_return para() throws RecognitionException {
        FlowUmiSystemTree.para_return retval = new FlowUmiSystemTree.para_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PARA123=null;
        CommonTree INT124=null;
        FlowUmiSystemTree.exprPara_return exprPara125 = null;

        FlowUmiSystemTree.sentencias_return sentencias126 = null;


        CommonTree PARA123_tree=null;
        CommonTree INT124_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:211:6: ( ^( PARA INT exprPara ( sentencias )* ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:211:8: ^( PARA INT exprPara ( sentencias )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            PARA123=(CommonTree)match(input,PARA,FOLLOW_PARA_in_para1053); 
            PARA123_tree = (CommonTree)adaptor.dupNode(PARA123);

            root_1 = (CommonTree)adaptor.becomeRoot(PARA123_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            INT124=(CommonTree)match(input,INT,FOLLOW_INT_in_para1055); 
            INT124_tree = (CommonTree)adaptor.dupNode(INT124);

            adaptor.addChild(root_1, INT124_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exprPara_in_para1057);
            exprPara125=exprPara();

            state._fsp--;

            adaptor.addChild(root_1, exprPara125.getTree());
            compilador.write(10, "for",(exprPara125!=null?exprPara125.text:null));
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:211:74: ( sentencias )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ASIGNACION||LA34_0==SI||LA34_0==MIENTRAS||LA34_0==PARA||(LA34_0>=LECTURA && LA34_0<=ESCRITURA)||(LA34_0>=BREAK && LA34_0<=AUX)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:211:74: sentencias
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_sentencias_in_para1061);
            	    sentencias126=sentencias();

            	    state._fsp--;

            	    adaptor.addChild(root_1, sentencias126.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            compilador.write(2);

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "para"

    public static class exprPara_return extends TreeRuleReturnScope {
        public String text;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprPara"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:213:1: exprPara returns [String text] : ^( AUX a= variable b= expresion c= expresion d= variable e= expresion ) ;
    public final FlowUmiSystemTree.exprPara_return exprPara() throws RecognitionException {
        FlowUmiSystemTree.exprPara_return retval = new FlowUmiSystemTree.exprPara_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AUX127=null;
        FlowUmiSystemTree.variable_return a = null;

        FlowUmiSystemTree.expresion_return b = null;

        FlowUmiSystemTree.expresion_return c = null;

        FlowUmiSystemTree.variable_return d = null;

        FlowUmiSystemTree.expresion_return e = null;


        CommonTree AUX127_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:213:30: ( ^( AUX a= variable b= expresion c= expresion d= variable e= expresion ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:213:32: ^( AUX a= variable b= expresion c= expresion d= variable e= expresion )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            AUX127=(CommonTree)match(input,AUX,FOLLOW_AUX_in_exprPara1076); 
            AUX127_tree = (CommonTree)adaptor.dupNode(AUX127);

            root_1 = (CommonTree)adaptor.becomeRoot(AUX127_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variable_in_exprPara1080);
            a=variable();

            state._fsp--;

            adaptor.addChild(root_1, a.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expresion_in_exprPara1084);
            b=expresion();

            state._fsp--;

            adaptor.addChild(root_1, b.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expresion_in_exprPara1088);
            c=expresion();

            state._fsp--;

            adaptor.addChild(root_1, c.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variable_in_exprPara1092);
            d=variable();

            state._fsp--;

            adaptor.addChild(root_1, d.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expresion_in_exprPara1096);
            e=expresion();

            state._fsp--;

            adaptor.addChild(root_1, e.getTree());
            retval.text = (a!=null?a.text:null) + " = " + (b!=null?b.text:null) + " ; " + (c!=null?c.text:null)  + " ; " + (d!=null?d.text:null) + " = " + (e!=null?e.text:null);

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprPara"

    public static class lectura_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lectura"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:215:1: lectura : ^( LECTURA INT variable ) ;
    public final FlowUmiSystemTree.lectura_return lectura() throws RecognitionException {
        FlowUmiSystemTree.lectura_return retval = new FlowUmiSystemTree.lectura_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LECTURA128=null;
        CommonTree INT129=null;
        FlowUmiSystemTree.variable_return variable130 = null;


        CommonTree LECTURA128_tree=null;
        CommonTree INT129_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:215:9: ( ^( LECTURA INT variable ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:215:11: ^( LECTURA INT variable )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            LECTURA128=(CommonTree)match(input,LECTURA,FOLLOW_LECTURA_in_lectura1107); 
            LECTURA128_tree = (CommonTree)adaptor.dupNode(LECTURA128);

            root_1 = (CommonTree)adaptor.becomeRoot(LECTURA128_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            INT129=(CommonTree)match(input,INT,FOLLOW_INT_in_lectura1109); 
            INT129_tree = (CommonTree)adaptor.dupNode(INT129);

            adaptor.addChild(root_1, INT129_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variable_in_lectura1111);
            variable130=variable();

            state._fsp--;

            adaptor.addChild(root_1, variable130.getTree());
            compilador.write(13, counter+"", (variable130!=null?variable130.text:null), (variable130!=null?variable130.tipo:null));counter++;

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lectura"

    public static class escritura_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "escritura"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:217:1: escritura : ^( ESCRITURA INT expresion ) ;
    public final FlowUmiSystemTree.escritura_return escritura() throws RecognitionException {
        FlowUmiSystemTree.escritura_return retval = new FlowUmiSystemTree.escritura_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ESCRITURA131=null;
        CommonTree INT132=null;
        FlowUmiSystemTree.expresion_return expresion133 = null;


        CommonTree ESCRITURA131_tree=null;
        CommonTree INT132_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:218:2: ( ^( ESCRITURA INT expresion ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:218:4: ^( ESCRITURA INT expresion )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ESCRITURA131=(CommonTree)match(input,ESCRITURA,FOLLOW_ESCRITURA_in_escritura1123); 
            ESCRITURA131_tree = (CommonTree)adaptor.dupNode(ESCRITURA131);

            root_1 = (CommonTree)adaptor.becomeRoot(ESCRITURA131_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            INT132=(CommonTree)match(input,INT,FOLLOW_INT_in_escritura1125); 
            INT132_tree = (CommonTree)adaptor.dupNode(INT132);

            adaptor.addChild(root_1, INT132_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expresion_in_escritura1127);
            expresion133=expresion();

            state._fsp--;

            adaptor.addChild(root_1, expresion133.getTree());
            compilador.write(14, (expresion133!=null?expresion133.text:null));

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "escritura"

    public static class breaks_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "breaks"
    // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:220:1: breaks : ^( BREAK INT ) ;
    public final FlowUmiSystemTree.breaks_return breaks() throws RecognitionException {
        FlowUmiSystemTree.breaks_return retval = new FlowUmiSystemTree.breaks_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BREAK134=null;
        CommonTree INT135=null;

        CommonTree BREAK134_tree=null;
        CommonTree INT135_tree=null;

        try {
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:220:8: ( ^( BREAK INT ) )
            // C:\\Users\\ideacentre\\Dropbox\\Tesis\\proyecto1\\flow-umi-system\\FlowUmiSystem-ejb\\src\\main\\java\\com\\flowumi\\compiler\\FlowUmiSystemTree.g:220:10: ^( BREAK INT )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            BREAK134=(CommonTree)match(input,BREAK,FOLLOW_BREAK_in_breaks1138); 
            BREAK134_tree = (CommonTree)adaptor.dupNode(BREAK134);

            root_1 = (CommonTree)adaptor.becomeRoot(BREAK134_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            INT135=(CommonTree)match(input,INT,FOLLOW_INT_in_breaks1140); 
            INT135_tree = (CommonTree)adaptor.dupNode(INT135);

            adaptor.addChild(root_1, INT135_tree);

            compilador.write(12);

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "breaks"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA3_eotS =
        "\17\uffff";
    static final String DFA3_eofS =
        "\17\uffff";
    static final String DFA3_minS =
        "\1\41\1\2\1\12\6\10\1\3\1\54\1\uffff\1\3\2\uffff";
    static final String DFA3_maxS =
        "\1\41\1\2\1\17\6\10\1\53\1\54\1\uffff\1\53\2\uffff";
    static final String DFA3_acceptS =
        "\13\uffff\1\1\1\uffff\1\3\1\2";
    static final String DFA3_specialS =
        "\17\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\13\47\uffff\1\12",
            "\1\14",
            "",
            "\1\16\47\uffff\1\15",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "37:1: parametrosDec : ( ^( AUX tipo_dato ID ) | ^( AUX tipo_dato ID '[' ']' ) | ^( AUX tipo_dato ID '[' ']' '[' ']' ) );";
        }
    }
    static final String DFA6_eotS =
        "\16\uffff";
    static final String DFA6_eofS =
        "\16\uffff";
    static final String DFA6_minS =
        "\1\42\1\2\1\12\6\10\1\11\1\3\3\uffff";
    static final String DFA6_maxS =
        "\1\42\1\2\1\17\6\10\1\52\1\11\3\uffff";
    static final String DFA6_acceptS =
        "\13\uffff\1\1\1\3\1\2";
    static final String DFA6_specialS =
        "\16\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\12\40\uffff\1\13",
            "\1\15\5\uffff\1\14",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "51:1: declaracionVar : ( ^( IVAR tipo_dato ID '=' constante ) | ^( IVAR tipo_dato ID a= INT ) | ^( IVAR tipo_dato ID a= INT b= INT ) );";
        }
    }
 

    public static final BitSet FOLLOW_funcion_in_algoritmo80 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_FUNCION_in_funcion91 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_funcion93 = new BitSet(new long[]{0x000000000000FC00L});
    public static final BitSet FOLLOW_tipo_dato_in_funcion95 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_parametrosDec_in_funcion99 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_principal_in_funcion104 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AUX_in_parametrosDec118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_dato_in_parametrosDec120 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_parametrosDec122 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AUX_in_parametrosDec129 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_dato_in_parametrosDec131 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_parametrosDec133 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_parametrosDec135 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_parametrosDec136 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AUX_in_parametrosDec143 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_dato_in_parametrosDec145 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_parametrosDec147 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_parametrosDec149 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_parametrosDec150 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_parametrosDec151 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_parametrosDec152 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INICIO_in_principal165 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variablesDec_in_principal167 = new BitSet(new long[]{0x000000036A410008L});
    public static final BitSet FOLLOW_sentencias_in_principal169 = new BitSet(new long[]{0x000000036A410008L});
    public static final BitSet FOLLOW_VARIABLES_in_variablesDec182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaracionVar_in_variablesDec184 = new BitSet(new long[]{0x0000000400000008L});
    public static final BitSet FOLLOW_IVAR_in_declaracionVar196 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_dato_in_declaracionVar198 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_declaracionVar200 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_declaracionVar202 = new BitSet(new long[]{0x00000000003C0200L});
    public static final BitSet FOLLOW_constante_in_declaracionVar204 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IVAR_in_declaracionVar212 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_dato_in_declaracionVar214 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_declaracionVar216 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INT_in_declaracionVar220 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IVAR_in_declaracionVar228 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_dato_in_declaracionVar230 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_declaracionVar232 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INT_in_declaracionVar236 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INT_in_declaracionVar240 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENTERO_in_tipo_dato254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANO_in_tipo_dato259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_tipo_dato264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CADENA_in_tipo_dato269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CARACTER_in_tipo_dato274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINGUNO_in_tipo_dato279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_in_sentencias289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_si_in_sentencias291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mientras_in_sentencias293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_para_in_sentencias295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lectura_in_sentencias297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_escritura_in_sentencias299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breaks_in_sentencias301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_llamado_in_sentencias303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASIGNACION_in_asignacion313 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_asignacion315 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_variable_in_asignacion317 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_expresion_in_asignacion320 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AUX_in_expresion340 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expry_in_expresion344 = new BitSet(new long[]{0x0000200000000008L});
    public static final BitSet FOLLOW_45_in_expresion348 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_expry_in_expresion352 = new BitSet(new long[]{0x0000200000000008L});
    public static final BitSet FOLLOW_AUX_in_expry374 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprmenor_in_expry378 = new BitSet(new long[]{0x0000400000000008L});
    public static final BitSet FOLLOW_46_in_expry382 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_exprmenor_in_expry386 = new BitSet(new long[]{0x0000400000000008L});
    public static final BitSet FOLLOW_AUX_in_exprmenor410 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprmayor_in_exprmenor414 = new BitSet(new long[]{0x0000800000000008L});
    public static final BitSet FOLLOW_47_in_exprmenor418 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_exprmayor_in_exprmenor422 = new BitSet(new long[]{0x0000800000000008L});
    public static final BitSet FOLLOW_AUX_in_exprmayor443 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprmayorigual_in_exprmayor447 = new BitSet(new long[]{0x0001000000000008L});
    public static final BitSet FOLLOW_48_in_exprmayor451 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_exprmayorigual_in_exprmayor455 = new BitSet(new long[]{0x0001000000000008L});
    public static final BitSet FOLLOW_AUX_in_exprmayorigual476 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprmenorigual_in_exprmayorigual480 = new BitSet(new long[]{0x0002000000000008L});
    public static final BitSet FOLLOW_49_in_exprmayorigual484 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_exprmenorigual_in_exprmayorigual488 = new BitSet(new long[]{0x0002000000000008L});
    public static final BitSet FOLLOW_AUX_in_exprmenorigual509 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprigual_in_exprmenorigual513 = new BitSet(new long[]{0x0004000000000008L});
    public static final BitSet FOLLOW_50_in_exprmenorigual517 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_exprigual_in_exprmenorigual521 = new BitSet(new long[]{0x0004000000000008L});
    public static final BitSet FOLLOW_AUX_in_exprigual542 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprdif_in_exprigual546 = new BitSet(new long[]{0x0008000000000008L});
    public static final BitSet FOLLOW_51_in_exprigual550 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_exprdif_in_exprigual554 = new BitSet(new long[]{0x0008000000000008L});
    public static final BitSet FOLLOW_AUX_in_exprdif575 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprMult_in_exprdif579 = new BitSet(new long[]{0x0010000000000008L});
    public static final BitSet FOLLOW_52_in_exprdif583 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_exprMult_in_exprdif587 = new BitSet(new long[]{0x0010000000000008L});
    public static final BitSet FOLLOW_AUX_in_exprMult610 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprdiv_in_exprMult614 = new BitSet(new long[]{0x0020000000000008L});
    public static final BitSet FOLLOW_53_in_exprMult618 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_exprdiv_in_exprMult622 = new BitSet(new long[]{0x0020000000000008L});
    public static final BitSet FOLLOW_AUX_in_exprdiv643 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprmod_in_exprdiv647 = new BitSet(new long[]{0x0040000000000008L});
    public static final BitSet FOLLOW_54_in_exprdiv651 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_exprmod_in_exprdiv655 = new BitSet(new long[]{0x0040000000000008L});
    public static final BitSet FOLLOW_AUX_in_exprmod675 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprSum_in_exprmod679 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_MOD_in_exprmod683 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_exprSum_in_exprmod687 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_AUX_in_exprSum710 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprres_in_exprSum714 = new BitSet(new long[]{0x0080000000000008L});
    public static final BitSet FOLLOW_55_in_exprSum718 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_exprres_in_exprSum722 = new BitSet(new long[]{0x0080000000000008L});
    public static final BitSet FOLLOW_AUX_in_exprres743 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_negacion_in_exprres747 = new BitSet(new long[]{0x0100000000000008L});
    public static final BitSet FOLLOW_56_in_exprres751 = new BitSet(new long[]{0x0200000200000000L});
    public static final BitSet FOLLOW_negacion_in_exprres755 = new BitSet(new long[]{0x0100000000000008L});
    public static final BitSet FOLLOW_atom_in_negacion776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_negacion782 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_negacion786 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AUX_in_atom804 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_consVar_in_atom806 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AUX_in_atom811 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_llamado_in_atom813 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AUX_in_atom818 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_58_in_atom820 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_expresion_in_atom823 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_atom824 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_constante843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_constante848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constante853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOGICO_in_constante858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_constante863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_index874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_index878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUX_in_llamado890 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_llamado892 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_llamado894 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_llamado896 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_parametros_in_llamado897 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_llamado898 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AUX_in_parametros913 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_consVar_in_parametros918 = new BitSet(new long[]{0x00000002003C0308L});
    public static final BitSet FOLLOW_constante_in_consVar937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_consVar940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUX_in_variable962 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_variable964 = new BitSet(new long[]{0x0000000200000300L});
    public static final BitSet FOLLOW_index_in_variable968 = new BitSet(new long[]{0x1000000000000008L});
    public static final BitSet FOLLOW_60_in_variable973 = new BitSet(new long[]{0x0000000200000300L});
    public static final BitSet FOLLOW_index_in_variable976 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SI_in_si990 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_si992 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_expresion_in_si994 = new BitSet(new long[]{0x000000036B410008L});
    public static final BitSet FOLLOW_sentencias_in_si998 = new BitSet(new long[]{0x000000036B410008L});
    public static final BitSet FOLLOW_sino_in_si1003 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SINO_in_sino1015 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_sino1017 = new BitSet(new long[]{0x000000036A410008L});
    public static final BitSet FOLLOW_sentencias_in_sino1020 = new BitSet(new long[]{0x000000036A410008L});
    public static final BitSet FOLLOW_MIENTRAS_in_mientras1032 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_mientras1034 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_expresion_in_mientras1036 = new BitSet(new long[]{0x000000036A410008L});
    public static final BitSet FOLLOW_sentencias_in_mientras1040 = new BitSet(new long[]{0x000000036A410008L});
    public static final BitSet FOLLOW_PARA_in_para1053 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_para1055 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_exprPara_in_para1057 = new BitSet(new long[]{0x000000036A410008L});
    public static final BitSet FOLLOW_sentencias_in_para1061 = new BitSet(new long[]{0x000000036A410008L});
    public static final BitSet FOLLOW_AUX_in_exprPara1076 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_exprPara1080 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_expresion_in_exprPara1084 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_expresion_in_exprPara1088 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_variable_in_exprPara1092 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_expresion_in_exprPara1096 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LECTURA_in_lectura1107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_lectura1109 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_variable_in_lectura1111 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ESCRITURA_in_escritura1123 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_escritura1125 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_expresion_in_escritura1127 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BREAK_in_breaks1138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_breaks1140 = new BitSet(new long[]{0x0000000000000008L});

}