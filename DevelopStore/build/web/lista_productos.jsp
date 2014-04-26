<%-- 
    Document   : lista_productos.jsp
    Created on : Apr 12, 2014, 9:52:42 AM
    Author     : isabelpalomar
--%>

<%@page import="java.util.List"%>
<%@page import="com.store.model.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" class="ui" href="http://semantic-ui.com/build/packaged/css/semantic.min.css">
        <title>Develop Store: Listado de Productos</title>
        <style>
            .masthead {
            position: relative;
            overflow: hidden;
            background-color: #3882c7;
            text-align: center;
            margin-top: 38px;
            padding: 50px 0px;
            color: rgba(255, 255, 255, 0.9);
            margin: 0;
            border-bottom: none;
            
            }
            
        </style>
    </head>
    <body>
        <table border="0" cellspacing="0" width="800" >
        
        <div class="masthead segment">
            <h2 style="color:#fff">Develop Store: Inicio</h2>
        </div>
        
        <h2>Listado de Productos</h2>    
        
        
        <table class="ui table segment">
            <thead>
                <tr><th>No.</th>
                    <th>Descripcion</th>
                    <th>Tipo</th>
                    <th>Color</th>
                    <th>Talla</th>
                    <th>Precio</th>
                </tr></thead>
            <tbody>
               <%
                   List<Producto> productos = (List<Producto>) request.getAttribute("productos");
                   int i= 0;
                   for(Producto producto:productos){
                       i++;
               %>
               <tr>
                   <td>
                       <%=i %>
                   </td>
                   <td>
                       <%=producto.getDescripcion() %>
                   </td>
                   <td>
                       <%=producto.getTipoProducto() %>
                   </td>
                   <td>
                       <%=producto.getColor() %>
                   </td>
                   <td>
                       <%=producto.getTalla() %>
                   </td>
                   <td>
                       <%=producto.getPrecio() %>
                   </td>
               </tr>
               
               <% 
                   }
               %>
            </tbody>
</table>
</body>
</html>
