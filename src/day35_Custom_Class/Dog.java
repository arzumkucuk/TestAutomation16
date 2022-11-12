package day35_Custom_Class;

public class Dog {

    public String nickname;
    public String breed;
    public String size;
    public int age;
    public String color;
    public char gender;

    public void dogType (String dogNickname, String dogBreed, String dogSize, int dogAge, String dogColor, char dogGender){

         nickname = dogNickname;
         breed = dogBreed;
         size = dogSize;
         age = dogAge;
         color = dogColor;
         gender = dogGender;

    }

    public void eat(){
        System.out.println(nickname+" is eating");
    }
    public void sleep(){
        System.out.println(nickname+" is sleeping");
    }

    public void getDogInfo(){
        System.out.println("Nickname: "+nickname+", Breed: "+breed+", Size: "+size+", Age: "+age+" years, Color: "+color+", Gender: "+gender);
    }

}
