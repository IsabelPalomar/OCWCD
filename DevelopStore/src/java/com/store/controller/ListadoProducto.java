/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.controller;

import com.store.model.Color;
import com.store.model.Producto;
import com.store.model.Talla;
import com.store.model.TipoProducto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author isabelpalomar
 */
@WebServlet(name = "ListadoProducto", urlPatterns = {"/lista_productos.view"})
public class ListadoProducto extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Producto> productos = new LinkedList<Producto>();
        
        productos.add(new Producto(Color.CAFE, Talla.CHICA, TipoProducto.PLAYERA, "Playera Squalo Importada", new Integer(1), 1.221));
        productos.add(new Producto(Color.MORADO, Talla.MEDIANA, TipoProducto.PANTALON, "Playera wrangler de mezclilla", new Integer(2), 2.342));
        productos.add(new Producto(Color.AMARILLO, Talla.GRANDE, TipoProducto.CAMISA, "Camisa lisa de vestir", new Integer(3), 3.434));
        productos.add(new Producto(Color.AMARILLO, Talla.EXTRA_GRANDE, TipoProducto.BLUSA, "Blusa informal", new Integer(4), 9.2));

        //get parameter..  DONT USE GET ATTRIBUTE, it returns the object
        request.setAttribute("productos", productos);
        
        RequestDispatcher rd = request.getRequestDispatcher("lista_productos.jsp");
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
