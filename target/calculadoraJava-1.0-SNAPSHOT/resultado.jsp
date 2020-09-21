<%-- 
    Document   : resultado
    Created on : Sep 21, 2020, 7:31:43 PM
    Author     : samir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado:</title>
    </head>
    <body style='font-family: roboto; margin: 2em; text-align: center; background-color: #f1f1f1'>
        <%
        String svalorA = request.getParameter("valorA");
        String svalorB = request.getParameter("valorB");
        String soperacao = request.getParameter("operacao");
        
        double dvalorA = Double.parseDouble(svalorA);
        double dvalorB = Double.parseDouble(svalorB);
        double resultado = 0;
        
        switch (soperacao) {
            case "+" : resultado = dvalorA + dvalorB;
            break;
            case "-" : resultado = dvalorA - dvalorB;
            break;
            case "*" : resultado = dvalorA * dvalorB;
            break;
            case "/" : resultado = dvalorA / dvalorB;
            break;
        }
        
        out.print("Resultado:<br>"+resultado);
        %>
        <br>
        <a href='http://localhost:8080/calculadoraJava/calculadoraJSP.html'>Voltar</a>
    </body>
</html>
