/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.Controller;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
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
@Table(name = "address")
public class Address {
    @Column(name = "id")
    @Id @GeneratedValue
    private int    id;
    @Column(name = "name")
    private String name;
    @Column(name = "parent_id")
    private int Parent_id;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParent_id(int parent_id) {
        this.Parent_id = parent_id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getParent_id() {
        return Parent_id;
    }
    public static SessionFactory createSessionFactory() {
    Configuration configuration = new Configuration();
    configuration.configure("hibernate.cfg.xml");
    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
            configuration.getProperties()).build();
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    return sessionFactory;
}
//    public static void main(String[] args) {
//          try {
//            SessionFactory ses = createSessionFactory();
//            Session session = ses.openSession();
//            Transaction transaction = session.beginTransaction();
//            Address address=new Address();
//            address.setName("Mdar");
//            address.setParent_id(3);
//            session.save(address);
//            transaction.commit();
//            session.close();
//            System.out.println("success");
//            System.exit(0);
//        }
//            catch(Exception e){
//            e.printStackTrace();
//            System.exit(0);
//        
//        }
//    }
//   
}
