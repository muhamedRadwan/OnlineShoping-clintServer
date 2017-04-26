/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping;

/**
 *
 * @author Mohamed-A.Radwan
 */
public class Person {
    private String Fname;
    private String Lname;
    private String password;
    private int    type;

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setType(int type) {
        this.type = type;
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

    public int getType() {
        return type;
    }
    
    public boolean Addnotify(Notification notification){
        return false;
    }
    public boolean logout(){
        return false;
    }
}
