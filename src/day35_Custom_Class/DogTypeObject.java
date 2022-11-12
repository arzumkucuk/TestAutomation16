package day35_Custom_Class;

import java.util.ArrayList;

public class DogTypeObject {

    public static void main(String[] args) {


        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();
        Dog dog6 = new Dog();


        dog1.dogType("Boncuk", "Maltese", "small", 3, "White", 'F');
        dog1.getDogInfo();
        dog1.eat();
        dog1.sleep();

        System.out.println("===============================");

        dog2.dogType("Jo", "Golden", "Big", 2,"Caramel", 'M');
        dog2.getDogInfo();
        dog2.eat();
        dog2.sleep();

        dog3.dogType("Richard", "Chow chow", "Medium", 4, "multicolor", 'F');

        Dog[] dogs = {dog1,dog2,dog3};

        ArrayList<Dog> huskies = new ArrayList<>();
        ArrayList<Dog> Maltese = new ArrayList<>();

        for (Dog eachDog : dogs){
            if (eachDog .breed.equalsIgnoreCase("husky") ){
                huskies.add(eachDog);
            }else if (eachDog.breed.equalsIgnoreCase("maltese") ){
                Maltese.add(eachDog);
            }
        }
        System.out.println("Total Number of Huskies: "+huskies.size());
        System.out.println("Total Number of Maltese: "+ Maltese.size());
    }
}
