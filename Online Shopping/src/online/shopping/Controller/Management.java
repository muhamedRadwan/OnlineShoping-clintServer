/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import org.hibernate.Session;

/**
 *
 * @author Mohamed-A.Radwan
 */
public class Management extends Person{
    HashMap<String, String> priviledgeHash;
    
    public void AddOfferProduct(ArrayList<Integer> products,int offer){
        Session session=hibernateConfig.createSessionFactory().openSession();
        session.beginTransaction();
        Offer offer1= (Offer)session.get(Offer.class, offer);
        for(int prod:products){
            Product product =(Product)session.get(Product.class, prod);
            product.setOffer(offer1);
            session.saveOrUpdate(session.merge(product));
            
        }
      session.getTransaction().commit();
    }
    public boolean makeOffer(String offerName, int presentage){
   try{ Session session =hibernateConfig.createSessionFactory().openSession();
    session.beginTransaction();
    Offer offer =new Offer();
    offer.setName(offerName);
    offer.setPresentage(presentage);
    session.save(offer);

    
    session.getTransaction().commit();
    session.close();
   }catch(Exception e){
       System.out.println(e);
                }
    return true;
    }
   
 public static void main(String[] args) {   
     Management m=new Management();
   //  m.makeOffer( "new offer",50);
    ArrayList<Integer>a=new ArrayList<>();
     a.add(5);
     a.add(11);
     //a.add(3); a.add(4);
     m.AddOfferProduct(a,8);
 }
 }
