package project2;

import java.util.ArrayList;

/**
 * Created by Redouane on 10/10/2016.
 */
public class DeluxeHamburger extends Hamburger {
    public DeluxeHamburger() {
        super("Deluxe ", "Sausage & Bacon", 9.52,"White");

        super.getToppings().add(new AdditionalItems("Chips", 2.75));
        super.getToppings().add(new AdditionalItems("Drink",1.80));
    }


    public void DeluxeHamburger(ArrayList<AdditionalItems> additionalItems) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
    // double price = hamburger.makeBurger();
    //        hamburger.additionalItems.add(new AdditionalItems("Tomato", 0.5));
//        hamburger.additionalItems.add(new AdditionalItems("Lettuce", 0.75));
//        hamburger.additionalItems.add(new AdditionalItems("Cheese", 1.13));
//        System.out.println("total ham price is$: " + hamburger.makeBurger());
//
//        NaturalHamburger naturalBurger = new NaturalHamburger("Bacon" , 5.67);
//        naturalBurger.additionalItems.add(new AdditionalItems("Egg", 3.43));
//        naturalBurger.additionalItems.add(new AdditionalItems("Lentils", 2.41));
//        naturalBurger.additionalItems.add(new AdditionalItems("Dijon mustard", 1.0));
//        System.out.println("< Total natural Burger price is $" + naturalBurger.makeBurger()+" >");
//
//        DeluxeHamburger db = new DeluxeHamburger();
//        db.additionalItems.add(new AdditionalItems("carrot", 2.0));
//        System.out.println("< Total deluxe burger price is $" + db.makeBurger()+" >");
}


