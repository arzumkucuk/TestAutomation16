package day50_OOP_Polimorphsim.DowlandTask;

public class Iphone extends Phone implements AppleApp {

    public Iphone(String model, String size, double price) {
        super("Apple", model, size, price);
        if (price>=1500){
            throw new RuntimeException("Invalid price, Iphone 'price cannot be more than $1500");
        }
    }

    public void faceTiming(){
        System.out.println(brand+ " is faceTiming");
    }

    @Override
    public void downland() {

    }

    @Override
    public String texting() {
        return brand + " is texting";
    }

    @Override
    public String calling() {
        return brand+" is calling";
    }

}
