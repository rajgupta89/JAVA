// Java program to remove repeated elements from array.
import java.util.*;
public class one {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> b = new ArrayList<Integer>();
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if( ! (b.contains(a[i])))
            b.add(a[i]);
        }
        System.out.println(b);
    }
}