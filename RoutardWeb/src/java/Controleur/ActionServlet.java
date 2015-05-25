package Controleur;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Actions.*;
import RoutardDAO.JpaUtil;
import Services.Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
            case "composerVoyage" :
            {
                action = new ComposerVoyage();
                break;
            }
            case "detaillerOffres" :
            {
                action = new DetaillerOffres();
                break;
            }
            case "creerDevis" :
            {
                action = new CreerDevis();
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
                vue = "CompositionVoyage.jsp";
                break;
            }
            case "composerVoyage" :
            {
                vue = "CompositionVoyage.jsp";
                break;
            }
            case "detaillerOffres" :
            {
                vue = "DetailsOffres.jsp";
                break;
            }
            case "creerDevis" :
            {
                vue = "DetailsOffres.jsp";
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
        // Variables de session
        //HttpSession session = request.getSession(true);
        
        String tache = request.getParameter("todo");
        Action action = this.getAction(tache);
        action.setServiceMetier(this.getServiceMetier());
        action.execute(request);
        String vue = this.setVue(tache);
        request.getRequestDispatcher(vue).forward(request, response);
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

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        JpaUtil.init();
    }

    @Override
    public void destroy() {
        super.destroy(); //To change body of generated methods, choose Tools | Templates.
        JpaUtil.destroy();
    }



}
