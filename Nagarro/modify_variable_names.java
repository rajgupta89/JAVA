import java.util.*;

public class modify_variable_names {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String s_new="";
        if(s.contains("_")){
           for (int i = 0; i < s.length(); i++) {
               if(s.charAt(i) !='_'){
                  s_new+=s.charAt(i);
               }
                else{
                  s_new+=Character.toUpperCase(s.charAt(i+1));
                  i++;
                }
           }
        }
        else{
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != Character.toUpperCase(s.charAt(i))) {
                    s_new+=s.charAt(i);
                }
                else{
                    s_new+="_"+ Character.toLowerCase(s.charAt(i));
                }
            }
        }
        System.out.println(s_new);
    }
}
