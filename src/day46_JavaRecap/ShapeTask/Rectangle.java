package day46_JavaRecap.ShapeTask;

public class Rectangle extends Shape{

    private double l, w;

    public Rectangle(double l, double w) {
        super("Rectangle");

        this.l = l;
        this.w = w;

        if (l<=0 && w<=0){
            throw new RuntimeException("No Such a Rectangle with a length and width of: "+ l + "&" + w);
        }

    }

    @Override
    public double area() {
        return l * w;
    }

    public double perimeter(){
        return (2*l)+(2*w);
    }
}
