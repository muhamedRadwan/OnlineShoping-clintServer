    /*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.Controller;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Mohamed-A.Radwan
 */
public class Cart {
   private HashMap<Product,Integer> productsWithAmount;

    public HashMap<Product,Integer> getProducts() {
        return productsWithAmount;
    }

    public void setProducts(HashMap<Product,Integer> productsWithAmount) {
        this.productsWithAmount = productsWithAmount;
    }
    
    
    public boolean AddToCart(int CardID,int ProductID){
        //Implemntations
        return true;
    }
    public boolean DeleteProductFromCart(int CardID,int ProductID){
        //Implemntations
        return true;
    }
    public  boolean UpdateCard(int CardID,Product product){
        //Implemntations
        return true;       
    }
    public double CalcAllProduct(){
        return 0.0;
    }
    
    
}
