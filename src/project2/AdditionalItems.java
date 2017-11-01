package project2;

import java.text.NumberFormat;

/**
 * Created by ivawen on 10/12/2016.
 */

public class AdditionalItems {

    private String name;
    private double price;
    private String size;
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

    public AdditionalItems(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public AdditionalItems(String name, String size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        if (size != null){return "[" + "("+ size +") "+ name + " --> " +  numberFormat.format(price)+"]";}
             else {return "["+name + " --> " +  numberFormat.format(price)+"]";}
    }
}
