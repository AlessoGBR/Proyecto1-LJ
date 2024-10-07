/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1lj.backend.HTML;

/**
 *
 * @author alesso
 */
public enum TokenEnumHTML {
    // Etiquetas de apertura y cierre
    APERTURA("", "<"),
    DIAGONAL("", "/"),
    CIERRE("", ">"),
    PRINCIPAL("main", "principal"),
    ENCABEZADO("header", "encabezado"),
    NAVEGACION("nav", "navegacion"),
    APARTADO("aside", "apartado"),
    LISTA_ORDENADA("ul", "listaordenada"),
    LISTA_DESORDENADA("ol", "listadesordenada"),
    ITEM("li", "itemlista"),
    ANCLAJE("a", "anclaje"),
    CONTENEDOR("div", "contenedor"),
    SECCION("section", "seccion"),
    ARTICULO("article", "articulo"),
    TITULO1("h1", "titulo1"),
    TITULO2("h2", "titulo2"),
    TITULO3("h3", "titulo3"),
    TITULO4("h4", "titulo4"), 
    TITULO5("h5", "titulo5"),
    TITULO6("h6", "titulo6"),    // h#
    PARRAFO("p", "parrafo"),
    SPAN("span", "span"),
    ENTRADA("input", "entrada"),
    FORMULARIO("form", "formulario"),
    LABEL("label", "label"),
    AREA("textarea", "area"),
    BOTON("button", "boton"),
    PIE_PAGINA("footer", "piepagina"),
    PALABRA_RESERVADA("", ""),
    PALABRA_RESERVADA_IGUAL("=", "="),
    CADENA("", "\"([a-zA-Z]|[0-9]|[.])*\""),
    TEXTO("", "([a-zA-Z]|[0-9]|[.])+"),
    COMENTARIO("", "//([a-zA-Z]|[0-9]|[.])*"),
    ID("id", "id"),
    CLASS("class", "class"),
    HREF("href", "href"),
    ONCLICK("onClick", "onClick"),
    STYLE("style", "style"),
    TYPE("type", "type"),
    PLACEHOLDER("placeholder", "placeholder"),
    REQUIRED("required", "required"),
    NAME("name", "name"),
    VALOR_ATRIBUTO("", "valor_atributo"),
    ATRIBUTO("", "atributo"),
    ERROR("", "");

    private final String token;
    private final String traduccion;

    TokenEnumHTML(String traduccion, String token) {
        this.token = token;
        this.traduccion = traduccion;
    }

    public String getToken() {
        return token;
    }

    public String getTraduccion() {
        return traduccion;
    }

    public static TokenEnumHTML getReservedWord(String word) {
        for (TokenEnumHTML token : values()) {
            if (token.token.equals(word)) {
                return token;
            }
        }
        return null;
    }

}
