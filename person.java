import java.util.Set;

public class person {
    String name;
    int age=25;
    public person(String name){
        this();
        SetName(name);
    }
    public person(String name, int age) {
        person(name);
        setAge(age);
    }
    public String show(){
        return name + " " + age;
    }
    public static void main(String[] args) {
        person p1=new person("Jesse");
        person p2=new person("Walter",52);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }
}
