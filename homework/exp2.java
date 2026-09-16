import java.util.*;

public class exp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine(); 
        String[] scores = sc.nextLine().split(" ");

        int count = 0;

        for (int i = 0; i < n; i++) {
            int score = Integer.parseInt(scores[i]);

            if (score >= c) {
                count++;
            }
        }

        System.out.println(count);
    }
}