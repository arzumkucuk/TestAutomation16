package day40_Constructor;

public class Car {

    public String brand, model, color;
    public int year;
    public double price;

    public Car (String brand){
        this.brand = brand;
    }

    public Car(String brand, String model) {
        this(brand);
        this.model = model;
    }

    public Car(String brand, String model, int year) {
        this(brand,model);
        this.year = year;
    }

    public Car(String brand, String model, int year, double price) {
        this(brand, model, year);
        this.price = price;
    }

    public Car(String brand, String model, String color, int year, double price) {
        this(brand, model, year, price);
        this.color = color;
    }

    public String toString() {
        return "Car {" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

class CarObjects{

    public static void main(String[] args) {

        Car car1 = new Car("BMW");
        Car car2 = new Car("Honda", "civic",2021,22000);

        System.out.println(car1);
        System.out.println(car2);
    }
}

