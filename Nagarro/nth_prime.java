import java.util.Scanner;

public class nth_prime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int num=1,count1=0;
        while (count1<n) {
            num++;
            int count=0;
            for (int i = 1; i <=num; i++) {
                if(num%i==0)
                  count++;
            }
            if(count==2)
              count1++;
        }
        System.out.println(num);
    }
}
