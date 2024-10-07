/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1lj.backend;

/**
 *
 * @author alesso
 */
public class TokenEstado {
    
    private String tokenHTML;
    private String tokenCSS;
    private String tokenJS;
    
    public TokenEstado(String tokenHTML, String tokenCSS, String tokenJS){
        this.tokenHTML = tokenHTML;
        this.tokenCSS = tokenCSS;
        this.tokenJS = tokenJS;
    }

    public String getTokenHTML() {
        return tokenHTML;
    }

    public void setTokenHTML(String tokenHTML) {
        this.tokenHTML = tokenHTML;
    }

    public String getTokenCSS() {
        return tokenCSS;
    }

    public void setTokenCSS(String tokenCSS) {
        this.tokenCSS = tokenCSS;
    }

    public String getTokenJS() {
        return tokenJS;
    }

    public void setTokenJS(String tokenJS) {
        this.tokenJS = tokenJS;
    }
    
    
    
}
