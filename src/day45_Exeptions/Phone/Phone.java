package day45_Exeptions.Phone;

public class Phone extends Device{

    public Phone(String brand, String model, String country, int price) {
        super(brand, model, country, price);
    }

    public void call(long number){
        System.out.println(brand+" "+model+" is calling "+number);
    }

    public void text(long number) {
        System.out.println(brand + " is texting " + number);
    }

    @Override
    public String toString() {
        return "Phone"+ super.toString();
    }

}
