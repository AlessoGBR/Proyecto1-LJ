/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1lj.backend;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alesso
 */
public class CrearHTML {

    public void crearArchivoHTML(String nombreArchivo, String contenidoHTML) {
        try {
            File archivo = new File(nombreArchivo);
            FileWriter fileWriter = new FileWriter(archivo);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Escribir el contenido en el archivo
            bufferedWriter.write(contenidoHTML);

            // Cerrar el BufferedWriter
            bufferedWriter.close();
            System.out.println("Archivo HTML creado: " + archivo.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
        }
    }
}
