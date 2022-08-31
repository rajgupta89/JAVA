import java.util.*;

class midian {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        ArrayList<Integer> li=new ArrayList<>();
        int num=0;
        while (n-->0) {
            li.add(a[num]);
            Collections.sort(li);
            int mid=0;
            int sizze=li.size()/2;
            if (li.size()%2==0) {
                mid=li.get(sizze)+li.get(sizze-1);
                mid=mid/2;       
            } else {
                mid=li.get(sizze);
            }
            System.out.println(mid);
            num++;
        }
    }    
}
