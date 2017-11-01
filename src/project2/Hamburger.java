package project2;

import java.util.ArrayList;

/**
 * Created by ivawen on 10/10/2016.
 */
public class Hamburger extends Items {

    private String name;
    private String breadType;
    private String meat;
    private double price;
    private ArrayList<Items> item;

    public Hamburger(){
        this.item = new ArrayList<Items>();
    }

    public Hamburger(String name, String meat, double price, String breadType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadType = breadType;
    }

    public double getPrice() {
        return price;
    }

    public double makeBurger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + "hamburger" + " on a " + this.breadType + " roll,"
                + "with " + this.meat +", price is " + this.price);

        return hamburgerPrice;
    }

    public double addTopping() {
        double price = this.price;
        for (int i = 0; i < getToppings().size(); i++) {
            if (this.getToppings().get(i) != null) {
                price += this.getToppings().get(i).getPrice();
                System.out.println("Added " + this.getToppings().get(i).getName() + " for ana extra " +
                        this.getToppings().get(i).getPrice());
            }
        }
        return price;
    }

    public void printItems(){
        System.out.println("Choose your topping " );
        for (int i =0 ; i<getToppings().size();i++){
            System.out.println((i+1) + "." + getToppings().get(i).getName() +" "+
                    getToppings().get(i).getPrice());
        }
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "breadType='" + breadType + '\'' +
                ", name='" + name + '\'' +
                ", meat='" + meat + '\'' +
                ", price=" + price +
                ", item=" + item +
                '}';
    }
}

