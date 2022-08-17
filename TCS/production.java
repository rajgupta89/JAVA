import java.util.*;
public class production {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Character> li=new ArrayList<>();
        li.add('a');
        li.add('e');
        li.add('i');
        li.add('o');
        li.add('u');
        li.add('A');
        li.add('I');
        li.add('E');
        li.add('D');
        li.add('U');
        char[] ch=new char[n];
        for (int i = 0; i < n; i++) {
            ch[i]=in.next().charAt(0);
        }
        // System.out.println(li);
        int count=0;
        for (int i = 0; i < n; i++) {
            if (! li.contains(ch[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}
