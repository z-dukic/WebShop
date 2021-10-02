/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author PC
 */
@Entity
public class Inventory extends Product {
    
    @OneToOne
    private Product product;

    private Integer availableProducts;

    public Inventory() {
    }



    public Integer getAvailableProducts() {
        return availableProducts;
    }

    public void setAvailableProducts(Integer availableProducts) {
        this.availableProducts = availableProducts;
    }

    public Inventory(Integer availableProducts) {
        this.availableProducts = availableProducts;
    }

    public Inventory(Integer availableProducts, String name, Integer sku, BigDecimal price) {
        super(name, sku, price);
        this.availableProducts = availableProducts;
    }



    @Override
    public String toString() {
        return "Product name: " + getName() + ", availableProducts: " + Integer.valueOf(getAvailableProducts());
    }

}
