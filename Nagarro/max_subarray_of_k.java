import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class max_subarray_of_k {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        for (int i = 0; i <= n-k; i++) {
            int maxx=0;
            for (int j = 0; j < k; j++) {
                maxx=Math.max(maxx, a[i+j]);
            }
            System.out.print(maxx+" ");
        }
    }
}
