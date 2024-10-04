/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1lj.backend.JS;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alesso
 */
public class AnalizadorJS {

    public List<String> analizar(String linea) {
        List<String> tokens = new ArrayList<>();
        StringBuilder token = new StringBuilder();
        char[] caracteres = linea.toCharArray();

        for (char c : caracteres) {
            if (esSeparador(c)) {
                if (token.length() > 0) {
                    tokens.add(token.toString());
                    token.setLength(0); 
                }
                if (!Character.isWhitespace(c)) {
                    tokens.add(String.valueOf(c));
                }
            } else {
                token.append(c);
            }
        }

        if (token.length() > 0) {
            tokens.add(token.toString());
        }

        return tokens;
    }

    private boolean esSeparador(char c) {
        return c == '{' || c == '}' || c == '(' || c == ')' || c == ';'
                || c == ':' || c == ',' || c == '.' || c == '='
                || c == '[' || c == ']' || Character.isWhitespace(c);
    }
}
