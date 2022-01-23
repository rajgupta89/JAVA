import java.util.*;

public class array_sum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int arr[]=new int[N];
        int K=in.nextInt();
        ArrayList <Integer> even=new ArrayList<Integer>();
        ArrayList <Integer> odd=new ArrayList<Integer>();
        ArrayList <Integer> KEven=new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }
        Collections.sort(even, Collections.reverseOrder());
        Collections.sort(odd, Collections.reverseOrder());
        // for (int i : even) {
        //     System.out.println("Even Numbers : "+i);
        // }
        // for (int i : odd) {
        //     System.out.println("odd Number : "+i);
        // }
        if (K%2==0) {
            if (K <= even.size()) {
                for (int i = 0; i < K; i++) {
                    KEven.add(even.get(i));
                }
                int sum = 0;
                for (int i : KEven) {
                    sum+=i;
                }
                System.out.println("Sum of even no. : "+sum);
            }
            
            else if(K <= odd.size()) {
                for (int i = 0; i < K; i++) {
                    KEven.add(odd.get(i));
                }
                int sum = 0;
                for (int i : KEven) {
                    sum+=i;
                }
                System.out.println("Sum of Odd no. : "+sum);
            }
        }
    }
}
