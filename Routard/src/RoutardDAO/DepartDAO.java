/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoutardDAO;

import java.util.List;
import javax.persistence.Query;
import routard.Depart;

/**
 *
 * @author kbulme
 */
public class DepartDAO extends DAO<Depart> {

    @Override
    public boolean create(Depart obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Depart find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Depart> listerDepart () {
    //ArrayList<Depart> l = new ArrayList<Depart>();
    Query query = JpaUtil.obtenirEntityManager().createQuery("select c from Depart c");
    List<Depart> resultat = (List<Depart>)query.getResultList();
    return resultat;
    }
}
