package day47_Abstraction.CarTask;

public class Toyota extends Car {


    public Toyota(String model, int year) {
        super("Toyota", model, year);
    }

    @Override
    public String start() {
        return "Insert key: twist the key to ignition";
    }
}
