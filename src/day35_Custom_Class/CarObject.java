package day35_Custom_Class;

public class CarObject {

    public static void main(String[] args) {

        Car car1 = new Car(); // has own brand
        Car car2 = new Car(); // has own brand
        Car car3 = new Car(); // has own brand

        car1.brand = "Toyota";
        car2.brand = "BMW";
        car3.brand = "Lexus";


        System.out.println( car1.brand );
        System.out.println( car2.brand);
        System.out.println(car3.brand);
/*
        String str1 = "Toyota";
        String str2 = "BMW";
        String str3 = "Lexus";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

 */

        car1.model = "Coralla";
        car2.model = "X7";
        car3.model = "LX300";


        System.out.println(car1.model);
        System.out.println(car2.model);
        System.out.println(car3.model);

        System.out.println();

        Car car4 = new Car();
        car4.setInfo("Mercedes", "C300","Red", 2018,22.400);

        System.out.println(car4.brand);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.year);
        System.out.println(car4.price);

        // 2018 Mercedes C300 Red

        System.out.println(car4.year+ " "+ car4.brand + " "+car4.model+" "+car4.color);





    }
}
