/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.calc.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author samir
 */
@WebServlet(name = "CalcBasic", urlPatterns = {"/CalcBasic"})
public class CalcBasic extends HttpServlet {
    int visitas = 0;
    
    @Override
    public void init(){
        visitas = 1;
    }

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        
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
        
        Cookie visit = new Cookie("visit", String.valueOf(visitas));
        response.addCookie(visit);
        request.setAttribute("resultado", resultado);
        request.setAttribute("visitas", visitas);
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
        visitas++;
    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>

}
