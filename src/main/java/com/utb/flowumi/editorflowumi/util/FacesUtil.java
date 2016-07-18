package com.utb.flowumi.editorflowumi.util;

import static javax.faces.application.FacesMessage.*;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author jssepulveda
 */
public class FacesUtil {
    public static final String SEPARATOR = "-";
    
    /**
     * Muestra un mensaje de error en la pagina 
     * @param message: representa el mensaje a mostrar
     * @param detail: representa los posibles detalles del mensaje (opcional)
     */
    public static void addErrorMessage(String message, String details) {        
        addMessage(SEVERITY_ERROR, message, details);
    }
    
    /**
     * Muestra un mensaje de error en la pagina, pero sin detalles
     * @param message 
     */
    public static void addErrorMessage(String message) {
        addMessage(SEVERITY_ERROR, message, null);
    }
    
    
    /**
     * Muestra un mensaje de informacion en la pagina 
     * @param message: representa el mensaje a mostrar
     * @param detail: representa los posibles detalles del mensaje (opcional)
     */
    public static void addInfoMessage(String message, String details) {        
        addMessage(SEVERITY_INFO, message, details);
    }
    
    /**
     * Muestra un mensaje de nformacion en la pagina, pero sin detalles
     * @param message 
     */
    public static void addInfoMessage(String message) {
        addMessage(SEVERITY_INFO, message, null);
    }
    
    
    /**
     * Muestra un mensaje de advertencia en la pagina 
     * @param message: representa el mensaje a mostrar
     * @param detail: representa los posibles detalles del mensaje (opcional)
     */
    public static void addWarnMessage(String message, String details) {        
        addMessage(SEVERITY_WARN, message, details);
    }
    
    /**
     * Muestra un mensaje de advertencia en la pagina, pero sin detalles
     * @param message 
     */
    public static void addWarnMessage(String message) {
        addMessage(SEVERITY_WARN, message, null);
    }
    
    
    private static void addMessage(Severity severity, String message, String details) {
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(severity, message, details));
    }
}
