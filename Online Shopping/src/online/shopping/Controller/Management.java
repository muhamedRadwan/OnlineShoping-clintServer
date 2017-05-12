/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.Controller;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import javassist.bytecode.stackmap.BasicBlock;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Mohamed-A.Radwan
 */
public class Management extends Person{
    HashMap<String, String> priviledgeHash;
    
    
    
    
    
   public boolean addProduct(Product product,int cateogryId , int currencyId)
   {
          try{
            
              SessionFactory ses = hibernateConfig.createSessionFactory();
              Session session = ses.openSession();
              Transaction transaction = session.beginTransaction();
           
              ProductCategory cateogry = (ProductCategory) selectObject("ProductCategory", cateogryId);
              
              Currency currency = (Currency) selectObject("Currency", currencyId);
              
              product.setProductCategory(cateogry);
              product.setCurrency(currency);
             
              session.save(product);
              transaction.commit();
              session.close();           
      
              return true;
              
          }
         catch(HibernateException ex){
             System.out.println(ex);
        
             return false;
         }
      
   }
   
   public Object selectObject(String className,int id)
   {
          try{
            
              SessionFactory ses = hibernateConfig.createSessionFactory();
              Session session = ses.openSession();
              Query query=session.createQuery("from "+className+" o where o.id=:id");
              query.setParameter("id", id);
              Object object = query.uniqueResult();
              
              return object ;
              
          }
         catch(HibernateException ex){
             System.out.println(ex);
        
             return null;
         }
      
   }
   
  public boolean updateProduct(Product product)
   {
          try{
            
              SessionFactory ses = hibernateConfig.createSessionFactory();
              Session session = ses.openSession();
              Transaction transaction = session.beginTransaction();
              session.saveOrUpdate(session.merge(product));
              transaction.commit();
              session.close();           
      
              return true;
              
          }
         catch(HibernateException ex){
             System.out.println(ex);
        
             return false;
         }
   }

  public boolean deleteProduct(int id)
   {
          try{
            
              SessionFactory ses = hibernateConfig.createSessionFactory();
              Session session = ses.openSession();
              Transaction transaction = session.beginTransaction();
              Product pro = new Product();
              pro.setID(id);
              session.delete(pro);
              //query.setParameter("pro_id",id);
              //session.save(query);
              transaction.commit();
              session.close();           
      
              return true;
             
          }
         catch(HibernateException ex){
             System.out.println(ex);
        
             return false;
         }
   }

  
  public Collection<Object> viewAll(String className)
   {
          try{
            
              SessionFactory ses = hibernateConfig.createSessionFactory();
              Session session = ses.openSession();
              Query query=session.createQuery("from "+className);
            
              Collection<Object> list = query.list();
              
              return list;
              
          }
         catch(HibernateException ex){
             System.out.println(ex);
        
             return null;
         }
      
   }
   


    public static void main(String[] args) {  
    
        
        Management manage = new Management();
  
       //ProductCategory cateogry = (ProductCategory) manage.selectObject("ProductCategory", 1) ;
        
       //Currency currency = (Currency) manage.selectObject("Currency", 3);
        Product product    = new Product();
        ProductCategory pc = new  ProductCategory();
        
       
        product.setDescription("Lbs rgaly");
        product.setName("Mohamed");
        product.setProductCategory(pc);
        product.setQuantity(50);
        product.setPrice(250.5);
        
        manage.addProduct(product,1,3);
              
       //System.out.println(currency.getName());
        
        
//        
//         Collection<Object> object = manage.viewAll("Customer");
//         Iterator<Object> itr = object.iterator();
//         
//              while (itr.hasNext()) {
//                Customer q = (Customer) itr.next();
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
//    
//    }
}
}