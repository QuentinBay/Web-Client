/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import routard.Depart;
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
        List<Depart> listeDeparts=null;
        Voyage voyageChoisi = null;
        
        
        
        if (destination.equals("Toutes les destinations"))
            //On va trouver les offres en fonction du Type !
        {
            String typeVoyage = request.getParameter("typeVoyage");
            if (typeVoyage!=null && typeVoyage.equals("sejour"))
                //On va selectionner tous les sejours
            {
                listeVoyage = service.listerLesSejours();
            }
            else if (typeVoyage!=null && typeVoyage.equals("circuit"))
                //On va selectionner tous les circuits
            {
                listeVoyage = service.listerLesCircuits();
            }
            else
                //Rien n'a ete selectionne : on affiche tout !
            {
                listeVoyage = service.listerLesVoyage();
            }
        }
        else
            //On va trouver les offres en fonction du pays
        {
            //Recuperons le pays associe au nom de pays
            Pays p = service.findPaysById(Integer.parseInt(destination));
            listeVoyage =service.listerLesVoyagePays(p);
        }
        
        //Recuperons la liste de depart d'un voyage
        String voyageId = request.getParameter("voyage");
        if (voyageId == null)
            //On choisit le premier voyage par defaut
        {
            voyageChoisi = listeVoyage.get(0);
            voyageId = voyageChoisi.getId().toString();
        }
        else
        {
            voyageChoisi = service.findVoyagetById(Integer.parseInt(voyageId));
        }
        listeDeparts = service.listerLesDepartsVoyage(voyageChoisi);
        
        request.setAttribute("voyages", listeVoyage);
        request.setAttribute("departs", listeDeparts);
        request.setAttribute("voyageId", voyageId);
    }
}
