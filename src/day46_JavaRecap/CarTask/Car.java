package day46_JavaRecap.CarTask;

import java.time.LocalDate;

public class Car {

    public String brand, model, color;
    public int year;
    public double price;

    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;

        if (price<0){
            throw new RuntimeException("Car price cant be negative");
        }
        if (year> LocalDate.now().getYear()) {
            throw new RuntimeException("Invalid year");
        }
    }


    public void start(){
        System.out.println(brand+" is starting");
    }
    public void drive() {
        System.out.println(brand+" is driving");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
