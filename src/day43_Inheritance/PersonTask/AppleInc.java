package day43_Inheritance.PersonTask;

public class AppleInc {

    public static void main(String[] args) {

        Tester tester1= new Tester("Arzum","0001",45,28,'F');
        tester1.eat();
        tester1.sleep();
        tester1.testing();
        System.out.println("Salary: "+tester1.calcSalary());
        System.out.println(tester1);

        Developer developer1 = new Developer("Eren", "A0010", 55, 33, 'M');
        developer1.work();
        developer1.sleep();
        developer1.code();
        //System.out.println("Salary: "+developer1.calcSalary());
        System.out.println(developer1);

    }
}
