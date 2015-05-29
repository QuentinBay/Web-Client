/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author quentin
 */
public class Deconnexion extends Action {
    @Override
    public void execute(HttpServletRequest request)
    {
        HttpSession session = request.getSession(true);
        session.setAttribute("clientId", 0);
        session.setAttribute("signin", "ko");
        /*if (session != null)
        {
            session.invalidate();
        }*/
        
        //System.out.println("Deconnexion !");
    }
    
}
