import java.util.*;
class Raj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(",");
        int n = s.length;
        int[] a = new int[n];
        for(int i=0;i<n;++i) {
            a[i] = Integer.parseInt(s[i]);
        }

        double avg = 0;
        for(String x : s){
            boolean flag = false;
            for(int i = 0 ; i < x.length() ; i++){
                if(x.charAt(i) == '6'){
                    x = x.substring(0,i) + '9' + x.substring(i+1);
                    flag = true;
                }
            }
            if(flag){
                // reverse the string
                StringBuilder sb = new StringBuilder(x);
                sb.reverse();
                x = sb.toString();
            }
            // System.out.println(x);
            avg += Integer.valueOf(x);

        }
        avg /= a.length;
        System.out.println(String.format("%.2f", avg)); // for 2 decimal place

    }
}