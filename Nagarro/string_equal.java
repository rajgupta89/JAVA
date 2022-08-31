import java.util.*;
class string_equal {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String a=in.next();
        String b=in.next();
        int count=0;
        for (int i = 0; i < n; i++) {
            String c="";
            c+=b.charAt(i);
            if(a.contains(c)){
              if(b.charAt(i)!=a.charAt(i))
                count++;
            }
            else{
                count=0;
                break;
            }
        }
        if(count>0)
           System.out.println(count);
        else
           System.out.println("-1");
    }    
}
