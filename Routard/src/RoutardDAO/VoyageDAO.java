/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoutardDAO;

import java.util.List;
import javax.persistence.Query;
import routard.Voyage;

/**
 *
 * @author kbulme
 */
public class VoyageDAO extends DAO<Voyage> {

    public boolean create(Voyage obj) {
        JpaUtil.obtenirEntityManager().persist(obj);
        return true;
    }

   public Voyage find(int id) {
        
       return null;
   }
   
   public List<Voyage> listerVoyage () {
    //ArrayList<Voyage> l = new ArrayList<Voyage>();
    Query query = JpaUtil.obtenirEntityManager().createQuery("select c from Voyage c");
    List<Voyage> resultat = (List<Voyage>)query.getResultList();
    return resultat;
    }
}