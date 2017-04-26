/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.Controller;

import java.util.Date;

/**
 *
 * @author Mohamed-A.Radwan
 */
public class CreditCard implements IPaymentStragy{
    private String holderName;
    private String cardNumber;
    private Date dateOfExpire;

    public CreditCard() {
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Date getDateOfExpire() {
        return dateOfExpire;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setDateOfExpire(Date dateOfExpire) {
        this.dateOfExpire = dateOfExpire;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    
    
    @Override
    public boolean pay(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
