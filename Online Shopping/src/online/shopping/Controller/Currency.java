/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.Controller;

/**
 *
 * @author Mohamed-A.Radwan
 */
public class Currency {
    private int id;
    private String name;
    private String conversionValue;

    public void setConversionValue(String conversionValue) {
        this.conversionValue = conversionValue;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConversionValue() {
        return conversionValue;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    
}
