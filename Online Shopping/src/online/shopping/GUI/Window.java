/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

/**
 *
 * @author Lobna
 */

public class Window extends javax.swing.JFrame implements ActionListener {

    String title ="" ;
    ImageIcon icon = new ImageIcon(getClass().getResource("/online/shopping/GUI/Images/logo.png"));
    JLabel logo = new JLabel();
    JFrame frame = new JFrame();
    
    
    public Window (String s){
        super (s);
        title = s;
        
        setLocation(300,10);
        setSize(800,800);
        setResizable(false);
        setLayout(null);
        //getContentPane().setBackground(Color.WHITE);
        logo.setIcon(icon);
        logo.setBounds(10, 10, 200, 100);
        add(logo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}