/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routard;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author kbulme
 */

@Entity
public class Conseiller implements Serializable {
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;  
    private String email;
    private String nom;
    private String prenom;
    @OneToMany(mappedBy = "conseillerDuDevis")
    private List<Devis> devisConseiller = new ArrayList<Devis>();
    
    public Conseiller () {
    }

    public Conseiller (String name, String firstName, String adresseMail) {
        this.nom=name;
        this.prenom=firstName;
        this.email=adresseMail;
    }

    public List<Devis> getDevisConseiller() {
        return devisConseiller;
    }

    public void setDevisConseiller(List<Devis> devisConseiller) {
        this.devisConseiller = devisConseiller;
    }
    
    public void addDevisConseiller(Devis d){
        devisConseiller.add(d);
    }
    
    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String mail) {
        this.email = mail;
    }
    
    public String getEmail() {
        return email;
    }

    
}


