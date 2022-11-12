package day35_Custom_Class;

public class StudentGetInfo {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();

        student1.setInfoStudent("Arzum", 27, 'F', "H113");
        student1.getInfo();
        student1.study("Java");
        student1.sleep();

        student2.setInfoStudent("Eren", 33, 'M', "H101");
        student2.getInfo();
        student2.study("API");
        student2.sleep();
    }
}
