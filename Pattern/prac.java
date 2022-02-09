public class prac{
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < 4*i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            for (int j = 4*(n-i); j > n-1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}