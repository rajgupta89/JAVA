import java.util.*;
public class special_sum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        int minn=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int f_sum=0, l_sum=0;
            for (int j = 0; j <=i; j++) {
                f_sum+=a[j];
            }
            for (int j = n-1; j >=n-1-i; j--) {
                l_sum+=a[j];
            }
            minn=Math.min(minn, f_sum+l_sum);
        }
        System.out.println(minn);
    }
}
