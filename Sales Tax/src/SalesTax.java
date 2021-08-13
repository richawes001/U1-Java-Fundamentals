public class SalesTax {

    /*
    Create a program which takes a quantity, price and tax percentage and outputs the subtotal, tax total and total cost.
     */

    public static void main(String[] args) {

        //declare and initialize variables
        int quantity = 6;
        double price = 9.99;
        final double TAX = 7.0; //0.07
        final double TAXRATE = TAX/100.0;

        //calculations
        double subtotal = price * quantity;

        //DISCOUNTS AND INCREASES

        /*
            FORMULA: AMOUNT * (1 +/- RATE)
            COST INCREASE (TAX) USE +
            COST DECREASE (DISCOUNT) USE -
         */

        double tax = subtotal * TAXRATE;
        double totalCost = subtotal * (1 + TAXRATE);

        System.out.println("You bought " + quantity + " shirts at " + price + " a piece.");
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + totalCost);

    }

}