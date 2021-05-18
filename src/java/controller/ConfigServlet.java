/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Config;
import service.Configservice;

/**
 *
 * @author Admin
 */
@WebServlet(name = "ConfigServlet", urlPatterns = {"/ConfigServlet"})
public class ConfigServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

        String action = request.getParameter("action");
            System.out.println(action);

        if (action.equals("list")) {
            ArrayList<Config> listConfigs = Configservice.getListConfig();

            request.setAttribute("listConfig", listConfigs);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/ListConfig.jsp");
            dispatcher.forward(request, response);
        } 
        else if (action.equals("add")) {
            String name = request.getParameter("txtname");
            float hso = Float.parseFloat(request.getParameter("txthso"));

            int records = Configservice.AddConfig(name, hso);

            ArrayList<Config> list = Configservice.getListConfig();

            request.setAttribute("listConfig", list);

            if (records > 0) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/ListConfig.jsp");
                dispatcher.forward(request, response);
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/AddConfig.jsp");
                dispatcher.forward(request, response);
            }
        }
        else if (action.equals("update")) {
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("txtname");
            float hso = Float.parseFloat(request.getParameter("txthso"));
            
            int records = Configservice.EditConfig(id, name, hso);
            
            ArrayList<Config> list = Configservice.getListConfig();
            request.setAttribute("listConfig", list);
            if (records > 0) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/ListConfig.jsp");
                dispatcher.forward(request, response);
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/UpdateConfig.jsp");
                dispatcher.forward(request, response);
            }
        }
        else if (action.equals("Edit")) {
             int id = Integer.parseInt(request.getParameter("id"));
             
             
             Config config = Configservice.getConfigByID(id);
             
             request.setAttribute("config", config);
             
             if (config != null) {
                    RequestDispatcher dispatch = request.getRequestDispatcher("/UpdateConfig.jsp");
                    dispatch.forward(request, response);
                } else {
                    RequestDispatcher dispatch = request.getRequestDispatcher("/ListBook.jsp");
                    dispatch.forward(request, response);
                }
        } else if (action.equals("deletemanybook")) {
            String[] listid = request.getParameterValues("id");
            for (int i = 0; i < listid.length; i++) {
                Configservice.deleteConfig(i);
            }
            
             ArrayList<Config> list = Configservice.getListConfig();
             request.setAttribute("listConfig", list);
             
             RequestDispatcher dispatch = request.getRequestDispatcher("/ListConfig.jsp");
             dispatch.forward(request, response);
             
        }
        else if(action.equals("Delete")) {
            int id = Integer.parseInt(request.getParameter("id"));
            
            System.out.println(id);
            int record =  Configservice.deleteConfig(id);
            
            ArrayList<Config> list = Configservice.getListConfig();
            request.setAttribute("listConfig", list);
            
            if (record > 0 ) {
            RequestDispatcher dispatch = request.getRequestDispatcher("/ListConfig.jsp");
            dispatch.forward(request, response);
            }else {
                RequestDispatcher dispatch = request.getRequestDispatcher("/ListConfig.jsp");
            dispatch.forward(request, response);
            }
            
        }
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
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
