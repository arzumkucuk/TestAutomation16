package day48_AbstractionContiniue_Interface.AnimalTask;

public class Parrot extends Animal implements Flyable ,Playable{

    public Parrot(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void play() {

    }
}
