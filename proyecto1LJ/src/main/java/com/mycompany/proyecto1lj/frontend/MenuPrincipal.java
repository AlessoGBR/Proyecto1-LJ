/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto1lj.frontend;

import com.mycompany.proyecto1lj.backend.AnalizadorCodigo;
import com.mycompany.proyecto1lj.backend.ConvertirTokenAString;
import com.mycompany.proyecto1lj.backend.CrearHTML;
import com.mycompany.proyecto1lj.backend.GeneradorHTML;
import com.mycompany.proyecto1lj.backend.LeerArchivo;
import com.mycompany.proyecto1lj.backend.NumeroLinea;
import com.mycompany.proyecto1lj.backend.OptimizarCodigo;
import com.mycompany.proyecto1lj.backend.ResultadoOptimizacion;
import com.mycompany.proyecto1lj.backend.Token;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author alesso
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private NumeroLinea numero;
    private AnalizadorCodigo analizar;
    private List<Token> TokensHTML;
    private List<Token> TokensCSS;
    private List<Token> TokensJS;
    private List<Token> tokensCombinados;
    private List<Token> TokensHTMLOptimizados;
    private List<Token> TokensCSSOptimizados;
    private List<Token> TokensJSOptimizados;
    private List<Token> TokensOptimizados;
    private ResultadoOptimizacion resultadoOpti;
    private String js;
    private String css;
    private String html;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        numero = new NumeroLinea(txtCodigo);
        jScrollPane2.setRowHeaderView(numero);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSquare = new javax.swing.JPanel();
        txtHtml = new javax.swing.JTextArea();
        panelTexto = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCodigo = new javax.swing.JTextArea();
        btnAnalizar = new javax.swing.JButton();
        bntSubir = new javax.swing.JButton();
        btnReporteOptimizacion = new javax.swing.JButton();
        btnReporteToken = new javax.swing.JButton();
        btnReporteError = new javax.swing.JButton();
        btnOptimizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");
        setResizable(false);

        panelSquare.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtHtml.setEditable(false);
        txtHtml.setColumns(20);
        txtHtml.setRows(5);

        javax.swing.GroupLayout panelSquareLayout = new javax.swing.GroupLayout(panelSquare);
        panelSquare.setLayout(panelSquareLayout);
        panelSquareLayout.setHorizontalGroup(
            panelSquareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSquareLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtHtml, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelSquareLayout.setVerticalGroup(
            panelSquareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSquareLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtHtml, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTexto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCodigo.setColumns(20);
        txtCodigo.setRows(5);
        jScrollPane2.setViewportView(txtCodigo);

        javax.swing.GroupLayout panelTextoLayout = new javax.swing.GroupLayout(panelTexto);
        panelTexto.setLayout(panelTextoLayout);
        panelTextoLayout.setHorizontalGroup(
            panelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTextoLayout.setVerticalGroup(
            panelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        btnAnalizar.setText("ANALIZAR");
        btnAnalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        bntSubir.setText("SUBIR");
        bntSubir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSubirActionPerformed(evt);
            }
        });

        btnReporteOptimizacion.setText("REPORTE OPTIMIZACION");
        btnReporteOptimizacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporteOptimizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteOptimizacionActionPerformed(evt);
            }
        });

        btnReporteToken.setText("REPORTE TOKENS");
        btnReporteToken.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporteToken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteTokenActionPerformed(evt);
            }
        });

        btnReporteError.setText("REPORTE ERROR");
        btnReporteError.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporteError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteErrorActionPerformed(evt);
            }
        });

        btnOptimizar.setText("OPTIMIZAR");
        btnOptimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptimizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bntSubir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOptimizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAnalizar)
                        .addGap(99, 99, 99)
                        .addComponent(btnReporteToken)
                        .addGap(18, 18, 18)
                        .addComponent(btnReporteOptimizacion)
                        .addGap(18, 18, 18)
                        .addComponent(btnReporteError))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelSquare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntSubir)
                    .addComponent(btnAnalizar)
                    .addComponent(btnReporteToken)
                    .addComponent(btnReporteOptimizacion)
                    .addComponent(btnReporteError)
                    .addComponent(btnOptimizar))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSquare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        analizarCodigo();
    }//GEN-LAST:event_btnAnalizarActionPerformed

    private void bntSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSubirActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto", "txt");
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            LeerArchivo leer = new LeerArchivo();
            txtCodigo.setText(leer.leerArchivoTxt(selectedFile.getAbsolutePath()));
        }

    }//GEN-LAST:event_bntSubirActionPerformed

    private void btnReporteOptimizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteOptimizacionActionPerformed
        ReporteOptimizacion reporte = new ReporteOptimizacion(TokensOptimizados);
        reporte.setVisible(true);
    }//GEN-LAST:event_btnReporteOptimizacionActionPerformed

    private void btnReporteTokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteTokenActionPerformed
        if (crearListaTokens()) {
            if (tokensCombinados != null) {
                ReporteTokens reporte = new ReporteTokens(tokensCombinados);
                reporte.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "NO HAY TOKENS REGISTRADOS", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnReporteTokenActionPerformed

    private void btnReporteErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteErrorActionPerformed
        ReporteError reporte = new ReporteError();
        reporte.setVisible(true);
    }//GEN-LAST:event_btnReporteErrorActionPerformed

    private void btnOptimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptimizarActionPerformed

        String contenido = txtCodigo.getText();
        if (contenido.length() != 0) {
            List<String> codigoSinOptimizar = new ArrayList<>();
            String[] lineas = contenido.split("\n");
            codigoSinOptimizar.addAll(Arrays.asList(lineas));
            OptimizarCodigo optimizar = new OptimizarCodigo();
            JOptionPane.showMessageDialog(null, "CODIGO OPTIMIZADO", "SUCCES", JOptionPane.INFORMATION_MESSAGE);
            txtCodigo.setText(optimizar.optimizarCodigo(codigoSinOptimizar));
        } else {
            JOptionPane.showMessageDialog(null, "NO HAY CODIGO QUE OPTIMIZAR", "ERROR", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnOptimizarActionPerformed

    public void analizarCodigo() {
        String codigo = txtCodigo.getText();
        String htmlCodigo;
        if (codigo.length() != 0) {
            analizar = new AnalizadorCodigo();
            analizar.procesarCodigo(codigo);
            htmlCodigo = analizar.getTraduccion();
            TokensCSS = analizar.getTokensCSS();
            TokensJS = analizar.getTokensJS();
            TokensHTML = analizar.getTokensHTML();
            ConvertirAString();
            GeneradorHTML generarHTML = new GeneradorHTML();
            if (htmlCodigo == null && css != null && js != null) {
                txtHtml.setText(generarHTML.generarHTML(" ", css, js));
            } else if (htmlCodigo != null && css == null && js != null) {
                txtHtml.setText(generarHTML.generarHTML(htmlCodigo, "", js));
            } else if (htmlCodigo != null && css != null && js == null) {
                txtHtml.setText(generarHTML.generarHTML(htmlCodigo, css, ""));
            } else {
                txtHtml.setText(generarHTML.generarHTML(htmlCodigo, css, js));
            }
            htmlCodigo = txtHtml.getText();
            CrearHTML crear = new CrearHTML();
            crear.crearArchivoHTML("Codigo.html", htmlCodigo);
            JOptionPane.showMessageDialog(null, "CODIGO ANALIZADO Y CREADO", "SUCCES", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "NO HAY CODIGO QUE ANALIZAR", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

    private boolean crearListaTokens() {
        tokensCombinados = new ArrayList<>();

        if (TokensCSS != null && TokensHTML != null && TokensJS != null) {
            tokensCombinados.addAll(TokensCSS);
            tokensCombinados.addAll(TokensJS);
            tokensCombinados.addAll(TokensHTML);
            return true;
        } else if (TokensCSS == null && TokensHTML != null && TokensJS != null) {
            tokensCombinados.addAll(TokensJS);
            tokensCombinados.addAll(TokensHTML);
            return true;
        } else if (TokensCSS != null && TokensHTML == null && TokensJS != null) {
            tokensCombinados.addAll(TokensJS);
            tokensCombinados.addAll(TokensCSS);
            return true;
        } else if (TokensCSS != null && TokensHTML != null && TokensJS == null) {
            tokensCombinados.addAll(TokensCSS);
            tokensCombinados.addAll(TokensHTML);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "NO HAY TOKENS RECONOCIDOS", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    private void ConvertirAString() {
        ConvertirTokenAString convertir = new ConvertirTokenAString();
        if (TokensCSS != null && TokensJS != null) {
            css = convertir.convertirTokensCSS(TokensCSS);
            js = convertir.convertirTokensJS(TokensJS);
        } else if (TokensJS != null) {
            js = convertir.convertirTokensJS(TokensJS);
        } else if (TokensCSS != null) {
            css = convertir.convertirTokensCSS(TokensCSS);
        }
    }

    private void optimizarCodigo() {
        AnalizadorCodigo analizadorOptimizacion = new AnalizadorCodigo();
        analizadorOptimizacion.procesarCodigo(txtCodigo.getText());
        TokensCSSOptimizados = analizadorOptimizacion.getTokensCSS();
        TokensHTMLOptimizados = analizadorOptimizacion.getTokensHTML();
        TokensJSOptimizados = analizadorOptimizacion.getTokensJS();
        TokensOptimizados = new ArrayList<>();
        if (TokensCSSOptimizados == null && TokensHTMLOptimizados != null && TokensJSOptimizados != null) {
            TokensOptimizados.addAll(TokensHTMLOptimizados);
            TokensOptimizados.addAll(TokensJSOptimizados);
        } else if (TokensCSSOptimizados != null && TokensHTMLOptimizados == null && TokensJSOptimizados != null) {
            TokensOptimizados.addAll(TokensCSSOptimizados);
            TokensOptimizados.addAll(TokensJSOptimizados);
        } else if (TokensCSSOptimizados != null && TokensHTMLOptimizados != null && TokensJSOptimizados == null) {
            TokensOptimizados.addAll(TokensCSSOptimizados);
            TokensOptimizados.addAll(TokensHTMLOptimizados);
        } else {
            TokensOptimizados.addAll(TokensHTMLOptimizados);
            TokensOptimizados.addAll(TokensCSSOptimizados);
            TokensOptimizados.addAll(TokensJSOptimizados);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSubir;
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnOptimizar;
    private javax.swing.JButton btnReporteError;
    private javax.swing.JButton btnReporteOptimizacion;
    private javax.swing.JButton btnReporteToken;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelSquare;
    private javax.swing.JPanel panelTexto;
    private javax.swing.JTextArea txtCodigo;
    private javax.swing.JTextArea txtHtml;
    // End of variables declaration//GEN-END:variables
}
