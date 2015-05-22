/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import routard.Pays;
import routard.Voyage;
/**
 *
 * @author quentin
 */
public class DetaillerOffres extends Action {
    @Override
    public void execute(HttpServletRequest request)
    {
        //Recuperons les informations necessaires a la creation du client
        String destination = request.getParameter("destination");
        List<Voyage> listeVoyage=null;
        if (destination.equals("Toutes les destinations"))
            //On va trouver les offres en fonction du Type !
        {
            String typeVoyage = request.getParameter("typeVoyage");
        }
        else
            //On va trouver les offres en fonction du pays
        {
            //Recuperons le pays associe au nom de pays
            Pays p = service.findPaysById(Integer.parseInt(destination));
            listeVoyage =service.listerLesVoyagePays(p);
        }
        
        
        //System.out.println(destination+" | "+typeVoyage);
        request.setAttribute("voyages", listeVoyage);
        //request.setAttribute("type", typeVoyage);
    }
}
