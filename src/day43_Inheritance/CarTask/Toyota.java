package day43_Inheritance.CarTask;

public class Toyota extends Car {

    public  static boolean isAfordable, isImmortal;

    public Toyota (String brand, String model, String color, int year, String madeIn){
        setInfo(brand, model, color, year, madeIn);
    }

    static {
        isAfordable=true;
        isImmortal=true;
    }


}
