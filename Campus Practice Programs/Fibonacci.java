//Print fabonacci series till n numbers
import java.util.*;
public class Fibonacci {
     public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         int n1=0,n2=1,n3=0;
         System.out.println("Enter size of fibonacci series");
         int n=in.nextInt();
         System.out.print(n1+", "+n2);
         for (int i = 0; i < n; i++) {
             n3=n1+n2;
             n1=n2;
             n2=n3;
             System.out.print(", "+n3);
         }
     }    
}