package day45_Exeptions.Phone;

/*

 */

public class Device {

    public String brand, model, country;
    public int price;

    public Device(String brand, String model, String country, int price) {
        this.brand = brand;
        this.model = model;
        this.country = country;
        this.price = price;
    }



    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", country='" + country + '\'' +
                ", price=" + price +
                '}';
    }
}
