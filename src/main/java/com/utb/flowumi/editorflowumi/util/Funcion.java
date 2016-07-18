/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utb.flowumi.editorflowumi.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author ideacentre
 */
public class Funcion {
    private String id;
    public enum TipoDatoRetorno {
        CADENA,
        CARACTER,
        LOGICO,
        ENTERO,
        REAL,
        NINGUNO;
    }
    private TipoDatoRetorno tipoDatoRetorno;
    private HashMap<String, Variable> parametros;
    private HashMap<String, Variable> variablesEntorno;
    private String algoritmoNodos;
    private String algoritmoConecciones;
    private String traduccionAlgoritmo;
    private long numeroUltimoNodo;

    public Funcion() {
        
    }

    public Funcion(String id, TipoDatoRetorno tipoDatoRetorno, String algoritmoNodos, String algoritmoConecciones, String traduccionAlgoritmo) {
        this.id = id;
        this.tipoDatoRetorno = tipoDatoRetorno;
        this.parametros = new HashMap<String, Variable>();
        this.variablesEntorno = new HashMap<String, Variable>();
        this.algoritmoNodos = algoritmoNodos;
        this.algoritmoConecciones = algoritmoConecciones;
        this.traduccionAlgoritmo = traduccionAlgoritmo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TipoDatoRetorno getTipoDatoRetorno() {
        return tipoDatoRetorno;
    }

    public void setTipoDatoRetorno(TipoDatoRetorno tipoDatoRetorno) {
        this.tipoDatoRetorno = tipoDatoRetorno;
    }

    public HashMap<String, Variable> getParametros() {
        return parametros;
    }

    public void setParametros(HashMap<String, Variable> parametros) {
        this.parametros = parametros;
    }

    public HashMap<String, Variable> getVariablesEntorno() {
        return variablesEntorno;
    }

    public void setVariablesEntorno(HashMap<String, Variable> variablesEntorno) {
        this.variablesEntorno = variablesEntorno;
    }
    
    public String getAlgoritmoNodos() {
        return algoritmoNodos;
    }

    public void setAlgoritmoNodos(String algoritmoNodos) {
        this.algoritmoNodos = algoritmoNodos;
    }

    public String getAlgoritmoConecciones() {
        return algoritmoConecciones;
    }

    public void setAlgoritmoConecciones(String algoritmoConecciones) {
        this.algoritmoConecciones = algoritmoConecciones;
    }

    public String getTraduccionAlgoritmo() {
        return traduccionAlgoritmo;
    }

    public void setTraduccionAlgoritmo(String traduccionAlgoritmo) {
        this.traduccionAlgoritmo = traduccionAlgoritmo;
    }

    public Long getNumeroUltimoNodo() {
        return numeroUltimoNodo;
    }

    public void setNumeroUltimoNodo(long numeroUltimoNodo) {
        this.numeroUltimoNodo = numeroUltimoNodo;
    }
    
    public List<Variable> getVariablesEntornoLista() {
        return new ArrayList<Variable>(variablesEntorno.values());
    }
    public List<Variable> getParametrosLista() {
        return new ArrayList<Variable>(parametros.values());
    }

    @Override
    public String toString() {
        return "Funcion{" + "id=" + id + ", tipoDatoRetorno=" + tipoDatoRetorno + '}';
    }
    
}
