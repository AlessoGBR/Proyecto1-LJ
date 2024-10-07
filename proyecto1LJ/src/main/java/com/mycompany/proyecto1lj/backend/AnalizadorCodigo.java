/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1lj.backend;

import com.mycompany.proyecto1lj.backend.CSS.AnalizadorCSS;
import com.mycompany.proyecto1lj.backend.HTML.AnalizadorHTML;
import com.mycompany.proyecto1lj.backend.JS.AnalizadorJS;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alesso
 */
public class AnalizadorCodigo {

    private final List<String> htmlCode = new ArrayList<>();
    private final List<String> cssCode = new ArrayList<>();
    private final List<String> jsCode = new ArrayList<>();

    // Analizadores individuales
    private AnalizadorHTML analizadorHTML;
    private AnalizadorCSS analizadorCSS;
    private AnalizadorJS analizadorJS;

    public AnalizadorCodigo() {

    }

    public void procesarCodigo(String codigo) {
        String[] lineas = codigo.split("\n");
        String estadoActual = "";  
o
        for (String linea : lineas) {
            if (linea.startsWith(">>[")) {
                if (linea.contains("[html]")) {
                    estadoActual = "html";
                } else if (linea.contains("[css]")) {
                    estadoActual = "css";
                } else if (linea.contains("[js]")) {
                    estadoActual = "js";
                }
            } else {
                switch (estadoActual) {
                    case "html":
                        htmlCode.add(linea);
                        break;
                    case "css":
                        cssCode.add(linea);
                        break;
                    case "js":
                        jsCode.add(linea);
                        break;
                    default:
                        System.out.println("Estado no reconocido.");
                }
            }
        }

        analizarHTML();
        analizarCSS();
        analizarJS();
    }

    private void analizarHTML() {
        if (!htmlCode.isEmpty()) {
            System.out.println("Iniciando análisis HTML...");
            StringBuilder htmlBuilder = new StringBuilder();
            for (String linea : htmlCode) {
                htmlBuilder.append(linea).append("\n");
            }
            this.analizadorHTML = new AnalizadorHTML(htmlBuilder.toString());
            this.analizadorHTML.analizar();
        }

    }

    private void analizarCSS() {
        if (!cssCode.isEmpty()) {
            System.out.println("Iniciando análisis CSS...");
            StringBuilder cssBuilder = new StringBuilder();
            for (String linea : cssCode) {
                cssBuilder.append(linea).append("\n");
            }
            this.analizadorCSS = new AnalizadorCSS();
            analizadorCSS.procesarLinea(cssBuilder.toString());
        }
    }

    private void analizarJS() {
        if (!jsCode.isEmpty()) {
            System.out.println("Iniciando análisis JS...");
            StringBuilder jsBuilder = new StringBuilder();
            for (String linea : jsCode) {
                jsBuilder.append(linea).append("\n");
            }
            analizadorJS = new AnalizadorJS();
            analizadorJS.analizar(jsBuilder.toString());
        }
    }
}
