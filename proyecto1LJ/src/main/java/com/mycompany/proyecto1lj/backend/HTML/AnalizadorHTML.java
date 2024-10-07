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

    private String input;
    private int index;
    private List<Token> tokens;  // Cambia de ArrayList<String> a ArrayList<Token>

    public AnalizadorHTML(String input) {
        this.input = input;
        this.index = 0;
        this.tokens = new ArrayList<>();  // Inicializa la lista de tokens
    }

    public void analizar() {
        while (index < this.input.length()) {
            avanzar();
        }

    }

    private void avanzar() {
        if (index >= input.length()) {
            return;
        }

        char actual = input.charAt(index);

        switch (actual) {
            case '<':
                if (!tokens.isEmpty() && tokens.get(tokens.size() - 1).getTypeHTML() == TokenEnumHTML.APERTURA) {
                    // No agregar un nuevo token de apertura si ya existe uno consecutivo
                    index++;
                    identificarElemento();
                } else {
                    tokens.add(new Token(TokenEnumHTML.APERTURA, "<"));  // Agrega el token a la lista
                    System.out.println("Token encontrado: <");
                    index++;
                    identificarElemento();
                }
                break;

            case '>':
                if (!tokens.isEmpty() && tokens.get(tokens.size() - 1).getTypeHTML() == TokenEnumHTML.CIERRE) {
                    // No agregar un nuevo token de cierre si ya existe uno consecutivo
                    index++;
                } else {
                    tokens.add(new Token(TokenEnumHTML.CIERRE, ">"));  // Agrega el token a la lista
                    System.out.println("Token encontrado: >");
                    index++;
                }
                break;

            case '/':
                if (!tokens.isEmpty() && tokens.get(tokens.size() - 1).getTypeHTML() == TokenEnumHTML.DIAGONAL) {
                    // No agregar un nuevo token diagonal si ya existe uno consecutivo
                    index++;
                } else {
                    tokens.add(new Token(TokenEnumHTML.DIAGONAL, "/"));  // Agrega el token a la lista
                    System.out.println("Token encontrado: /");
                    index++;
                }
                break;

            case '=':
                tokens.add(new Token(TokenEnumHTML.PALABRA_RESERVADA_IGUAL, "="));  // Agrega el token a la lista
                System.out.println("Token encontrado: =");
                index++;
                break;

            default:
                identificarTexto();
                break;
        }
    }

    private void identificarElemento() {
        StringBuilder tokenString = new StringBuilder();

        while (index < input.length() && input.charAt(index) != ' ' && input.charAt(index) != '>' && input.charAt(index) != '=' && input.charAt(index) != '/') {
            tokenString.append(input.charAt(index));
            index++;
        }

        String token = tokenString.toString();
        TokenEnumHTML tipoToken = obtenerTipoToken(token);

        // Solo agrega el token si no es repetido
        if (tokens.isEmpty() || tokens.get(tokens.size() - 1).getTypeHTML() != tipoToken) {
            tokens.add(new Token(tipoToken, token));  // Agrega el token a la lista
            System.out.println("Token encontrado: " + tipoToken.getToken());
        }

        if (input.charAt(index) == ' ') {
            identificarAtributos();
        }

        if (index < input.length() && input.charAt(index) == '/') {
            tokens.add(new Token(TokenEnumHTML.DIAGONAL, "/"));  // Agrega el token a la lista
            System.out.println("Token encontrado: /");
            index++;
        }

        if (index < input.length() && input.charAt(index) == '>') {
            tokens.add(new Token(TokenEnumHTML.CIERRE, ">"));  // Agrega el token a la lista
            System.out.println("Token encontrado: >");
            index++;
        }
    }

    private TokenEnumHTML obtenerTipoToken(String token) {
        return switch (token) {
            case "principal" ->
                TokenEnumHTML.PRINCIPAL;
            case "encabezado" ->
                TokenEnumHTML.ENCABEZADO;
            case "navegacion" ->
                TokenEnumHTML.NAVEGACION;
            case "apartado" ->
                TokenEnumHTML.APARTADO;
            case "listaordenada" ->
                TokenEnumHTML.LISTA_ORDENADA;
            case "listadesordenada" ->
                TokenEnumHTML.LISTA_DESORDENADA;
            case "itemlista" ->
                TokenEnumHTML.ITEM;
            case "anclaje" ->
                TokenEnumHTML.ANCLAJE;
            case "contenedor" ->
                TokenEnumHTML.CONTENEDOR;
            case "seccion" ->
                TokenEnumHTML.SECCION;
            case "articulo" ->
                TokenEnumHTML.ARTICULO;
            case "titulo1" ->
                TokenEnumHTML.TITULO1;
            case "titulo2" ->
                TokenEnumHTML.TITULO2;
            case "titulo3" ->
                TokenEnumHTML.TITULO3;
            case "titulo4" ->
                TokenEnumHTML.TITULO4;
            case "titulo5" ->
                TokenEnumHTML.TITULO5;
            case "titulo6" ->
                TokenEnumHTML.TITULO6;
            case "parrafo" ->
                TokenEnumHTML.PARRAFO;
            case "span" ->
                TokenEnumHTML.SPAN;
            case "entrada" ->
                TokenEnumHTML.ENTRADA;
            case "formulario" ->
                TokenEnumHTML.FORMULARIO;
            case "label" ->
                TokenEnumHTML.LABEL;
            case "area" ->
                TokenEnumHTML.AREA;
            case "boton" ->
                TokenEnumHTML.BOTON;
            case "piepagina" ->
                TokenEnumHTML.PIE_PAGINA;
            default ->
                TokenEnumHTML.ERROR;
        };
    }

    private void identificarAtributos() {
        while (index < input.length() && input.charAt(index) == ' ') {
            index++;
        }

        while (index < input.length() && input.charAt(index) != '>' && input.charAt(index) != '/') {
            StringBuilder atributo = new StringBuilder();
            StringBuilder valorAtributo = new StringBuilder();

            while (index < input.length() && input.charAt(index) != '=' && input.charAt(index) != ' ' && input.charAt(index) != '>') {
                atributo.append(input.charAt(index));
                index++;
            }

            if (atributo.length() > 0) {
                tokens.add(new Token(TokenEnumHTML.ATRIBUTO, atributo.toString()));  // Agrega el token de atributo a la lista
                System.out.println("Token de atributo encontrado: " + atributo.toString());
            }

            if (index < input.length() && input.charAt(index) == '=') {
                tokens.add(new Token(TokenEnumHTML.PALABRA_RESERVADA_IGUAL, "="));  // Agrega el token para '=' a la lista
                System.out.println("Token encontrado: =");
                index++;

                if (index < input.length() && input.charAt(index) == '"') {
                    index++;
                    while (index < input.length() && input.charAt(index) != '"') {
                        valorAtributo.append(input.charAt(index));
                        index++;
                    }
                    index++;
                }

                if (valorAtributo.length() > 0) {
                    tokens.add(new Token(TokenEnumHTML.VALOR_ATRIBUTO, valorAtributo.toString()));  // Agrega el token de valor de atributo a la lista
                    System.out.println("Token de valor de atributo encontrado: " + valorAtributo.toString());
                }
            }

            while (index < input.length() && input.charAt(index) == ' ') {
                index++;
            }
        }
    }

    private void identificarTexto() {
        StringBuilder texto = new StringBuilder();
        boolean espacioEncontrado = false;

        while (index < input.length() && input.charAt(index) != '<') {
            char actual = input.charAt(index);

            if (actual != ' ') {
                if (espacioEncontrado) {
                    texto.append(' ');
                    espacioEncontrado = false;
                }
                texto.append(actual);
            } else {
                espacioEncontrado = true;
            }
            index++;
        }

        if (texto.length() > 0 && texto.charAt(texto.length() - 1) == ' ') {
            texto.deleteCharAt(texto.length() - 1);
        }

        if (texto.length() > 0) {
            tokens.add(new Token(TokenEnumHTML.TEXTO, texto.toString()));  // Agrega el token de texto a la lista
            System.out.println("Texto encontrado: " + texto.toString());
        }
    }

    public List<Token> getTokens() {
        return tokens;
    }

}
