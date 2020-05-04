<%-- 
    Document   : login
    Created on : 25/04/2020, 07:54:03 PM
    Author     : Juan Carlos
--%>
<%  String respuesta = (String)request.getAttribute("respuesta");
    %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <%=respuesta%>
    </body>
</html>
