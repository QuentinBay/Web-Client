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
public class Depart implements Serializable{
     @Id
    private Integer id;
    private String jour;
    private int prix;
    private String transport;
    private String ville;
    private Integer voyageId;
    @ManyToOne
    private Voyage voyage;

    public Depart(Integer id, String jour, int prix, String transport, String ville, Integer voyageId) {
        this.id = id;
        this.jour = jour;
        this.prix = prix;
        this.transport = transport;
        this.ville = ville;
        this.voyageId = voyageId;
    }

    public Voyage getVoyage() {
        return voyage;
    }

    public void setVoyage(Voyage voyage) {
        this.voyage = voyage;
    }

    public Depart() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Integer getVoyageId() {
        return voyageId;
    }

    public void setVoyageId(Integer voyageId) {
        this.voyageId = voyageId;
    }
    
    public void affichage(){
        System.out.println(jour + " " + ville + " " +prix+" "+transport);
        
        
    }    
    
}
