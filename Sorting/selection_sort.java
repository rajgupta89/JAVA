public class selection_sort {
    public void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
    public static void main(String[] args) {
         int[] a= {7,8,3,2,1};
         for (int i = 0; i < a.length-1; i++) {
             int small=i;
             for (int j = i+1; j < a.length; j++) {
                 if(a[small]>a[j]){
                     small=j;                     
                 }
             }
             int temp=a[small];
             a[small]=a[i];
             a[i]=temp;
         }
         bubble_sort obj=new bubble_sort();
         obj.print(a);
    }    
}