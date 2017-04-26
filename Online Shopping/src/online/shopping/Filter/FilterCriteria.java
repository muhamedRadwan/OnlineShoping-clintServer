/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.Filter;

import java.util.ArrayList;
import online.shopping.Controller.Product;

/**
 *
 * @author Mohamed-A.Radwan
 */
public class FilterCriteria {
    private ArrayList<Product> products;
    private Icriteria criteria;
   
    public FilterCriteria(Icriteria criteria,ArrayList<Product> products) {
        this.criteria=criteria;
        this.products=products;
    }
    
    public void setCriteria(Icriteria criteria) {
        this.criteria = criteria;
    }

    public Icriteria getCriteria() {
        return criteria;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    
}
