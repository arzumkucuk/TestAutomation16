package day37_CustomClass;

import java.time.LocalDate;

public class Car {

    public String brand, model, color;
    public LocalDate DOfB; //
    public double price, mileage;
    public int year;

    public void setInfo(String brand, String model, String color, LocalDate DOfB, double price, double mileage) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.DOfB = DOfB;
        this.price = price;
        this.mileage = mileage;
        this.year = DOfB.getYear();
    }

    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", DOfB=" + DOfB +
                ", price=" + price +
                ", mileage=" + mileage +
                ", year=" + year;
    }

    public void driver(){

        System.out.println("Driving "+brand+" "+model);
    }



}

/*
circle:
        radius
        PI
        diameters
        area
        perimeter

        methods:
            setInfo
           toString
           calculateArea
           calculatePerimeter
 */
