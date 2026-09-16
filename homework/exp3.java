import java.util.*;

public class exp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        sc.nextLine();
        String[] nums= sc.nextLine().split(" ");
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }

        int l=0;
        int r=n-1;
        int first = -1;
        int last = -1;
        while(l<=r){
            if(x== arr[l] && first==-1){
                first=l;
            }
            if(x== arr[r] && last==-1){
                last=r;
            }
            l++;
            r--;
        }

        
        System.out.println(first + " " + last);
    }
}