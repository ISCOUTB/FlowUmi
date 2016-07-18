/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utb.flowumi.editorflowumi.util;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ideacentre
 */
public class Algoritmo implements Serializable {
    private byte[] jsonAlgoritmo;
    private byte[] variables;
    private byte[] algoritmotexto;
    private byte[] algoritmojava;

    public Algoritmo() {
    }
    
    public byte[] getJsonAlgoritmo() {
        return jsonAlgoritmo;
    }

    public void setJsonAlgoritmo(byte[] jsonAlgoritmo) {
        this.jsonAlgoritmo = jsonAlgoritmo;
    }

    public byte[] getVariables() {
        return variables;
    }

    public void setVariables(byte[] variables) {
        this.variables = variables;
    }

    public byte[] getAlgoritmotexto() {
        return algoritmotexto;
    }

    public void setAlgoritmotexto(byte[] algoritmotexto) {
        this.algoritmotexto = algoritmotexto;
    }

    public byte[] getAlgoritmojava() {
        return algoritmojava;
    }

    public void setAlgoritmojava(byte[] algoritmojava) {
        this.algoritmojava = algoritmojava;
    }
    
}
