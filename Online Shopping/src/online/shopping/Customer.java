/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping;

import java.util.ArrayList;

/**
 *
 * @author Mohamed-A.Radwan
 */
public class Customer extends Person{
    private String email;
    private String phoneNumber;
    private Address address;
    private Cart cart;
    private ArrayList<String> invoices;
    private ArrayList<Feedback> Feedbacks;

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public Cart getCart() {
        return cart;
    }

    public ArrayList<String> getInvoices() {
        return invoices;
    }

    public ArrayList<Feedback> getFeedbacks() {
        return Feedbacks;
    }
    
    

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public void setInvoices(ArrayList<String> invoices) {
        this.invoices = invoices;
    }

    public void setFeedbacks(ArrayList<Feedback> Feedbacks) {
        this.Feedbacks = Feedbacks;
    }
    
    
    
    public  boolean MakeFeedBack(Feedback feedback){
            return  false;
    }
    
    public boolean PayInvoice(Iinvoice invoice){
        return  false;
    }
    
    public boolean MakeOrder(ArrayList<Cart> products){
        return  false;
    }
}
