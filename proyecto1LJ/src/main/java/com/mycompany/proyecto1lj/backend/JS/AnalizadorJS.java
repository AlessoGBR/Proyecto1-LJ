/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1lj.backend.JS;

import com.mycompany.proyecto1lj.backend.Token;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alesso
 */
public class AnalizadorJS {

    private List<Token> tokens;

    public List<Token> analizar(String linea) {
        tokens = new ArrayList<>();
        StringBuilder token = new StringBuilder();
        char[] caracteres = linea.toCharArray();
        boolean enComentario = false;

        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];

            if (!enComentario && c == '/' && i + 1 < caracteres.length && caracteres[i + 1] == '/') {
                enComentario = true;
                token.append("//");
                i++;
                continue;
            }

            if (enComentario) {
                if (c == '\n') {
                    agregarToken(token.toString());
                    token.setLength(0);
                    enComentario = false;
                } else {
                    token.append(c);
                }
            } else if (esSeparador(c)) {
                if (token.length() > 0) {
                    agregarToken(token.toString());
                    token.setLength(0);
                }
                if (!Character.isWhitespace(c)) {
                    agregarToken(String.valueOf(c));
                }
            } else {
                token.append(c);
            }
        }

        if (token.length() > 0) {
            agregarToken(token.toString());
        }

        return tokens;
    }

    private boolean esSeparador(char c) {
        return c == '{' || c == '}' || c == '(' || c == ')' || c == ';'
                || c == ':' || c == ',' || c == '.' || c == '='
                || c == '[' || c == ']' || Character.isWhitespace(c);
    }

    private void agregarToken(String token) {
        TokenEnumJS tokenEnum = switch (token) {
            case "function" ->
                TokenEnumJS.FUNCTION;
            case "{" ->
                TokenEnumJS.LLAVE_ABIERTO;
            case "}" ->
                TokenEnumJS.LLAVE_CERRADA;
            case "[" ->
                TokenEnumJS.CORCHETE_ABIERTO;
            case "]" ->
                TokenEnumJS.CORCHETE_CERRADO;
            case "(" ->
                TokenEnumJS.PARENTESIS_ABIERTO;
            case ")" ->
                TokenEnumJS.PARENTESIS_CERRADO;
            case ";" ->
                TokenEnumJS.PUNTO_Y_COMA;
            case "," ->
                TokenEnumJS.COMA;
            case "." ->
                TokenEnumJS.PUNTO;
            case ":" ->
                TokenEnumJS.DOS_PUNTOS;
            case "=" ->
                TokenEnumJS.ASIGNACION;
            case "+" ->
                TokenEnumJS.SUMA;
            case "-" ->
                TokenEnumJS.RESTA;
            case "*" ->
                TokenEnumJS.MULTIPLICACION;
            case "/" ->
                TokenEnumJS.DIVISION;
            case "if" ->
                TokenEnumJS.IF;
            case "else" ->
                TokenEnumJS.ELSE;
            case "let" ->
                TokenEnumJS.LET;
            case "const" ->
                TokenEnumJS.CONST;
            case "document" ->
                TokenEnumJS.DOCUMENT;
            case "event" ->
                TokenEnumJS.EVENT;
            case "alert" ->
                TokenEnumJS.ALERT;
            case "for" ->
                TokenEnumJS.FOR;
            case "while" ->
                TokenEnumJS.WHILE;
            case "return" ->
                TokenEnumJS.RETURN;
            case "console.log" ->
                TokenEnumJS.CONSOLE_LOG;
            case "==" ->
                TokenEnumJS.IGUAL;
            case ">" ->
                TokenEnumJS.MAYOR_QUE;
            case "<" ->
                TokenEnumJS.MENOR_QUE;
            case "<=" ->
                TokenEnumJS.MENOR_O_IGUAL_QUE;
            case ">=" ->
                TokenEnumJS.MAYOR_O_IGUAL_QUE;
            case "!=" ->
                TokenEnumJS.DIFERENTE;
            case "||" ->
                TokenEnumJS.OR;
            case "&&" ->
                TokenEnumJS.AND;
            case "!" ->
                TokenEnumJS.NOT;
            case "++" ->
                TokenEnumJS.INCREMENTO;
            case "--" ->
                TokenEnumJS.DECREMENTO;
            default ->
                TokenEnumJS.IDENTIFICADOR;
        };

        tokens.add(new Token(token, tokenEnum));
        System.out.println("Token encontrado: " + token);
    }

    public List<Token> getTokens() {
        return tokens;
    }

}
