package day38_StaticKeyword;

public class Iphone {

    public String model, color, storage;
    public double price;

    public static String brand = "Apple", OS= "iOS", MadeIn = "China";

    public  void call(long phoneNumber){
        System.out.println("Iphone "+ model+ " is calling "+phoneNumber);

    }

    public static void getInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Operating System: "+ OS);
        System.out.println("Made in: "+ MadeIn);
    }


    public String toString() {
        return "Iphone{ Brand: " + brand+ "OS: "+OS+
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", storage='" + storage + '\'' +
                ", price=" + price +
                '}';

    }
}
