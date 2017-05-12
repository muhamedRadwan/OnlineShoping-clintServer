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
import javax.persistence.Table;

/**
 *
 * @author Mohamed-A.Radwan
 */
@Entity(name = "person")
@Inheritance(strategy = InheritanceType.JOINED  )
@DiscriminatorColumn(name = "type_id")
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
    
    
}
