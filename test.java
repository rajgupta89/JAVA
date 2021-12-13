public class test {
    static int c=0;
    int i=0,a=0;
    public void changecount(){
        while(i<5){
        i++;
        c++;
        a++;
        }
}
    public static void main(String[] args) {
        test check1=new test();
        test check2=new test();
        check1.changecount();
        check2.changecount();
        System.out.println("Static variable value - "+test.c+" : "+test.c); // here test.c is used instead of check1.c because here c  is static.
        System.out.println("Simple variable value - "+check1.a+" : "+check1.a);
    }
}
