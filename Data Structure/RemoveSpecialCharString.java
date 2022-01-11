import java.util.*;
public class RemoveSpecialCharString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
           String s; 
           String st="";
           char ch;
           System.out.println("Enter String to remove special characters from");
           s=in.next();
           System.out.println("Original String : "+s);
           for (int i = 0; i < s.length(); i++) {
               ch=s.charAt(i);
            //    st=ch+st;
            if((ch>='a'&&ch<'z')||(ch>='A'&&ch<'Z')||(ch>='1'&&ch<'9')){
                // st=ch+st;
                st=st+ch;
            }
           }
           System.out.println("String after removing special charcters : "+st);
    }
}
