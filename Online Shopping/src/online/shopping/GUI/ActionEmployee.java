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
    
    int ID;
    String Name;
    float Price;
    int Category;
    int Currency;
    int Quantity;
    String Color;
    String Descripe;
    String Img;
    Management manage = new Management();
    Product product = new Product();
    public ActionEmployee(){
        
    }
    
    public void SetData(String name, String price, String category, String currency, String quantity, String color, String descripe, String img){
        Name = name;
        Price = Float.parseFloat(price);
        Category = Integer.parseInt(category);
        Currency = Integer.parseInt(currency);
        Quantity = Integer.parseInt(quantity);
        Color = color;
        Descripe = descripe;
        Img = img;
        
        product.setName(Name);
        product.setDescription(Descripe);
        product.setPrice(Price);
        product.setQuantity(Quantity);
        
        
    }
    
    public void Search(String id){
        ID = Integer.parseInt(id);
        
    }
    public void delete(String search){
        this.ID = Integer.parseInt(search);
    }
    
}
