// at Present this program is only for 3 digit number only
import java.util.*;
public class keith {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number to check for keith");
        int n=in.nextInt();
        int a=n,num1,num2,num3,num4;
        ArrayList<Integer> num=new ArrayList<Integer>();
        while (a>0) {
            int m=a%10;
            a/=10;
            num.add(m);
        }
        Collections.reverse(num);
            // System.out.println(num.get(2));
            num1=num.get(0);
            num2=num.get(1);
            num3=num.get(2);
           while (num3<n) {
               num4=num1+num2+num3;
               num1=num2;
               num2=num3;
               num3=num4;
           }
           if (num3==n) {
               System.out.println(n+" is a keith number");
            } else {
               System.out.println(n+" is not a keith number");
               
           }
    }
}
