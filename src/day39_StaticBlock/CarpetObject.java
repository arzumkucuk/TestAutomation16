package day39_StaticBlock;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject {

    public static void main(String[] args) {

        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(),new Carpet() };
        carpets[0].customOrder(5,7,15,false);
        carpets[1].customOrder(5,7,15,true);
        carpets[2].customOrder(8,10,12,false);
        carpets[3].customOrder(10,15,13,true);
        carpets[4].customOrder(25,20,25,true);

        ArrayList<Carpet> persianCarpets = new ArrayList<>(Arrays.asList(carpets));
        persianCarpets.removeIf(p-> !p.isPersian);

        ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets) );
        regularCarpets.removeAll(persianCarpets);
        regularCarpets.removeIf(p->p.isPersian);

        System.out.println("=================================================");

        double totalPriceOfPersianCarpets=0;
        for (Carpet each : persianCarpets){
            System.out.println(each);
            totalPriceOfPersianCarpets += each.calCost();
        }

        System.out.println("total price of CARPETS = "+ totalPriceOfPersianCarpets);

        System.out.println("=================================================");

        double totalPriceOfRegCarpets = 0;
        for (Carpet each : regularCarpets){
            System.out.println(each);
            totalPriceOfRegCarpets += each.calCost();
        }


        System.out.println("Total price: "+ totalPriceOfPersianCarpets);

        System.out.println("=================================================");


        double totalPrice = totalPriceOfRegCarpets+ totalPriceOfPersianCarpets;
        System.out.println("Total Price= "+ totalPrice);

    }



}
/*
Carpet class continue;


create a class called carpetObject, and create an array of the carpet that contains 5 carpet objects ( make sure
      you set the instance variables of those objects)

      create two ArrayList of carpets:
                                    persianCarpets
                                    regularCarpets

      write a program to store all the persian Carpets into the list of persianCarpets, and store all regular
      carpets into the list of regularCarpets

       use for each loop to print out all the persian carpet
 */
