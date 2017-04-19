/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.GUI;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Lobna
 */
public class Cart extends Window{
    
    Card a = new Card();
    Card b = new Card();
    Card c = new Card();
    Card x = new Card();
    Card y = new Card();
    Card z = new Card();
    Card z1 = new Card();
    Card z2 = new Card();
    Card z3 = new Card();
    Card z4 = new Card();
    JPanel panel = new JPanel();
    JScrollPane scrollPane;
    JLabel total = new JLabel("Total Price");
    JLabel price = new JLabel("xxx$");
    JButton buy = new JButton("Continue to checkout");
    JButton home = new JButton("Home");

    public Cart(String title) {
        super(title);
        
        panel.setLayout(new GridLayout(0,3,5,10));
        panel.add(a.product);
        panel.add(b.product);
        panel.add(c.product);
        panel.add(x.product);
        panel.add(z.product);
        panel.add(z1.product);
        panel.add(z2.product);
        panel.add(z3.product);
        panel.add(z4.product);
        scrollPane = new JScrollPane(panel);
        scrollPane.setBounds(150, 150 , 500 , 500);
        add(scrollPane);
        panel.setBackground(new Color(197,239,247));
        
        total.setBounds(scrollPane.getBounds().x - 50, scrollPane.getBounds().y + 520, 100, 50);
        add(total);
        total.setForeground(Color.white);
        
        price.setBounds(total.getBounds().x+80, total.getBounds().y, 100, 50);
        add(price);
        price.setForeground(Color.white);
        
        buy.setBounds(total.getBounds().x + 400, total.getBounds().y, 180, 50);
        add(buy);
        buy.addActionListener(this);
        
        home.setBounds(logo.getBounds().x + 600, logo.getBounds().y+20, 100, 30);
        add(home);
        home.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Continue to checkout")) {
            back x = new back();
            x.Back=1;
            this.setVisible(false);
            new PaymentMethod("Payment Method").setVisible(true);
        }
        else if (ae.getActionCommand().equals("Home")){
            this.setVisible(false);
            new Home("Home").setVisible(true);
        }
    }
    
}
