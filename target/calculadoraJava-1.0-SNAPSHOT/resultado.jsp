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
        <title>Resultado</title>
    </head>
    <body style='font-family: roboto; margin: 2em; text-align: center; background-color: #f1f1f1'>
        <h2>Resultado da operação</h2>
        <form>
            Resultado:
            <input type="text" size= "10" value="<%= request.getAttribute("resultado") %>"<br>
            Visitas:
            <input type="text" size= "10" value="<%= request.getAttribute("visitas") %>"<br>
        </form>
        <br>
        <input type="button" value="Retornar" onclick="history.back()"<br>
    </body>
</html>
