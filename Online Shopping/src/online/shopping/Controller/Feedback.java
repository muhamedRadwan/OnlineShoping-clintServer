/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.Controller;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

/**
 *
 * @author Mohamed-A.Radwan
 */
@Entity
@Table(name = "feedback")
public class Feedback {
    @Id @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "description")
    private String Description;
    @Column(name = "date")
    private String date;
    @Column(name = "seen")
    private boolean seen;
    @ManyToOne(fetch = FetchType.EAGER)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
    public String getDate() {
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

    public void setDate(String date) {
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
}
