package day48_AbstractionContiniue_Interface.AnimalTask;

public class Dog extends Animal implements Playable, Swimmable{

    public Dog(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {

    }

    @Override
    public void play() {

    }

    @Override
    public void swim() {

    }
}
