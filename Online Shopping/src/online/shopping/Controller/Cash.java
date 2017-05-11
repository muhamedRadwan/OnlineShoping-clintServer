/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.Controller;

import java.sql.Date;
import javax.persistence.*;

/**
 *
 * @author Mohamed-A.Radwan
 */
public class Cash implements IPaymentStragy{
    private int id;
    private Date date;
    private int order_id;

    @Override
    public boolean pay(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
