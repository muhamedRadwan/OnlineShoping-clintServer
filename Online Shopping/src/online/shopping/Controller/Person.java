/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.Controller;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Mohamed-A.Radwan
 */
@Inheritance(strategy = InheritanceType.JOINED  )
@DiscriminatorColumn(name = "type_id")
@Entity(name = "person")

public class Person implements Serializable  {
    @Id @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "firstName")
    private String Fname;
    @Column(name = "lastname")
    private String Lname;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "registerationDate",insertable = false)
    private String registerationDate; 
    @Column(name = "type_id",insertable = false)
    private String typeId;
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public int getId() {
        return id;
    }
    
    

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getPassword() {
        return password;
    }

    
    public boolean Addnotify(Notification notification){
        return false;
    }
    public boolean logout(){
        return false;
    }

    public String getRegisterationDate() {
        return registerationDate;
    }

    public void setRegisterationDate(String registerationDate) {
        this.registerationDate = registerationDate;
    }
    
    
    
    public boolean addPerson(Person person)
    {
          try{
            
              SessionFactory ses = hibernateConfig.createSessionFactory();
              Session session = ses.openSession();
              Transaction transaction = session.beginTransaction();
           
              session.save(person);
              transaction.commit();
              session.close();           
      
              return true;
              
          }
         catch(HibernateException ex){
             System.out.println(ex);
        
             return false;
         }
      
   }
   
   public Person selectPerson(int id)
   {
          try{
            
              SessionFactory ses = hibernateConfig.createSessionFactory();
              Session session = ses.openSession();
              Query query=session.createQuery("from person p where p.id=:id");
              query.setParameter("id", id);
              Person person = (Person)query.uniqueResult();
              
              return person ;
              
          }
         catch(HibernateException ex){
             System.out.println(ex);
        
             return null;
         }
      
   }
   
  public boolean updateProduct(Person person)
   {
          try{
            
              SessionFactory ses = hibernateConfig.createSessionFactory();
              Session session = ses.openSession();
              Transaction transaction = session.beginTransaction();
              session.saveOrUpdate(session.merge(person));
              transaction.commit();
              session.close();           
      
              return true;
              
          }
         catch(HibernateException ex){
             System.out.println(ex);
        
             return false;
         }
   }

  public boolean deletePerson(int id)
   {
          try{
            
              SessionFactory ses = hibernateConfig.createSessionFactory();
              Session session = ses.openSession();
              Transaction transaction = session.beginTransaction();
              Person person = new Person();
              person.setId(id);
              session.delete(person);
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
        
        Person per = new Person();
        
        
        per.deletePerson(21);
        
        
        
        
    }

    
    
    
    
    
    
    
}
