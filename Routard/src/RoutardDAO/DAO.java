/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoutardDAO;
import javax.persistence.EntityManager;
import routard.*;

/**
 *
 * @author kbulme
 */
import java.io.Serializable;
public abstract class DAO<T> extends JpaUtil implements Serializable{
    public abstract boolean create (T obj);
    public abstract T find (int id);
}
