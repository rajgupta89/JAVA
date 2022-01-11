//program to print same element in 2 arrays
public class array3 {
    public static void main(String[] args) {
        int arr1[]={0,1,2,3,5,9};
        int arr2[]={5,4,9,6,7,8};
        for (int i = 0; i < 6; i++) {
            for(int j=0;j<6;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
