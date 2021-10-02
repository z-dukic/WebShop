/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp.model;

import java.math.BigDecimal;

/**
 *
 * @author PC
 */
public class Inventory extends Product{
    
    private Product product;
    private int availableProducts;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAvailableProducts() {
        return availableProducts;
    }

    public void setAvailableProducts(int availableProducts) {
        this.availableProducts = availableProducts;
    }

    public Inventory(Product product, int availableProducts, String name, Integer sku, BigDecimal price, Integer quantity) {
        super(name, sku, price, quantity);
        this.product = product;
        this.availableProducts = availableProducts;
    }
    
    
    
    
    
    
}
