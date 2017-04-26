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
public interface Iinvoice {

    /**
     *
     * @return
     */
    public double  getCost();
    public void  setCost(double  Cost);
    public ArrayList<Product>  getList();
    
}
