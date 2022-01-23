// Sort array elements in acsending and descending order
import java.util.*;

public class two {
    public static void main(String[] args) {
        int a[] = { 5, 6, 8, 9, 2, 4, 3, 1 };
        // Acsending Order
        Arrays.sort(a);
        System.out.print("Array Elements in ascending Order is :");
        for (int i : a) {
            System.out.print(" " + i);
        }
        // Descending Order
        System.out.print("\nArray Elements in Descending order is :");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(" " + a[i]);
        }
    }
}
