package day36_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Dean { // Dean has an Offer

    public static void main(String[] args) {

        ArrayList<Offer> offers = new ArrayList<>();

        offers.addAll(Arrays.asList(
                new Offer(), new Offer(), new Offer(), new Offer(), new Offer() ));

        offers.get(0).setInfo("CA","Capitalone", 120000, "SDET", true, true,
                false);
        offers.get(1).setInfo("VA","Apple", 115000, "QA", true, true,
                false);
        offers.get(2).setInfo("PA", "American Express", 100000, "Scrum Master", true,
                true, true);
        offers.get(3).setInfo("TX", "Google", 130000, "Dev", true,
                true, true);
        offers.get(4).setInfo("VA", "Meta", 200000, "SDET", true,
                true, true);

        /*
        for (int i=0; i<= offers.size()-1; i++){
            offers.get(i).getInfo();
        }

         */

        System.out.println("================================================================");
        // only print the offers from VA
        for (Offer each : offers){
            if (each.location.equals("VA") && each.salary>=110000 && each.jobTitle.equals("SDET") ){
                each.getInfo();
            }
        }



        System.out.println("================================================================");

        ArrayList<Offer> localOffer = new ArrayList<>(offers);
        localOffer.removeIf(p-> !p.location.equals("VA") ); // retain if the offer is from VA

        System.out.println("VA offers: "+localOffer.size() );

        System.out.println("==================================================================");

        ArrayList<Offer> SDETOffers = new ArrayList<>(offers);
        SDETOffers.removeIf( p-> !p.jobTitle.equals("SDET") ); // retain if the offer is for SDET

        System.out.println("SDET Offer: "+SDETOffers.size());

        System.out.println("==================================================================");

        ArrayList<Offer> goodSalary = new ArrayList<>(offers);
        goodSalary.removeIf(p -> p.salary < 120000); // removes all offers that has salary less than 120k

        System.out.println("120k or more: "+goodSalary.size());

        System.out.println("===================================================================");

        ArrayList<Offer> fullTime = new ArrayList<>(offers);

        fullTime.removeIf(p-> !p.isFullTime == false);
        System.out.println("Full time: "+fullTime.size());








    }
}
