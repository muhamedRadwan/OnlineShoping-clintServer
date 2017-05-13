/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.Controller;


import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.*;

/**
 *
 * @author Mohamed-A.Radwan
 */
@Entity
@Table(name = "offer")
public class Offer extends DocretorInvoice{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "presentage")
    private int presentage;
    @Column(name = "name")
    private String name; 
    @OneToMany(fetch =  FetchType.EAGER)
    @JoinTable(name = "offer_product",
            joinColumns = {@JoinColumn(name = "offer_id")},
            inverseJoinColumns = {@JoinColumn(name = "product_id")})
    Collection<Product> products;

    public Offer() {
    products=new ArrayList<>(20);
    }
    
    
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Iinvoice getCom() {
        return com;
    }

    public void setCom(Iinvoice com) {
        this.com = com;
    }
   
}
