<%-- 
    Document   : resource
    Created on : May 3, 2014, 12:01:03 PM
    Author     : isabelpalomar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Name:</h3> ${applicationScope.persona }
        <h3>Address:</h3>${applicationScope.persona.address }
    </body>
</html>
