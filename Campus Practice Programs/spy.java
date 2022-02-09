import java.util.*;
public class spy {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number to check for neon number");
        int n=in.nextInt();
        int a=n,count=0,sum=0,product=1;
        ArrayList<Integer> num=new ArrayList<Integer>();
        while (a>0) {
            int m=a%10;
            a/=10;
            num.add(m);
        }
        Collections.reverse(num);
        for (int i = 0; i < num.size(); i++) {
            sum+=num.get(i);
            product*=num.get(i);
        }
        // System.out.println(sum);
        // System.out.println(product);
        if (sum==product) {
            System.out.println(n+" is a spy number");
        } else {
            System.out.println(n+" is not a spy number");
        }
    }
}
