public class test1 {
    static String[][] arr =new String[3][];
    private static void doPrint() {
    for(int i=0;i<arr.length;i++){
        int j=arr[i].length-1;
        System.out.print(arr[i][j]);
    }
}
    public static void main(String[] args) {
    String[] class1 = {"A","B","C"};
    String[] class2 = {"L","M","N","O"};
    String[] class3 = {"I","J"};
    arr[0] = class1;
    arr[1] = class2;
    arr[2] = class3;
    test1.doPrint();
    }
    }
