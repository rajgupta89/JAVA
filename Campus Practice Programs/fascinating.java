import java.util.*;
public class fascinating {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number to check for fascinating number");
        int n=in.nextInt();
        int count=0;
        String a=Integer.toString(n),b,c,d;
        int num1=n*2;
        int num2=n*3;
        b=Integer.toString(num1);
        c=Integer.toString(num2);       
        d=a+b+c;
        for (int i = 0; i < d.length(); i++) {
            char ch=d.charAt(i);
            for (char j = '1'; j <= '9'; j++) {
                if (ch==j) {
                    count++;
                }
            }
        }
            if (count==9) {
                System.out.println(n+" is a facinating number");
             } else {
                System.out.println(n+" is not a facinating number");
            }
    }
}
