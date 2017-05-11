/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.Controller;

import java.io.Serializable;
import java.util.HashMap;
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
    
    
    
    
    
   public boolean addProduct(Product product)
   {
          try{
            
              SessionFactory ses = hibernateConfig.createSessionFactory();
              Session session = ses.openSession();
              Transaction transaction = session.beginTransaction();
           
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
   
   public Product selectProduct(int id)
   {
          try{
            
              SessionFactory ses = hibernateConfig.createSessionFactory();
              Session session = ses.openSession();
              Query query=session.createQuery("from Product p where p.id=:id");
              query.setParameter("id", id);
              Product product = (Product)query.uniqueResult();
              
              return product ;
              
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



    public static void main(String[] args) {  
    
        
        Management manage = new Management();
        
        Product pro = manage.selectProduct(1);
        
        System.out.println(pro.getName());
    
    }
}