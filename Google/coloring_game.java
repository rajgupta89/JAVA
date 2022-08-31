import java.util.*;
class coloring_game {
     public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         int t=in.nextInt();
         int raj=0;
         while(t-->0){
             int n=in.nextInt();
             System.out.println("Case #"+ ++raj+": "+(n+4)/5);
         }
     }    
}