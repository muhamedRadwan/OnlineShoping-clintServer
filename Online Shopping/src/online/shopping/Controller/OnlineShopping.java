/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.Controller;

import online.shopping.GUI.*;

/**
 *
 * @author Lobna
 */
public class OnlineShopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AddProduct x = new AddProduct ("Home");
        x.setVisible(true);
        
        
        
//        Offers x = new Offers("Offer");
//        x.setVisible(true);
    }
    public static String[] set(){
        String [] s = new String[2];
        s[0]="lobna";
        s[1]="salma";
        return s;
    }
}
