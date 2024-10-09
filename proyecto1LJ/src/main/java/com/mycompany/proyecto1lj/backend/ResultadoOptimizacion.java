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
public class ResultadoOptimizacion {

    private final List<Token> tokensOptimizados;
    private final String codigoOptimizado;

    public ResultadoOptimizacion(List<Token> tokensOptimizados, String codigoOptimizado) {
        this.tokensOptimizados = tokensOptimizados;
        this.codigoOptimizado = codigoOptimizado;
    }

    public List<Token> getTokensOptimizados() {
        return tokensOptimizados;
    }

    public String getCodigoOptimizado() {
        return codigoOptimizado;
    }
}
