/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.Controller;

import java.util.ArrayList;

/**
 *
 * @author Mohamed-A.Radwan
 */
public class Invoice implements Iinvoice{
    private double cost=0;
    private Address address;
    private ArrayList<Product> products;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
    public Invoice() {
            // TODO Auto-generated constructor stub
    }
    @Override
    public void setCost(double cost)
    {
            this.cost=cost;
    }
    @Override
    public double getCost() {
            return cost;
    }
    @Override
    public ArrayList<Product> getList() {
            // TODO Auto-generated method stub
            return products;
    }
	    
}
