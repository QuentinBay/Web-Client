/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routard;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/**
 *
 * @author kbulme
 */
@Entity
public class Pays implements Serializable{
     @Id
    private Integer id;
    private String capitale;
    private String code;
    private String langue;
    private String nom;
    private float population;
    private String region;
    private float superficie;
    
    public Pays(Integer id, String capitale, String code, String langue, String nom, float population, String region, float superficie) {
        this.id = id;
        this.capitale = capitale;
        this.code = code;
        this.langue = langue;
        this.nom = nom;
        this.population = population;
        this.region = region;
        this.superficie = superficie;
    }


    public Pays() {
    }

    public Integer getId() {
        return id;
    }

    public String getCapitale() {
        return capitale;
    }

    public String getCode() {
        return code;
    }

    public String getLangue() {
        return langue;
    }

    public String getNom() {
        return nom;
    }

    public float getPopulation() {
        return population;
    }

    public String getRegion() {
        return region;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setCapitale(String capitale) {
        this.capitale = capitale;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPopulation(float population) {
        this.population = population;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }
  
    public void affichage(){
        System.out.println(nom);
    }

}