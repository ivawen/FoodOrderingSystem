package project2;

import java.util.ArrayList;

/**
 * Created by Redouane on 10/10/2016.
 */

public class NaturalHamburger extends Hamburger {

    ArrayList<AdditionalItems> toppingItems;


    public NaturalHamburger(String meat, double price) {
        super("Healthy ", meat, price, "Brown rice");
        this.toppingItems = new ArrayList<AdditionalItems>();
    }

    public ArrayList<AdditionalItems> getNaturalExtra() {
        return toppingItems;
    }

    @Override
    public double makeBurger() {
        double hamburgerPrice = super.makeBurger();

        for (int i = 0; i < toppingItems.size(); i++){
            if (this.toppingItems.get(i) != null){
                hamburgerPrice += this.toppingItems.get(i).getPrice();
                System.out.println("Added " + this.toppingItems.get(i).getName() + " for an extra " +
                                        this.toppingItems.get(i).getPrice());
            }
        }
        return hamburgerPrice;
    }
}
