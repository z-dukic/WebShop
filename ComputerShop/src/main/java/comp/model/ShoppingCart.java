/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp.model;

import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author PC
 */
@Entity
public class ShoppingCart extends EntityId {

    private String brojRacuna;

    @ManyToOne
    private Product product;

    private Integer howManyProducts;
    private Integer pricePerUnit;
    private Integer total;

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getHowManyProducts() {
        return howManyProducts;
    }

    public void setHowManyProducts(Integer howManyProducts) {
        this.howManyProducts = howManyProducts;
    }

    public Integer getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(Integer pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.brojRacuna);
        hash = 83 * hash + Objects.hashCode(this.product);
        hash = 83 * hash + Objects.hashCode(this.howManyProducts);
        hash = 83 * hash + Objects.hashCode(this.pricePerUnit);
        hash = 83 * hash + Objects.hashCode(this.total);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ShoppingCart other = (ShoppingCart) obj;
        if (!Objects.equals(this.brojRacuna, other.brojRacuna)) {
            return false;
        }
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        if (!Objects.equals(this.howManyProducts, other.howManyProducts)) {
            return false;
        }
        if (!Objects.equals(this.pricePerUnit, other.pricePerUnit)) {
            return false;
        }
        if (!Objects.equals(this.total, other.total)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "brojRacuna: " + brojRacuna ;
    }


    

        


    
    

}
