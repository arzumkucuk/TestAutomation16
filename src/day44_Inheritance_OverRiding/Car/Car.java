package day44_Inheritance_OverRiding.Car;

public class Car {

    public String brand, model,color;
    int year, price;

    public Car(String brand, String model, String color, int year, int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public void start(){
        System.out.println(brand+" is starting");
    }

    public void drive(){
        System.out.println("driving");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year='" + year + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
