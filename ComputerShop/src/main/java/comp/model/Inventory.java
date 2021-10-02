/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp.model;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 *
 * @author PC
 */
@Entity
public class Inventory extends Product {

    @ManyToMany
    private List<Product> product;
    
    private Integer availableProducts;

    public Inventory() {
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public Integer getAvailableProducts() {
        return availableProducts;
    }

    public void setAvailableProducts(Integer availableProducts) {
        this.availableProducts = availableProducts;
    }


}


