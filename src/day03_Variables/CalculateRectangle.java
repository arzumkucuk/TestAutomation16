package day03_Variables;

public class CalculateRectangle {

    public static void main(String[] args) {

        int w=10;
        int l=50;
        int Area =w*l;
        int perimeter= (2*w)+(2*l); // perimeter:cevre

        System.out.print("Area is: ");
        System.out.print(Area);
        System.out.print(" and perimeter is: ");
        System.out.println(perimeter);
        System.out.println();
        System.out.println("Area is: " + Area+ " and Perimeter is: "+ perimeter);
        System.out.println();


        int a= 4;
        int squareA= a*a;
        int squareP=4*a;
        System.out.println("Square area is : "+ squareA + "\nSquare perimeter is : "+ squareP );

        System.out.println();

        double r=3;
        double pi=3.14;
        double circleArea=pi*r*r;
        double circlePerimt=2*pi*r;

        System.out.println("circle area is: " + circleArea +" circle perimeter is: "+ circlePerimt );


















    }
}
