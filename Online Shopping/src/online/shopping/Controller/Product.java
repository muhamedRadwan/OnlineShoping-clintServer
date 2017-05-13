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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author Mohamed-A.Radwan
 */
@Entity
@Table(name = "product")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    @Column(name = "name")
    private String name;
    @Column(name = "unitPrice")
    private double price;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "Description")
    private String Description;
    @ManyToOne()
    @JoinColumn(name = "cateogry_id")
    private ProductCategory productCategory;
    @ManyToOne()
    @JoinColumn(name = "currency_id")
    private Currency currency;
    @ManyToOne()
    @JoinTable(name = "offer_product",
            joinColumns = {@JoinColumn(name = "product_id")},
            inverseJoinColumns = {@JoinColumn(name = "offer_id")}
    )
    private Offer offer;

    public Product() {
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getDescription() {
        return Description;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Offer getOffer() {
        return offer;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

//    public ProductFeaturs getProductFeaturs() {
//        return productFeaturs;
//    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

//    public void setProductFeaturs(ProductFeaturs productFeaturs) {
//        this.productFeaturs = productFeaturs;
//    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }
       public static SessionFactory createSessionFactory() {
        Configuration configuration = new Configuration().configure();
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
                configuration.getProperties()).build();
        return configuration.buildSessionFactory(serviceRegistry);
    }
/*
    public static void main(String[] args) {
       try{
        SessionFactory sessionFactory = createSessionFactory();
        Session session    = sessionFactory.openSession();
        session.beginTransaction();
        Product product    = new Product();
        Offer offer        = new Offer();
        ProductCategory pc = new  ProductCategory();
        Currency currency  = new Currency();
        currency.setConversionValue(5.10);
        currency.setName("Dollar");
        pc.setDescription("ELBL7");
        pc.setName("Man");
        pc.setParentId(1);
        
        offer.setName("Ramadan");
        offer.setPresentage(10);
        product.setID(3);
        product.setCurrency(currency);
        product.setDescription("Lbs rgaly");
        product.setName("Mohamed");
        product.setOffer(offer);
        product.setProductCategory(pc);
        product.setQuantity(50);
        product.setPrice(250.5);
        
        Management management = new Management();
        
        
        
        //session.save(product);
        //session.getTransaction().commit();
       }catch(Exception e){
           e.printStackTrace();
           System.exit(0);
       }
        
    }
*/
}
