/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.Controller.Filter;

import java.util.ArrayList;
import online.shopping.Controller.Product;
/**
 *
 * @author Mohamed-A.Radwan
 */
public interface Icriteria {
    public ArrayList<Product> Filter(ArrayList<Product> products);
            
}
