package day42_Inheritance.DeviceTask;

public class Device {

    public String deviceName, brand, model;
    public double price;

    public static String madeIn;
    public static boolean hasBattery, hasPowerButton;

    public void setInfo(String deviceName, String brand, String model, double price) {
        this.deviceName = deviceName;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    static {
        madeIn = "China";
        hasBattery = true;
        hasPowerButton = true;
    }



    public String toString() {
        return "Device {" +
                "Device name= "+ deviceName+ '\''+
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public void turnOn(){
        System.out.println("Turning on "+ brand+" "+model);
    }

    public void turnOff(){
        System.out.println("Turning Off "+brand+" "+model);
    }
}
