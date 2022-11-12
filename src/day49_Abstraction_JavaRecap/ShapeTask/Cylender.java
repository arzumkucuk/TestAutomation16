package day49_Abstraction_JavaRecap.ShapeTask;

public class Cylender extends Shape implements Volume {

    public double r, d, h;
    public final static double PI =3.14;

    public Cylender(double r, double h) {
        super("Cylinder");
        if (r<=0 || h<=0){
            throw new RuntimeException("No such a Cylinder with radius and height of "+r+" "+h);
        }
        this.r=r;
        this.h=h;
        d= 2 * r;
    }

    @Override
    public double area() {
        return (2 * PI * r * h) + (2 * PI * r * r);
    }

    @Override
    public double perimeter() {
        return new Circle(r).perimeter() * h;
    }

    @Override
    public double volume() {
        return  PI*r*r*h;
    }
    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name+
                " Area= "+ df.format(area())+
                " Perimeter= "+ df.format(perimeter())+
                " Volume= "+ df.format(volume());
    }


}
