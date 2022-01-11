public class array2 {
    int a[]={10,20};
    int b[]={120,110};
    int c[]={50,60};
    int d[]={89,90};
    String e[][]={{"abc","xyz","pqr"},{"top","pot"}};
    int f[][]=new int[4][2];
    void test()
    {
        String g[][]=new String[2][];
        g[0]=new String[3];
        g[1]=new String[2];
        // g[0][0]=e[0][0];
        // g[0][1]=e[0][1];
        // g[0][2]=e[0][2];
        // g[1][0]=e[1][0];
        // g[1][1]=e[1][1];
        g[0]=e[0];
        g[1]=e[1];
        f[0]=a;
        f[1]=b;
        f[2]=c;
        f[3]=d;
        System.out.println(g[0][0]+" "+g[1][1]);
    }
    public static void main(String[] args) {
        array2 o=new array2();
        o.test();
    }
}
