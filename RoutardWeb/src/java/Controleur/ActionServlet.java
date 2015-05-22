package Controleur;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Actions.Action;
import Actions.CreerClient;
import Services.Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author quentin
 */
public class ActionServlet extends HttpServlet 
{
//---------------------------------------------------------------------ATTRIBUTS
    Service serviceVoyage;

//----------------------------------------------------------------------METHODES
    /**
     * Instancie un service si necessaire
     * @return service
     */
    public Service getServiceMetier()
    {
        if (serviceVoyage==null)
        {
            serviceVoyage = new Service ();
        }
        return serviceVoyage;
    }
    
    /**
     * En fonction de la requete http, renvoie l'action a effectuer
     * @param todo
     * @return 
     */
    protected Action getAction(String todo)
    {
        Action action = null;
        switch (todo)
        {
            case "identification" :
            {
                action = new CreerClient();
                break;
            }
            case "inscriptionClient" :
            {
                action = new CreerClient();
                break;
            }
        }
        return action;
    }
    
    protected String setVue(String todo)
    {
        String vue = null;
        switch(todo)
        {
            case "inscriptionClient" :
            {
                vue = "ConfirmationEnvoieMail.jsp";
                break;
            }
        }
        return vue;
    }
    
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
            throws ServletException, IOException 
    {
        String tache = request.getParameter("todo");
        Action action = this.getAction(tache);
        action.setServiceMetier(this.getServiceMetier());
        action.execute(request);
        String vue = this.setVue(tache);
        request.getRequestDispatcher(vue).forward(request, response);
        
        /*response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            // TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ActionServlet test</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ActionServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }*/
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
