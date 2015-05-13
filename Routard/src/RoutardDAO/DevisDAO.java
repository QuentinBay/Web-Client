/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoutardDAO;

import routard.Devis;


/**
 *
 * @author kbulme
 */
public class DevisDAO extends DAO<Devis> {

    public boolean create(Devis obj) {
        JpaUtil.obtenirEntityManager().persist(obj);
        return true;
    }

   public Devis find(int id) {
        return JpaUtil.obtenirEntityManager().find(Devis.class, id);
   }
    
}
