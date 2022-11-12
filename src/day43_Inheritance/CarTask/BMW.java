package day43_Inheritance.CarTask;

public class BMW  extends Car{

    public static boolean isExpensive, isLuxury;

    static{
        isExpensive=true;
        isLuxury=true;
    }

    public BMW(String brand, String model, String color, int year, String madeIn) {
        setInfo(brand, model, color, year, madeIn);
    }

    public void race(){
        System.out.println(model+" is racing");
    }
}
