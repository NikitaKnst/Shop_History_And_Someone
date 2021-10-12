/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author Melnikov
 */
public class History {
    private Product product;
    private Owner1 owner;
    private Date givenDate;
    private Date returnDate;

    public History() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Owner1 getOwner1() {
        return owner;
    }

    public void setOwner1(Owner1 owner) {
        this.owner = owner;
    }

    public Date getGivenDate() {
        return givenDate;
    }

    public void setGivenDate(Date givenDate) {
        this.givenDate = givenDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "History{"
                + "\nproduct=" + product.toString()
                + ",\n=" + owner.toString()
                + ",\n givenDate=" + givenDate.toString()
                + ",\n returnDate=" + returnDate
                + "\n}";
    }
    
}
