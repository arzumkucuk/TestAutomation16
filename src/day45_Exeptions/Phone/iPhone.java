package day45_Exeptions.Phone;

public class iPhone extends Phone{

    public iPhone(String model, String country, int price) {
        super("Apple", model, "USA", price);
    }

    public void faceTime(long number){
        System.out.println(brand+" "+model+ " is face timing with "+ number);
    }

    public void faceTime(String email){
        System.out.println(brand+" "+model+ " is face timing with "+ email);

    }

    public void faceTime(long number1, long number2){
        faceTime(number1);
        faceTime(number2);
    }

    public void faceTime(String email1, String email2){
        faceTime(email1);
        faceTime(email2);
    }

    public void faceTime(String email1, String email2, String email3){
        faceTime(email1);
        faceTime(email2);
        faceTime(email3);
    }
}
