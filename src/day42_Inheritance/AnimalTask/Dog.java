package day42_Inheritance.AnimalTask;

public class Dog extends Animal{

    public Dog(String name, String breed, char gender, int age, String color,  String size){
        setInfo(breed, color, name, size, gender, age);

    }

    public void bark(){
        System.out.println(name+ " is barking");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
/*
class C{
    public static void main(String[] args) {

        new Dog().eat("Food"); // import ettiginde eat hata veriyor cunku, dog classinda eat methodu yok.
             new Animal().eat("Food");

    }
}

 */
