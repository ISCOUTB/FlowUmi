package com.utb.flowumi.editorflowumi.compiler;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ideacentre
 */
public class Compilador {

    private StringBuilder archivoJava;

    public Compilador() {
        archivoJava = new StringBuilder();
        archivoJava.append("public class Main {\n\n");
        archivoJava.append("private static String[] args;\n");
        archivoJava.append("private static String salida;\n\n");
        archivoJava.append("public static void main(String[] args) {\n");
        archivoJava.append("Main.args = args;\n");
        archivoJava.append("salida = \"\";\n");
        archivoJava.append("Principal();\nSystem.out.println(salida);\n}\n" + "");
    }

    void write(int i, String... string) {
        switch (i) {
            case 0:
                archivoJava.append("private static ").append(string[1]).append(" ").append(string[0]).append(" ( ");
                break;
            case 1:
                archivoJava.append(" ) {\n");
                break;
            case 2:
                archivoJava.append("}\n");
                break;
            case 3:
                archivoJava.append(string[1]).append(" ").append(string[0]).append(" ");
                break;
            case 4:
                archivoJava.append(string[1]).append(" ").append(string[0]).append("[] ");
                break;
            case 5:
                archivoJava.append(string[1]).append(" ").append(string[0]).append("[][] ");
                break;
            case 6:
                archivoJava.append(string[1]).append(" ").append(string[0]).append(" = ").append(string[2]).append("; \n");
                break;
            case 7:
                archivoJava.append(string[1]).append("[] ").append(string[0]).append(" = new ").append(string[1]).append(" [").append(string[2]).append("]; \n");
                break;
            case 8:
                archivoJava.append(string[1]).append("[][] ").append(string[0]).append(" = new ").append(string[1]).append(" [").append(string[2]).append("][").append(string[3]).append("]; \n");
                break;
            case 9:
                archivoJava.append(string[0]).append(" = ").append(string[1]).append("; \n");
                break;
            case 10:
                archivoJava.append(string[0]).append("(").append(string[1]).append("){\n");
                break;
            case 11:
                archivoJava.append("else {\n");
                break;
            case 12:
                archivoJava.append("break;\n");
                break;
            case 13:
                lectura(string[0], string[1], string[2]);
                break;
            case 14:
                archivoJava.append("salida += ").append(string[0]).append("+\"\\n\";\n");
                break;
        }
    }

    public StringBuilder getArchivoJava() {
        return archivoJava;
    }

    public void setArchivoJava(StringBuilder archivoJava) {
        this.archivoJava = archivoJava;
    }

    private void lectura(String string0, String string1, String string2) {
        if (string2.equals("long")) {
            archivoJava.append(string1).append("= Long.parseLong(args[").append(string0).append("]);\n");
        }
        if (string2.equals("double")) {
            archivoJava.append(string1).append("= Double.parseDouble(args[").append(string0).append("]);\n");
        }
        if (string2.equals("boolean")) {
            archivoJava.append(string1).append("= Boolean.parseBoolean(args[").append(string0).append("]);\n");
        }
        if (string2.equals("String")) {
            archivoJava.append(string1).append("= args[").append(string0).append("];\n");
        }
        if (string2.equals("char")) {
            archivoJava.append(string1).append("= args[").append(string0).append("].charAt(0);\n");
        }
    }

    public void close() {
        archivoJava.append("\n}");
    }
}
