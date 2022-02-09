import java.util.*;
public class tech {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number to check for tech number");
        int n=in.nextInt();
        int num=n,count=0,sum=0;
        while (num>0) {
            count++;
            num/=10;
        }
        num=n;
        if (count%2==0) {
            int a=num% (int)Math.pow(10, count/2);
            int b=num/(int)Math.pow(10, count/2);
            sum=(a+b)*(a+b);
            if (sum==n) {
                System.out.println("It is tech Number");
            } else {
                System.out.println("It is not a tech number");
            }
        } else {
            System.out.println("Entered Number is not even. Please Enter an even number");
        }
    }
}
