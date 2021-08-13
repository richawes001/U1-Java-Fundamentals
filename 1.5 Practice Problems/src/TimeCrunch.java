public class TimeCrunch {

    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.

    Example:


     */

    public static void main(String[] args) {

        int rawTime = 483963;
        int time = rawTime;

    int numHours = time/3600;
    time = time % 3600;

    int numMinutes = time/60;
    time = time % 60;

    int numSeconds = time;

    System.out.println(rawTime + " seconds, is equal to " + numHours + " hours, " + numMinutes + " minutes, and " + numSeconds + " seconds.");

    }

}
