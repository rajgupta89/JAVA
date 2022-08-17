import java.util.*;
public class decimal_binary {
       public static void main(String[] args) {
           Scanner in=new Scanner(System.in);
           int n=in.nextInt();
           String binary=Integer.toBinaryString(n);  // to convert decimal to binary
           String bin_srt="";
        //    System.out.println(binary);
           for (int i = 0; i < binary.length(); i++) {
               if(binary.charAt(i)=='1')
               bin_srt+='0';
               else
               bin_srt+='1';
           }
        //    System.out.println(bin_srt);
           int deci=Integer.parseInt(bin_srt,2);
           System.out.println(deci);
       }    
}