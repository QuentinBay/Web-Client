/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import routard.Pays;

/**
 *
 * @author quentin
 */
public class ComposerVoyage extends Action {
    @Override
    public void execute(HttpServletRequest request)
    {
        List<Pays> listePays = service.listerLesPays();
        request.setAttribute("listePays",listePays);
    }
    
}
