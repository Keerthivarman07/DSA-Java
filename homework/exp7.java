import java.util.*;

public class exp7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] arr = sc.nextLine().split(" ");

        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(arr[i]);

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }

            System.out.print(max - min + " ");

        }
    }
}