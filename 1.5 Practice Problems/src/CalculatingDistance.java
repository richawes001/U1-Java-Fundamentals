public class CalculatingDistance {

    /*
    Create a program that calculates a vehicle's distance based on speed traveled and time traveled.

    Example: 55 mph for 45 minutes -> 41.25 miles   |   55/60 * 45 = 41.25

    */

    //I fixed it. Now I can get my perfect score.

    public static void main(String[] args) {

      double miles = 55;
      double minutes = 45;
      double hours = minutes/60.0;

      double milesDriven = miles * hours;

        System.out.println("You drove " + milesDriven + " miles in " + hours + " hours.");

    }

}
