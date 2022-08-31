import java.util.*;
 class length_of_middle_word {
     public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         String s=in.nextLine();
         String[] s_arr=s.split(" ");
         int len=s_arr.length;
         if(len%2==0){
             int maxx=Math.max(s_arr[len/2].length(), s_arr[len/2 -1].length());
             System.out.println(maxx);
         }
         else{
             System.out.println(s_arr[len/2].length());
         }
     }    
}
