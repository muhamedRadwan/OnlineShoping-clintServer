/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.GUI;

import online.shopping.Controller.CartItem;
import online.shopping.Controller.Customer;
import online.shopping.Controller.Guest;
import online.shopping.Controller.Product;

/**
 *
 * @author Lobna
 */
public class PaymentMethod extends javax.swing.JFrame {

    /**
     * Creates new form PaymentMetho
     */
    public PaymentMethod(String title) {
        super (title);
        initComponents();
        Customer cust=login.cust;
        if(cust != null)
            cust.MakeOrder(cust);
        StringBuilder st=new StringBuilder();
        st.append("Product name            Quantity           Price");
        Product prod;
        int amount;
        double price;
        for(CartItem cart:cust.getCartItem()){
           prod =  cart.getProduct();
           amount = cart.getQuantity();
           price=amount*prod.getPrice();
           st.append(prod.getName()).append("%12s").append(amount).append("%8s").append(price);
        }
        System.out.println(st.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Add = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Logout = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        PPaymentMethod = new javax.swing.JPanel();
        PCash = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        PCreditCard = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cardNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Year = new javax.swing.JTextField();
        Sec = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Month = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        PPayPal = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        Cash = new javax.swing.JButton();
        CreditCard = new javax.swing.JButton();
        PayPal = new javax.swing.JButton();
        Back = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 500));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address");

        Name.setBackground(new java.awt.Color(36, 47, 65));
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("John");
        Name.setBorder(null);
        Name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NameMouseClicked(evt);
            }
        });

        Add.setBackground(new java.awt.Color(36, 47, 65));
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setText("61st,");
        Add.setBorder(null);
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(0, 204, 204));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Logout");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LogoutLayout = new javax.swing.GroupLayout(Logout);
        Logout.setLayout(LogoutLayout);
        LogoutLayout.setHorizontalGroup(
            LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoutLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel11)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        LogoutLayout.setVerticalGroup(
            LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        PPaymentMethod.setBackground(new java.awt.Color(36, 47, 65));
        PPaymentMethod.setVisible(false);
        PPaymentMethod.setLayout(new java.awt.CardLayout());

        PCash.setBackground(new java.awt.Color(36, 47, 65));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pay cash when your product is delivered");

        jButton2.setText("Confirm Order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PCashLayout = new javax.swing.GroupLayout(PCash);
        PCash.setLayout(PCashLayout);
        PCashLayout.setHorizontalGroup(
            PCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCashLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(PCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PCashLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jButton2)))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        PCashLayout.setVerticalGroup(
            PCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCashLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        PPaymentMethod.add(PCash, "card2");

        PCreditCard.setBackground(new java.awt.Color(36, 47, 65));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("/");

        cardNo.setBackground(new java.awt.Color(153, 153, 153));
        cardNo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cardNoMouseDragged(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Card Number");

        jButton3.setText("Confirm Order");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" on the signature panel of your card.");

        Year.setBackground(new java.awt.Color(153, 153, 153));

        Sec.setBackground(new java.awt.Color(153, 153, 153));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total Amount");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("###$");

        Month.setBackground(new java.awt.Color(153, 153, 153));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("The 3 digits after the card number");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Expire Date");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Security code");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Month/Year");

        javax.swing.GroupLayout PCreditCardLayout = new javax.swing.GroupLayout(PCreditCard);
        PCreditCard.setLayout(PCreditCardLayout);
        PCreditCardLayout.setHorizontalGroup(
            PCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCreditCardLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(PCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PCreditCardLayout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(37, 37, 37)
                            .addComponent(Sec))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PCreditCardLayout.createSequentialGroup()
                            .addGroup(PCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel12))
                            .addGap(38, 38, 38)
                            .addGroup(PCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cardNo)
                                .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PCreditCardLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(PCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(PCreditCardLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14))
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        PCreditCardLayout.setVerticalGroup(
            PCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCreditCardLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(PCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cardNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(PCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(44, 44, 44)
                .addGroup(PCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        PPaymentMethod.add(PCreditCard, "card3");

        PPayPal.setBackground(new java.awt.Color(36, 47, 65));

        jButton4.setText("Confirm Order");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("e-mail");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Password");

        mail.setBackground(new java.awt.Color(36, 47, 65));
        mail.setForeground(new java.awt.Color(255, 255, 255));
        mail.setText("example@ex.com");
        mail.setBorder(null);
        mail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mailMouseClicked(evt);
            }
        });

        pass.setBackground(new java.awt.Color(36, 47, 65));
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setText("sdffa");
        pass.setBorder(null);
        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PPayPalLayout = new javax.swing.GroupLayout(PPayPal);
        PPayPal.setLayout(PPayPalLayout);
        PPayPalLayout.setHorizontalGroup(
            PPayPalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPayPalLayout.createSequentialGroup()
                .addGroup(PPayPalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PPayPalLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jButton4))
                    .addGroup(PPayPalLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(PPayPalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel15)
                            .addGroup(PPayPalLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(23, 23, 23)))
                        .addGap(18, 18, 18)
                        .addGroup(PPayPalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator4)
                            .addComponent(pass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        PPayPalLayout.setVerticalGroup(
            PPayPalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PPayPalLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(PPayPalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PPayPalLayout.createSequentialGroup()
                        .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PPayPalLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );

        PPaymentMethod.add(PPayPal, "card4");

        Cash.setText("Cash");
        Cash.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashActionPerformed(evt);
            }
        });

        CreditCard.setText("Credit Card");
        CreditCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditCardActionPerformed(evt);
            }
        });

        PayPal.setText("PayPal");
        PayPal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayPalActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(0, 204, 204));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Back");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BackLayout = new javax.swing.GroupLayout(Back);
        Back.setLayout(BackLayout);
        BackLayout.setHorizontalGroup(
            BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackLayout.setVerticalGroup(
            BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("qwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\nqwjnjsaj\nsadnjsajns\n");
        jScrollPane1.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Your Order");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CreditCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PayPal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cash, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(PPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator2)
                                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Cash, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(CreditCard, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(PayPal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameMouseClicked
        // TODO add your handling code here:
        Name.setText("");
    }//GEN-LAST:event_NameMouseClicked

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        // TODO add your handling code here:
        Add.setText("");
    }//GEN-LAST:event_AddMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        new logout(this);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
        new logout(this);
    }//GEN-LAST:event_LogoutMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cardNoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardNoMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNoMouseDragged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        logout log = new logout(this);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void mailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailMouseClicked
        // TODO add your handling code here:
        mail.setText("");
    }//GEN-LAST:event_mailMouseClicked

    private void passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseClicked
        // TODO add your handling code here:
        pass.setText("");
    }//GEN-LAST:event_passMouseClicked

    private void CashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashActionPerformed
        // TODO add your handling code here:
        PPaymentMethod.setVisible(true);
        //Deleting all panel
        PPaymentMethod.removeAll();
        PPaymentMethod.repaint();
        PPaymentMethod.revalidate();

        //Adding panel
        PPaymentMethod.add(PCash);
        PPaymentMethod.repaint();
        PPaymentMethod.revalidate();
    }//GEN-LAST:event_CashActionPerformed

    private void CreditCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditCardActionPerformed
        // TODO add your handling code here:
        PPaymentMethod.setVisible(true);
        //Deleting all panel
        PPaymentMethod.removeAll();
        PPaymentMethod.repaint();
        PPaymentMethod.revalidate();

        //Adding panel
        PPaymentMethod.add(PCreditCard);
        PPaymentMethod.repaint();
        PPaymentMethod.revalidate();
    }//GEN-LAST:event_CreditCardActionPerformed

    private void PayPalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayPalActionPerformed
        // TODO add your handling code here:
        PPaymentMethod.setVisible(true);
        //Deleting all panel
        PPaymentMethod.removeAll();
        PPaymentMethod.repaint();
        PPaymentMethod.revalidate();

        //Adding panel
        PPaymentMethod.add(PPayPal);
        PPaymentMethod.repaint();
        PPaymentMethod.revalidate();
    }//GEN-LAST:event_PayPalActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Item("Product").setVisible(true);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Item("Product").setVisible(true);
    }//GEN-LAST:event_BackMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Add;
    private javax.swing.JPanel Back;
    private javax.swing.JButton Cash;
    private javax.swing.JButton CreditCard;
    private javax.swing.JPanel Logout;
    private javax.swing.JTextField Month;
    private javax.swing.JTextField Name;
    private javax.swing.JPanel PCash;
    private javax.swing.JPanel PCreditCard;
    private javax.swing.JPanel PPayPal;
    private javax.swing.JPanel PPaymentMethod;
    private javax.swing.JButton PayPal;
    private javax.swing.JTextField Sec;
    private javax.swing.JTextField Year;
    private javax.swing.JTextField cardNo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField mail;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
