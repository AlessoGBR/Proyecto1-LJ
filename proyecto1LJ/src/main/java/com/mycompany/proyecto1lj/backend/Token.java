/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1lj.backend;

import com.mycompany.proyecto1lj.backend.HTML.TokenEnumHTML;

/**
 *
 * @author alesso
 */
public class Token {

    private final TokenEnumHTML type;
    private final String value;

    public Token(TokenEnumHTML type, String value) {
        this.type = type;
        this.value = value;
    }

    public TokenEnumHTML getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Token{"
                + "type=" + type
                + ", value='" + value + '\''
                + '}';
    }
}
