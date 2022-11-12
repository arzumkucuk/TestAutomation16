package day44_Inheritance_OverRiding.Car;

public class Lexus extends Car{

    public Lexus(String model, String color, int year, int price) {
        super("Lexus", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Lexus car starting with start button");

    }
}
