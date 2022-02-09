import java.util.*;
public class array_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s1 = sc.nextLine().split(",");
        String[] s2 = sc.nextLine().split(",");
        int n = s1.length;
        int m = s2.length;
        String inarr1 = new int[n];
        String inarr2 = new int[m];
        for(int i=0;i<n;++i) {
            inarr1[i] = String.parse(s1[i]);
        }
        for(int i=0;i<m;++i) {
            inarr2[i] = Integer.parseInt(s2[i]);
        }
        String instr1, instr2;
        instr1=sc.nextLine();
        instr2=sc.nextLine();
    }
}
