import java.util.*;
class student_and_mentors {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long t=in.nextLong();
        long rajjj=0;
        while(t-->0){
            int n=in.nextInt();
            ArrayList<Long> li=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                long a=in.nextLong();
                li.add(a);
            }
            System.out.print("Case #"+ ++rajjj+": ");
            for (int i = 0; i < n; i++) {
                long maxx=-1;
                for (int j = 0; j < n; j++) {
                    if(li.get(j)!=li.get(i)){
                        if(li.get(j)<=2*li.get(i)){
                             maxx=Math.max(maxx, li.get(j));
                        }
                    }
                }
                System.out.print(maxx+" ");
            }
            System.out.println();
        }
    }
}
