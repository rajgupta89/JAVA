// Print non-repeating string element
public class string {
    public static void main(String[] args) {
        String s="Heelloo";
        for (int i = 0; i < s.length(); i++) {
           char c=s.charAt(i);
            if (s.indexOf(c)==s.lastIndexOf(c)) {
                System.out.println(c);
            }
        }
    }
}
