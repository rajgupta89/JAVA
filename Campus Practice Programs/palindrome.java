// Palindrome Number
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to check for palindrome");
        int n = in.nextInt();
        int sum = 0;
        int p = n;
        while (n > 0) {
            int m = n % 10;
            n /= 10;
            sum = (sum * 10) + m;
        }
        // System.out.println(p);
        if (p == sum) {
            System.out.println("It is palindrome Number");
        } else {
            System.out.println("It is not a palindrome Number");
        }
    }
}
