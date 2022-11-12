package day49_Abstraction_JavaRecap.ShapeTask;

public class Circle extends Shape{

    public double r;
    public double d;
    public final static double PI = 3.14;


    public Circle(double r) {
        super("Circle");
        if (r<=0){
            throw new RuntimeException("No such a circle with radius of "+ r);
        }
        this.r = r;
        d = r+r;
    }

    @Override
    public double area() {
        return PI*r*r;
    }

    @Override
    public double perimeter() {
        return d * PI;
    }
}
