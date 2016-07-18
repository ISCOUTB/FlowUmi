/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utb.flowumi.editorflowumi.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ideacentre
 */
public class Generador {

    private static BufferedReader stdout; //lector de las lineas de salidas del shell
    private static BufferedReader stderr; //lector de las lineas de error del shell

    public static byte[] compilar(byte[] algoritmo, String nombre) {
        byte[] archivoclass = null;
        try {
            String app_conf = System.getProperty("APP_CONF");
            //javac -g Foo.java
            File dir = new File(app_conf
                    + System.getProperty("file.separator") + "recursos"
                    + System.getProperty("file.separator") + "flowumi"
                    + System.getProperty("file.separator") + nombre);
            dir.mkdir();
            
            File algoritmoText = new File(app_conf
                    + System.getProperty("file.separator") + "recursos"
                    + System.getProperty("file.separator") + "flowumi"
                    + System.getProperty("file.separator") + nombre
                    + System.getProperty("file.separator") + "Main.java");
            FileOutputStream ouputStream = new FileOutputStream(algoritmoText);
            ouputStream.write(algoritmo);
            ouputStream.close();
            Process p;
            Runtime r;
            r = Runtime.getRuntime();
            p = r.exec("javac -g " + algoritmoText.getAbsolutePath());
            p.waitFor();
            File file = new File(app_conf
                    + System.getProperty("file.separator") + "recursos"
                    + System.getProperty("file.separator") + "flowumi"
                    + System.getProperty("file.separator") + nombre
                    + System.getProperty("file.separator") + "Main.class");
            FileInputStream fileInputStream = new FileInputStream(app_conf
                    + System.getProperty("file.separator") + "recursos"
                    + System.getProperty("file.separator") + "flowumi"
                    + System.getProperty("file.separator") + nombre
                    + System.getProperty("file.separator") + "Main.class");
            archivoclass = new byte[(int) file.length()];
            fileInputStream.read(archivoclass);
            fileInputStream.close();
        } catch (InterruptedException ex) {
            Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return archivoclass;
    }

    public static String correr(byte[] algoritmoclass, String entradas, String nombre) {
        compilar(algoritmoclass, nombre);
        final StringBuilder salida = new StringBuilder();
        //java fuente1
        try {
            String app_conf = System.getProperty("APP_CONF");
            Process p;
            Runtime r;
            OutputStream os;
            PrintStream ps2; //imprimira en el shell los parametros pasados
            InputStream is;
            r = Runtime.getRuntime();
            p = r.exec("java -cp " + app_conf
                    + System.getProperty("file.separator") + "recursos"
                    + System.getProperty("file.separator") + "flowumi"
                    + System.getProperty("file.separator") + nombre
                    + " Main" + " " + entradas);
            os = p.getOutputStream();
            is = p.getInputStream();
            stdout = new BufferedReader(new InputStreamReader(is));
            is = p.getErrorStream();
            stderr = new BufferedReader(new InputStreamReader(is));
            /*
             * este hilo maneja el stream de salida
             */
            Thread stdoutThread = new Thread() {
                @Override
                public void run() {
                    try {
                        int l;
                        String line;
                        for (l = 0; (line = stdout.readLine()) != null;) {
                            if (line.length() > 0) {
                                l++;
                            }
                            salida.append(line);
                        }
                        stdout.close();
                    } catch (IOException ie) {
                    }
                }
            };
            stdoutThread.start();
            /*
             * este hilo maneja el stream de error
             */
            Thread stderrThread = new Thread() {
                @Override
                public void run() {
                    try {
                        int l;
                        String line;
                        for (l = 0; (line = stderr.readLine()) != null;) {
                            if (line.length() > 0) {
                                l++;
                                salida.append(line);
                            }
                        }
                        stderr.close();
                    } catch (IOException ie) {
                    }
                }
            };
            stderrThread.start();



            p.waitFor();
        } catch (InterruptedException ex) {
            Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
        }

        return salida.toString();
    }
}
