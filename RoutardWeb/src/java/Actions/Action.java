/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import Services.Service;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author quentin
 */
public abstract class Action {
//---------------------------------------------------------------------ATTRIBUTS
    Service service;

//----------------------------------------------------------------------METHODES
    public abstract void execute(HttpServletRequest request);
    
    public void setServiceMetier(Service unService)
    {
        service = unService;
    }
    
}
