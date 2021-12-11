package pakage;

public class balance {
    String name;
    double bal;
    public balance(String n, double d){
        this.name=n;
        this.bal=d;
    }
    public void show(){
        System.out.println("Name : " + this.name + "Balance : " + this.bal);
    }
}
