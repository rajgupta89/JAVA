// Print ASCII value of entered character
import java.util.*;
public class ASCII {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a character");
        char c=in.next().charAt(0);
        int a=c;
        System.out.println("ASCII value of "+c+" is : "+a);
    }
}
