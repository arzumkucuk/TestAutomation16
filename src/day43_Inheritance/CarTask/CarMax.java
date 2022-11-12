package day43_Inheritance.CarTask;

public class CarMax extends Car {

    public static void main(String[] args) {

        Mercedes mercedes1 = new Mercedes("Mercedes","G300","grey",2022,"German");
        mercedes1.autoParking();
        mercedes1.autoPilot();
        mercedes1.drive();

        System.out.println(mercedes1);

        Toyota toyota1 = new Toyota("Toyota", "Corolla","White",2019,"Japan");
        toyota1.drive();

        System.out.println(toyota1.isAfordable);
        System.out.println(toyota1.isImmortal);
       // System.out.println(toyota1.isLuxury);

        BMW bmw = new BMW("BMW","530i","red",2023,"German");

        bmw.race();
        bmw.park();
        System.out.println(bmw.isExpensive);
        System.out.println(bmw.isLuxury);


    }
}
