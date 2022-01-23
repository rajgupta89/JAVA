
// Print the following pattern
import java.util.*;

public class six {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            int k = 1;
            for (int j = 1; j <= i; j++) {
                if (j < i) {
                    System.out.print(count++);
                }
                if (k < i) {
                    System.out.print("*");
                    k = k + 1;
                }
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            int k = 1;
            for (int j = 0; j < i; j++) {
                if (j < i) {
                    System.out.print(count--);
                }
                if (k < i) {
                    System.out.print("*");
                    k = k + 1;
                }
            }
            System.out.println();
        }
    }
}
