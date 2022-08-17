import java.util.HashMap;
import java.util.*;

public class subarraysum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        HashMap<Integer,Integer> li=new HashMap<>();
        li.put(0, 1);
        int count=0;
        int csum=0;
        for (int i = 0; i < n; i++) {
            csum+=a[i];
            int finall=csum-k;
            if (li.containsKey(finall))
                count+=li.get(finall);
            li.put(csum, li.getOrDefault(csum, 0)+1);
        }
        System.out.println(count);
        if(count>0)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}
