import java.util.*;
//0 1 3 4 7 8 11 12 15 16
public class series {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=0;
        int n1=1;
        int n2=3;
        int curr_num=n1+n2;
        int range=in.nextInt();
        System.out.print(n+", "+n1+", "+n2+", "+curr_num+", ");
        while (curr_num<range) {
            curr_num+=n2;
            System.out.print(curr_num+", ");
            curr_num+=n1;
            if (curr_num>=range)
                System.out.print(curr_num);
                else
                System.out.print(curr_num+", ");
        }
    }
}
