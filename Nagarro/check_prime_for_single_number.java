import java.util.Scanner;

public class check_prime_for_single_number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        for (int i = 1; i <=n ; i++) {
            if(n%i==0)
            count++;
        }
        if(count==2)
           System.out.println(n+" is prime number");
        else
           System.out.println(n+" is not a prime number");
    }
}
