package day49_Abstraction_JavaRecap.ShapeTask;

public class Cupe extends Shape implements Volume {

    public double side;

    public Cupe(double side) {
        super("Cube");
        if (side <= 0){
            throw new RuntimeException("No such a cube with side of "+ side);
        }
        this.side = side;
    }


    @Override
    public double area() {
        return 6 *side*side;
    }

    @Override
    public double perimeter() {
        return 12 * side;
    }

    @Override
    public double volume() {
        return side * side * side;
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
