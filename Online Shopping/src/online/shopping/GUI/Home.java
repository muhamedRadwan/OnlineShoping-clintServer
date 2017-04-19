/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Lobna
 */
public class Home extends Window {

    private JButton login = new JButton("login");
    private JButton register = new JButton("Sign up");
    private JButton cart = new JButton("Cart");
    String[] man = {
        "Men",
        "T-shirst",
        "Shirts",
        "Blazer",
        "Trousers"
    };
    String[] woman = {
        "Women",
        "Basic",
        "Cardigan",
        "Dress",
        "Skirt"
    };
    String[] kid = {
        "Kids",
        "New Born(0-9months)",
        "Baby Girls(4-24months)",
        "Baby Boys{4-24months}"
    };
    JComboBox men = new JComboBox(man);
    JComboBox women = new JComboBox(woman);
    JComboBox kids = new JComboBox(kid);
    JLabel SORT = new JLabel("Sort");
    JLabel filter = new JLabel("Filter");
    JPanel filterOptions, filterArea;
    String[] Sort = {
        "A-Z",
        "Z-A",
        "Price"
    };
    ArrayList<Card>cards;
    JPanel panel = new JPanel();
    JScrollPane scrollPane;
    JComboBox sort = new JComboBox(Sort);
    Font font;
    ArrayList< Filter> filterList;

    public Home(String title) {
        super(title);
        filterOptions = new JPanel();
        filterArea = new JPanel();
        filterList = new ArrayList<>(10);
        font = new Font("Arail", Font.BOLD, 25);
        //Testing Can Deleted
        Filter ss = new Filter();
        Filter ss1 = new Filter();
        ss.setFilterName("Brand");
        ss1.setFilterName("Price");
        ss.setType(2);
        ss1.setType(4);
        ArrayList< String> name = new ArrayList<>();
        name.add("asd1");
        name.add("asd1");
        name.add("asd1");
        name.add("asd1");
        name.add("asd2");
        name.add("asd3");
        ss.setFilterOption(name);
        filterList.add(ss);
        filterList.add(ss);
        filterList.add(ss1);
        filterList.add(ss);
        //End Testing Area
        login.setBounds(logo.getBounds().x + 400, logo.getBounds().y + 50, 100, 30);
        add(login);
        login.addActionListener(this);
        register.setBounds(login.getBounds().x + 120, login.getBounds().y, 100, 30);
        add(register);
        register.addActionListener(this);
        cart.setBounds(register.getBounds().x + 120, register.getBounds().y, 100, 30);
        add(cart); 
        cart.addActionListener(this);

        men.setBounds(logo.getBounds().x + 150, logo.getBounds().y + 150, 80, 30);
        add(men);
        women.setBounds(men.getBounds().x + 85, men.getBounds().y, 80, 30);
        add(women);
        kids.setBounds(women.getBounds().x + 85, men.getBounds().y, 150, 30);
        add(kids);
        
        cards=new ArrayList<>(10);
        cards.add(new Card());
        cards.add(new Card());
        cards.add(new Card());
        cards.add(new Card());
        cards.add(new Card());
        cards.add(new Card());
        cards.add(new Card());
        cards.add(new Card());
        cards.add(new Card());
        cards.add(new Card());
        panel.setLayout(new GridLayout(0,3,5,10));
        cards.forEach((card)->{
        panel.add(card.product);
        });
        
        scrollPane = new JScrollPane(panel);
        scrollPane.setBounds(men.getBounds().x +100, men.getBounds().y+50 , 500 , 500);
        add(scrollPane);
        panel.addMouseListener(new MouseAdapter(){  

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                new Item("Item").setVisible(true);
                
            }
                 
            });

        SORT.setBounds(men.getBounds().x - 130, men.getBounds().y + 50, 80, 30);
        add(SORT);
        sort.setBounds(SORT.getBounds().x, SORT.getBounds().y + 25, 80, 30);
        add(sort);

        /*
            Set Filter Area 
            Filter Area The Area THat hold FIlter Name and its Options
            Filter Option The Option Of Filter
            Problems : some white space  betwwen all panels 
         */
        //Set The Position And Border And Layout Of FilterArea  and Font
        filterArea.setBounds(sort.getBounds().x, sort.getBounds().y + 30, 200, 400);
        filterArea.setBorder(new BevelBorder(1, Color.black, Color.lightGray));
        //set Layout  Grid with any number of Rows and 1 colmun
        GridLayout s=new GridLayout(0,1);
        s.setHgap(0);
        s.setVgap(0);
        filterArea.setLayout(s);
        filterArea.setFont(font);
        //set Filter Option Layout and Border
        //set Layout  Grid with any number of Rows and 1 colmun
        filterOptions.setLayout(s);
        filterOptions.setBorder(new EmptyBorder(0, 0, 0, 0));

        //Panl To Save in it JLabel--> Filter
        JPanel FilterWordHolder = new JPanel();
        FilterWordHolder.add(filter);
        filterArea.add(FilterWordHolder); //Add Filter Word To Filter Area
        //Calling Function  That Fill Filters Options panel  By Data
        SetFiliter(filterList);

        //Make Scrooll pane To Hold All Options Of Filters
        JScrollPane scrollPane = new JScrollPane(filterOptions);
        filterArea.add(scrollPane); //Add it to Filter Area
        //Add Filter Area To Main Frame (Home Frame)
        add(filterArea);

    }

    /*
     take Array List Of Filters And Fill Filiter Option By it 
     Return --> none
     Should Call it :
             1-When user Change Category
             2-In Constractor of Home
     */
    void SetFiliter(ArrayList< Filter> filterList) {
        
        //Fill Array List FilterList By data That Come From Calling
        this.filterList = filterList;
        
        //For loop For every filter Object in List 
        filterList.forEach((filiter) -> {
            
            JPanel panelHoldOption = new JPanel(); //Jpanel That Hold every Option Type
            
            //set Layout Grid with any number of Rows  and 1 colmun
            panelHoldOption.setLayout(new GridLayout(0, 1));
            
            //Label Hold the Name Of Option
            JLabel lNameOption = new JLabel(filiter.getFilterName());
            lNameOption.setFont(font);
            panelHoldOption.add(lNameOption);
            
            if(filiter.getType()!=4) {
                    for (String Option : filiter.getFilterOption()) {
                    //Make Check Box With name Of Option
                    JCheckBox chackBox = new JCheckBox(Option);
                    chackBox.setFont(new Font("Arial", Font.BOLD, 18));
                    panelHoldOption.add(chackBox);
                    //Add Panel of one Option To Panel Of Options
                    filterOptions.add(panelHoldOption);
                }
            } else //This Object is Price
                {
                    JPanel pHoldPrice=new  JPanel();
                    pHoldPrice.setBorder(null);
                    
                    JTextField minPrice=new JTextField(3);
                    JTextField maxPrice=new JTextField(3);
                    minPrice.setFont(font);
                    maxPrice.setFont(font);
                    pHoldPrice.add(minPrice);
                    pHoldPrice.add(maxPrice);
                    filterOptions.add(panelHoldOption);
                    filterOptions.add(pHoldPrice);
                }

        });

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Sign up")) {
            this.setVisible(false);
            Register reg = new Register("Register");
            reg.setVisible(true);
        }
        if (ae.getActionCommand().equals("login")) {
            this.setVisible(false);
            login log = new login("Login");
            log.setVisible(true);
        }
        if (ae.getActionCommand().equals("Cart")) {
            this.setVisible(false);
            new Cart("Cart").setVisible(true);
        }
    }
}
