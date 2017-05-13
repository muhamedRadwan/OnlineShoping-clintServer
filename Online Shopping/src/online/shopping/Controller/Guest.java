/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.Controller;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Mohamed-A.Radwan
 */
public class Guest extends SystemTool{
    public static Person login(String username,String password){
       try{
        SessionFactory sessionFactory=   hibernateConfig.createSessionFactory();
        Session session=sessionFactory.openSession();
        Query query=session.createQuery("from person p where p.password=:passowrd and p.username=:username");
        query.setParameter("username", username);
        query.setParameter("passowrd", password);
        Person person=(Person)query.uniqueResult();
        session.close();
        return person;
       }catch(Exception ex){
        ex.printStackTrace();
        return null;
       }
    }
    public static boolean register (Customer customer){
     try{
         SessionFactory sessionFactory=   hibernateConfig.createSessionFactory();
         Session session=sessionFactory.openSession();
         session.save(customer);
         session.getTransaction().commit();
         session.close();
         return true;
     }catch(Exception ex){
         System.out.println(ex);
         System.exit(0);
         return false;
     }
    }

    
    public static void main(String[] args) {
      
    }
}

