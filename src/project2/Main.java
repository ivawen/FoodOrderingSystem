package project2;


import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic ", "White", 4.57, "Sausage");
        //System.out.println(hamburger.makeBurger());
        Items items = new Items();
        //System.out.println(items.getAllDrinks());
        //System.out.println(items.toString());
        //System.out.println(hamburger.addTopping());

       //full System.out.println(items);
        System.out.println("Would you like to view the full items or just a section? [FULL] [SEC]");
        //Get the answer
        String answer = sc.next();
        //check answer
        while (!(answer.equalsIgnoreCase("full") || answer.equalsIgnoreCase("sec"))){
            System.out.println("Invalid input.Please enter again");
            answer = sc.next();// rescan input
        }
        if (answer.equalsIgnoreCase("full")){
            System.out.println(items);
        }else {
            System.out.println("Which section? [Toppings] [Drinks] [Creamery]");
        }
        String sec = sc.next().toLowerCase();

        while (!(sec.equalsIgnoreCase("toppings") || sec.equalsIgnoreCase("drinks") || sec.equalsIgnoreCase("creamery"))){
            System.out.println("Invalid input.Please enter again: ");
            sec = sc.next().toLowerCase();//rescan input
        }
        if (sec.equals("toppings")){
            System.out.println(items.getAllToppingItems());
        }else if (sec.equals("drinks")){
            System.out.println(items.getAllDrinks());
        }else  {
            System.out.println(items.getAllCreamery());
        }
        //place order
        System.out.println("please enter item ID to the right of item's name");
        String itemId = sc.next().toUpperCase();
        char itemSec = itemId.charAt(0);//get letter in front of ID
        while (itemSec == 'T' || itemSec == 'D' || itemSec == 'C' || itemId.length() == 2
                || itemId.length() ==3){
            System.out.println("Invalid input. Please enter again: ");
            itemId = sc.next().toUpperCase();
            itemSec = itemId.charAt(0);
        }
        //change string into number
        int num = Integer.parseInt(itemId.substring(1,itemId.length()));
        while (num > items.getToppings().size() && itemSec =='T' || (num > items.getDrinks().size() && itemSec == 'D')
                || (num > items.getCreamery().size() && itemSec == 'C')){
            System.out.println("Invalid input . Please enter again");
            itemId = sc.next().toUpperCase();
            itemSec = itemId.charAt(0);
            num = Integer.parseInt(itemId.substring(1,itemId.length()));
        }

        //  System.out.println(hamburger.getAllToppingItems());


//        boolean quit = false;
//        printActions();
//        while (!quit) {
//            System.out.println("\nEnter action: (5 to show available actions)");
//            int action = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (action) {
//                case 0:
//                    System.out.println("\nShutting down...");
//                    quit = true;
//                    break;
//                case 1:
//                    hamburger.makeBurger();
//                    boolean done = false;
//                    while (!done){
//                        int in = scanner.nextInt();
//                        scanner.nextLine();
//                        switch (in){
//                            case 0:
//                                done = true;
//                                break;
//                            case 1:
//                                System.out.println("/n choose toppings"+hamburger.addTopping());
//                                break;
//                            case 2:
//                                hamburger.printItems();
//                                break;
//                        }
//                    }
//                    break;
//
//                case 2:
//                    hamburger.printItems();
//                    break;
//                case 3:
//                    AdditionalItems item;
//                    hamburger.addTopping();
//            }
//        }
//    }
//    private static void printActions () {
//        System.out.println("\nAvailable actions:\npress");
//        System.out.println("0 - to shutdown\n" +
//                "1 - Basic Hamburger\n" +
//                "2 - print items\n" +
//                "3 - Add toping\n" +
//                "4 - Natural Hamburger\n" +
//                "5 - deluxe hamburger\n" +
//                "6 - getTotal\n"
//        );
//        System.out.println("Choose your actions");
  }
}
