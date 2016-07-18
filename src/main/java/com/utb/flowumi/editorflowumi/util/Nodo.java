/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utb.flowumi.editorflowumi.util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ideacentre
 */
public class Nodo {
    private String posX;
    private String posY;
    private TipoNodoAlgoritmo tipoNodoAlgoritmo;
    private long nodoId;
    private String Expresion;
    private List<String> targets;
    private String idLarge;

    public Nodo(String line) {
        String[] parts = line.split("[$]");
        idLarge = parts[0];
        tipoNodoAlgoritmo = getType(parts[0]);
        nodoId = Long.parseLong(parts[1].split(" ")[2]);
        posY = parts[2];
        posX = parts[3];
        if (parts.length >= 5) {
            if (!parts[4].equals("")) {
                Expresion = parts[4];
            }
        }
        targets = new ArrayList(0);
    }

    public Nodo(String posX, String posY, TipoNodoAlgoritmo tipoNodoAlgoritmo, long nodoId, String Expresion) {
        this.posX = posX;
        this.posY = posY;
        this.tipoNodoAlgoritmo = tipoNodoAlgoritmo;
        this.nodoId = nodoId;
        this.Expresion = Expresion;
    }

    public Nodo() {
    }

    public String getPosX() {
        return posX;
    }

    public void setPosX(String posX) {
        this.posX = posX;
    }

    public String getPosY() {
        return posY;
    }

    public void setPosY(String posY) {
        this.posY = posY;
    }

    public TipoNodoAlgoritmo getTipoNodoAlgoritmo() {
        return tipoNodoAlgoritmo;
    }

    public void setTipoNodoAlgoritmo(TipoNodoAlgoritmo tipoNodoAlgoritmo) {
        this.tipoNodoAlgoritmo = tipoNodoAlgoritmo;
    }

    public String getExpresion() {
        return Expresion;
    }

    public void setExpresion(String Expresion) {
        this.Expresion = Expresion;
    }

    public List<String> getTargets() {
        return targets;
    }

    public long getNodoId() {
        return nodoId;
    }

    public void setNodoId(long nodoId) {
        this.nodoId = nodoId;
    }

    public String getIdLarge() {
        return idLarge;
    }

    public void setIdLarge(String idLarge) {
        this.idLarge = idLarge;
    }

    private TipoNodoAlgoritmo getType(String id) {
        if (id.startsWith("inicio")) {
            return TipoNodoAlgoritmo.INICIO;
        }
        return TipoNodoAlgoritmo.INICIO;
    }

    @Override
    public String toString() {
        return "Nodo{" + "posX=" + posX + ", posY=" + posY + ", tipoNodoAlgoritmo=" + tipoNodoAlgoritmo + ", nodoId=" + nodoId + ", Expresion=" + Expresion + ", targets=" + targets + ", idLarge=" + idLarge + '}';
    }
    
    
}
