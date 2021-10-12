/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import entity.Seller;
import java.util.Arrays;

/**
 *
 * @author Melnikov
 */
public class Product {
    private String caption;
    private Seller[] seller;
    private int price;
    
    public Product() {
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Seller[] getSeller() {
        return seller;
    }

    public void setSeller(Seller[] seller) {
        this.seller = seller;
    }
 public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" 
                + "caption=" + caption 
                + ",\n seller=" + Arrays.toString(seller)
                +",\n Price="+ price
                + "\n}";
    }
    
    
}
