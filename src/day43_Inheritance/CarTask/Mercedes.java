package day43_Inheritance.CarTask;

public class Mercedes extends Car{

    public Mercedes(String brand, String model, String color, int year, String madeIn){
        setInfo(brand, model, color, year, madeIn);
    }

    public void autoPilot(){
        System.out.println(brand+" "+model+" has auto pilot");
    }

    public void autoParking(){
        System.out.println(brand+" "+model+" is making auto parking");

    }
}
