import java.util.*;

public class reverse_array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        ArrayList<Character> st = new ArrayList<Character>();
        // String st="";
        char ch;
        System.out.println("Enter String to be reversed");
        s = in.next();
        System.out.println("Original String : " + s);
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '1' && ch <= '9')) {
                // st=st+ch;
                st.add(ch);
            }
        }
        Collections.reverse(st);
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if ((ch >= 32 && ch <= 47) || (ch >= 58 && ch <= 64) || (ch >= 91 && ch <= 96)
                    || (ch >= 123 && ch <= 126)) {
                st.add(i, ch);
            }
        }
        System.out.print("Reversed String leaving special characters at same position : ");
        for (Character a : st) {
            System.out.print(a);
        }
    }
}