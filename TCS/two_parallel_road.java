import java.util.*;
class two_parallel_road {
     public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         int m=in.nextInt();
         ArrayList<Integer> li=new ArrayList<>();
         for(int i=0;i<n+m;i++){
             int a=in.nextInt();
             if(! li.contains(a))
                li.add(a);
         }
         Collections.sort(li);
         double mid=0;
         if(li.size()%2==0){
             mid=(li.get(li.size()/2 -1)+li.get(li.size()/2));
             mid=mid/2;
         }
         else
             mid=li.get(li.size()/2);
             
        System.out.format("%.2f", mid);
     }    
}