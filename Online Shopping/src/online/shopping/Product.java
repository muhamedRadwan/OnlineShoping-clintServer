/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping;

/**
 *
 * @author Mohamed-A.Radwan
 */
public class Product {
    private int ID;
    private String name;
    private double price;
    private int quantity;
    private String Description;
    private ProductFeaturs productFeaturs;
    private ProductCategory productCategory;
    private Currency currency;
    private Offer offer;

    public Product() {
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getDescription() {
        return Description;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Offer getOffer() {
        return offer;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public ProductFeaturs getProductFeaturs() {
        return productFeaturs;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setProductFeaturs(ProductFeaturs productFeaturs) {
        this.productFeaturs = productFeaturs;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }
    
}
