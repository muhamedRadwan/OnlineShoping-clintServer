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
    public Person login(String username,String password){
      SessionFactory s=hibernateConfig.createSessionFactory();
      Session session =s.openSession(); 
      Query q =session.createQuery("from tablename where attribut_name=:first_parameter");
      q.setParameter("first_parameter",username);
      Person p=(Person)q.uniqueResult();
        return p;
    }
    public boolean register (Customer customer){
        return false;
    }
}

