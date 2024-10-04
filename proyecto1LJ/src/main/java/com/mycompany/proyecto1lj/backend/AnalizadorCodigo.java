/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1lj.backend;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author alesso
 */
public class AnalizadorCodigo {

    public enum Estado {
        HTML, CSS, JS
    }

    private Estado estado = Estado.HTML;
    private final Map<Estado, Analizador> analizadores;

    public AnalizadorCodigo() {
        this.analizadores = new HashMap<>();
        this.analizadores.put(Estado.HTML, new AnalizadorHTML());
        this.analizadores.put(Estado.CSS, new AnalizadorCSS());
        this.analizadores.put(Estado.JS, new AnalizadorJS());
    }

    // Método para procesar el código
    public String procesarCodigo(List<String> lineas) {
        StringBuilder resultado = new StringBuilder();

        for (String linea : lineas) {
            cambiarEstadoSiEsNecesario(linea); // Actualizar el estado si corresponde
            Analizador analizadorActual = analizadores.get(estado);
            resultado.append(analizadorActual.procesarLinea(linea)).append("\n");
        }

        return resultado.toString();
    }

    private void cambiarEstadoSiEsNecesario(String linea) {
        if (linea.startsWith(">>[html]")) {
            estado = Estado.HTML;
        } else if (linea.startsWith(">>[css]")) {
            estado = Estado.CSS;
        } else if (linea.startsWith(">>[js]")) {
            estado = Estado.JS;
        }
    }
}

interface Analizador {

    String procesarLinea(String linea);
}

class AnalizadorHTML implements Analizador {

    @Override
    public String procesarLinea(String linea) {
        
        return "HTML: " + linea;
    }
}

class AnalizadorCSS implements Analizador {

    @Override
    public String procesarLinea(String linea) {
        return "CSS: " + linea;
    }
}

class AnalizadorJS implements Analizador {

    @Override
    public String procesarLinea(String linea) {
        return "JS: " + linea;
    }
}
