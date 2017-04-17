/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.GUI;

import java.util.ArrayList;

/**
 *
 * @author mohamedRadwan
 */
/*
Type         ID
Category     1 //Tops Short Pants
Brand        2
Condition    3 //New OLd 
Price        4
Display Type 5//if watches


*/
public class Filter {
    String filterName;
    int    Type;
    ArrayList<String> FilterOption; 

    public String getFilterName() {
        return filterName;
    }

    public ArrayList<String> getFilterOption() {
        return FilterOption;
    }

    public int getType() {
        return Type;
    }

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    public void setFilterOption(ArrayList<String> FilterOption) {
        this.FilterOption = FilterOption;
    }

    public void setType(int Type) {
        this.Type = Type;
    }
    
}
