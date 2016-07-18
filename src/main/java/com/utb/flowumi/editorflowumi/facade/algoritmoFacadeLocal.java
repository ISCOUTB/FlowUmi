/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utb.flowumi.editorflowumi.facade;

import com.utb.flowumi.editorflowumi.util.Algoritmo;

/**
 *
 * @author ivan
 */
class algoritmoFacadeLocal {
    static private Algoritmo algoritmo;
    
    static{
        algoritmo = new Algoritmo();
    }

    public static void edit(Algoritmo alg) {
        algoritmo = alg;
    }

    public static Algoritmo find(Integer idAlgoritmo) {
       return algoritmo;
    }

    static public void guardar(Algoritmo alg) {
        algoritmo = alg;
    }
    
}
