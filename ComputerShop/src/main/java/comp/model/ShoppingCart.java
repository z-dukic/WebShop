/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author PC
 */
@Entity
public class ShoppingCart extends EntityId{ 
    
    private String brojRacuna;
    
    @ManyToOne
    private Inventory inventory;

    public ShoppingCart(String brojRacuna, Inventory inventory) {
        this.brojRacuna = brojRacuna;
        this.inventory = inventory;
    }
    
    public ShoppingCart(){
        
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    
    
    
    
}
