/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utb.flowumi.editorflowumi.util;

import com.utb.flowumi.editorflowumi.util.Funcion.TipoDatoRetorno;
import com.utb.flowumi.editorflowumi.util.Variable.TipoDato;
import com.utb.flowumi.editorflowumi.util.Variable.TipoEstructura;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author ideacentre
 */
public class AlgoritmoUtil {

    public static Entorno makeEntorno(Algoritmo algoritmo) {
        Entorno entorno = new Entorno();
        if (algoritmo.getVariables() == null) {
            entorno = createNewEntonro(entorno);
        } else {
            entorno = transformarFuncionesVariables(entorno, algoritmo);
        }
        return entorno;
    }

    private static Entorno createNewEntonro(Entorno entorno) {
        Funcion principal = new Funcion();
        principal.setId("Principal");
        principal.setParametros(new HashMap<String, Variable>());
        principal.setVariablesEntorno(new HashMap<String, Variable>());
        principal.setTipoDatoRetorno(TipoDatoRetorno.NINGUNO);
        principal.setAlgoritmoConecciones("inicio1$fin1$");
        principal.setAlgoritmoNodos("inicio1$Inicio - 1$50px$50px$\nfin1$Fin - 1$150px$150px$\n");
        principal.setNumeroUltimoNodo(2);
        entorno.getFunciones().put(principal.getId(), principal);
        entorno.setActual(principal.getId());
        return entorno;
    }

    private static Entorno transformarFuncionesVariables(Entorno entorno, Algoritmo algoritmo) {
        Funcion funcion = null;
        String[] variables = new String(algoritmo.getVariables()).split("[\n]");
        for (String s : variables) {
            String[] partes = s.split("[$]");
            if (partes[0].equals("Funcion")) {
                funcion = new Funcion();
                funcion.setId(partes[1]);
                funcion.setTipoDatoRetorno(TipoDatoRetorno.valueOf(partes[2]));
                funcion.setParametros(new HashMap<String, Variable>());
                funcion.setVariablesEntorno(new HashMap<String, Variable>());
            }
            if (partes[0].equals("FinFuncion")) {
                entorno.getFunciones().put(funcion.getId(), funcion);
            }
            if (partes[0].equals("Variable")) {
                Variable variable = new Variable();
                variable.setAmbito(funcion.getId());
                variable.setId(partes[1]);
                variable.setValorInicial(partes[2]);
                variable.setTipoDato(TipoDato.valueOf(partes[3]));
                variable.setTipoEstructura(TipoEstructura.valueOf(partes[4]));
                variable.setIndice1(Integer.parseInt(partes[5]));
                variable.setIndice2(Integer.parseInt(partes[6]));
                funcion.getVariablesEntorno().put(variable.getId(), variable);
            }
            if (partes[0].equals("Parametro")) {
                Variable variable = new Variable();
                variable.setAmbito(funcion.getId());
                variable.setId(partes[1]);
                variable.setValorInicial(partes[2]);
                variable.setTipoDato(TipoDato.valueOf(partes[3]));
                variable.setTipoEstructura(TipoEstructura.valueOf(partes[4]));
                variable.setIndice1(Integer.parseInt(partes[5]));
                variable.setIndice2(Integer.parseInt(partes[6]));
                funcion.getParametros().put(variable.getId(), variable);
            }
        }
        String[] nodoYconecciones = new String(algoritmo.getJsonAlgoritmo()).split("[\n]");
        String funActualID = "";
        String nodosActuales = "";
        String coneccionesActuales = "";
        for (String s : nodoYconecciones) {
            if (s.startsWith("Funcion")) {
                if (!(s.split("[$]").length < 2)) {
                    funActualID = s.split("[$]")[1];
                    nodosActuales = "";
                    coneccionesActuales = "";
                }
            }
            if (s.startsWith("END")) {
                entorno.getFunciones().get(funActualID).setAlgoritmoNodos(nodosActuales);
                entorno.getFunciones().get(funActualID).setAlgoritmoConecciones(coneccionesActuales);
            }
            if (s.startsWith("Nodo")) {
                if (!(s.split("[%]").length < 2)) {
                    nodosActuales += s.split("[%]")[1] + "\n";
                }
            }
            if (s.startsWith("Coneccion")) {
                if (!(s.split("[%]").length < 2)) {
                    coneccionesActuales += s.split("[%]")[1] + "\n";
                }
            }
            if (s.startsWith("Cantidad")) {
                if (!(s.split("[$]").length < 2)) {
                    entorno.getFunciones().get(funActualID).setNumeroUltimoNodo(Integer.parseInt(s.split("[$]")[1]));
                }
            }
        }
        entorno.setActual("Principal");
        return entorno;
    }

    public static String makeScript(Funcion funcion) {
        String script = "";
        String[] nodos = funcion.getAlgoritmoNodos().split("[\n]");
        for (String s : nodos) {
            script += crearNodo(s) + "\n";
        }
        String[] conecciones = funcion.getAlgoritmoConecciones().split("[\n]");
        for (String s : conecciones) {
            script += crearConeccion(s) + "\n";
        }
        return script;
    }

    private static String crearNodo(String s) {
        String[] nodoInfo = s.split("[$]");
        if (s.startsWith("inicio")) {
            long numNodo = Long.parseLong(nodoInfo[0].substring(6));
            return "makeNodoInicio(" + nodoInfo[2].substring(0, nodoInfo[2].length() - 2) + ", " + nodoInfo[3].substring(0, nodoInfo[3].length() - 2) + ", '" + nodoInfo[0] + "', '" + nodoInfo[1] + "', " + numNodo + ");";
        }
        if (s.startsWith("break")) {
            long numNodo = Long.parseLong(nodoInfo[0].substring(5));
            return "makeNodoBreak(" + nodoInfo[2].substring(0, nodoInfo[2].length() - 2) + ", " + nodoInfo[3].substring(0, nodoInfo[3].length() - 2) + ", '" + nodoInfo[0] + "', '" + nodoInfo[1] + "', " + numNodo + ");";
        }
        if (s.startsWith("asignacion")) {
            long numNodo = Long.parseLong(nodoInfo[0].substring(10));
            return "makeNodoAsignacion(" + nodoInfo[2].substring(0, nodoInfo[2].length() - 2) + ", " + nodoInfo[3].substring(0, nodoInfo[3].length() - 2) + ", '" + nodoInfo[0] + "', '" + nodoInfo[1] + "' , " + numNodo + ", '"
                    + (nodoInfo.length > 4 ? nodoInfo[4] : "") + "' );";
        }
        if (s.startsWith("mientras")) {
            long numNodo = Long.parseLong(nodoInfo[0].substring(8));
            return "makeNodoMientras(" + nodoInfo[2].substring(0, nodoInfo[2].length() - 2) + ", " + nodoInfo[3].substring(0, nodoInfo[3].length() - 2) + ", '" + nodoInfo[0] + "', '" + nodoInfo[1] + "', " + numNodo + ", '"
                    + (nodoInfo.length > 4 ? nodoInfo[4] : "") + "'  );";
        }
        if (s.startsWith("para")) {
            long numNodo = Long.parseLong(nodoInfo[0].substring(4));
            return "makeNodoPara(" + nodoInfo[2].substring(0, nodoInfo[2].length() - 2) + ", " + nodoInfo[3].substring(0, nodoInfo[3].length() - 2) + ", '" + nodoInfo[0] + "', '" + nodoInfo[1] + "', " + numNodo + ", '"
                    + (nodoInfo.length > 4 ? nodoInfo[4] : "") + "');";
        }
        if (s.startsWith("lectura")) {
            long numNodo = Long.parseLong(nodoInfo[0].substring(7));
            return "makeNodoLectura(" + nodoInfo[2].substring(0, nodoInfo[2].length() - 2) + ", " + nodoInfo[3].substring(0, nodoInfo[3].length() - 2) + ", '" + nodoInfo[0] + "', '" + nodoInfo[1] + "', " + numNodo + ", '"
                    + (nodoInfo.length > 4 ? nodoInfo[4] : "") + "' );";
        }
        if (s.startsWith("escritura")) {
            long numNodo = Long.parseLong(nodoInfo[0].substring(9));
            return "makeNodoEscritura(" + nodoInfo[2].substring(0, nodoInfo[2].length() - 2) + ", " + nodoInfo[3].substring(0, nodoInfo[3].length() - 2) + ", '" + nodoInfo[0] + "', '" + nodoInfo[1] + "', " + numNodo + ", '"
                    + (nodoInfo.length > 4 ? nodoInfo[4] : "") + "' );";
        }
        if (s.startsWith("funcion")) {
            long numNodo = Long.parseLong(nodoInfo[0].substring(7));
            return "makeNodoFuncion(" + nodoInfo[2].substring(0, nodoInfo[2].length() - 2) + ", " + nodoInfo[3].substring(0, nodoInfo[3].length() - 2) + ", '" + nodoInfo[0] + "', '" + nodoInfo[1] + "', " + numNodo + ", '"
                    + (nodoInfo.length > 4 ? nodoInfo[4] : "") + "' );";
        }
        if (s.startsWith("sino")) {
            long numNodo = Long.parseLong(nodoInfo[0].substring(4));
            return "makeNodoSiNo(" + nodoInfo[2].substring(0, nodoInfo[2].length() - 2) + ", " + nodoInfo[3].substring(0, nodoInfo[3].length() - 2) + ", '" + nodoInfo[0] + "', '" + nodoInfo[1] + "', " + numNodo + ");";
        }
        if (s.startsWith("si")) {
            long numNodo = Long.parseLong(nodoInfo[0].substring(2));
            return "makeNodoSi(" + nodoInfo[2].substring(0, nodoInfo[2].length() - 2) + ", " + nodoInfo[3].substring(0, nodoInfo[3].length() - 2) + ", '" + nodoInfo[0] + "', '" + nodoInfo[1] + "', " + numNodo + ", '"
                    + (nodoInfo.length > 4 ? nodoInfo[4] : "") + "' );";
        }
        if (s.startsWith("fin")) {
            long numNodo = Long.parseLong(nodoInfo[0].substring(3));
            return "makeNodoFin(" + nodoInfo[2].substring(0, nodoInfo[2].length() - 2) + ", " + nodoInfo[3].substring(0, nodoInfo[3].length() - 2) + ", '" + nodoInfo[0] + "', '" + nodoInfo[1] + "', " + numNodo + ");";
        }
        return null;
    }

    private static String crearConeccion(String s) {
        String[] srctrg = s.split("[$]");
        if (!(s.split("[$]").length < 2)) {
            return "conectar("
                    + "'" + srctrg[0] + "'"
                    + ", "
                    + "'" + srctrg[1] + "'"
                    + ");";
        } else {
            return "";
        }
    }

    public static Algoritmo guardar(Entorno entorno, Algoritmo algoritmo) {
        String variables = "";
        String json = "";
        List<Funcion> funciones = new ArrayList<Funcion>(entorno.getFunciones().values());
        for (Funcion funcion : funciones) {
            variables += "Funcion$" + funcion.getId() + "$" + funcion.getTipoDatoRetorno() + "$\n";
            for (Variable v : funcion.getParametrosLista()) {
                variables += "Parametro$" + v.getId() + "$" + v.getValorInicial() + "$" + v.getTipoDato() + "$" + v.getTipoEstructura() + "$" + v.getIndice1() + "$" + v.getIndice2() + "$\n";
            }
            for (Variable v : funcion.getVariablesEntornoLista()) {
                variables += "Variable$" + v.getId() + "$" + v.getValorInicial() + "$" + v.getTipoDato() + "$" + v.getTipoEstructura() + "$" + v.getIndice1() + "$" + v.getIndice2() + "$\n";
            }
            variables += "FinFuncion$\n";
            json += "Funcion$" + funcion.getId() + "$\n";
            String[] nodos = funcion.getAlgoritmoNodos().split("[\n]");
            for (String s : nodos) {
                json += "Nodo%" + s + "\n";
            }
            String[] conecciones = funcion.getAlgoritmoConecciones().split("[\n]");
            for (String s : conecciones) {
                if (!s.equals("")) {
                    json += "Coneccion%" + s + "\n";
                }
            }
            json += "Cantidad$" + funcion.getNumeroUltimoNodo() + "$\n";
            json += "END$\n";
        }
        algoritmo.setJsonAlgoritmo(json.getBytes());
        algoritmo.setVariables(variables.getBytes());
        return algoritmo;
    }

    public static String makeAlgorithm(Entorno entorno) {
        StringBuilder algoritmo = new StringBuilder();
        for (Funcion f : entorno.getFunciones().values()) {
            algoritmo.append("FUNCION ");
            algoritmo.append(f.getTipoDatoRetorno());
            algoritmo.append(" ");            
            algoritmo.append(f.getId());
            algoritmo.append(" ( ");

            for (Variable v : f.getParametrosLista()) {
                algoritmo.append(v.getTipoDato());
                algoritmo.append(" ");
                algoritmo.append(v.getId());
                if (v.getTipoEstructura() == TipoEstructura.NORMAL) {
                    algoritmo.append(" = ");
                    algoritmo.append(v.getValorInicial());
                    algoritmo.append(" ");
                }
                if (v.getTipoEstructura() == TipoEstructura.ARREGLO) {
                    algoritmo.append("[] ");
                }
                if (v.getTipoEstructura() == TipoEstructura.MATRIZ) {
                    algoritmo.append("[][] ");
                }
            }

            algoritmo.append(" )");
            algoritmo.append(" VARIABLES ");
            
            for(Variable v : f.getVariablesEntornoLista()){
                algoritmo.append(v.getTipoDato());
                algoritmo.append(" ");
                algoritmo.append(v.getId());
                if (v.getTipoEstructura() == TipoEstructura.NORMAL) {
                    algoritmo.append(" = ");
                    algoritmo.append(v.getValorInicial());
                    algoritmo.append(" ");
                }
                if (v.getTipoEstructura() == TipoEstructura.ARREGLO) {
                    algoritmo.append("[");
                    algoritmo.append(v.getIndice1());
                    algoritmo.append("] ");
                }
                if (v.getTipoEstructura() == TipoEstructura.MATRIZ) {
                    algoritmo.append("[");
                    algoritmo.append(v.getIndice1());
                    algoritmo.append("]");
                    algoritmo.append("[");
                    algoritmo.append(v.getIndice2());
                    algoritmo.append("] ");
                }
            }
            
            algoritmo.append(" FIN_VAR ");
            algoritmo.append(AlgoritmoMaker.makeAlgorithm(f.getAlgoritmoNodos(), f.getAlgoritmoConecciones()));

            algoritmo.append(" \n");
        }
        return algoritmo.toString();
    }
}
