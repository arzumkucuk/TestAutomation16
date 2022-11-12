package day46_JavaRecap.CarTask;

public class BMW extends Car{

    public BMW(String model, String color, int year, double price) {
        super("BMW", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println(brand+" is starting");
    }

    @Override
    public void drive() {
        System.out.println(brand+" drib=ving");
    }

}
