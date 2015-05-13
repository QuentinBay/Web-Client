/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoutardDAO;

import java.util.List;
import javax.persistence.Query;
import routard.Pays;

/**
 *
 * @author kbulme
 */
public class PaysDAO extends DAO<Pays> {

    public boolean create(Pays obj) {
        JpaUtil.obtenirEntityManager().persist(obj);
        return true;
    }

   public Pays find(int id) {
        return JpaUtil.obtenirEntityManager().find(Pays.class, id);
   }
   
    public List<Pays> listerPays () {
    //ArrayList<Pays> l = new ArrayList<Pays>();
    Query query = JpaUtil.obtenirEntityManager().createQuery("select c from Pays c");
    List<Pays> resultat = (List<Pays>)query.getResultList();
    return resultat;
    }
    
}
