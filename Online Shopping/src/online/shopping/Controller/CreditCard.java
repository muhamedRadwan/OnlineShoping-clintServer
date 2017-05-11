/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.Controller;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 *
 * @author Mohamed-A.Radwan
 */
@Entity
@Table(name = "")
public class CreditCard implements IPaymentStragy, Serializable{
    @Id @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "holder_name")
    private String holderName;
    @Column(name = "card_number")    
    private String cardNumber;
    @Temporal(TemporalType.DATE)
    @Column(name = "date_of_expire")
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
