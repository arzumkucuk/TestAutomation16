package day47_Abstraction.CarTask;

public class Mercedes extends Car{

    public Mercedes(String model, int year) {
        super("Mercedes", model, year);
    }

    @Override
    public String start() {
        return "Push Button: press brake and push the start button";
    }
}
