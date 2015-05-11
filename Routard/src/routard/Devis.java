/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routard;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author kbulme
 */ 
@Entity
public class Devis implements Serializable{
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private int prixTotal;
    private String date;
    private int nbPersonnes;
    @ManyToOne
    private Conseiller conseillerDuDevis;
    @ManyToOne
    private Depart departDuDevis;
    @ManyToOne
    private Voyage voyageDuDevis;

    public Devis() {
    }

    public Devis(int prixTotal, String date, int nbPersonnes, Conseiller conseillerDuDevis, Depart departDuDevis, Voyage voyageDuDevis) {
        this.prixTotal = prixTotal;
        this.date = date;
        this.nbPersonnes = nbPersonnes;
        this.conseillerDuDevis = conseillerDuDevis;
        this.departDuDevis = departDuDevis;
        this.voyageDuDevis = voyageDuDevis;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(int prixTotal) {
        this.prixTotal = prixTotal;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNbPersonnes() {
        return nbPersonnes;
    }

    public void setNbPersonnes(int nbPersonnes) {
        this.nbPersonnes = nbPersonnes;
    }

    public Conseiller getConseillerDuDevis() {
        return conseillerDuDevis;
    }

    public void setConseillerDuDevis(Conseiller conseillerDuDevis) {
        this.conseillerDuDevis = conseillerDuDevis;
    }

    public Depart getDepartDuDevis() {
        return departDuDevis;
    }

    public void setDepartDuDevis(Depart departDuDevis) {
        this.departDuDevis = departDuDevis;
    }

    public Voyage getVoyageDuDevis() {
        return voyageDuDevis;
    }

    public void setVoyageDuDevis(Voyage voyageDuDevis) {
        this.voyageDuDevis = voyageDuDevis;
    }
    
    public void affichageDevis(Client c){
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Date :" + date);
        System.out.println(c.getPrenom()+ " " + c.getNom());
        System.out.println(c.getAdressePhysique());
        System.out.println(c.getNoTel());
        System.out.println("");
        System.out.println("Votre conseiller pour ce voyage : " + conseillerDuDevis.getPrenom()+ " " + conseillerDuDevis.getNom() +" (" + conseillerDuDevis.getEmail()+ " )");
        System.out.println("");
        System.out.print("Votre voyage : " + voyageDuDevis.getNom()+ " (Code " + voyageDuDevis.getCode()+ ").");
        for(int i=0;i<voyageDuDevis.getPaysVoyage().size();i++){
            System.out.print((((voyageDuDevis.getPaysVoyage()).get(i)).getNom()).toUpperCase() + " ");
        }
        System.out.println("");
        System.out.println(voyageDuDevis.getInfosVoyages());
        System.out.println("");
        System.out.println("Départ : le " + departDuDevis.getJour() + " de " + departDuDevis.getVille());
        System.out.println("Transport aérien (suceptible d'être modifié) : " + departDuDevis.getTransport());
        System.out.println("");
        System.out.println(voyageDuDevis.getDescription());
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("Nombre de personnes : " + this.getNbPersonnes());
        System.out.println("Tarif par personne : " + departDuDevis.getPrix() + "€");
        System.out.println("TOTAL : " + this.getPrixTotal() + "€");
        System.out.println("");
    }    
}
