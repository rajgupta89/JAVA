// Print the following pattern
import java.util.*;
public class five {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println();
        for (int i = 1; i <= n ; i++) {
            int k=1;
            for (int j = 0; j < i; j++) {
                System.out.print(i);
                if (k<i) {
                    System.out.print("*");
                    k=k+1;
                }
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            int k=1;
            for (int j = 0; j < i; j++) {
                System.out.print(i);
                if (k<i) {
                    System.out.print("*");
                    k=k+1;
                }
            }
            System.out.println();
        }
    }
}
