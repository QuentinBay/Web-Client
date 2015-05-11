/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoutardDAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import static org.eclipse.persistence.jpa.jpql.utility.CollectionTools.list;
import routard.Client;

/**
 *
 * @author kbulme
 */
public class ClientDAO extends DAO<Client> {

    public boolean create(Client obj) {
        JpaUtil.obtenirEntityManager().persist(obj);
        return true;
    }
    
    public void mettreAJourClient(Client obj){
        JpaUtil.obtenirEntityManager().merge(obj);
    }

   public Client find(int id) {
        
       return null;
   }
   
   public List<Client> listerClient () {
    //ArrayList<Client> l = new ArrayList<Client>();
    Query query = JpaUtil.obtenirEntityManager().createQuery("select c from Client c");
    List<Client> resultat = (List<Client>)query.getResultList();
    return resultat;
    }
}
