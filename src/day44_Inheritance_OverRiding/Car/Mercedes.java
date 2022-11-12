package day44_Inheritance_OverRiding.Car;

public class Mercedes extends Car {

    public Mercedes(String model, String color, int year, int price) {
        super("Mercedes", model, color, year, price);
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void drive() {
        super.drive();
    }


}
