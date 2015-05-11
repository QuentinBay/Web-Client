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
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author kbulme
 */
@Entity
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
public class Voyage implements Serializable{
     @Id
     private Integer id;
     private String dtype;
     private String code;
     private String description;
     private int duree;
     private String nom;
    @OneToMany
     private List<Pays> paysVoyage = new ArrayList<Pays>();
    @OneToMany
     private List<Depart> depart = new ArrayList<Depart>();
     
    public Voyage(){
    }
    
    public Voyage(Integer id, String code, String description, int duree, String name) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.duree = duree;
        this.nom = name;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public List<Pays> getPaysVoyage() {
        return paysVoyage;
    }

    public List<Depart> getDepart() {
        return depart;
    }

    public void setDepart(List<Depart> depart) {
        this.depart = depart;
    }
    
    public void setPaysVoyage(List<Pays> paysVoyage) {
        this.paysVoyage = paysVoyage;
    }

    public Integer getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public int getDuree() {
        return duree;
    }

    public String getNom() {
        return nom;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setNom(String name) {
        this.nom = name;
    }
     
    public void affichage(){
        System.out.println(nom);
        System.out.println(((this.getPaysVoyage()).get(0)).getNom() + " ");
    }
     
    public String getInfosVoyages() {
        return "";
    }
    
    public boolean paysVisite(Pays p){
        for(int i =0; i<paysVoyage.size();i++){
            if((paysVoyage.get(i)).getNom() == p.getNom()){
                return true;
            }
        }
        return false;
    }
    
    public void affichage1(){
        System.out.println(nom);
        System.out.println(dtype  + " (" + duree + "jours " + this.getInfosVoyages());
        System.out.println("");
        System.out.println(description);
    }
    
}
