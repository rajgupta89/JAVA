// check armstrong number for entered number. 
// Entered Number can be of any digit
import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number to check for armstrong number");
        int n=in.nextInt();
        int sum=0,count=0;
        int a=n,b=n;
        // to count the digit in entered number
        while (a>0) {
            count++;
            a/=10;
        }
        while (n>0) {
            int m=n%10;
            sum+=Math.pow(m, count);
            n/=10;
        }
        if (b==sum) {
           System.out.println("It is armstrong number");    
        } 
        else {
            System.out.println("It is not a armstrong number");
        }
    }
}