/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import routard.Client;
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
        String typeVoyage = request.getParameter("typeVoyage");
        
        System.out.println(destination+" | "+typeVoyage);
        request.setAttribute("dest", destination);
        request.setAttribute("type", typeVoyage);
    }
}
