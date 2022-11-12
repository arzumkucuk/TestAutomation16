package day09_IfStatement;

public class EligibleToVote2 {
    public static void main(String[] args) {

        String name = "Daniel";
        boolean isUSACitizen = true;
        int age = 38;

        boolean isEligible= isUSACitizen == true && age >= 18 ;
        //                         true ==  true &&  38 >= 18
        //                              true  &&   true
        //                                     true

        System.out.println(name+ " is eligible to vote: "+ isEligible);


        String name2 = "John";
        String c1 = "Canada";
        String c2 = "USA";

        boolean eligible = c1 == "USA"  ||  c2 =="USA";
        //               "Canada" == "USA || "USA == "USA"
        //                  false      ||      true
        //                          true

        System.out.println(name2 + " is eligible to vote: "+eligible);





    }
}
