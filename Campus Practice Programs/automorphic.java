import java.util.*;
public class automorphic {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number to check for automorphic ");
        int n=in.nextInt();
        int a=n,count=0;
        while (a>0) {
            count++;
            a/=10;
        }
        int b=n*n;
        int sum=0;
        int c;
        while (count-->0) {
            c=b%10;
            sum=(sum*10)+c;
            b=b/10;
        }
        int sum1=0,c1;
        while (sum>0) {
            c1=sum%10;
            sum1=(sum1*10)+c1;
            sum=sum/10;            
        }
        if (sum1==n) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
