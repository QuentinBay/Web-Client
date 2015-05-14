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
public class IdentifierClient extends Action {
    @Override
    public void execute(HttpServletRequest request)
    {
        //Recuperons les informations necessaires a la creation du client
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        
        //Appelons le service de creation du client
        //service.enregistrerClient(civilite, nom, prenom, adresse+codePostal+ville+pays, email, numero);
        
        //Indiquons que le client a ete inscrit
        //Recuperons l'id du client cree
        List<Client> listeC = service.listerLesClient();
        int idClient = listeC.get(listeC.size()-1).getId();
        
        request.setAttribute("correct", "etat");
    }
}
