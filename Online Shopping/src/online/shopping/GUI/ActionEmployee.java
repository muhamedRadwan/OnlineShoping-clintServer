/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.GUI;
import online.shopping.Controller.*;
/**
 *
 * @author Lobna
 */
public class ActionEmployee {
    
    int Search;
    String Name;
    double Price;
    int Category;
    int Currency;
    int Quantity;
    String Color;
    String Descripe;
    String Img;
    Management manage = new Management();
    Product product = new Product();
    
   public ActionEmployee(String name, String price, String category, String currency, String quantity, String color, String descripe, String img){
        Name = name;
        Price = Double.parseDouble(price);
        Category = Integer.parseInt(category);
        Currency = Integer.parseInt(currency);
        Quantity = Integer.parseInt(quantity);
        Color = color;
        Descripe = descripe;
        Img = img;
    }
    
    public void add(){
        
        product.setName(Name);
        product.setDescription(Descripe);
        product.setPrice(Price);
        product.setQuantity(Quantity);
        
        manage.addProduct(product, Category, Currency);
        
    }
    
    public void update(){
        
    }
    
    public Product Search(String id){
        Search = Integer.parseInt(id);
        product = (Product)manage.selectObject("Product", Search);
        Name = product.getName();
        Price =  product.getPrice();
        Category = product.getProductCategory().getID();
        Currency = product.getCurrency().getId();
        Quantity = product.getQuantity();
        Descripe = product.getDescription();
        return product;
    }
    public void delete(String search){
        this.Search = Integer.parseInt(search);
    }
    
}
