/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping;

import java.util.HashMap;

/**
 *
 * @author Mohamed-A.Radwan
 */
public class Order {
    private HashMap<Product,Integer> productsWithAmount;
    int customerID;

    public int getCustomerID() {
        return customerID;
    }

    public HashMap<Product, Integer> getProductsWithAmount() {
        return productsWithAmount;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setProductsWithAmount(HashMap<Product, Integer> productsWithAmount) {
        this.productsWithAmount = productsWithAmount;
    }
    
    
    
    public double CalacAllItmes(){
        return 0;
    }
    public void pay(IPaymentStragy PaymentMethod){
        
    }
}
