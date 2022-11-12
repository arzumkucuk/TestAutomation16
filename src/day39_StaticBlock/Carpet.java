package day39_StaticBlock;

public class Carpet {

    public double width, length, unitPrice;
    public boolean isPersian;

    public void customOrder(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calCost() {
        double totalPrice = (width * length) * unitPrice;
        if (isPersian) {
            totalPrice += 200;
        }
        return totalPrice;
        // return (isPersian)? totalPrice += 200 : totalPrice;
    }


    public String toString() {
        return "Carpets: " +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", Total price= " + calCost();


    }
}
/*
    1. create a custom class for the Carpet class that should contain the following:

            instance variable:
                width, length, unitPrice, isPersian (boolean)

            instance methods:
                customerOrder(): sets the carpet' width, length, unitPrice, & isParsian

                calCost(): should be able to calculate the total cost of the carpet and return it as double

                toString(): should be able to display all the info of the carpet including the total cost of the carpet as
                calculated by calCost()

                total price of carpet= (width*length)*unitprice

              if the carpet is persian carpet that'S came from Turkey, add 200$ to the totalPrice

      */