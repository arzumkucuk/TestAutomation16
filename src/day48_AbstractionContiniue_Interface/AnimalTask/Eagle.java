package day48_AbstractionContiniue_Interface.AnimalTask;

public class Eagle extends Animal implements Predator, Flyable{

    public Eagle(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Eagle sleep 6 hours");
    }

    @Override
    public void hunt() {
        System.out.println("Eagle hunts snake");
    }

    @Override
    public void fly() {
        System.out.println("Eagle can fly long hours");
    }
}
