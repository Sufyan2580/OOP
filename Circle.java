
public class Circle {
    public double radius;
    public Circle(){
        radius=12;
    }
    public Circle(double r){
        radius=r;
    }
    public void display(){
        double c;
        c=2*3.14*radius;
        System.out.println("circumference of circle is:"+c);


    }
    public static void main(String []args){
        Circle c1=new Circle();
        c1.display();
        Circle c2=new Circle(15);
        c2.display();

    }
}
