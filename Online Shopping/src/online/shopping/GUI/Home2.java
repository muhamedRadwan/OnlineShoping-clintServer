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
    JLabel sort = new JLabel("Sort");
    JCheckBox a_z = new JCheckBox("A-Z");
    JCheckBox z_a = new JCheckBox("Z-A");
    JCheckBox price = new JCheckBox("Price");
    
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
        
        men.setBounds(logo.getBounds().x+150, logo.getBounds().y+150, 80, 30);
        add(men);
        women.setBounds(men.getBounds().x + 85, men.getBounds().y, 80, 30);
        add(women);
        kids.setBounds(women.getBounds().x + 85, men.getBounds().y, 150, 30);
        add(kids);
        
        sort.setBounds(men.getBounds().x - 130, men.getBounds().y+50, 80, 10);
        add(sort);
        a_z.setBounds(sort.getBounds().x, sort.getBounds().y + 20, 50, 20);
        add(a_z);
        z_a.setBounds(a_z.getBounds().x, a_z.getBounds().y + 30, 50, 30);
        add(z_a);
        price.setBounds(z_a.getBounds().x, z_a.getBounds().y + 30, 100, 50);
        add(price);
        
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
    }
}
