/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping;

/**
 *
 * @author Mohamed-A.Radwan
 */
public class Delivery extends DocretorInvoice{
    final private double  deliveryamount =20;
    
    public void setCost(double cost)
    {
    System.out.println("");
    System.out.println("***START Ex-2***");
    if(getCost()==0.0)

    //double get= super.getCost();
    cost=deliveryamount+cost;
    super.setCost(cost);
            //Add additional thing if necessary
            System.out.println("Cost is =" +cost);
    }
    @Override
    public double getCost() {
            return super.getCost();
    }    
}
