package day35_Custom_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class CarMax {

    public static void main(String[] args) {


        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setInfo("Toyota", "Carolla", "Gray", 2020, 22500);
        //car1.getInfo();

        car2.setInfo("Honda", "Civic", "White", 2021, 20000.45);
       // car2.getInfo();

        car3.setInfo("Nissan", "Rogue", "Blue", 2007,15000.99);

        car4.setInfo("Range Rover", "Velar", "Gray", 2023,78000);

        car5.setInfo("Audi", "R8", "Yellow", 2020, 105000);

        Car[] cars = {car1, car2, car3, car4, car5};

        for (Car eachCar : cars){
            eachCar.getInfo();
        }

        System.out.println("=======================================");

        ArrayList <Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(cars) );

        carList.removeIf( p -> p.price < 25000); // we removed all the cars that are 25k

        for (int i=0; i<= carList.size()-1; i++){
            carList.get(i).getInfo();

        }



    }

}
