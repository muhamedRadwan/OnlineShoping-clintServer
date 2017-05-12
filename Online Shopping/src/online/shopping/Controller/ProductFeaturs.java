/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.Controller;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Mohamed-A.Radwan
 */
@Entity
@Table(name = "product_feature")
public class ProductFeaturs {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int ID;
    @Column(name = "name") 
    private String Freaturstitle;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn()
    
    private Collection<String> featuresHash;

    public ProductFeaturs() {
    featuresHash=new ArrayList<>(10);
    }
    
    
}
