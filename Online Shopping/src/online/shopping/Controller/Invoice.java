/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.Controller;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

/**
 *
 * @author Mohamed-A.Radwan
 */
@Entity
@Table(name = "invoice")
public class Invoice implements Iinvoice{
    @Id @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "content")
    private String content="";
    @Column(name = "cost")
    private double cost=0;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private Order order;
    @ManyToOne(fetch = FetchType.EAGER)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
    public Invoice() {
            // TODO Auto-generated constructor stub
    }
    @Override
    public void setCost(double cost)
    {
            this.cost=cost;
    }
    @Override
    public double getCost() {
        
            return cost;
    }
 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }



    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

  

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
<<<<<<< HEAD
    

=======

    /*
    public static void main(String[] args) {
        SessionFactory sesionFactory=Customer.createSessionFactory();
        Session session=sesionFactory.openSession();
        Address address=new Address();
        address.setName("Maadi");
        address.setParent_id(2);
        Query query=session.createQuery("from address set creditscore=:creditscore where name=:name");
        query.setInteger("creditscore", 612);
        query.setString("name", "John Q. Public");
        int modifications=query.executeUpdate();
        
    }
    */
>>>>>>> e2812489ab0d30b2b5529d9950ce3399aafebbc4
}
