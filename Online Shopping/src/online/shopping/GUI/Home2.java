/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.GUI;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author Lobna
 */
public class Home2 extends Window{
    private JButton login = new JButton("login");
    private JButton register = new JButton("Sign up");
    private JButton cart = new JButton ("Cart");
    String[] man = {"Men","T-shirst", "Shirts", "Blazer", "Trousers"};
    String[] woman = {"Women","Basic", "Cardigan", "Dress", "Skirt"};
    String[] kid = {"Kids","New Born(0-9months)", "Baby Girls(4-24months)", "Baby Boys{4-24months}"};
    JComboBox men = new JComboBox(man);
    JComboBox women = new JComboBox(woman);
    JComboBox kids = new JComboBox(kid);
    JLabel SORT = new JLabel("Sort");
    JLabel filter = new JLabel("Filter");
    String[] Sort = {"A-Z", "Z-A", "Price"};
    JComboBox sort = new JComboBox(Sort);
    Card x = new Card();
    
    public Home2(String s) {
        super(s);
        
        login.setBounds(logo.getBounds().x + 400, logo.getBounds().y + 50, 100, 30);
        add(login);
        login.addActionListener(this);
        register.setBounds(login.getBounds().x + 120, login.getBounds().y, 100, 30);
        add(register);
        register.addActionListener(this);
        cart.setBounds(register.getBounds().x + 120, register.getBounds().y, 100, 30);
        add(cart);
        cart.addActionListener(this);
        
        men.setBounds(logo.getBounds().x+150, logo.getBounds().y+150, 80, 30);
        add(men);
        women.setBounds(men.getBounds().x + 85, men.getBounds().y, 80, 30);
        add(women);
        kids.setBounds(women.getBounds().x + 85, men.getBounds().y, 150, 30);
        add(kids);
        
       // x.image().setBounds(men.getBounds().x , men.getBounds().y+50 , 150 , 250);
     //   add(x);
        
        SORT.setBounds(men.getBounds().x - 130, men.getBounds().y+50, 80, 30);
        add(SORT);
        sort.setBounds(SORT.getBounds().x, SORT.getBounds().y+25, 80, 30);
        add(sort);
        
        filter.setBounds(sort.getBounds().x, sort.getBounds().y+30, 80, 30);
        add(filter);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Sign up")){
            this.setVisible(false);
            Register reg = new Register ("Register");
            reg.setVisible(true);
        }
        if(ae.getActionCommand().equals("login")){
            this.setVisible(false);
            login log = new login("Login");
            log.setVisible(true);
        }
        if(ae.getActionCommand().equals("Cart")){
            System.out.println("Items are here");
        }
    }
}
