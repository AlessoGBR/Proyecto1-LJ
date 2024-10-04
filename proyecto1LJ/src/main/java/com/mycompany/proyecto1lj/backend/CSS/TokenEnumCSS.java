/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1lj.backend.CSS;

/**
 *
 * @author alesso
 */
public enum TokenEnumCSS {

    // Selectores
    UNIVERSAL("*"),
    BODY("body"),
    HEADER("header"),
    MAIN("main"),
    NAV("nav"),
    ASIDE("aside"),
    DIV("div"),
    UL("ul"),
    OL("ol"),
    LI("li"),
    A("a"),
    H1("h1"),
    H2("h2"),
    H3("h3"),
    H4("h4"),
    H5("h5"),
    H6("h6"),
    P("p"),
    SPAN("span"),
    LABEL("label"),
    TEXTAREA("textarea"),
    BUTTON("button"),
    SECTION("section"),
    ARTICLE("article"),
    FOOTER("footer"),
    // Selectores de clase e id
    CLASS_SELECTOR(".class-selector"),
    ID_SELECTOR("#id-selector"),
    // Combinadores
    DESCENDANT(" "),
    CHILD(">"),
    ADJACENT_SIBLING("+"),
    GENERAL_SIBLING("~"),
    // Reglas CSS
    COLOR("color"),
    BACKGROUND_COLOR("background-color"),
    BACKGROUND("background"),
    FONT_SIZE("font-size"),
    FONT_WEIGHT("font-weight"),
    FONT_FAMILY("font-family"),
    TEXT_ALIGN("text-align"),
    WIDTH("width"),
    HEIGHT("height"),
    MIN_WIDTH("min-width"),
    MIN_HEIGHT("min-height"),
    MAX_WIDTH("max-width"),
    MAX_HEIGHT("max-height"),
    DISPLAY("display"),
    INLINE("inline"),
    BLOCK("block"),
    INLINE_BLOCK("inline-block"),
    FLEX("flex"),
    GRID("grid"),
    NONE("none"),
    MARGIN("margin"),
    PADDING("padding"),
    BORDER("border"),
    BORDER_COLOR("border-color"),
    BORDER_STYLE("border-style"),
    BORDER_WIDTH("border-width"),
    BORDER_TOP("border-top"),
    BORDER_BOTTOM("border-bottom"),
    BORDER_LEFT("border-left"),
    BORDER_RIGHT("border-right"),
    BOX_SIZING("box-sizing"),
    BORDER_BOX("border-box"),
    POSITION("position"),
    STATIC("static"),
    RELATIVE("relative"),
    ABSOLUTE("absolute"),
    STICKY("sticky"),
    FIXED("fixed"),
    TOP("top"),
    BOTTOM("bottom"),
    LEFT("left"),
    RIGHT("right"),
    Z_INDEX("z-index"),
    JUSTIFY_CONTENT("justify-content"),
    ALIGN_ITEMS("align-items"),
    BORDER_RADIUS("border-radius"),
    AUTO("auto"),
    FLOAT("float"),
    LIST_STYLE("list-style"),
    BOX_SHADOW("box-shadow"),
    // Unidades de medida y colores
    PX("px"),
    PERCENTAGE("%"),
    REM("rem"),
    EM("em"),
    VW("vw"),
    VH("vh"),
    // Pseudo-clases y pseudo-elementos
    HOVER(":hover"),
    ACTIVE(":active"),
    NOT(":not"),
    NTH_CHILD(":nth-child"),
    ODD(":odd"),
    EVEN(":even"),
    BEFORE("::before"),
    AFTER("::after"),
    // Otros
    RGBA("rgba"),
    HEX_COLOR("#hex"),
    // Símbolos
    COLON(":"),
    SEMICOLON(";"),
    COMMA(","),
    BRACKET_OPEN("{"),
    BRACKET_CLOSE("}"),
    PARENTHESIS_OPEN("("),
    PARENTHESIS_CLOSE(")");

    private final String token;

    TokenEnumCSS(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
