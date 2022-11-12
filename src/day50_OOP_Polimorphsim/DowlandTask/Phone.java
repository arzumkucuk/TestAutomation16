package day50_OOP_Polimorphsim.DowlandTask;

public abstract class Phone{

    public String brand, model, size;
    public double price;

    public Phone(String brand, String model, String size, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        if (price<=0){
            throw new RuntimeException ("Invalid price, cannot be negative");
        }
    }

    public abstract String texting();

    public abstract String calling();

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
