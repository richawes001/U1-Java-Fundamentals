public class TimeCrunch {

    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.

    Example:


     */

    //comment so I can commit and push all 1.5 practice problems

    public static void main(String[] args) {

        int rawTime = 60;
        int time = rawTime;

    int numHours = time/3600;
    time = time % 3600;

    int numMinutes = time/60;
    time = time % 60;

    int numSeconds = time;

    System.out.println(rawTime + " seconds, is equal to " + numHours + " hours, " + numMinutes + " minutes, and " + numSeconds + " seconds.");

    }

}
