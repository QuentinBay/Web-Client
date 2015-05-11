/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routard;

import javax.persistence.Entity;

/**
 *
 * @author kbulme
 */
@Entity
public class Sejour extends Voyage {
    private String residence;

    public Sejour(String residence, Integer id, String code, String description, int duree, String name) {
        super(id, code, description, duree, name);
        this.residence = residence;
    }

    public Sejour() {
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }
    
   @Override
    public String getInfosVoyages() {
        String s = "";
        s = this.getDtype() + " (" + this.getResidence() + ")";
        return s;
    }
}
