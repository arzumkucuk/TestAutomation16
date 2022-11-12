package day42_Inheritance.AnimalTask;

public class Zoo { //Zoo HAS a Tiger

    public static void main(String[] args) {

        Tiger tiger = new Tiger("Sher Khan", "bengal tiger","yellow", "large",'M',5 );

        System.out.println(tiger);
        tiger.eat("Chicken");
        tiger.sleep();
        //tiger.bark(); yapamaz hata verir dog classina ait
        //tiger.meow(); hata verir cunku kediye ait

        Cat cat = new Cat("Kitty","British fold", "White", "SMall", 'F', 1);

        System.out.println(cat);
        cat.meow();
        cat.eat("Tuna");
        cat.drink("milk");

        Dog dog = new Dog("Dobby","Golden retwiver",'M',2,"caramel","Medium");

        System.out.println(dog);
        dog.bark();
       // dog.meow(); cat class ina ait hata veriyor
        dog.eat("bone");
        dog.drink("water");

    }



}
