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
    PRINCIPAL_OPEN("<main>"),
    PRINCIPAL_CLOSE("</main>"),
    ENCABEZADO_OPEN("<header>"),
    ENCABEZADO_CLOSE("</header>"),
    NAVEGACION_OPEN("<nav>"),
    NAVEGACION_CLOSE("</nav>"),
    APARTADO_OPEN("<aside>"),
    APARTADO_CLOSE("</aside>"),
    LISTAORDENADA_OPEN("<ul>"),
    LISTAORDENADA_CLOSE("</ul>"),
    LISTADESORDENADA_OPEN("<ol>"),
    LISTADESORDENADA_CLOSE("</ol>"),
    ITEMLISTA_OPEN("<li>"),
    ITEMLISTA_CLOSE("</li>"),
    ANCLAJE_OPEN("<a>"),
    ANCLAJE_CLOSE("</a>"),
    CONTENEDOR_OPEN("<div>"),
    CONTENEDOR_CLOSE("</div>"),
    SECCION_OPEN("<section>"),
    SECCION_CLOSE("</section>"),
    ARTICULO_OPEN("<article>"),
    ARTICULO_CLOSE("</article>"),
    TITULO1_OPEN("<h1>"),
    TITULO1_CLOSE("</h1>"),
    TITULO2_OPEN("<h2>"),
    TITULO2_CLOSE("</h2>"),
    TITULO3_OPEN("<h3>"),
    TITULO3_CLOSE("</h3>"),
    TITULO4_OPEN("<h4>"),
    TITULO4_CLOSE("</h4>"),
    TITULO5_OPEN("<h5>"),
    TITULO5_CLOSE("</h5>"),
    TITULO6_OPEN("<h6>"),
    TITULO6_CLOSE("</h6>"),
    PARRAFO_OPEN("<p>"),
    PARRAFO_CLOSE("</p>"),
    SPAN_OPEN("<span>"),
    SPAN_CLOSE("</span>"),
    ENTRADA_SELF("<input/>"),
    FORMULARIO_OPEN("<form>"),
    FORMULARIO_CLOSE("</form>"),
    LABEL_OPEN("<label>"),
    LABEL_CLOSE("</label>"),
    AREA_SELF("<textarea/>"),
    BOTON_OPEN("<button>"),
    BOTON_CLOSE("</button>"),
    PIEPAGINA_OPEN("<footer>"),
    PIEPAGINA_CLOSE("</footer>"),
    // Palabras reservadas
    CLASS("class"),
    ID("id"),
    STYLE("style"),
    TYPE("type"),
    HREF("href"),
    PLACEHOLDER("placeholder"),
    REQUIRED("required"),
    ONCLICK("onClick"),
    NAME("name"),
    EQUAL("="),
    TEXT("text"),
    STRING("string");

    private final String token;

    TokenEnumHTML(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
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
