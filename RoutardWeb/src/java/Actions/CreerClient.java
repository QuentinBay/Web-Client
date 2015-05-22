/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import routard.Client;

/**
 *
 * @author quentin
 */
public class CreerClient extends Action {
    @Override
    public void execute(HttpServletRequest request)
    {
        //Recuperons les informations necessaires a la creation du client
        String civilite = request.getParameter("civilite");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String adresse = request.getParameter("adresse");
        String codePostal = request.getParameter("codePostal");
        String ville = request.getParameter("ville");
        String pays = request.getParameter("pays");
        String email = request.getParameter("email");
        String numero = request.getParameter("numero");
        
        //Appelons le service de creation du client
        service.enregistrerClient(civilite, nom, prenom, adresse+" "+codePostal+" "+ville+" "+pays, email, numero);
        
        //Indiquons que le client a ete inscrit
        //Recuperons l'id du client cree
        /*List<Client> listeC = service.listerLesClient();
        int idClient = listeC.get(listeC.size()-1).getId();
        
        String inscription = "Expediteur : ifroutard@monde.com\n"
                           + "Pour : "+email+"\n"
                           + "Sujet : Bienvenue\n\n"
                           + "Corps :\n"
                           + "Bonjour "+prenom+"\n"
                           + "Nous vous confirmons votre inscription à l'agence IF'Routard. "
                           + "Votre numéro de client est : "+idClient;
        request.setAttribute("inscription", inscription);*/
    }
}
