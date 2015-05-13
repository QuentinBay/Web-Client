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
public class Circuit extends Voyage{
    private int kilometrage;
    private String transport;

    public Circuit() {
    }

    public Circuit(int kilometrage, String transport, Integer id, String code, String description, int duree, String name) {
        super(id, code, description, duree, name);
        this.kilometrage = kilometrage;
        this.transport = transport;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public String getTransport() {
        return transport;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }
    
    @Override
    public String getInfosVoyages() {
        String s = "";
        s = this.getDtype() + " (" + this.getDuree() + " jours, " + this.getKilometrage() + " kms, " + this.getTransport() + ")";
        return s;
    }
    
    
}


