package online.shopping.Controller;

import online.shopping.Controller.Filter.FilterCriteria;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Mohamed-A.Radwan
 */
public class SystemTool {
    public static Collection<Object> search(String attName,String attValue,String classeName){
        try{
        Session session=hibernateConfig.createSessionFactory().openSession();
        Query query=session.createQuery("from "+classeName);
        Collection<Object> objects=query.list();
        Product s=new Product();
        s.setID(5);
        session.close();
        return objects;
        }catch(HibernateException ex)
        {
            System.out.println(ex);
        }
        return null;
    }
    
    
    public ArrayList<Product> filter(FilterCriteria filter,ArrayList<Product> Products){
        return null;
    }
    public ArrayList<Product> sort(int type){
        
        return null;
    }
    
    
    public static void main(String[] args) {
       Collection<Object> objects= search("Fname", "mohamed", "Person");
       if(objects != null){
           Iterator<Object>persons=objects.iterator();
          
           while(persons.hasNext()){
              Person e=(Person)persons.next();
               System.out.println(e.getId());
           }
       }
    }
}
