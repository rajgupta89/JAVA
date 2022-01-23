// print lower and uper triangle Matrix
import java.util.*;
public class lower_matrix {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of 2D_array");
        int n=in.nextInt();
        int a[][]=new int [n][n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("Original array elements are");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix with Lower triangle");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (j>i) {
                    System.out.print(" ");
                } else {
                    System.out.print(a[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("Matrix with Upper triangle");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i>j) {
                    System.out.print(" ");
                } else {
                    System.out.print(a[i][j]);
                }
            }
            System.out.println();
        }
    }
}
