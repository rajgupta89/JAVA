public class bubble_sort {
    public void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
    public static void main(String[] args) {
         int[] a= {7,8,3,2,1};
         for (int i = 0; i < a.length-1; i++) {
             for (int j = 0; j < a.length-1-i; j++) {
                 if(a[j]>a[j+1]){
                  int temp=a[j];
                  a[j]=a[j+1];
                  a[j+1]=temp;
                 }
             }
         }
         bubble_sort obj=new bubble_sort();
         obj.print(a);
    }    
}