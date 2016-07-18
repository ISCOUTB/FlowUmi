/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utb.flowumi.editorflowumi.util;

import java.util.HashMap;

/**
 *
 * @author ideacentre
 */
public class AlgoritmoMaker {
    private static String algoritmoTexto;
    private static HashMap<String, Nodo> mapaNodos;

    public static String makeAlgorithm(String nodos, String Conecciones) {
        String[] nodosArray = nodos.split("[\n]");
        mapaNodos = new HashMap<String, Nodo>();
        for (String s : nodosArray) {
            Nodo n = new Nodo(s);
            mapaNodos.put(n.getIdLarge(), n);
        }

        String[] connectionsArray = Conecciones.split("[\n]");
        for (String s : connectionsArray) {
            mapaNodos.get(s.split("[$]")[0]).getTargets().add(s.split("[$]")[1]);
        }
        for(String s : mapaNodos.keySet()){
        }
        return makeAlgorithmText();
    }

    private static String makeAlgorithmText() {
        algoritmoTexto = "";
        generarTextoExpresion("inicio1");
        return algoritmoTexto;
    }

    private static String generarTextoExpresion(String nodoActual) {
        for(String s : mapaNodos.keySet()){
        }
        if (nodoActual.startsWith("inicio")) {
            Nodo n = mapaNodos.get(nodoActual);
            algoritmoTexto += "INICIO ";
            return generarTextoExpresion(n.getTargets().get(0));
        }
        if (nodoActual.startsWith("break")) {
            Nodo n = mapaNodos.get(nodoActual);
            algoritmoTexto += "BREAK "+n.getNodoId()+" ";
            return generarTextoExpresion(n.getTargets().get(0));
        }
        if (nodoActual.startsWith("asignacion")) {
            Nodo n = mapaNodos.get(nodoActual);
            algoritmoTexto += "ASIGNACION "+n.getNodoId()+" " + n.getExpresion() + " ";
            return generarTextoExpresion(n.getTargets().get(0));
        }
        if (nodoActual.startsWith("mientras")) {
            Nodo n = mapaNodos.get(nodoActual);
            algoritmoTexto += "MIENTRAS "+n.getNodoId()+" "+" (" + n.getExpresion() + "): ";
            String fin = generarTextoExpresion(n.getTargets().get(0));
            algoritmoTexto += "FIN_MIENTRAS ";
            n = mapaNodos.get(fin);
            String actual = n.getTargets().get(0).startsWith("mientras") ? n.getTargets().get(1) : n.getTargets().get(0);
            return generarTextoExpresion(actual);
        }
        if (nodoActual.startsWith("para")) {
            Nodo n = mapaNodos.get(nodoActual);
            algoritmoTexto += "PARA "+n.getNodoId()+" "+"(" + n.getExpresion() + "): ";
            String fin = generarTextoExpresion(n.getTargets().get(0));
            algoritmoTexto += "FIN_PARA ";
            n = mapaNodos.get(fin);
            String actual = n.getTargets().get(0).startsWith("para") ? n.getTargets().get(1) : n.getTargets().get(0);
            return generarTextoExpresion(actual);
        }
        if (nodoActual.startsWith("lectura")) {
            Nodo n = mapaNodos.get(nodoActual);
            algoritmoTexto += "LECTURA "+n.getNodoId()+" "+"(" + n.getExpresion() + ") ";
            return generarTextoExpresion(n.getTargets().get(0));
        }
        if (nodoActual.startsWith("escritura")) {
            Nodo n = mapaNodos.get(nodoActual);
            algoritmoTexto += "ESCRITURA "+n.getNodoId()+" "+"(" + n.getExpresion() + ") ";
            return generarTextoExpresion(n.getTargets().get(0));
        }
        if (nodoActual.startsWith("funcion")) {
            Nodo n = mapaNodos.get(nodoActual);
            algoritmoTexto += n.getNodoId()+" " +n.getExpresion() + " ";
            return generarTextoExpresion(n.getTargets().get(0));
        }
        if (nodoActual.startsWith("sino")) {
            Nodo n = mapaNodos.get(nodoActual);
            algoritmoTexto += "SINO "+n.getNodoId()+" ";
            return generarTextoExpresion(n.getTargets().get(0));
        }
        if (nodoActual.startsWith("si")) {
            Nodo n = mapaNodos.get(nodoActual);
            algoritmoTexto += "SI "+n.getNodoId()+" "+"(" + n.getExpresion() + "): ";
            String fin;
            if (n.getTargets().size() == 2) {
                int which = n.getTargets().get(0).startsWith("sino") ? 1 : 0;
                fin = generarTextoExpresion(n.getTargets().get(which));
                generarTextoExpresion(n.getTargets().get((which + 1) % 2));
            } else {
                fin = generarTextoExpresion(n.getTargets().get(0));
            }
            n = mapaNodos.get(fin);
            String actual = n.getTargets().get(0);
            algoritmoTexto += "FIN_SI ";
            return generarTextoExpresion(actual);
        }
        if (nodoActual.startsWith("fin")) {
            if (mapaNodos.get(nodoActual).getTargets().isEmpty()) {
                algoritmoTexto += "FIN ";
            }
            return nodoActual;
        }
        return null;
    }
}
