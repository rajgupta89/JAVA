import java.util.*;
public class missing_number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String[] a=new String[n];
        ArrayList<Integer> li=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i]=in.next();
            int dec=Integer.parseInt(a[i],2);
            li.add(dec);
        }
        String bin="";
        for (int i = 0; i < li.size()-1; i++) {
            if(li.get(i)+1 !=li.get(i+1)){
                bin+=Integer.toBinaryString(li.get(i)+1);
            }               
        }
        System.out.println(bin);
    }
}
