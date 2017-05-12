/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.Controller;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author Mohamed-A.Radwan
 */
@Entity
@Table(name = "currency")
public class Currency implements Serializable {
    @Id @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "conversionValue")
    private double conversionValue;

    public void setConversionValue(double conversionValue) {
        this.conversionValue = conversionValue;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getConversionValue() {
        return conversionValue;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    
}
