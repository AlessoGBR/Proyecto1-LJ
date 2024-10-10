/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1lj.backend.HTML;

import com.mycompany.proyecto1lj.backend.Token;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author alesso
 */
public class TraductorHTML {

    private static final HashMap<String, String> traducciones;

    static {
        traducciones = new HashMap<>();
        traducciones.put("principal", "main");
        traducciones.put("encabezado", "header");
        traducciones.put("navegacion", "nav");
        traducciones.put("apartado", "aside");
        traducciones.put("listaordenada", "ol");
        traducciones.put("listadesordenada", "ul");
        traducciones.put("itemlista", "li");
        traducciones.put("anclaje", "a");
        traducciones.put("contenedor", "div");
        traducciones.put("seccion", "section");
        traducciones.put("articulo", "article");
        traducciones.put("titulo1", "h1");
        traducciones.put("titulo2", "h2");
        traducciones.put("titulo3", "h3");
        traducciones.put("titulo4", "h4");
        traducciones.put("titulo5", "h5");
        traducciones.put("titulo6", "h6");
        traducciones.put("parrafo", "p");
        traducciones.put("span", "span");
        traducciones.put("entrada", "input");
        traducciones.put("formulario", "form");
        traducciones.put("label", "label");
        traducciones.put("area", "textarea");
        traducciones.put("boton", "button");
        traducciones.put("piepagina", "footer");
    }

    public String traducir(List<Token> tokens) {
        StringBuilder resultado = new StringBuilder();
        boolean esEtiquetaDeCierre = false;
        String nombreEtiqueta = "";

        for (Token token : tokens) {
            TokenEnumHTML tipo = token.getTypeHTML();
            String valor = token.getValue();

            switch (tipo) {
                case APERTURA:
                    resultado.append("<");
                    esEtiquetaDeCierre = false;
                    break;

                case CIERRE:
                    resultado.append(">");
                    break;

                case DIAGONAL:
                    esEtiquetaDeCierre = true;
                    resultado.insert(resultado.length() - nombreEtiqueta.length(), "/");
                    break;

                case VALOR_ATRIBUTO:
                    resultado.append("\"").append(valor).append("\"");
                    break;

                case ATRIBUTO:
                    resultado.append(" ").append(valor);
                    break;

                case PRINCIPAL:
                case ENCABEZADO:
                case NAVEGACION:
                case APARTADO:
                case LISTA_ORDENADA:
                case LISTA_DESORDENADA:
                case ITEM:
                case ANCLAJE:
                case CONTENEDOR:
                case SECCION:
                case ARTICULO:
                case PARRAFO:
                case TITULO1:
                case TITULO2:
                case TITULO3:
                case TITULO4:
                case TITULO5:
                case TITULO6:
                case SPAN:
                case ENTRADA:
                case FORMULARIO:
                case LABEL:
                case AREA:
                case BOTON:
                case PIE_PAGINA:
                    nombreEtiqueta = traducciones.getOrDefault(valor, valor); 
                    resultado.append(nombreEtiqueta); 
                    break;

                default:
                    resultado.append(valor); 
                    break;
            }
        }

        return resultado.toString();
    }

}
