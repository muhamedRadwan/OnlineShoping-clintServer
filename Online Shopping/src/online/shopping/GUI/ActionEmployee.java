/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.GUI;

/**
 *
 * @author Lobna
 */
public class ActionEmployee {
    
    int ID;
    String Name;
    float Price;
    String Category;
    int Size;
    String Color;
    String Descripe;
    String Img;
    
    public ActionEmployee(){
        
    }
    
    public void SetData(String id, String name, String price, String category, String size, String color, String descripe, String img){
        ID = Integer.parseInt(id);
        Name = name;
        Price = Float.parseFloat(price);
        Category = category;
        Size = Integer.parseInt(size);
        Color = color;
        Descripe = descripe;
        Img = img;
    }
    
    public void Search(String id){
        ID = Integer.parseInt(id);
        
    }
    public void delete(String search){
        this.ID = Integer.parseInt(search);
    }
    
}
