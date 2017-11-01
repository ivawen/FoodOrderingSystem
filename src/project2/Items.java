package project2;

import java.util.ArrayList;

/**
 * Created by ivawen on 10/24/2016.
 */
public class Items  {
    private ArrayList<AdditionalItems> toppings = new ArrayList<AdditionalItems>();
    private ArrayList<AdditionalItems> drinks = new ArrayList<AdditionalItems>();
    private ArrayList<AdditionalItems> creamery = new ArrayList<AdditionalItems>();

    public Items (){
        populateItems();
    }

    public ArrayList<AdditionalItems> getToppings() {
        return toppings;
    }

    public ArrayList<AdditionalItems> getDrinks() {
        return drinks;
    }

    public ArrayList<AdditionalItems> getCreamery() {
        return creamery;
    }

    public AdditionalItems getDrinks(int i){
        return drinks.get(i);
    }
    public AdditionalItems removeTopping(int i){
        return toppings.remove(i);
    }

    public void clearToppings (){
         toppings.clear();
    }
    //return all toppings as string
    public String getAllToppingItems(){
        String aTopping = "";
        aTopping += "Toppings:" + toppings.size() +"\n";
        for (int i = 0; i<toppings.size();i++ ){
            AdditionalItems item = toppings.get(i);
            // ade name and price
            aTopping += "T" + (i+1) + " " + item.toString()+"\n";
        }
        return aTopping;
    }
    public String getAllDrinks(){
        String aTopping = "";
        aTopping += "Drinks:" + drinks.size() +"\n";
        for (int i = 0; i<drinks.size();i++ ){
            AdditionalItems item = drinks.get(i);
            // ade name and price
            aTopping += "D" + (i+1) + " " + item.toString()+"\n";
        }
        return aTopping;
    }

    public String getAllCreamery(){
        String aTopping = "";
        aTopping += "Creamery:" + creamery.size() +"\n";
        for (int i = 0; i<creamery.size();i++ ){
            AdditionalItems item = creamery.get(i);
            // ade name and price
            aTopping += "C" + (i+1) + " " + item.toString()+"\n";
        }
        return aTopping;
    }
    public void populateItems (){
        toppings.add(new AdditionalItems("Tomato\t\t", 1.5));
        toppings.add(new AdditionalItems("lettuce\t\t", 0.75));
        toppings.add(new AdditionalItems("Mayo\t\t", 0.45));
        toppings.add(new AdditionalItems("Onion\t\t", 0.70));
        toppings.add(new AdditionalItems("Jalapenos\t", 0.5));
        toppings.add(new AdditionalItems("Mushroom\t", 1.0));
        toppings.add(new AdditionalItems("Garlic\t\t", 0.55));
        toppings.add(new AdditionalItems("Beans\t\t", 0.35));
        toppings.add(new AdditionalItems("Cheddar chiz", 1.20));

        drinks.add(new AdditionalItems("Coca Cola\t","12oz",2.0));
        drinks.add(new AdditionalItems("Pepsi\t\t","12oz",1.75));
        drinks.add(new AdditionalItems("Water\t\t","12oz",1.5));

        creamery.add(new AdditionalItems("Vanilla shake\t\t",2.30));
        creamery.add(new AdditionalItems("Strawberry shake\t",3.00));
        creamery.add(new AdditionalItems("Fresh banana\t\t", 3.50));
        creamery.add(new AdditionalItems("Peanut Butter Banana",3.23));
        creamery.add(new AdditionalItems("Chocolate Chip\t\t",3.60));
    }

    public String toString(){
        String items = "";
        items += "Items List: \n";
        items += getAllToppingItems() +"\n";
        items += getAllDrinks() +"\n";
        items += getAllCreamery()+ "\n";
        return items;
    }

}
