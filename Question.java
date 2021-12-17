 class Circle{
    double radius;
    //  double area;
    //  int getradius;
     Circle(double r){radius=r;}
    //  double getradius(){return radius;}
    //  void setradius(double r){radius=r;}
     double getarea(){return Math.PI * radius * radius;}
}
public class Question {
    public static void main(String[] args) {
        Circle c1=new Circle(17.4);
        // c1.area=Math.PI*c1.getradius*c1.getradius();
        System.out.println("Area  = "+c1.getarea());
    }
    // jdb
}