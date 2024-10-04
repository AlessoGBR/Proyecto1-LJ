/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1lj.backend.CSS;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alesso
 */
public class AnalizadorCSS {

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
        StringBuilder token = new StringBuilder();
        char[] caracteres = linea.toCharArray();

        for (char c : caracteres) {
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

    private String traducirToken(String token) {
        // Aquí se traduce el token basado en el enum de CSS
        switch (token) {
            case "*":
                return TokenEnumCSS.UNIVERSAL.getToken();
            case "body":
                return TokenEnumCSS.BODY.getToken();
            case "header":
                return TokenEnumCSS.HEADER.getToken();
            case "main":
                return TokenEnumCSS.MAIN.getToken();
            case "nav":
                return TokenEnumCSS.NAV.getToken();
            case "aside":
                return TokenEnumCSS.ASIDE.getToken();
            case "div":
                return TokenEnumCSS.DIV.getToken();
            case "ul":
                return TokenEnumCSS.UL.getToken();
            case "ol":
                return TokenEnumCSS.OL.getToken();
            case "li":
                return TokenEnumCSS.LI.getToken();
            case "a":
                return TokenEnumCSS.A.getToken();
            case "h1":
                return TokenEnumCSS.H1.getToken();
            case "h2":
                return TokenEnumCSS.H2.getToken();
            case "h3":
                return TokenEnumCSS.H3.getToken();
            case "h4":
                return TokenEnumCSS.H4.getToken();
            case "h5":
                return TokenEnumCSS.H5.getToken();
            case "h6":
                return TokenEnumCSS.H6.getToken();
            case "p":
                return TokenEnumCSS.P.getToken();
            case "span":
                return TokenEnumCSS.SPAN.getToken();
            case "label":
                return TokenEnumCSS.LABEL.getToken();
            case "textarea":
                return TokenEnumCSS.TEXTAREA.getToken();
            case "button":
                return TokenEnumCSS.BUTTON.getToken();
            case "section":
                return TokenEnumCSS.SECTION.getToken();
            case "article":
                return TokenEnumCSS.ARTICLE.getToken();
            case "footer":
                return TokenEnumCSS.FOOTER.getToken();
            case ".":
                return TokenEnumCSS.CLASS_SELECTOR.getToken();
            case "#":
                return TokenEnumCSS.ID_SELECTOR.getToken();
            case " ":
                return TokenEnumCSS.DESCENDANT.getToken();
            case ">":
                return TokenEnumCSS.CHILD.getToken();
            case "+":
                return TokenEnumCSS.ADJACENT_SIBLING.getToken();
            case "~":
                return TokenEnumCSS.GENERAL_SIBLING.getToken();
            case "color":
                return TokenEnumCSS.COLOR.getToken();
            case "background-color":
                return TokenEnumCSS.BACKGROUND_COLOR.getToken();
            case "background":
                return TokenEnumCSS.BACKGROUND.getToken();
            case "font-size":
                return TokenEnumCSS.FONT_SIZE.getToken();
            case "font-weight":
                return TokenEnumCSS.FONT_WEIGHT.getToken();
            case "font-family":
                return TokenEnumCSS.FONT_FAMILY.getToken();
            case "text-align":
                return TokenEnumCSS.TEXT_ALIGN.getToken();
            case "width":
                return TokenEnumCSS.WIDTH.getToken();
            case "height":
                return TokenEnumCSS.HEIGHT.getToken();
            case "min-width":
                return TokenEnumCSS.MIN_WIDTH.getToken();
            case "min-height":
                return TokenEnumCSS.MIN_HEIGHT.getToken();
            case "max-width":
                return TokenEnumCSS.MAX_WIDTH.getToken();
            case "max-height":
                return TokenEnumCSS.MAX_HEIGHT.getToken();
            case "display":
                return TokenEnumCSS.DISPLAY.getToken();
            case "inline":
                return TokenEnumCSS.INLINE.getToken();
            case "block":
                return TokenEnumCSS.BLOCK.getToken();
            case "inline-block":
                return TokenEnumCSS.INLINE_BLOCK.getToken();
            case "flex":
                return TokenEnumCSS.FLEX.getToken();
            case "grid":
                return TokenEnumCSS.GRID.getToken();
            case "none":
                return TokenEnumCSS.NONE.getToken();
            case "margin":
                return TokenEnumCSS.MARGIN.getToken();
            case "padding":
                return TokenEnumCSS.PADDING.getToken();
            case "border":
                return TokenEnumCSS.BORDER.getToken();
            case "border-color":
                return TokenEnumCSS.BORDER_COLOR.getToken();
            case "border-style":
                return TokenEnumCSS.BORDER_STYLE.getToken();
            case "border-width":
                return TokenEnumCSS.BORDER_WIDTH.getToken();
            case "border-top":
                return TokenEnumCSS.BORDER_TOP.getToken();
            case "border-bottom":
                return TokenEnumCSS.BORDER_BOTTOM.getToken();
            case "border-left":
                return TokenEnumCSS.BORDER_LEFT.getToken();
            case "border-right":
                return TokenEnumCSS.BORDER_RIGHT.getToken();
            case "box-sizing":
                return TokenEnumCSS.BOX_SIZING.getToken();
            case "border-box":
                return TokenEnumCSS.BORDER_BOX.getToken();
            case "position":
                return TokenEnumCSS.POSITION.getToken();
            case "static":
                return TokenEnumCSS.STATIC.getToken();
            case "relative":
                return TokenEnumCSS.RELATIVE.getToken();
            case "absolute":
                return TokenEnumCSS.ABSOLUTE.getToken();
            case "sticky":
                return TokenEnumCSS.STICKY.getToken();
            case "fixed":
                return TokenEnumCSS.FIXED.getToken();
            case "top":
                return TokenEnumCSS.TOP.getToken();
            case "bottom":
                return TokenEnumCSS.BOTTOM.getToken();
            case "left":
                return TokenEnumCSS.LEFT.getToken();
            case "right":
                return TokenEnumCSS.RIGHT.getToken();
            case "z-index":
                return TokenEnumCSS.Z_INDEX.getToken();
            case "justify-content":
                return TokenEnumCSS.JUSTIFY_CONTENT.getToken();
            case "align-items":
                return TokenEnumCSS.ALIGN_ITEMS.getToken();
            case "border-radius":
                return TokenEnumCSS.BORDER_RADIUS.getToken();
            case "auto":
                return TokenEnumCSS.AUTO.getToken();
            case "float":
                return TokenEnumCSS.FLOAT.getToken();
            case "list-style":
                return TokenEnumCSS.LIST_STYLE.getToken();
            case "box-shadow":
                return TokenEnumCSS.BOX_SHADOW.getToken();
            case "px":
                return TokenEnumCSS.PX.getToken();
            case "%":
                return TokenEnumCSS.PERCENTAGE.getToken();
            case "rem":
                return TokenEnumCSS.REM.getToken();
            case "em":
                return TokenEnumCSS.EM.getToken();
            case "vw":
                return TokenEnumCSS.VW.getToken();
            case "vh":
                return TokenEnumCSS.VH.getToken();
            case ":hover":
                return TokenEnumCSS.HOVER.getToken();
            case ":active":
                return TokenEnumCSS.ACTIVE.getToken();
            case ":not":
                return TokenEnumCSS.NOT.getToken();
            case ":nth-child":
                return TokenEnumCSS.NTH_CHILD.getToken();
            case ":odd":
                return TokenEnumCSS.ODD.getToken();
            case ":even":
                return TokenEnumCSS.EVEN.getToken();
            case "::before":
                return TokenEnumCSS.BEFORE.getToken();
            case "::after":
                return TokenEnumCSS.AFTER.getToken();
            case "rgba":
                return TokenEnumCSS.RGBA.getToken();
            case ":":
                return TokenEnumCSS.COLON.getToken();
            case ";":
                return TokenEnumCSS.SEMICOLON.getToken();
            case ",":
                return TokenEnumCSS.COMMA.getToken();
            case "{":
                return TokenEnumCSS.BRACKET_OPEN.getToken();
            case "}":
                return TokenEnumCSS.BRACKET_CLOSE.getToken();
            case "(":
                return TokenEnumCSS.PARENTHESIS_OPEN.getToken();
            case ")":
                return TokenEnumCSS.PARENTHESIS_CLOSE.getToken();
            default:
                return token;
        }
    }
}
