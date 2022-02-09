// Peterson number - Sum of the factorial of each digit of the number should be equal to the original number.
import java.util.*;
public class peterson {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to check for peterson");
        int n = in.nextInt();
        int a = n, sum = 0, f = 1;
        while (a > 0) {
            int b = a % 10;
            for (int i = 1; i <= b; i++) {
                f = f * i;
            }
            sum = sum + f;
            a = a / 10;
            f = 1;
        }
        if (n == sum) {
            System.out.println("It is peterson Number");
        } else {
            System.out.println("It is not a peterson Number");
        }
    }
}
