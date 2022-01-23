// Sort first half in ascending and second half in descending order
import java.util.Arrays;
public class three {
    public static void main(String[] args) {
        int a[]={8,5,6,2,9,4,3,7};
        int n=a.length;
        Arrays.sort(a);
        for (int i=0; i<n/2; i++) {
            System.out.print(" "+i);
        }
        for (int i = n-1; i >= n/2; i--) {
            System.out.print(" "+ a[i]);
        }
    }
}
