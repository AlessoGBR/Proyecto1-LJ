/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1lj.backend;

import com.mycompany.proyecto1lj.backend.CSS.TokenEnumCSS;
import com.mycompany.proyecto1lj.backend.HTML.TokenEnumHTML;
import com.mycompany.proyecto1lj.backend.JS.TokenEnumJS;

/**
 *
 * @author alesso
 */
public class Token {

    private TokenEnumHTML typeHTML;
    private TokenEnumCSS typeCSS;
    private TokenEnumJS typeJS;
    private String value;

    public Token(TokenEnumHTML type, String value) {
        this.typeHTML = type;
        this.value = value;
    }

    public Token(TokenEnumCSS type, String value) {
        this.typeCSS = type;
        this.value = value;
    }

    public Token(String valor, TokenEnumJS typeJS) {
        this.typeJS = typeJS;
        this.value = valor;
    }

    public TokenEnumHTML getTypeHTML() {
        return typeHTML;
    }

    public TokenEnumCSS getTypeCSS() {
        return typeCSS;
    }

    public TokenEnumJS getTypeJS() {
        return typeJS;
    }

    public String getValue() {
        return value;
    }

    public String toStringHTML() {
        return "Token{"
                + "type=" + typeHTML
                + ", value='" + value + '\''
                + '}';
    }
    
    public String toStringCSS() {
        return "Token{"
                + "type=" + typeCSS
                + ", value='" + value + '\''
                + '}';
    }
    
    public String toStringJS() {
        return "Token{"
                + "type=" + typeJS
                + ", value='" + value + '\''
                + '}';
    }
}
