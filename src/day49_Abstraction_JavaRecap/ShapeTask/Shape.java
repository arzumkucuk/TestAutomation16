package day49_Abstraction_JavaRecap.ShapeTask;

import java.text.DecimalFormat;

public abstract class Shape {

    public final String name;
    public static DecimalFormat df = new DecimalFormat("0.00");


    public Shape(String name) {
        if (name.isEmpty()){
            throw new RuntimeException("Name can not be empty");
        }
        this.name = name;

    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name+
                " Area= "+ df.format(area())+
                " Perimeter= "+ df.format(perimeter());
    }
}

