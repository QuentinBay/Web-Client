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

public class Client implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String civilite;
    private String nom;
    private String prenom;
    private String adressePhysique;
    private String adresseMail;
    private String noTel;
    @OneToMany
    private List<Devis> devis = new ArrayList<Devis>();

    public Client() {
    }

    public List<Devis> getDevis() {
        return devis;
    }
    
    public void addDevis(Devis d){
        devis.add(d);
    }
    
    public void setDevis(List<Devis> devis) {
        this.devis = devis;
    }
    
    public String getCivilite() {
        return civilite;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdressePhysique() {
        return adressePhysique;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public String getNoTel() {
        return noTel;
    }
    
  
    public Client (String civility, String name, String firstname, String adress, String mail, String phone){
        civilite = civility;
        nom = name;
        prenom = firstname;
        adressePhysique = adress;
        adresseMail = mail;
        noTel = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdressePhysique(String adressePhysique) {
        this.adressePhysique = adressePhysique;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public void setNoTel(String noTel) {
        this.noTel = noTel;
    }

    public void affichage(){
        System.out.println(nom+" "+prenom);
    } 
}