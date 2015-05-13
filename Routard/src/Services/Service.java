/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import RoutardDAO.ClientDAO;
import RoutardDAO.ConseillerDAO;
import RoutardDAO.DepartDAO;
import RoutardDAO.DevisDAO;
import RoutardDAO.JpaUtil;
import RoutardDAO.PaysDAO;
import RoutardDAO.VoyageDAO;
import static java.lang.String.format;
import static java.lang.String.format;
import java.util.ArrayList;
import java.util.List;
import routard.Circuit;
import routard.Client;
import routard.Conseiller;
import routard.Depart;
import routard.Devis;
import routard.Pays;
import routard.Voyage;

/**
 *
 * @author kbulme
 */
public class Service extends JpaUtil {
    
    public void enregistrerClient (String civility, String name, String firstname, String adress, String mail, String phone) {
        JpaUtil.creerEntityManager();
        Client c1 = new Client( civility, name,  firstname, adress, mail,phone);
        JpaUtil.ouvrirTransaction();
        ClientDAO dClient = new ClientDAO();
        dClient.create(c1);
        JpaUtil.validerTransaction();
        JpaUtil.fermerEntityManager();
    }
    
    public List<Client> listerLesClient(){
        JpaUtil.creerEntityManager();
        ClientDAO dClient = new ClientDAO();
        List<Client> resultat = dClient.listerClient();
        JpaUtil.fermerEntityManager();
        return resultat;
    }
    
    public List<Voyage> listerLesVoyage(){
        JpaUtil.creerEntityManager();
        VoyageDAO dVoyage = new VoyageDAO();
        List<Voyage> resultat = dVoyage.listerVoyage();
        JpaUtil.fermerEntityManager();
        return resultat;
    }
    
    public List<Conseiller> listerLesConseillers(){
        JpaUtil.creerEntityManager();
        ConseillerDAO dConseiller = new ConseillerDAO();
        List<Conseiller> resultat = dConseiller.listerConseiller();
        JpaUtil.fermerEntityManager();
        return resultat;
    }
    
    public List<Depart> listerLesDepartsVoyage(Voyage v){
        JpaUtil.creerEntityManager();
        List<Depart> resultat = v.getDepart();
        JpaUtil.fermerEntityManager();
        return resultat;
    }
    
    public void creerDevis (int nbPersonnes, Client c, Voyage v, Depart d){
        JpaUtil.creerEntityManager();
        int prix;
        String format = "dd/MM/yy H:mm:ss";
        prix = d.getPrix()*nbPersonnes;
        java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat( format ); 
        java.util.Date date = new java.util.Date();
        JpaUtil.ouvrirTransaction();
        ConseillerDAO dConseiller = new ConseillerDAO();
        Conseiller co = dConseiller.trouverConseillerMoinsDeClients();
        JpaUtil.validerTransaction();
        Devis dev = new Devis(prix, formater.format(date), nbPersonnes, co, d, v);
        co.addDevisConseiller(dev);
        c.addDevis(dev);
        JpaUtil.ouvrirTransaction();
        DevisDAO dDevis = new DevisDAO();
        ClientDAO dClient = new ClientDAO();
        dDevis.create(dev);
        dClient.mettreAJourClient(c);
        dConseiller.mettreAJourConseiller(co);
        JpaUtil.validerTransaction();
        JpaUtil.fermerEntityManager();
    }
    
    public List<Voyage> listerLesCircuits(){
        JpaUtil.creerEntityManager();
        VoyageDAO dVoyage = new VoyageDAO();
        List<Voyage> lCircuit = new ArrayList<Voyage>();
        List<Voyage> lVoyage = dVoyage.listerVoyage();
        for(int i=0; i<lVoyage.size();i++){
            if ("Circuit".equals(lVoyage.get(i).getDtype())){
                lCircuit.add(lVoyage.get(i));
            }
        }
        JpaUtil.fermerEntityManager();
        return lCircuit;
    }
    
    public List<Voyage> listerLesSejours(){
        JpaUtil.creerEntityManager();
        VoyageDAO dVoyage = new VoyageDAO();
        List<Voyage> lSejour = new ArrayList<Voyage>();
        List<Voyage> lVoyage = dVoyage.listerVoyage();
        for(int i=0; i<lVoyage.size();i++){
            if ("Sejour".equals(lVoyage.get(i).getDtype())){
                lSejour.add(lVoyage.get(i));
            }
        }
        JpaUtil.fermerEntityManager();
        return lSejour;
    }
    
    public void afficherDevis(Devis d, Client c){
        d.affichageDevis(c);
    }
    
    public List<Devis> listerLesDevis(Client c){
        List<Devis> listeDevis = c.getDevis();
        return listeDevis;
    }
    
    public List<Pays> listerLesPays(){
        JpaUtil.creerEntityManager();
        PaysDAO dPays = new PaysDAO();
        List<Pays> resultat = dPays.listerPays();
        JpaUtil.fermerEntityManager();
        return resultat;
    }
    
    public List<Voyage> listerLesVoyagePays(Pays p){
        JpaUtil.creerEntityManager();
        VoyageDAO dVoyage = new VoyageDAO();
        List<Voyage> liste = dVoyage.listerVoyage();
        List<Voyage> resultat = new ArrayList<Voyage>();
        for(int i =0; i<liste.size();i++){
            if((liste.get(i)).paysVisite(p)){
                resultat.add(liste.get(i));
            }
        }
        JpaUtil.fermerEntityManager();
        return resultat;
    }
    
    public Client findClientById(int id){
        JpaUtil.creerEntityManager();
        ClientDAO dClient = new ClientDAO();
        Client resultat = dClient.find(id);
        JpaUtil.fermerEntityManager();
        return resultat;
    }
}


