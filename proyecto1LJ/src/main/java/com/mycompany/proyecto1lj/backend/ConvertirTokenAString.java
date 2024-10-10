/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1lj.backend;

import java.util.List;

/**
 *
 * @author alesso
 */
public class ConvertirTokenAString {

    public ConvertirTokenAString() {

    }

    public String convertirTokensJS(List<Token> tokens) {
        StringBuilder codigo = new StringBuilder();
        boolean esComentario = false;

        for (Token token : tokens) {
            String valor = token.getValue();

            switch (token.getTypeJS()) {
                case FUNCTION:
                case CONST:
                case DOCUMENT:
                case IDENTIFICADOR:
                    codigo.append(valor).append(" ");
                    break;
                case PARENTESIS_ABIERTO:
                case PARENTESIS_CERRADO:
                    codigo.append(valor);
                    break;
                case LLAVE_ABIERTO:
                    codigo.append(valor).append("\n");
                    break;
                case LLAVE_CERRADA:
                    codigo.append(valor);
                    break;
                case ASIGNACION:
                    codigo.append(" ").append(valor).append(" ");
                    break;
                case PUNTO:
                    codigo.append(valor);
                    break;
                case MAYOR_QUE:
                    codigo.append(valor);
                    break;
                case PUNTO_Y_COMA:
                    codigo.append(valor).append("\n");
                    break;
                case COMENTARIO:
                    codigo.append(valor).append("\n");
                    esComentario = true;
                    break;
                default:
                    codigo.append(valor).append(" ");
                    break;
            }

            if (esComentario) {
                codigo.append("\n");
                esComentario = false;
            }
        }

        return codigo.toString();
    }

    public String convertirTokensCSS(List<Token> tokens) {
        StringBuilder sb = new StringBuilder();
        int indentLevel = 0; // Para manejar la indentación

        for (Token token : tokens) {
            switch (token.getTypeCSS()) {
                case UNIVERSAL:
                case BODY:
                case HEADER:
                case MAIN:
                case NAV:
                case ASIDE:
                case DIV:
                case UL:
                case OL:
                case LI:
                case A:
                case H1:
                case H2:
                case H3:
                case H4:
                case H5:
                case H6:
                case P:
                case SPAN:
                case LABEL:
                case TEXTAREA:
                case BUTTON:
                case SECTION:
                case ARTICLE:
                case FOOTER:
                case CLASS_SELECTOR:
                case ID_SELECTOR:
                    sb.append(token.getValue()).append(" {\n");
                    indentLevel++;
                    break;

                case DISPLAY:
                case FONT_SIZE:
                case FONT_WEIGHT:
                case FONT_FAMILY:
                case COLOR:
                case BACKGROUND_COLOR:
                case BACKGROUND:
                case TEXT_ALIGN:
                case WIDTH:
                case HEIGHT:
                case MIN_WIDTH:
                case MIN_HEIGHT:
                case MAX_WIDTH:
                case MAX_HEIGHT:
                case MARGIN:
                case PADDING:
                case BORDER:
                case BORDER_COLOR:
                case BORDER_STYLE:
                case BORDER_WIDTH:
                case BORDER_TOP:
                case BORDER_BOTTOM:
                case BORDER_LEFT:
                case BORDER_RIGHT:
                case BOX_SHADOW:
                case POSITION:
                case STATIC:
                case RELATIVE:
                case ABSOLUTE:
                case STICKY:
                case FIXED:
                case TOP:
                case BOTTOM:
                case LEFT:
                case RIGHT:
                case Z_INDEX:
                case JUSTIFY_CONTENT:
                case ALIGN_ITEMS:
                case BORDER_RADIUS:
                case FLOAT:
                case LIST_STYLE:
                case AUTO:
                    sb.append(getIndentation(indentLevel))
                            .append(token.getValue()).append(" ");
                    break;

                case BRACKET_CLOSE:
                    indentLevel--;
                    sb.append(getIndentation(indentLevel)).append("}\n");
                    break;
                case COLON:
                    sb.append(token.getValue());
                    break;

                case VALOR:
                    sb.append(token.getValue()).append(";\n");
                    break;

                case COMENTARIO:
                    sb.append(getIndentation(indentLevel)).append("/* ").append(token.getValue()).append(" */\n");
                    break;

                default:
                    break;
            }
        }

        return sb.toString();
    }

    // Método para obtener la indentación adecuada
    private String getIndentation(int level) {
        return "    ".repeat(level); // 4 espacios por nivel de indentación
    }

}
