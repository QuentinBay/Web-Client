/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoutardDAO;

import java.util.List;
import javax.persistence.Query;
import routard.Conseiller;

/**
 *
 * @author kbulme
 */
    public class ConseillerDAO extends DAO<Conseiller> {

    public boolean create(Conseiller obj) {
        JpaUtil.obtenirEntityManager().persist(obj);
        return true;
    }
    
    public void mettreAJourConseiller(Conseiller obj){
        JpaUtil.obtenirEntityManager().merge(obj);
    }

    public List<Conseiller> listerConseiller () {
    //ArrayList<Conseiller> l = new ArrayList<Conseiller>();
    Query query = JpaUtil.obtenirEntityManager().createQuery("select c from Conseiller c");
    List<Conseiller> resultat = (List<Conseiller>)query.getResultList();
    return resultat;
    }
    
    public Conseiller find(int id) {
        return null;
    }
    
    public Conseiller trouverConseillerMoinsDeClients() {
       List<Conseiller> cons = listerConseiller();
       Conseiller c = cons.get(0);
       int min = c.getDevisConseiller().size();
       for(int i =1; i<cons.size();i++){
           if(min>=cons.get(i).getDevisConseiller().size()){
               min = cons.get(i).getDevisConseiller().size();
               c = cons.get(i);
           }
       }
       return c;
   }
}
