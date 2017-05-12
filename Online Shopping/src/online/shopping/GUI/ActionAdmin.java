/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.GUI;

import java.util.ArrayList;

/**
 *
 * @author Lobna
 */
public class ActionAdmin {
    
    int ID;
    String Name;
    String UserName;
    String Mail;
    String Pass;
    
    public ActionAdmin(){
        
    }
    
    public void SetData(String id, String name, String username, String mail, String pass){
        ID = Integer.parseInt(id);
        Name = name;
        UserName = username;
        Mail = mail;
        Pass = pass;
    }
    
    public void getData(){
        
    }
    public void search(String search){
        this.ID = Integer.parseInt(search);
        
    }
    public void deactivate(String search){
        this.ID = Integer.parseInt(search);
    }
}
