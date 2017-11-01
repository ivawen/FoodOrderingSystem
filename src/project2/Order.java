package project2;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ivawen on 10/16/2016.
 */
public class Order  {
    private static int orderNum = 0;
    private ArrayList<Hamburger> order = new ArrayList<Hamburger>();

    //const
    public Order (){
    }
    //get item from the order
    public Hamburger getHamb(int i){
        return order.get(i);
    }
    //add item to order
    public void addItem(Hamburger hamb){
        order.add(hamb);
    }
   // clear the order

    public void clearOrder(){
        order.clear();
    }

    //remove item from order
    public void removeHamb(Hamburger hamb){
        order.remove(hamb);
    }
    //get order size
    public int getSize(){
        return order.size();
    }
    public int getOrderNumber(){
        return orderNum;
    }
    public void incrementOrderNum(){
        orderNum++;
    }
    // get random server for order
    public String gertServer (){
        Random rand = new Random();
        int n = rand.nextInt(7)+1;
        switch (n){
            case 1:
                return "Red";
            case 2:
                return "Melissa";
            case 3:
                return "Jim";
            case 4:
                return "Emily";
            case 5:
                return "Zach";
            default:
                return "No server ";
        }
    }
    @Override
    public String toString() {
        String str ="";
        for (int i =0; i <order.size();i++){
            str += order.get(i).toString();
        }
        return str;
    }
}
