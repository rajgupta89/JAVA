import java.util.*;
public class series {
     public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         if(n%2==0){
             n=(n/2)-1;
             System.out.println((int)Math.pow(3, n));
         }
         else{
             n=n/2;
             System.out.println((int)Math.pow(2, n));
         }
     }    
}
