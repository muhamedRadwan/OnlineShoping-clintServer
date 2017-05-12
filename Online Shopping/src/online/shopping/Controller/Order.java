/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.Controller;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Mohamed-A.Radwan
 */
@Entity
@Table(name = "order_1")
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "order_cart_item",
            joinColumns ={ @JoinColumn(name="order_id")},
            inverseJoinColumns = {@JoinColumn(name="cartItem_id")})
    private Collection<CartItem>productsWithAmount;
    @Column(name = "date",insertable = false)
    private String Date; 
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Order() {
        productsWithAmount=new ArrayList<>(15);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Collection<CartItem> getProductsWithAmount() {
        return productsWithAmount;
    }

    public void setProductsWithAmount(Collection<CartItem> productsWithAmount) {
        this.productsWithAmount = productsWithAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    


    

    
    
    public double CalacAllItmes(){
        return 0;
    }
    public void pay(IPaymentStragy PaymentMethod){
        
    }
}
