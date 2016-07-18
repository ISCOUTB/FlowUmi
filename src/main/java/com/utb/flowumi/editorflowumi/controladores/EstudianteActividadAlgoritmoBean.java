/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utb.flowumi.editorflowumi.controladores;


import com.utb.flowumi.editorflowumi.facade.EstudianteFacade;
import com.utb.flowumi.editorflowumi.util.Algoritmo;
import com.utb.flowumi.editorflowumi.util.AlgoritmoUtil;
import com.utb.flowumi.editorflowumi.util.Entorno;
import com.utb.flowumi.editorflowumi.util.Funcion;
import com.utb.flowumi.editorflowumi.util.Variable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;

/**
 *
 * @author ideacentre
 */
@ManagedBean
@ViewScoped
public class EstudianteActividadAlgoritmoBean implements Serializable {
    private Algoritmo algoritmo;
    private Entorno entorno;
    private String script;
    private String conecciones;
    private String nodos;
    private String numNodos;
    private Funcion funcionNueva;
    private Variable variableNueva;
    private String entradas;
    public String consola;
    public String nombre;
    private List<Funcion.TipoDatoRetorno> tipoDatoRetorno;
    private List<Variable.TipoDato> tipoDatos;
    private List<Variable.TipoEstructura> tipoEstructuras;
    
    /**
     * Creates a new instance of ProfesorEditorAlgoritmoBean
     */
    public EstudianteActividadAlgoritmoBean() {
    }

    @PostConstruct
    public void init() {
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        Integer idAlgoritmo = (Integer) flash.get("idAlgoritmo");
        nombre = (String) flash.get("nombreAlgoritmo");
        algoritmo = EstudianteFacade.getAlgoritmoEstudainte(idAlgoritmo);
        entorno = AlgoritmoUtil.makeEntorno(algoritmo);
        makeScript();
        funcionNueva = new Funcion();
        variableNueva = new Variable();
        tipoDatoRetorno = new ArrayList<Funcion.TipoDatoRetorno>(0);
        tipoDatoRetorno.addAll(Arrays.asList(Funcion.TipoDatoRetorno.values()));
        tipoDatos = new ArrayList<Variable.TipoDato>(0);
        tipoDatos.addAll(Arrays.asList(Variable.TipoDato.values()));
        tipoEstructuras = new ArrayList<Variable.TipoEstructura>(0);
        tipoEstructuras.addAll(Arrays.asList(Variable.TipoEstructura.values()));
    }

    private void makeScript() {
        script = AlgoritmoUtil.makeScript(entorno.getFunciones().get(entorno.getActual()));
    }

    public Entorno getEntorno() {
        return entorno;
    }

    public void setEntorno(Entorno entorno) {
        this.entorno = entorno;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public Funcion getFuncionActual() {
        return entorno.getFunciones().get(entorno.getActual());
    }

    public List<Funcion> getFunciones() {
        return new ArrayList<Funcion>(entorno.getFunciones().values());
    }

    public Funcion getFuncionNueva() {
        return funcionNueva;
    }

    public void setFuncionNueva(Funcion funcionNueva) {
        this.funcionNueva = funcionNueva;
    }

    public Variable getVariableNueva() {
        return variableNueva;
    }

    public void setVariableNueva(Variable variableNueva) {
        this.variableNueva = variableNueva;
    }

    public List<Funcion.TipoDatoRetorno> getTipoDatoRetorno() {
        return tipoDatoRetorno;
    }

    public void setTipoDatoRetorno(List<Funcion.TipoDatoRetorno> tipoDatoRetorno) {
        this.tipoDatoRetorno = tipoDatoRetorno;
    }

    public List<Variable.TipoDato> getTipoDatos() {
        return tipoDatos;
    }

    public void setTipoDatos(List<Variable.TipoDato> tipoDatos) {
        this.tipoDatos = tipoDatos;
    }

    public List<Variable.TipoEstructura> getTipoEstructuras() {
        return tipoEstructuras;
    }

    public void setTipoEstructuras(List<Variable.TipoEstructura> tipoEstructuras) {
        this.tipoEstructuras = tipoEstructuras;
    }

    public String getEntradas() {
        return entradas;
    }

    public void setEntradas(String entradas) {
        this.entradas = entradas;
    }

    public String getConsola() {
        if(consola != null) {
            consola = consola.replaceAll("(\r\n|\n)", "<br />");
        }
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }
    
    public void crearFuncion() {
        funcionNueva.setParametros(new HashMap<String, Variable>());
        funcionNueva.setVariablesEntorno(new HashMap<String, Variable>());
        funcionNueva.setAlgoritmoConecciones("inicio1$fin1");
        funcionNueva.setAlgoritmoNodos("inicio1$Inicio - 1$50px$50px$\nfin1$Fin - 1$150px$150px$\n");
        funcionNueva.setNumeroUltimoNodo(2);
        entorno.getFunciones().put(funcionNueva.getId(), funcionNueva);
        makeScript();
        funcionNueva = new Funcion();
    }

    public void crearVariable(boolean isVariable) {
        Funcion funcion = entorno.getFunciones().get(variableNueva.getAmbito());
        if (isVariable) {
            funcion.getVariablesEntorno().put(variableNueva.getId(), variableNueva);
        } else {
            funcion.getParametros().put(variableNueva.getId(), variableNueva);
        }

        variableNueva = new Variable();
    }

    public String getConecciones() {
        return conecciones;
    }

    public void setConecciones(String conecciones) {
        this.conecciones = conecciones;
    }

    public String getNodos() {
        return nodos;
    }

    public void setNodos(String nodos) {
        this.nodos = nodos;
    }

    public String getNumNodos() {
        return numNodos;
    }

    public void setNumNodos(String numNodos) {
        this.numNodos = numNodos;
    }

    public void cambiarActual(String id) {
        Funcion funcion = entorno.getFunciones().get(entorno.getActual());
        funcion.setAlgoritmoConecciones(conecciones);
        funcion.setAlgoritmoNodos(nodos);
        funcion.setNumeroUltimoNodo(Long.parseLong(numNodos));
        entorno.setActual(id);
        makeScript();
    }

    public void guardarAlgoritmo() {
        Funcion funcion = entorno.getFunciones().get(entorno.getActual());
        funcion.setAlgoritmoConecciones(conecciones);
        funcion.setAlgoritmoNodos(nodos);
        funcion.setNumeroUltimoNodo(Long.parseLong(numNodos));
        Algoritmo nuevoAlgoritmo = AlgoritmoUtil.guardar(entorno, algoritmo);
        algoritmo.setJsonAlgoritmo(nuevoAlgoritmo.getJsonAlgoritmo());
        algoritmo.setVariables(nuevoAlgoritmo.getVariables());
        EstudianteFacade.guardarAlgoritmo(algoritmo);
        makeScript();
    }

    public void compilarAlgoritmo() {
        Funcion funcion = entorno.getFunciones().get(entorno.getActual());
        funcion.setAlgoritmoConecciones(conecciones);
        funcion.setAlgoritmoNodos(nodos);
        funcion.setNumeroUltimoNodo(Long.parseLong(numNodos));
        Algoritmo nuevoAlgoritmo = AlgoritmoUtil.guardar(entorno, algoritmo);
        algoritmo.setJsonAlgoritmo(nuevoAlgoritmo.getJsonAlgoritmo());
        algoritmo.setVariables(nuevoAlgoritmo.getVariables());
        algoritmo.setAlgoritmotexto(AlgoritmoUtil.makeAlgorithm(entorno).getBytes());
        EstudianteFacade.compilarAlgoritmo(algoritmo);
        makeScript();
    }

    public void correrAlgoritmo() {
        consola = EstudianteFacade.correrAlgoritmo(algoritmo, entradas, nombre);
    }
}