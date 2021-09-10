public class SteamDiscount {

    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */

    //comment so I can commit and push all 1.5 practice problems

    public static void main(String[] args) {

        double price = 60.00;
        final double DISCOUNT = 20.00;
        final double DISCOUNTRATE = DISCOUNT/100.0;

        double totalPrice = price * (1 - DISCOUNTRATE);

        System.out.println("Steam game price is now $" + totalPrice);


    }
}
