<%-- 
    Document   : index
    Created on : May 3, 2014, 9:16:53 AM
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
        <form action="ListenerTester">
            <select name="breed">
                <% 
                String[] breeds = (String [])getServletContext().getAttribute("breeds");
                for(String breed: breeds){ %>
                
                <option value="<%=breed%>"><%=breed%></option>
                <%
                }
                %>
            </select>
            <%= new String[3] %>
            <button type="submit">Send</button>
        </form>
    </body>
</html>
