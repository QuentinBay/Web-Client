/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import routard.Client;
import routard.Depart;
import routard.Voyage;

/**
 *
 * @author quentin
 */
public class CreerDevis extends Action {
    @Override
    public void execute(HttpServletRequest request)
    {
        String voyageId = request.getParameter("voyage");
        String nbPersonnes = request.getParameter("nbPersonnes");
        String departId = request.getParameter("transport");

        // Variables de session
        HttpSession session = request.getSession(true);
        
        int clientId = (int)session.getAttribute("clientId");
        if ( voyageId != null && departId != null )
        {
            Client client = service.findClientById(clientId);
            Voyage voyage = service.findVoyagetById(Integer.parseInt(voyageId));
            Depart depart = service.findDepartById(Integer.parseInt(departId));
            service.creerDevis(Integer.parseInt(nbPersonnes), client, voyage, depart);
            
            request.setAttribute("confirmation", "ok");
        }
        else
        {
            request.setAttribute("confirmation", "ko");
        }
        
    }
    
}
