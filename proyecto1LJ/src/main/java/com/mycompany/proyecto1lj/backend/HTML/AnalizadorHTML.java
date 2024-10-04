/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1lj.backend.HTML;

import com.mycompany.proyecto1lj.backend.Token;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alesso
 */
public class AnalizadorHTML {

    public String procesarLinea(String linea) {
        StringBuilder resultado = new StringBuilder();
        List<String> tokens = tokenizar(linea);

        for (String token : tokens) {
            resultado.append(traducirToken(token)).append(" ");
        }

        return resultado.toString().trim();
    }

    private List<String> tokenizar(String linea) {
        List<String> tokens = new ArrayList<>();
        
        for (String token : linea.split(" ")) {
            tokens.add(token.trim());
        }
        return tokens;
    }

    private String traducirToken(String token) {
        // Aquí se traduce el token basado en el enum de HTML
        switch (token) {
            case "<principal>":
                return TokenEnumHTML.PRINCIPAL_OPEN.getToken();
            case "</principal>":
                return TokenEnumHTML.PRINCIPAL_CLOSE.getToken();
            case "<encabezado>":
                return TokenEnumHTML.ENCABEZADO_OPEN.getToken();
            case "</encabezado>":
                return TokenEnumHTML.ENCABEZADO_CLOSE.getToken();
            case "<navegacion>":
                return TokenEnumHTML.NAVEGACION_OPEN.getToken();
            case "</navegacion>":
                return TokenEnumHTML.NAVEGACION_CLOSE.getToken();
            case "<apartado>":
                return TokenEnumHTML.APARTADO_OPEN.getToken();
            case "</apartado>":
                return TokenEnumHTML.APARTADO_CLOSE.getToken();
            case "<listaordenada>":
                return TokenEnumHTML.LISTAORDENADA_OPEN.getToken();
            case "</listaordenada>":
                return TokenEnumHTML.LISTAORDENADA_CLOSE.getToken();
            case "<listadesordenada>":
                return TokenEnumHTML.LISTADESORDENADA_OPEN.getToken();
            case "</listadesordenada>":
                return TokenEnumHTML.LISTADESORDENADA_CLOSE.getToken();
            case "<itemlista>":
                return TokenEnumHTML.ITEMLISTA_OPEN.getToken();
            case "</itemlista>":
                return TokenEnumHTML.ITEMLISTA_CLOSE.getToken();
            case "<anclaje>":
                return TokenEnumHTML.ANCLAJE_OPEN.getToken();
            case "</anclaje>":
                return TokenEnumHTML.ANCLAJE_CLOSE.getToken();
            case "<contenedor>":
                return TokenEnumHTML.CONTENEDOR_OPEN.getToken();
            case "</contenedor>":
                return TokenEnumHTML.CONTENEDOR_CLOSE.getToken();
            case "<seccion>":
                return TokenEnumHTML.SECCION_OPEN.getToken();
            case "</seccion>":
                return TokenEnumHTML.SECCION_CLOSE.getToken();
            case "<articulo>":
                return TokenEnumHTML.ARTICULO_OPEN.getToken();
            case "</articulo>":
                return TokenEnumHTML.ARTICULO_CLOSE.getToken();
            case "<titulo1>":
                return TokenEnumHTML.TITULO1_OPEN.getToken();
            case "<titulo2>":
                return TokenEnumHTML.TITULO2_OPEN.getToken();
            case "<titulo3>":
                return TokenEnumHTML.TITULO3_OPEN.getToken();
            case "<titulo4>":
                return TokenEnumHTML.TITULO4_OPEN.getToken();
            case "<titulo5>":
                return TokenEnumHTML.TITULO5_OPEN.getToken();
            case "<titulo6>":
                return TokenEnumHTML.TITULO6_OPEN.getToken();
            case "<parrafo>":
                return TokenEnumHTML.PARRAFO_OPEN.getToken();
            case "</parrafo>":
                return TokenEnumHTML.PARRAFO_CLOSE.getToken();
            case "<span>":
                return TokenEnumHTML.SPAN_OPEN.getToken();
            case "</span>":
                return TokenEnumHTML.SPAN_CLOSE.getToken();
            case "<entrada/>":
                return TokenEnumHTML.ENTRADA_SELF.getToken();
            case "<formulario>":
                return TokenEnumHTML.FORMULARIO_OPEN.getToken();
            case "</formulario>":
                return TokenEnumHTML.FORMULARIO_CLOSE.getToken();
            case "<label>":
                return TokenEnumHTML.LABEL_OPEN.getToken();
            case "</label>":
                return TokenEnumHTML.LABEL_CLOSE.getToken();
            case "<area/>":
                return TokenEnumHTML.AREA_SELF.getToken();
            case "<boton>":
                return TokenEnumHTML.BOTON_OPEN.getToken();
            case "</boton>":
                return TokenEnumHTML.BOTON_CLOSE.getToken();
            case "<piepagina>":
                return TokenEnumHTML.PIEPAGINA_OPEN.getToken();
            case "</piepagina>":
                return TokenEnumHTML.PIEPAGINA_CLOSE.getToken();
            default:
                if (token.startsWith("<") && token.endsWith("/>")) {
                    return token; 
                }
                return token; 
        }
    }
}
