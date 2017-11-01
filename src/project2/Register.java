package project2;

import java.text.NumberFormat;

/**
 * Created by ivawen on 10/17/2016.
 */
public class Register {
    private static final double TAX = 0.07141;// sales tax
    private double total;
    private double subTotal;
    private NumberFormat numberForm = NumberFormat.getCurrencyInstance();

    Order order = new Order();

    //constructor
    public Register(Order order){
        this.order = order;
        order.incrementOrderNum();
    }

    public Register() {

    }

    public double getSubTotal() {
        return subTotal;
    }
    public double calcSubTotal(){
        for (int i = 0; i < order.getSize();i++){
            Hamburger hamb = order.getHamb(i);
            subTotal  += hamb.getPrice();
        }
        return subTotal;
    }

    public static double getTAX() {
        return TAX;
    }

    public double calcTax (){
        return subTotal * TAX;
    }
    public double calcTotal(){
        total = subTotal + calcTax();
        return total;
    }
    public void clearPayment(){
        subTotal = 0;
        total = 0;
    }
    public String checkPayment(double payment){
        if (payment == total){return "No change due";}
        else if (payment > total){
            return "Here is your change: " + numberForm.format(payment - total);}
        else {
            return "Please pay the full amount of: " + numberForm.format(total - payment);}
    }
    public String toString(){
        String str = "Order No. " + order.getOrderNumber() + "Server's name is: " + order.gertServer();
        str += order.toString();
        str += "Subtotal: " + numberForm.format(calcSubTotal() + "tax: " + numberForm.format(calcTax()) + "Total: "
                + numberForm.format(calcTotal()));
        return str;
    }
}
