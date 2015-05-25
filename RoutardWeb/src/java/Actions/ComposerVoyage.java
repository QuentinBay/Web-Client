/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import routard.Pays;

/**
 *
 * @author quentin
 */
public class ComposerVoyage extends Action {
    @Override
    public void execute(HttpServletRequest request)
    {
    
        //Affichons la liste des pays dans la fenetre de composition des voyages
        List<Pays> listePays = service.listerLesPays();
        request.setAttribute("listePays",listePays);
    }
    
}
