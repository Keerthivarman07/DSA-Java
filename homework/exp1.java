import java.util.*;

public class exp1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String[] input = sc.nextLine().split(" ");

        int[] scores = new int[n];

        double sum = 0;

        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(input[i]);
            sum += scores[i];
        }

        System.out.println("Scores:");
        for (int i = 0; i < n; i++) {
            System.out.print(scores[i] + " ");

            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }


        double average = sum / n;

        int lowest = scores[0];
        int highest = scores[0];

        for (int i = 1; i < n; i++) {
            if (scores[i] < lowest) {
                lowest = scores[i];
            }

            if (scores[i] > highest) {
                highest = scores[i];
            }
        }

        System.out.printf("\nAverage: %.2f\n", average);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Highest Score: " + highest);


        System.out.println("\nScore  Deviation");

        double sumSquares = 0;

        for (int i = 0; i < n; i++) {
            double deviation = scores[i] - average;
            sumSquares += deviation * deviation;

            System.out.printf("%-6d %7.2f\n", scores[i], deviation);
        }


        double sd = Math.sqrt(sumSquares / n);

        System.out.printf("\nStandard Deviation: %.2f\n", sd);


        int count = 0;
        double lowerLimit = average - sd;
        double upperLimit = average + sd;

        for (int i = 0; i < n; i++) {
            if (scores[i] >= lowerLimit && scores[i] <= upperLimit) {
                count++;
            }
        }

        System.out.println("\nScores within one standard deviation: " + count);
    }
}