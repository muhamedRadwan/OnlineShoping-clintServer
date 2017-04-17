/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Lobna
 */
public class login extends Window implements ActionListener{

    private JButton loginButton = new JButton("Login");
    private JButton homeButton = new JButton("Home");
    private JTextField []arrtextfields = new JTextField[2];
    private JLabel []arrlabel = new JLabel[3];
    private ImageIcon img;
    
    public login(String title) {
        super(title);
        
        setLocation(400,100);
        setSize(500,500);
        
        arrlabel [0] = new JLabel("User Name");
        arrlabel[0].setBounds(logo.getBounds().x, logo.getBounds().y+150 , 100 , 20);
        add(arrlabel[0]);
        arrtextfields [0] = new JTextField(20);
        arrtextfields[0].setBounds(arrlabel[0].getBounds().x+70,arrlabel[0].getBounds().y,arrlabel[0].getBounds().width + 50,arrlabel[0].getBounds().height);
        add(arrtextfields[0]);
     
        arrlabel [1] = new JLabel("Password");
        arrlabel[1].setBounds(logo.getBounds().x,arrlabel[0].getBounds().y + 30,100,20);
        add(arrlabel[1]);
        arrtextfields[1] = new JTextField(20);
        arrtextfields[1].setBounds(arrlabel[1].getBounds().x+70,arrlabel[1].getBounds().y,arrlabel[1].getBounds().width + 50,arrlabel[1].getBounds().height);
        add(arrtextfields[1]);
        
        loginButton.setBounds(arrtextfields[1].getBounds().x,arrtextfields[1].getBounds().y+60, 100, 40);
        add(loginButton);
        loginButton.addActionListener(this);
        
        homeButton.setBounds(loginButton.getBounds().x + 200, loginButton.getBounds().y, 100, 40);
        add(homeButton);
        homeButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Login")){
            notimplmented imp = new notimplmented(this);
        }
        if(ae.getActionCommand().equals("Home")){
            this.setVisible(false);
            new Home("Home").setVisible(true);
        }
    }
}
