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
public class Entorno {
    private HashMap<String, Funcion> funciones;
    private String actual;

    public Entorno() {
        funciones = new HashMap<String, Funcion>();
    }

    public HashMap<String, Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(HashMap<String, Funcion> funciones) {
        this.funciones = funciones;
    }    

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }
    
}
