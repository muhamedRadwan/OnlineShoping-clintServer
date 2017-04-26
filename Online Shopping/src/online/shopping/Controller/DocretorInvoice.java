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
public class DocretorInvoice implements Iinvoice{
    protected Iinvoice com;
  
    public void SetTheComponent(Iinvoice c) {
            com = c;
    }

    public void setCost(double cost) {
            if (com != null) {
                    com.setCost(cost);
            }
    }

    @Override
    public double getCost() {
            // TODO Auto-generated method stub
            return com.getCost();
    }

    @Override
    public ArrayList<Product> getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	

}
   