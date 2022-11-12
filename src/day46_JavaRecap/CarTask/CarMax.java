package day46_JavaRecap.CarTask;

public class CarMax {


    public static void main(String[] args) {

        Mercedes mercedes1 = new Mercedes("C200","White",2012,250000);
        BMW bmw1 = new BMW("m8","Blue",2013,50000);

        mercedes1.drive();
        bmw1.start();
        System.out.println(mercedes1);
        System.out.println(bmw1);
    }
}
