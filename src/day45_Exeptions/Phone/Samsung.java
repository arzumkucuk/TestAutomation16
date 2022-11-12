package day45_Exeptions.Phone;

public class Samsung extends Phone{

    public Samsung(String model, String country, int price) {
        super("Samsung", model, country, price);
    }

    public void freeze(){
        System.out.println(brand+" "+model+ " is freezing");
    }
}
