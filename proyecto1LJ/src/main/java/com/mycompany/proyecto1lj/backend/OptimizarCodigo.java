/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1lj.backend;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alesso
 */
public class OptimizarCodigo {

    private final List<String> tokensEliminados = new ArrayList<>();

    public String optimizarCodigo(List<String> codigoSinOptimizar) {
        List<String> codigoOptimizado = new ArrayList<>();

        for (String linea : codigoSinOptimizar) {
            if (!linea.isEmpty() && !contieneComentario(linea)) {
                codigoOptimizado.add(linea.trim());
            } else {
                tokensEliminados.add(linea.trim());
            }
        }

        return String.join("\n", codigoOptimizado);
    }

    private boolean contieneComentario(String linea) {
        return linea.contains("//") || linea.contains("/*") || linea.contains("*/");
    }

    
}
