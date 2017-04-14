/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.GUI;

import java.awt.Button;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mohamed-A.Radwan
 */
public class AddEmployee extends Home{
    JButton logout;
    JLabel username,userType;
    JPanel panelName;
    
    public AddEmployee() {
        initjButton1("Logout", true);
        initjButton2("", false);
        setjPanel2(false);
        setVisible(true);
        logout=getjButton1();
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }

            private void jButton1ActionPerformed(ActionEvent evt) {
                 int dialogResult = JOptionPane.showConfirmDialog (null, "Are You Sure ?","Warning",JOptionPane.YES_NO_OPTION);
                    if(dialogResult == JOptionPane.YES_OPTION){
                         setVisible(false);
                         Home2 x=new Home2("Home");
                         x.setVisible(true);
                        }
            }
        });
        
        panelName =getjPanelName();
        userType=getJLtype();
        username=getJLUserName();
        userType.setText("Admin");
        username.setText("Test2");
        panelName.setVisible(true);
        
    }
   
}
