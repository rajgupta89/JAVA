import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class missing {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        ArrayList<Integer> li=new ArrayList<>();
        for (int i = 0; i < n-1; i++) {
            if(a[i]+1 !=a[i+1])
               li.add(a[i]+1);
        }
        for (int i = 0; i < li.size(); i++) {
            if (m<li.get(i)) {
                System.out.println(li.get(i));
                break;
            }            
        }
        }
    }
