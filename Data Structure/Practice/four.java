// Print the following pattern
import java.util.*;
public class four {
     public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         System.out.println("Enter the values of n and m");
         int n=in.nextInt();
         int m=in.nextInt();
         System.out.println();
         for (int i = n; i < n+m; i++) {
             for (int j = 0; j < i-n+1; j++) {
                 System.out.print(i);
             }
             System.out.println();
         }
         for (int i = n+m-2; i >= n; i--) {
             for (int j = 0; j < i-n+1; j++) {
                 System.out.print(i);
             }
             System.out.println();
         }
     }    
}