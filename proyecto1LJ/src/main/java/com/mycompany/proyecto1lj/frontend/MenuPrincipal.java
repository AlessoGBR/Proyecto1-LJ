/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto1lj.frontend;

import com.mycompany.proyecto1lj.backend.AnalizadorCodigo;
import com.mycompany.proyecto1lj.backend.LeerArchivo;
import com.mycompany.proyecto1lj.backend.NumeroLinea;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author alesso
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private NumeroLinea numero;

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
        btnReporteCSS = new javax.swing.JButton();
        btnReporteHTML = new javax.swing.JButton();
        btnReporteJS = new javax.swing.JButton();
        btnReporteError = new javax.swing.JButton();

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

        btnReporteCSS.setText("REPORTE CSS");
        btnReporteCSS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporteCSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteCSSActionPerformed(evt);
            }
        });

        btnReporteHTML.setText("REPORTE HTML");
        btnReporteHTML.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporteHTML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteHTMLActionPerformed(evt);
            }
        });

        btnReporteJS.setText("REPORTE JS");
        btnReporteJS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporteJS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteJSActionPerformed(evt);
            }
        });

        btnReporteError.setText("REPORTE ERROR");
        btnReporteError.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporteError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteErrorActionPerformed(evt);
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
                        .addGap(18, 18, 18)
                        .addComponent(btnAnalizar)
                        .addGap(195, 195, 195)
                        .addComponent(btnReporteJS)
                        .addGap(18, 18, 18)
                        .addComponent(btnReporteCSS)
                        .addGap(18, 18, 18)
                        .addComponent(btnReporteHTML)
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
                    .addComponent(btnReporteJS)
                    .addComponent(btnReporteCSS)
                    .addComponent(btnReporteHTML)
                    .addComponent(btnReporteError))
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
        // Crear una instancia de JFileChooser
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

    private void btnReporteCSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteCSSActionPerformed

    }//GEN-LAST:event_btnReporteCSSActionPerformed

    private void btnReporteHTMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteHTMLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteHTMLActionPerformed

    private void btnReporteJSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteJSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteJSActionPerformed

    private void btnReporteErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteErrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteErrorActionPerformed

    public void analizarCodigo() {
        String codigo = txtCodigo.getText();
        AnalizadorCodigo analizar = new AnalizadorCodigo();
        analizar.procesarCodigo(codigo);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSubir;
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnReporteCSS;
    private javax.swing.JButton btnReporteError;
    private javax.swing.JButton btnReporteHTML;
    private javax.swing.JButton btnReporteJS;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelSquare;
    private javax.swing.JPanel panelTexto;
    private javax.swing.JTextArea txtCodigo;
    private javax.swing.JTextArea txtHtml;
    // End of variables declaration//GEN-END:variables
}
