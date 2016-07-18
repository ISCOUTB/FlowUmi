/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utb.flowumi.editorflowumi.facade;

import com.flowumi.compiler.FlowUmiCompilerLexer;
import com.flowumi.compiler.FlowUmiCompilerParser;
import com.utb.flowumi.editorflowumi.compiler.FlowUmiSystemTree;
import com.utb.flowumi.editorflowumi.util.Algoritmo;
import com.utb.flowumi.editorflowumi.util.Generador;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

/**
 *
 * @author ivan
 */
public class EstudianteFacade {
    
    public static void compilarAlgoritmo(Algoritmo algoritmo){
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(algoritmo.getAlgoritmotexto());
            ANTLRInputStream input = new ANTLRInputStream(bis);
            FlowUmiCompilerLexer lexer = new FlowUmiCompilerLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            FlowUmiCompilerParser parser = new FlowUmiCompilerParser(tokens);
            FlowUmiCompilerParser.algoritmo_return r2 = parser.algoritmo();
            CommonTree t2 = (CommonTree) r2.getTree();
            CommonTreeNodeStream nodes2 = new CommonTreeNodeStream(t2);
            FlowUmiSystemTree walker = new FlowUmiSystemTree(nodes2);
            walker.algoritmo();
            algoritmo.setAlgoritmojava(walker.getCompilador().getArchivoJava().toString().getBytes());
            algoritmoFacadeLocal.edit(algoritmo);
        } catch (RecognitionException ex) {
        } catch (IOException ex) {
        }}

    public static String correrAlgoritmo(Algoritmo algoritmo, String entradas, String nombre){
        return Generador.correr(algoritmo.getAlgoritmojava(), entradas, nombre);
}
    public static Algoritmo getAlgoritmoEstudainte(Integer idAlgoritmo){
        return algoritmoFacadeLocal.find(idAlgoritmo);
    }

    public static void guardarAlgoritmo(Algoritmo algoritmo) {
        algoritmoFacadeLocal.guardar(algoritmo);
    }
}
