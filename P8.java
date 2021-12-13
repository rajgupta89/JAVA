class test2 {
int a,b,c;
void getdata(int x, int y) {
    a=x;
    b=y;
}
void add() {
    c=a+b;
    System.out.println("Addition = "+c);
}
}
public class P8 {

public static void main(String[] args) {

    test2 obj = new test2();
    obj.getdata(200,100);
    obj.add();
    }
}