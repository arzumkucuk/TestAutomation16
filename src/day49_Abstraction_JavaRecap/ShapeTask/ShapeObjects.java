package day49_Abstraction_JavaRecap.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle = new Circle(23);
        Cupe cube = new Cupe(15);
        Cylender cylender = new Cylender(2,5);
        Square square = new Square(50);

        System.out.println(circle);
        System.out.println(square);
        System.out.println(cylender);
        System.out.println(cube);

    }
}
