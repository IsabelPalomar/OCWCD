/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipalomar;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author isabelpalomar
 */
public class HelloServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            getServletContext().log("Hola, hoy es"+ new Date());
            
            //get and show context values
            getServletContext().log("Primera variable de contexto: " + getServletContext().getInitParameter("Context1"));
            getServletContext().log("Application name: " + getServletContext().getInitParameter("visualName"));
            getServletContext().log("Versión: " + getServletContext().getInitParameter("version"));
            
            //get servlet config vars
            getServletContext().log("Name: " + getServletConfig().getInitParameter("Name"));
            getServletContext().log("Gender: " + getServletConfig().getInitParameter("Gender"));
            getServletContext().log("Ocuppation: " + getServletConfig().getInitParameter("Ocuppation"));
            
            //New solution :D
            ServletContext srvltCtx = getServletContext();
            srvltCtx.log("Servlet has been invoked on" + new Date());
            
            Enumeration<String> contextParams = srvltCtx.getInitParameterNames();
            
            while(contextParams.hasMoreElements()){
                String name = contextParams.nextElement();
                String value = srvltCtx.getInitParameter(name);
                
                srvltCtx.log("This is the context: Param name" + name + "and its value is " + value);
                
            }
            
            //get the servlet init parameters
            //this.getInitParameterNames();
            
            ServletConfig srvConf = getServletConfig(); 
            Enumeration<String> configParams = srvConf.getInitParameterNames();
            
            
             while(configParams.hasMoreElements()){
                String name = configParams.nextElement();
                String value = srvConf.getInitParameter(name);
                
               // srvConf.log("This is the context: Param name" + name + "and its value is " + value);
                
            }
            
            
            
            
                    //date
                    //values of each parameter
            
            
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
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
