/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1lj.backend.CSS;

import com.mycompany.proyecto1lj.backend.Token;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alesso
 */
public class AnalizadorCSS {

    public List<Token> procesarLinea(String linea) {
        List<Token> tokens = new ArrayList<>();
        List<String> elementos = tokenizar(linea);
        for (String elemento : elementos) {
            if (!elemento.startsWith("//")) {  // Ignora comentarios
                tokens.add(obtenerTokens(elemento));
            }
        }
        return tokens;
    }

    private List<String> tokenizar(String linea) {
        List<String> tokens = new ArrayList<>();
        StringBuilder token = new StringBuilder();
        char[] caracteres = linea.toCharArray();
        boolean dentroDeComentario = false;

        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];

            if (i < caracteres.length - 1 && c == '/' && caracteres[i + 1] == '/') {
                dentroDeComentario = true;
                token.append("//");
                tokens.add(token.toString());
                token.setLength(0);
                i++;
                continue;
            }

            if (i < caracteres.length - 1 && c == '*' && caracteres[i + 1] == '/') {
                dentroDeComentario = false;
                i++;
                continue;
            }

            if (dentroDeComentario) {
                continue;
            }

            if (c == '{' || c == '}' || c == '(' || c == ')' || c == ';' || c == ':' || c == ',' || Character.isWhitespace(c)) {
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

    private Token obtenerTokens(String token) {
        TokenEnumCSS tipo = null;
        System.out.println("Token encontrado: " + token);
        tipo = switch (token) {
            case "*" -> TokenEnumCSS.UNIVERSAL;
            case "body" -> TokenEnumCSS.BODY;
            case "header" -> TokenEnumCSS.HEADER;
            case "main" -> TokenEnumCSS.MAIN;
            case "nav" -> TokenEnumCSS.NAV;
            case "aside" -> TokenEnumCSS.ASIDE;
            case "div" -> TokenEnumCSS.DIV;
            case "ul" -> TokenEnumCSS.UL;
            case "ol" -> TokenEnumCSS.OL;
            case "li" -> TokenEnumCSS.LI;
            case "a" -> TokenEnumCSS.A;
            case "h1" -> TokenEnumCSS.H1;
            case "h2" -> TokenEnumCSS.H2;
            case "h3" -> TokenEnumCSS.H3;
            case "h4" -> TokenEnumCSS.H4;
            case "h5" -> TokenEnumCSS.H5;
            case "h6" -> TokenEnumCSS.H6;
            case "p" -> TokenEnumCSS.P;
            case "span" -> TokenEnumCSS.SPAN;
            case "label" -> TokenEnumCSS.LABEL;
            case "textarea" -> TokenEnumCSS.TEXTAREA;
            case "button" -> TokenEnumCSS.BUTTON;
            case "section" -> TokenEnumCSS.SECTION;
            case "article" -> TokenEnumCSS.ARTICLE;
            case "footer" -> TokenEnumCSS.FOOTER;
            case "." -> TokenEnumCSS.CLASS_SELECTOR;
            case "#" -> TokenEnumCSS.ID_SELECTOR;
            case " " -> TokenEnumCSS.DESCENDANT;
            case ">" -> TokenEnumCSS.CHILD;
            case "+" -> TokenEnumCSS.ADJACENT_SIBLING;
            case "~" -> TokenEnumCSS.GENERAL_SIBLING;
            case "color" -> TokenEnumCSS.COLOR;
            case "background-color" -> TokenEnumCSS.BACKGROUND_COLOR;
            case "background" -> TokenEnumCSS.BACKGROUND;
            case "font-size" -> TokenEnumCSS.FONT_SIZE;
            case "font-weight" -> TokenEnumCSS.FONT_WEIGHT;
            case "font-family" -> TokenEnumCSS.FONT_FAMILY;
            case "text-align" -> TokenEnumCSS.TEXT_ALIGN;
            case "width" -> TokenEnumCSS.WIDTH;
            case "height" -> TokenEnumCSS.HEIGHT;
            case "min-width" -> TokenEnumCSS.MIN_WIDTH;
            case "min-height" -> TokenEnumCSS.MIN_HEIGHT;
            case "max-width" -> TokenEnumCSS.MAX_WIDTH;
            case "max-height" -> TokenEnumCSS.MAX_HEIGHT;
            case "display" -> TokenEnumCSS.DISPLAY;
            case "inline" -> TokenEnumCSS.INLINE;
            case "block" -> TokenEnumCSS.BLOCK;
            case "inline-block" -> TokenEnumCSS.INLINE_BLOCK;
            case "flex" -> TokenEnumCSS.FLEX;
            case "grid" -> TokenEnumCSS.GRID;
            case "none" -> TokenEnumCSS.NONE;
            case "margin" -> TokenEnumCSS.MARGIN;
            case "padding" -> TokenEnumCSS.PADDING;
            case "border" -> TokenEnumCSS.BORDER;
            case "border-color" -> TokenEnumCSS.BORDER_COLOR;
            case "border-style" -> TokenEnumCSS.BORDER_STYLE;
            case "border-width" -> TokenEnumCSS.BORDER_WIDTH;
            case "border-top" -> TokenEnumCSS.BORDER_TOP;
            case "border-bottom" -> TokenEnumCSS.BORDER_BOTTOM;
            case "border-left" -> TokenEnumCSS.BORDER_LEFT;
            case "border-right" -> TokenEnumCSS.BORDER_RIGHT;
            case "box-sizing" -> TokenEnumCSS.BOX_SIZING;
            case "border-box" -> TokenEnumCSS.BORDER_BOX;
            case "position" -> TokenEnumCSS.POSITION;
            case "static" -> TokenEnumCSS.STATIC;
            case "relative" -> TokenEnumCSS.RELATIVE;
            case "absolute" -> TokenEnumCSS.ABSOLUTE;
            case "sticky" -> TokenEnumCSS.STICKY;
            case "fixed" -> TokenEnumCSS.FIXED;
            case "top" -> TokenEnumCSS.TOP;
            case "bottom" -> TokenEnumCSS.BOTTOM;
            case "left" -> TokenEnumCSS.LEFT;
            case "right" -> TokenEnumCSS.RIGHT;
            case "z-index" -> TokenEnumCSS.Z_INDEX;
            case "justify-content" -> TokenEnumCSS.JUSTIFY_CONTENT;
            case "align-items" -> TokenEnumCSS.ALIGN_ITEMS;
            case "border-radius" -> TokenEnumCSS.BORDER_RADIUS;
            case "auto" -> TokenEnumCSS.AUTO;
            case "float" -> TokenEnumCSS.FLOAT;
            case "list-style" -> TokenEnumCSS.LIST_STYLE;
            case "box-shadow" -> TokenEnumCSS.BOX_SHADOW;
            case "px" -> TokenEnumCSS.PX;
            case "%" -> TokenEnumCSS.PERCENTAGE;
            case "rem" -> TokenEnumCSS.REM;
            case "em" -> TokenEnumCSS.EM;
            case "vw" -> TokenEnumCSS.VW;
            case "vh" -> TokenEnumCSS.VH;
            case ":hover" -> TokenEnumCSS.HOVER;
            case ":active" -> TokenEnumCSS.ACTIVE;
            case ":not" -> TokenEnumCSS.NOT;
            case ":nth-child" -> TokenEnumCSS.NTH_CHILD;
            case ":odd" -> TokenEnumCSS.ODD;
            case ":even" -> TokenEnumCSS.EVEN;
            case "::before" -> TokenEnumCSS.BEFORE;
            case "::after" -> TokenEnumCSS.AFTER;
            case "rgba" -> TokenEnumCSS.RGBA;
            case ":" -> TokenEnumCSS.COLON;
            case ";" -> TokenEnumCSS.SEMICOLON;
            case "," -> TokenEnumCSS.COMMA;
            case "{" -> TokenEnumCSS.BRACKET_OPEN;
            case "}" -> TokenEnumCSS.BRACKET_CLOSE;
            case "(" -> TokenEnumCSS.PARENTHESIS_OPEN;
            case ")" -> TokenEnumCSS.PARENTHESIS_CLOSE;
            default -> TokenEnumCSS.ERROR;
        };

        return new Token(tipo, token);
    }
    
    
}
