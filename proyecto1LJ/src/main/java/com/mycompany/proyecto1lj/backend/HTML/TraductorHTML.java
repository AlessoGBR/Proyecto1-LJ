/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1lj.backend.HTML;

/**
 *
 * @author alesso
 */
public class TraductorHTML {

    public String traducir(String html) {
        StringBuilder resultado = new StringBuilder();
        StringBuilder etiqueta = new StringBuilder();
        boolean dentroDeEtiqueta = false;

        for (char c : html.toCharArray()) {
            if (c == '<') {
                // Cuando encontramos '<', comenzamos una nueva etiqueta
                dentroDeEtiqueta = true;
                etiqueta.setLength(0); // Limpiamos el contenido de la etiqueta
            }

            if (dentroDeEtiqueta) {
                etiqueta.append(c); // Agregamos el carácter a la etiqueta

                if (c == '>') {
                    // Cuando encontramos '>', terminamos la etiqueta
                    String etiquetaCompleta = etiqueta.toString();
                    String etiquetaTraducida = traducirEtiqueta(etiquetaCompleta);
                    resultado.append(etiquetaTraducida);
                    dentroDeEtiqueta = false; // Salimos de la etiqueta
                }
            } else {
                // Si no estamos dentro de una etiqueta, agregamos el carácter al resultado
                resultado.append(c);
            }
        }

        return resultado.toString(); // Devolvemos el HTML traducido
    }

    // Método que traduce la etiqueta usando el enum
    private String traducirEtiqueta(String etiqueta) {
        // Extraemos el nombre de la etiqueta (sin atributos)
        String nombreEtiqueta = etiqueta.split(" ")[0].substring(1); // Extraemos el nombre

        // Buscamos si el nombre de la etiqueta coincide con algún enum
        for (TokenEnumHTML token : TokenEnumHTML.values()) {
            if (token.getToken().equals(nombreEtiqueta)) {
                // Reemplazamos la etiqueta original por la traducida
                String etiquetaTraducida = "<" + token.getTraduccion();
                // Si hay atributos, los mantenemos
                String atributos = etiqueta.substring(nombreEtiqueta.length() + 1);
                return etiquetaTraducida + atributos + ">";
            }
        }

        return etiqueta; // Si no se encuentra, devuelve la etiqueta original
    }
}
