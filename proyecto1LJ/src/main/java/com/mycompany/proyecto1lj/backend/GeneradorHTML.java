/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1lj.backend;

/**
 *
 * @author alesso
 */
public class GeneradorHTML {

        public String generarHTML(String htmlTraducido, String cssTraducido, String jsTraducido) {
            StringBuilder documento = new StringBuilder();
            documento.append("<!DOCTYPE html>\n<html>\n<head>\n<meta charset=\"UTF-8\">\n<meta name=\"viewport\" content =\"width=device-width, initial-scale=1.0\">\n");
            documento.append("<title>Document</title>\n");
            documento.append("<style>\n").append(cssTraducido).append("\n</style>\n");
            documento.append("<script>\n").append(jsTraducido).append("\n</script>\n");
            documento.append("</head>\n<body>\n");
            documento.append(htmlTraducido);
            documento.append("\n</body>\n</html>");
            return documento.toString();
        }
}
