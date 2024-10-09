/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1lj.backend.JS;

/**
 *
 * @author alesso
 */
public enum TokenEnumJS {
    // Identificadores
    IDENTIFICADOR("[a-zA-Z]([a-zA-Z]|[0-9]|[_])*"),
    SUMA("+"),
    RESTA("-"),
    MULTIPLICACION("*"),
    DIVISION("/"),
    IGUAL("=="),
    MENOR_QUE("<"),
    MAYOR_QUE(">"),
    MENOR_O_IGUAL_QUE("<="),
    MAYOR_O_IGUAL_QUE(">="),
    DIFERENTE("!="),
    OR("||"),
    AND("&&"),
    NOT("!"),
    INCREMENTO("++"),
    DECREMENTO("--"),
    ENTERO("[0-9]+"),
    DECIMAL("[0-9]+\\.[0-9]+"),
    CADENA("\".*?\"|'[^']*'|`.*?`"),
    BOOLEANO_TRUE("true"),
    BOOLEANO_FALSE("false"),
    FUNCTION("function"),
    CONST("const"),
    LET("let"),
    DOCUMENT("document"),
    EVENT("event"),
    ALERT("alert"),
    FOR("for"),
    WHILE("while"),
    IF("if"),
    ELSE("else"),
    RETURN("return"),
    CONSOLE_LOG("console.log"),
    NULL("null"),
    PARENTESIS_ABIERTO("("),
    PARENTESIS_CERRADO(")"),
    CORCHETE_ABIERTO("["),
    CORCHETE_CERRADO("]"),
    LLAVE_ABIERTO("{"),
    LLAVE_CERRADA("}"),
    ASIGNACION("="),
    PUNTO_Y_COMA(";"),
    COMA(","),
    PUNTO("."),
    DOS_PUNTOS(":"),
    COMENTARIO("comentario");
    
    

    private final String token;

    TokenEnumJS(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
