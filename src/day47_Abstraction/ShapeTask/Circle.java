package day47_Abstraction.ShapeTask;

public class Circle extends Shape{

    public double radius;
    public static double PI=3.14;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public Circle() {
        super("Circle");
    }

    @Override
    public double area() {
        return radius * radius * PI;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
}
