package day46_JavaRecap.CarTask;

public class Mercedes extends Car {

    public Mercedes(String model, String color, int year, double price) {
        super("Mercedes", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println(brand+" is starting");
    }

    @Override
    public void drive() {
        System.out.println(brand+" "+model+" is driving to beach");
    }


}
