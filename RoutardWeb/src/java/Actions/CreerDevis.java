/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import routard.Client;
import routard.Depart;
import routard.Devis;
import routard.Pays;
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
        
        if ( session != null )
        {
            int clientId = (int)session.getAttribute("clientId");
            if ( clientId!=0 && voyageId != null && departId != null )
            {
                Client client = service.findClientById(clientId);
                Voyage voyage = service.findVoyagetById(Integer.parseInt(voyageId));
                Depart depart = service.findDepartById(Integer.parseInt(departId));
                service.creerDevis(Integer.parseInt(nbPersonnes), client, voyage, depart);

                //Recuperons le devis cree
                List<Devis> listeDevis = service.listerLesDevis(client);
                int idDevis = listeDevis.get(listeDevis.size()-1).getId();
                Devis devis = service.findDevistById(idDevis);

                service.afficherDevis(devis, client);
                session.setAttribute("signin", "ok");
            }
            else
                //La personne doit s'inscrire avant !
            {
                session.setAttribute("signin", "ko");
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("Votre devis n'a pas pu être créé, veuillez réessayer.");
                System.out.println("------------------------------------------------------------------------------------");
            }
        }
        
        
        //Reaffichons la page de details des offres
        String destination = request.getParameter("destination");
        
        List<Voyage> listeVoyage=null;
        List<Depart> listeDeparts=null;
        Voyage voyageChoisi = null;
        String selection=null;

        
        if (destination.equals("Toutes les destinations"))
            //On va trouver les offres en fonction du Type !
        {
            String typeVoyage = request.getParameter("typeVoyage");
            if (typeVoyage!=null && typeVoyage.equals("sejour"))
                //On va selectionner tous les sejours
            {
                listeVoyage = service.listerLesSejours();
                selection = "sejour";
            }
            else if (typeVoyage!=null && typeVoyage.equals("circuit"))
                //On va selectionner tous les circuits
            {
                listeVoyage = service.listerLesCircuits();
                selection = "circuit";
            }
            else
                //Rien n'a ete selectionne : on affiche tout !
            {
                listeVoyage = service.listerLesVoyage();
                selection = "tout";
            }
        }
        else
            //On va trouver les offres en fonction du pays
        {
            //Recuperons le pays associe au nom de pays
            Pays p = service.findPaysById(Integer.parseInt(destination));
            listeVoyage =service.listerLesVoyagePays(p);
            selection = destination;
        }
        
        
        voyageChoisi = service.findVoyagetById(Integer.parseInt(voyageId));
        listeDeparts = service.listerLesDepartsVoyage(voyageChoisi);
        
        request.setAttribute("voyages", listeVoyage);
        request.setAttribute("departs", listeDeparts);
        request.setAttribute("voyageId", voyageId);
        request.setAttribute("selection", selection);
        
        
    }
    
}
