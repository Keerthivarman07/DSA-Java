import java.util.*;

public class exp4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int l = 0;
        int r = arr.length - 1;

        while (l < r) {

            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }

        System.out.println(new String(arr));
    }
}