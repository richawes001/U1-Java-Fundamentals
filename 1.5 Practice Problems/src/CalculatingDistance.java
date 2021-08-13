public class CalculatingDistance {

    /*
    Create a program that calculates a vehicle's distance based on speed traveled and time traveled.

    Example: 55 mph for 45 minutes -> 41.25 miles   |   55/60 * 45 = 41.25

    */

    public static void main(String[] args) {

        double miles = 88.0;
        double minutes = 48.0;
        double milesPerMinute = miles / minutes;

        double minutesDriven = 272.0;

        double milesDriven = milesPerMinute * minutesDriven;

        System.out.print("You drove " + milesDriven + " miles in " + minutesDriven + " minutes.");

    }

}
