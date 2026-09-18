import java.util.*;

public class exp6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int min = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            System.out.print(min+" ");

        }
    }
}