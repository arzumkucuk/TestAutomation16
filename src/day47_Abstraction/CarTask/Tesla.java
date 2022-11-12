package day47_Abstraction.CarTask;

public class Tesla extends Car{


    public Tesla(String model, int year) {
        super("Tesla", model, year);
    }

    @Override
    public String start() {
        return "Voice Control: Say start";
    }
}
