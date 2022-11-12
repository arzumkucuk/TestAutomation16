package day48_AbstractionContiniue_Interface.AnimalTask;

public class Shark extends Animal implements Predator, Swimmable{

    public Shark(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {

    }

    @Override
    public void hunt() {

    }

    @Override
    public void swim() {

    }
}
