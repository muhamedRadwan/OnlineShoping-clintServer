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
public class Address {
    private String name;
    private int    id;
    private ArrayList<Address>Parents;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParents(ArrayList<Address> Parents) {
        this.Parents = Parents;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Address> getParents() {
        return Parents;
    }
    
}
