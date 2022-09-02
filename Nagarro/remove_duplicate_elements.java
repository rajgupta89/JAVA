import java.util.*;

public class remove_duplicate_elements {

    static void using_set(String[] s1){
        Set<String> li=new HashSet<>();
        for (int i = 0; i < s1.length; i++) {
            li.add(s1[i]);
        }
        for (String i : li) {
            System.out.print(i+" ");
        }
    }
    static void using_arraylist(String[] s1){
        ArrayList<String> li=new ArrayList<>();
        for (int i = 0; i < s1.length; i++) {
            if(! li.contains(s1[i]))
              li.add(s1[i]);
        }
        for (String i : li) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String[] s1=s.split(" ");
        System.out.println();
        System.out.print("Using Set - ");
        using_set(s1);
        System.out.println();
        System.out.println();
        System.out.print("Using ArrayList - ");
        using_arraylist(s1);
    }
}
