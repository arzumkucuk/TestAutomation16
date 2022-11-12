package day35_Custom_Class;

public class Student {
    /*
    Student
        Attribute: name, age, gender, ID

       Actions:
            setInfo
            getInfo
            study
            sleep
     */

    public String name;
    public int age;
    public char gender;
    public String ID;

    public void setInfoStudent(String stdntName, int stdntAge, char stdntGender, String stdntID ){

        name=stdntName;
        age=stdntAge;
        gender=stdntGender;
        ID=stdntID;
    }

    public void getInfo(){
        System.out.println("Name: "+name+", Age: "+age+", Gender:"+gender+", ID: "+ID);
    }
    public void study(String lesson){
        System.out.println(name+" is studying "+ lesson);
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
}
