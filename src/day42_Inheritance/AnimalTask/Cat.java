package day42_Inheritance.AnimalTask;

public class Cat extends Animal {

    public Cat(String breed, String color, String name, String size, char gender, int age) {
        setInfo(breed, color, name, size, gender, age);
    }

    public void meow(){
        System.out.println(name+" meowing");
    }


    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
