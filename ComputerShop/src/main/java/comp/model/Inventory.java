/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp.model;

import java.math.BigDecimal;
import javax.persistence.Entity;

/**
 *
 * @author PC
 */
@Entity
public class Inventory extends Product {

    private Product product;
    private Integer availableProducts;

    public Inventory() {
    }

    public Inventory(Product product, Integer availableProducts, String name, Integer sku, BigDecimal price, Integer quantity) {
        super(name, sku, price, quantity);
        this.product = product;
        this.availableProducts = availableProducts;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getAvailableProducts() {
        return availableProducts;
    }

    public void setAvailableProducts(Integer availableProducts) {
        this.availableProducts = availableProducts;
    }
}


