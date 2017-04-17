/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.GUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Lobna
 */
public class Card extends JFrame{

    ImageIcon img = new ImageIcon(getClass().getResource("/online/shopping/GUI/Images/3_4_length_faux_wool_reefer_coat_camel1344009661.jpg"));
    JLabel product = new JLabel();
    
    public Card() {
        
        setSize(150,250);
        product.setBounds(25, 25, 200, 300);
        product.setIcon(img);
        image();
        
    }
    public void image (){
        add(product);
    }
}
