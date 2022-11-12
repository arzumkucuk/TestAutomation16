package day47_Abstraction.ShapeTask;

public class Rectangle extends Shape{

    public double length, width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return  2 * (width + length);
    }
}
