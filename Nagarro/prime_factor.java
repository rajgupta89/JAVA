import java.util.ArrayList;
import java.util.Scanner;

public class prime_factor {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> li=new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if(n%i==0)
              li.add(i);
        }
        for (int i = 1; i < li.size(); i++) {
            int count=0;
            for (int j = 1; j <=n; j++) {
                if(li.get(i)%j==0)
                  count++;
            }
            if(count==2){
              System.out.println(li.get(i)+" ");
            }
        }
    }
}
