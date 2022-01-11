import java.util.Arrays;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size");
        int n=in.nextInt();
        // int a[] = {50,80,20,10,40,11,1,21,63};
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Sorted array");
        // for (int i = 0; i < a.length; i++) {
        //     System.out.println(a[i]);
        // }
        for (int i : a) {
            System.out.println(i);
        }
        System.out.println("Enter number to be searched");
        int b=in.nextInt();
        int s=Arrays.binarySearch(a,b);
        System.out.println("Index of searched number "+b+" = "+s);
    }
}
