package day43_Inheritance.CarTask;

public class Car {

    public String brand, model, color, madeIn;
    public int year;
    public static boolean hasEngine, hasWheel, hasTires;

    public void setInfo(String brand, String model, String color, int year, String madeIn) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.madeIn = madeIn;
    }

    static {
        hasEngine=true;
        hasTires=true;
        hasWheel=true;

    }

    public void park(){
        System.out.println(brand+" "+model+" is parking");
    }

    public void drive(){
        System.out.println(brand+" "+model+" is driving");
    }


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", year=" + year +
                '}';
    }
}
