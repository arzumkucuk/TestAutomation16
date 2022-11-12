package day50_OOP_Polimorphsim.DowlandTask;


public class Samsung extends Phone implements AndroidApp{

    public Samsung(String model, String size, double price) {
        super("Samsung", model, size, price);
        if(price>=1200){
            throw  new RuntimeException("Invalid price, Samsung 'price cannot be more than $1200");
        }
    }
    public void Freezing(){
        System.out.println(brand+" is freezing.");
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
        return brand+ " is calling";
    }
}
