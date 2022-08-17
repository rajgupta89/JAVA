import java.util.ArrayList;
import java.util.Scanner;

public class subarray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        ArrayList<Integer> li1=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a=in.nextInt();
            li1.add(a);
        }
        int count=0;
        for (int i = 0; i < m; i++) {
            int b=in.nextInt();
            if(li1.contains(b))
               count++;
            else
            count=0;
        }
        if(count>=m)
        System.out.println("YES");
        else
        System.out.println("NO");
    }    
}