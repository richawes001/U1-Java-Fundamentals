public class Averages {

    /*
    Create a program to output the averages of 4 values.
    Example: 12, 13, 14, 15 -> 13.5
     */

    public static void main(String[] args) {

        int testScores1 = 1235;
        int testScores2 = 13;
        int testScores3 = -9523;
        int testScores4 = 6594;

        int sumTotal = testScores1 + testScores2 + testScores3 + testScores4;
        double average = sumTotal/4.0;

        System.out.println("The average is " + average);
    }
}
