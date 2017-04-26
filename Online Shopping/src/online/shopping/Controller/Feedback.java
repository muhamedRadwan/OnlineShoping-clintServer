/*
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
public class Feedback {
    private int id;
    private String Description;
    private Date date;
    private boolean seen;

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return Description;
    }

    public int getId() {
        return id;
    }

    public boolean isSeen() {
        return seen;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }
    
}
