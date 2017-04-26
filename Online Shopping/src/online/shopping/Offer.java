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
public class Offer extends DocretorInvoice{

    private int presentage;

    public int getPresentage() {
        return presentage;
    }
        
   public void setPresentage(int presentage) {
        this.presentage = presentage;
   }
   
    @Override
   public void setCost(double cost)
   {
        cost= cost- presentage;
        super.setCost(cost);
        System.out.println(super.getList());
   }
   
   @Override
   public double getCost() {
        // TODO Auto-generated method stub
        return super.getCost();
   }    
}
