/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1lj.backend;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author alesso
 */
public class ReporteHTML {

    private final String paht;
    private boolean generado;

    public ReporteHTML(String path) {
        this.paht = path;
    }

    public void reporteTokens(List<Token> listaTokens, String path, String nombre) {
        if (!path.endsWith(File.separator)) {
            path += File.separator;
        }

        String filePath = path + nombre;

        File newFile = new File(filePath);

        try (FileWriter writer = new FileWriter(newFile)) {
            writer.write("<html>\n");
            writer.write("<head>\n");
            writer.write("<title>REPORTES</title>\n");
            writer.write("<style>\n");
            writer.write("table {width: 100%; border-collapse: collapse;}\n");
            writer.write("table, th, td {border: 1px solid black;}\n");
            writer.write("th, td {padding: 8px; text-align: left;}\n");
            writer.write("th {background-color: #f2f2f2;}\n");
            writer.write("</style>\n");
            writer.write("</head>\n");
            writer.write("<body>\n");
            writer.write("<h1>Reporte de Tokens</h1>\n");

            writer.write("<table border='1'>\n");
            writer.write("<tr><th>TOKEN</th><th>EXPRESION REGULAR</th><th>LENGUAJE</th><th>TIPO</th></tr>\n");

            for (Token token : listaTokens) {
                String lenguaje = "";
                String tipoToken = "";

                if (token.getTypeHTML() != null) {
                    lenguaje = "HTML";
                    tipoToken = token.getTypeHTML().name();
                } else if (token.getTypeCSS() != null) {
                    lenguaje = "CSS";
                    tipoToken = token.getTypeCSS().name();
                } else if (token.getTypeJS() != null) {
                    lenguaje = "JavaScript";
                    tipoToken = token.getTypeJS().name();
                }

                writer.write("<tr>");
                writer.write("<td>" + token.getValue() + "</td>");
                writer.write("<td>" + token.getValue() + "</td>");
                writer.write("<td>" + lenguaje + "</td>");
                writer.write("<td>" + tipoToken + "</td>");
                writer.write("</tr>\n");
            }

            writer.write("</table>\n");
            writer.write("</body>\n");
            writer.write("</html>");
            generado = true;

        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
            generado = false;
        }
    }

    public boolean isGenerado() {
        return generado;
    }
    

    public void reporteOptimizacion(List<Token> listaTokens, String path, String nombre) {
        if (!path.endsWith(File.separator)) {
            path += File.separator;
        }

        String filePath = path + nombre;
        File newFile = new File(filePath);

        try (FileWriter writer = new FileWriter(newFile)) {
            writer.write("<html>\n");
            writer.write("<head>\n");
            writer.write("<title>Reporte de Tokens Eliminados</title>\n");
            writer.write("<style>\n");
            writer.write("table {width: 100%; border-collapse: collapse;}\n");
            writer.write("table, th, td {border: 1px solid black;}\n");
            writer.write("th, td {padding: 8px; text-align: left;}\n");
            writer.write("th {background-color: #f2f2f2;}\n");
            writer.write("</style>\n");
            writer.write("</head>\n");
            writer.write("<body>\n");
            writer.write("<h1>Reporte de Tokens Eliminados</h1>\n");

            writer.write("<table border='1'>\n");
            writer.write("<tr><th>TOKEN</th><th>EXPRESION REGULAR</th><th>LENGUAJE</th><th>TIPO</th></tr>\n");

            for (Token token : listaTokens) {
                String lenguaje = determinarLenguaje(token);
                String tipoToken = determinarTipo(token);

                writer.write("<tr>");
                writer.write("<td>" + token.getValue() + "</td>");
                writer.write("<td>" + token.getValue() + "</td>");
                writer.write("<td>" + lenguaje + "</td>");
                writer.write("<td>" + tipoToken + "</td>");
                writer.write("</tr>\n");
            }

            writer.write("</table>\n");
            writer.write("</body>\n");
            writer.write("</html>");

        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    private String determinarLenguaje(Token token) {
        if (token.getTypeHTML() != null) {
            return "HTML";
        } else if (token.getTypeCSS() != null) {
            return "CSS";
        } else if (token.getTypeJS() != null) {
            return "JavaScript";
        }
        return "Desconocido";
    }

    private String determinarTipo(Token token) {
        if (token.getTypeHTML() != null) {
            return token.getTypeHTML().name();
        } else if (token.getTypeCSS() != null) {
            return token.getTypeCSS().name();
        } else if (token.getTypeJS() != null) {
            return token.getTypeJS().name();
        }
        return "Texto";
    }

    public void reporteError(List<Token> listaTokens, String path, String nombre) {
        if (!path.endsWith(File.separator)) {
            path += File.separator;
        }

        String filePath = path + nombre;

        File newFile = new File(filePath);

        try (FileWriter writer = new FileWriter(newFile)) {
            writer.write("<html>\n");
            writer.write("<head>\n");
            writer.write("<title>REPORTES</title>\n");
            writer.write("<style>\n");
            writer.write("table {width: 100%; border-collapse: collapse;}\n");
            writer.write("table, th, td {border: 1px solid black;}\n");
            writer.write("th, td {padding: 8px; text-align: left;}\n");
            writer.write("th {background-color: #f2f2f2;}\n");
            writer.write("</style>\n");
            writer.write("</head>\n");
            writer.write("<body>\n");
            writer.write("<h1>Reporte de Tokens</h1>\n");

            writer.write("<table border='1'>\n");
            writer.write("<tr><th>TOKEN</th><th>LENGUAJE DONDE SE ENCONTRO</th><th>LENGUAJE SUGERIDO</th></tr>\n");

            for (Token token : listaTokens) {
                String lenguaje = "";
                String tipoToken = "";

                if (token.getTypeHTML() != null) {
                    lenguaje = "HTML";
                    tipoToken = token.getTypeHTML().name();
                } else if (token.getTypeCSS() != null) {
                    lenguaje = "CSS";
                    tipoToken = token.getTypeCSS().name();
                } else if (token.getTypeJS() != null) {
                    lenguaje = "JavaScript";
                    tipoToken = token.getTypeJS().name();
                }

                writer.write("<tr>");
                writer.write("<td>" + token.getValue() + "</td>");
                writer.write("<td>" + token.getValue() + "</td>");
                writer.write("<td>" + lenguaje + "</td>");
                writer.write("<td>" + tipoToken + "</td>");
                writer.write("</tr>\n");
            }

            writer.write("</table>\n");
            writer.write("</body>\n");
            writer.write("</html>");

        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}
