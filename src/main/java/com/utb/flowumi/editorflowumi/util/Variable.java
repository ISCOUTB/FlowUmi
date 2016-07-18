/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utb.flowumi.editorflowumi.util;

/**
 *
 * @author ideacentre
 */
public class Variable {
    private String id;
    private String valorInicial;
    public enum TipoDato {
        CADENA,
        CARACTER,
        LOGICO,
        ENTERO,
        REAL
    }
    private TipoDato tipoDato;
    public enum TipoEstructura {
        NORMAL,
        ARREGLO,
        MATRIZ,
    }
    private TipoEstructura tipoEstructura;
    private int indice1;
    private int indice2;
    private String ambito;

    public Variable() {
    }

    public Variable(String id, String valorInicial, TipoDato tipoDato, TipoEstructura tipoEstructura, String ambito) {
        this.id = id;
        this.valorInicial = valorInicial;
        this.tipoDato = tipoDato;
        this.tipoEstructura = tipoEstructura;
        this.ambito = ambito;
    }

    public Variable(String id, String valorInicial, TipoDato tipoDato, TipoEstructura tipoEstructura, int indice1, String ambito) {
        this.id = id;
        this.valorInicial = valorInicial;
        this.tipoDato = tipoDato;
        this.tipoEstructura = tipoEstructura;
        this.indice1 = indice1;
        this.ambito = ambito;
    }

    public Variable(String id, String valorInicial, TipoDato tipoDato, TipoEstructura tipoEstructura, int indice1, int indice2, String ambito) {
        this.id = id;
        this.valorInicial = valorInicial;
        this.tipoDato = tipoDato;
        this.tipoEstructura = tipoEstructura;
        this.indice1 = indice1;
        this.indice2 = indice2;
        this.ambito = ambito;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(String valorInicial) {
        this.valorInicial = valorInicial;
    }

    public TipoDato getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(TipoDato tipoDato) {
        this.tipoDato = tipoDato;
    }

    public TipoEstructura getTipoEstructura() {
        return tipoEstructura;
    }

    public void setTipoEstructura(TipoEstructura tipoEstructura) {
        this.tipoEstructura = tipoEstructura;
    }

    public int getIndice1() {
        return indice1;
    }

    public void setIndice1(int indice1) {
        this.indice1 = indice1;
    }

    public int getIndice2() {
        return indice2;
    }

    public void setIndice2(int indice2) {
        this.indice2 = indice2;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    @Override
    public String toString() {
        return "Variable{" + "id=" + id + ", valorInicial=" + valorInicial + ", tipoDato=" + tipoDato + ", tipoEstructura=" + tipoEstructura + ", indice1=" + indice1 + ", indice2=" + indice2 + ", ambito=" + ambito + '}';
    }
    
}
