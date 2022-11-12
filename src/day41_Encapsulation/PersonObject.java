package day41_Encapsulation;

public class PersonObject {
    public static void main(String[] args) {


        Person p1 = new Person("Jimmy", 19, 'M');
        System.out.println(p1.getName());


        System.out.println(p1.getName() );
        System.out.println(p1.getGender() );
        System.out.println(p1.getAge());

        p1.setName("Breanne");
        p1.setAge(23);
        p1.setGender('F');

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getGender());



        //Person p2 = new Person("Breana",23,'F');

    }
}
