/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.Controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
/**
 *
 * @author Mohamed-A.Radwan
 */
@Entity
@Table(name = "customer")
public class Customer extends Person{
    @Column(name = "email")
    private String email;
    @Column(name = "phonenumber")
    private String phoneNumber;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Collection<CartItem> CartItem;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Collection<Feedback> feedbacks;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id",referencedColumnName = "id")
    private Collection<Invoice> invoices;
    public Customer() {
        CartItem=new ArrayList<>(10);
        feedbacks=new ArrayList<>(10);
        invoices=new ArrayList<>(10);
    }

    
    public Collection<CartItem> getCartItem() {
        return CartItem;
    }

    public void setCartItem(Collection<CartItem> CartItem) {
        this.CartItem = CartItem;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }



    
    
    
    public  boolean MakeFeedBack(Feedback feedback){
            return  false;
    }
   
    
    public boolean MakeOrder(ArrayList<CartItem> products){
        return  false;
    }

    public Collection<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(Collection<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }
    
    
    public boolean forgetPassword(String email) {
        
          try{
            
              SessionFactory ses = hibernateConfig.createSessionFactory();
              Session session = ses.openSession();
              
              Query query=session.createQuery("from Customer c where c.email=:email");
              query.setParameter("email", email);
              Customer customer = (Customer)query.uniqueResult();
              if(customer !=null){
                    Transaction transaction = session.beginTransaction();
                    String newPassword = getSaltString();
                    customer.setPassword(newPassword);
                    
                    session.saveOrUpdate(session.merge(customer));
       
                    transaction.commit();
                    session.close();           
      
                  return true ;
              
              }
              else{
                    session.close();           
      
                     return false;
                   }
          
          
          }
         catch(HibernateException ex){
             System.out.println(ex);
        
             return false;
         }
       
    }

    
    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
    
   public static void main(String[] args) {

       Customer cust =new Customer();
       
       cust.forgetPassword("muhameda.radwan@gmail.com");



   }
//        try {
//            SessionFactory ses = createSessionFactory();
//            Session session = ses.openSession();
//            Transaction transaction = session.beginTransaction();
//            Customer c = new Customer();
//            Address address=new Address();
//            Invoice invoice=new Invoice();
//            Feedback feedback=new Feedback();
//            Order order=new Order();
//            feedback.setDescription("This Amazing site");
//            feedback.setSeen(false);
//            address.setName("Maadi");
//            address.setParent_id(2);
//            CartItem cart_item = new CartItem();
//            c.setAddress(address);
//            cart_item.setProduct(4);
//            cart_item.setQuantity(500);
//            c.setEmail("muhameda.radwan@gmail.com");
//            c.setFname("Mohamed");
//            c.setLname("Ahmed");
//            c.setPassword("1234");
//            c.setUsername("mohamedahmed");
//            c.setPhoneNumber("01148037467");
//            c.getCartItem().add(cart_item);
//            c.getFeedbacks().add(feedback);
//            order.setCustomer(c);
//            order.setProductsWithAmount(c.getCartItem());            
//            invoice.setAddress(c.getAddress());
//            invoice.setContent("10 pices cakes 250");
//            invoice.setCost(250);
//            invoice.setOrder(order);
//            invoice.setCustomer(c);
//            session.save(c);
//            session.save(invoice);
//            transaction.commit();
//            session.close();
//             //retrive info
//            session = ses.openSession();
//            org.hibernate.Query query = session.createQuery("from Customer");
//            Collection<Customer> list = query.list();
//
//            Iterator<Customer> itr = list.iterator();
//            while (itr.hasNext()) {
//                Customer q = itr.next();
//                System.out.println("Question Name: " + q.getId());
//                //printing answers  
//                Collection<CartItem> list2 = q.getCartItem();
//                Collection<Feedback>feedbacks=q.getFeedbacks();
//                Iterator<CartItem> itr2 = list2.iterator();
//                Iterator<Feedback> iterator=feedbacks.iterator();
//                while (itr2.hasNext()) {
//                    CartItem carts=itr2.next();
//                    System.out.println("CArt holder : "+carts.getCustomer().getId()+"Cart Value"+carts.getProduct());
//                }
//             
//   while (iterator.hasNext()) {
//                        Feedback customer=iterator.next();
//                        System.out.println("Feedback :"+customer.getDescription());
//                }
//            }
//            
//            session.close();
//        
//            System.out.println("success");
//            System.exit(0);
//        }
//            catch(Exception e){
//            e.printStackTrace();
//            System.exit(0);
//        }
//        }
    
}
